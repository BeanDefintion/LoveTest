<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="wrapper wrapper-content gray-bg  animated  ${cfg.animated}   ">
	<div style="display: block; width: 100%; border: 1px #B8D0D6 solid; height: 450px;">
		<iframe src="${pageContext.request.contextPath}/system/jvm" width="100%" height="450"
			frameborder="no" border="0" marginwidth="0" marginheight="0"
			scrolling="no" allowtransparency="yes"></iframe>
	</div>
	<div style="display: block; width: 100%; height: 250px;">
		<div class="pageContent">
			<table class="table center" style="border: 1px #B8D0D6 solid;"
				width="100%" layoutH="100">
				<thead>
					<tr>
						<th width="50%" align="left">名称</th>
						<th width="50%" align="left">值</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${d}" var="dto" varStatus="status">
						<tr target="id">
							<td>${dto.key}</td>
							<td><a title="${dto.value}">${dto.value}</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
