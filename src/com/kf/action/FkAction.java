package com.kf.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.kf.entity.Doctor;
import com.kf.entity.PageCom;
import com.kf.entity.vo.MemberVo;
import com.kf.util.RestUtil;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class FkAction extends ActionSupport{
	HttpServletRequest request = ServletActionContext.getRequest();

	public String list() {
		// 请求参数
		String UserName = request.getParameter("agentid");
		String ANI = request.getParameter("ani");
		String DNIS = request.getParameter("dnis");
		String DN = request.getParameter("agentdn");

		// 调用方法获取结果
		if (!"".equals(ANI) || ANI != null) {
			String url = "http://192.16.10.92:8000/members?EQS_username="+ ANI;
			String json = RestUtil.doRest(url).trim();
			PageCom pageCom = JSON.parseObject(json, PageCom.class);
			request.setAttribute("pageCom", pageCom);
			
			//请求医生或顾客详细信息
			List<MemberVo> list = pageCom.getItems();
			if (list.size()>0 && list!=null) {
				String type = list.get(0).getType();
				String id = list.get(0).getId()+"";
				url = "http://192.16.10.92:8000/members/"+id+"/profile";
				json = RestUtil.doRest(url).trim();
				if ("doctor".equals(type) && !"".equals(json)) {//医生
					Doctor doctor = JSON.parseObject(json, Doctor.class);
					request.setAttribute("doctor", doctor);
				}else if("personal".equals(type)) {//个人
					
				}
			}
			
		}
		// 将数据写入到页面中
		request.setAttribute("UserName", UserName);
		request.setAttribute("ANI", ANI);
		request.setAttribute("DNIS", DNIS);
		request.setAttribute("DN", DN);
		return "kf";
	}
}
