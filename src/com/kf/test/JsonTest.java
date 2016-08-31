package com.kf.test;

import com.alibaba.fastjson.JSON;
import com.kf.entity.PageCom;
import com.kf.util.RestUtil;

public class JsonTest {
	public static void main(String[] args) {
		String url = "http://192.168.0.200:8000/members?EQS_username=15921884773";
		String json = RestUtil.doRest(url).trim();
		PageCom pageCom = JSON.parseObject(json, PageCom.class);
		System.out.println(pageCom.getPage());
		
//		PageCom pageCom = new PageCom();
//		pageCom.setCount(32);
//		pageCom.setPage(3);
//		pageCom.setPer_page(3);
//		List<MemberVo> items = new ArrayList<MemberVo>();
//		MemberVo memberVo = new MemberVo();
//		memberVo.setUsername("3");
//		memberVo.setModifier("4343");
//		Map<Object, Map<Object, Object>> _links = new HashMap<Object, Map<Object, Object>>();
//		
//		Map<Object, Object> map = new HashMap<Object, Object>();
//		map.put("href", "http://192.168.0.200:8000/members/5");
//		_links.put("self", map);
//		memberVo.set_links(_links);
//		items.add(memberVo);
//		pageCom.setItems(items);
//		String str = JSON.toJSONString(pageCom);
//		System.out.println(str);
		
	}
}
