<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<title>客服中心</title>
<meta
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport">
<link href="stylesheets/bootstrap.min.css" media="all" rel="stylesheet" type="text/css" />
<link href="stylesheets/font-awesome.css" media="all" rel="stylesheet" type="text/css" />
<link href="stylesheets/style.css" media="all" rel="stylesheet"
type="text/css" />
<style type="text/css">
.mycard {
	color: #007aff;
	padding: 15px 5px 15px 5px;
	font-size: 30px;
}
.fontweight{font-weight: bold;}
</style>
</head>

<body style="padding-top: 10px;">
	<div class="modal-shiftfix">
		<div class="row">
			<div class="widget-container stats-container">
				<div class="col-md-3 col-sm-6">
					<div class="mycard">
						<i class="icon-user"></i> ${UserName}
					</div>
					<div class="text">工号</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="mycard">
						<i class="icon-globe"></i> ${ANI }
					</div>
					<div class="text">主叫</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="mycard">
						<i class="icon-phone"></i> ${DNIS}
					</div>
					<div class="text">被叫</div>
				</div>
				<div class="col-md-3 col-sm-6">
					<div class="mycard">
						<i class="icon-phone-sign"></i> ${DN }
					</div>
					<div class="text">分机号</div>
				</div>
			</div>
		</div>
		
		<div class="row">
            <div class="widget-container fluid-height clearfix">
              <div class="col-sm-4">
                <div class="heading">
                  <i class="icon-book"></i>基本信息
                </div>
                <div class="widget-content padded">
	                  <div class="row">
	                    	<div class="col-sm-4 fontweight">姓名</div>
	                    	<div class="col-sm-8">${doctor.name }</div>
	                  </div>
	                  <div class="row">
	                    	<div class="col-sm-4 fontweight">职称</div>
	                    	<div class="col-sm-8">${doctor.position }</div>
	                  </div>
	                  <div class="row">
	                    	<div class="col-sm-4 fontweight">荣誉称号</div>
	                    	<div class="col-sm-8">${doctor.honorary }</div>
	                  </div>
	                  <div class="row">
	                    	<div class="col-sm-4 fontweight">第一职业点</div>
	                    	<div class="col-sm-8">${doctor.first_work_point }</div>
	                  </div>
	                  <div class="row">
	                    	<div class="col-sm-4 fontweight">科室</div>
	                    	<div class="col-sm-8">${doctor.department }</div>
	                  </div>
                </div>
              </div>
              <div class="col-sm-4">
                <div class="heading">
                </div>
                <div class="widget-content padded">
                  <div class="row">
                    	<div class="col-sm-4 fontweight">性别</div>
                    	<div class="col-sm-8">${doctor.sex }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">擅长</div>
                    	<div class="col-sm-8">${doctor.introduction }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">简介</div>
                    	<div class="col-sm-8">${doctor.expert_field }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">详细介绍</div>
                    	<div class="col-sm-8">${doctor.detailed_introduction }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">工作年限</div>
                    	<div class="col-sm-8">${doctor.working_year }</div>
                  </div>
                </div>
              </div>
              <div class="col-sm-4">
                <div class="heading">
                </div>
                <div class="widget-content padded">
                  <div class="row">
                    	<div class="col-sm-4 fontweight">工作范围</div>
                    	<div class="col-sm-8">${doctor.scope }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">挂号费</div>
                    	<div class="col-sm-8">${doctor.reg_fee }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">咨询费</div>
                    	<div class="col-sm-8">${doctor.consulting_fee }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">地址</div>
                    	<div class="col-sm-8">${doctor.address }</div>
                  </div>
                  <div class="row">
                    	<div class="col-sm-4 fontweight">电话</div>
                    	<div class="col-sm-8">${doctor.phone }</div>
                  </div>
                </div>
              </div>
            </div>
        </div>
        
		<div class="row" style="margin-left: 0px;margin-right: 0px;">
          <div class="col-md-4">
            <div class="widget-container fluid-height">
              <div class="heading">
                <i class="icon-list-ul"></i>医生档案/病史+咨询史
              </div>
              <div class="widget-content padded">
                <ul>
                  <li>
                    	内容
                  </li>
                  <li>
                    	内容
                  </li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="widget-container fluid-height">
              <div class="heading">
                <i class="icon-list-ol"></i>工单记录
              </div>
              <div class="widget-content padded">
                <ol>
                  <li>
                    	内容
                  </li>
                  <li>
                    	内容
                  </li>
                </ol>
              </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="widget-container fluid-height">
              <div class="heading">
                <i class="icon-reorder"></i>升级记录
              </div>
              <div class="widget-content padded">
                <ul class="no-style">
                  <li>
                    	内容
                  </li>
                  <li>
                    	内容
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>

		
		
		


		<!-- 
		<div class="row">
			<div class="col-xs-12">
				<div class="widget-container scrollable list rollodex">
					<div class="heading">
						<i class="icon-comment"></i>用户列表
					</div>
					<div class="widget-content">
						<div class="widget-content padded clearfix">
							<table class="table table-hover">
								<thead>
									<th>用户类型</th>
									<th>主叫</th>
									<th>真实名</th>
								</thead>
								<tbody>
									<c:forEach items="${pageCom.items }" var="item">
										<tr>
											<td><c:if test="${item.type=='doctor'}">医生</c:if> <c:if
													test="${item.type=='personal'}">个人</c:if></td>
											<td>${item.username}</td>
											<td>${item.nick_name}</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		 -->
	</div>
</body>

</html>