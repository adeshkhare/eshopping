<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>

<script type="text/javascript">
	window.menu = '${title}';
</script>
<!-- Bootstrap core CSS -->
<%-- <link href="${css}/bootstrap.min.css" rel="stylesheet"> --%>
<link href="${css}/bootstrap-simple-theme.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="common/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">


			<!-- Loading home page  -->
			<c:if test="${userClickHome == true}">
				<%@include file="common/maincontainer.jsp"%>
			</c:if>

			<!-- Loading about page  -->
			<c:if test="${userClickAbout == true}">
				<%@include file="common/about.jsp"%>
			</c:if>

			<!-- Loading contacts page  -->
			<c:if test="${userClickContacts == true}">
				<%@include file="common/contacts.jsp"%>
			</c:if>
			
			<!-- Loading contacts page  -->
			<c:if test="${userClickAllProducts == true or userClickCategoryProduct == true}">
				<%@include file="/WEB-INF/views/listProducts.jsp"%>
			</c:if>

			<!-- /.container -->
		</div>

		<!-- Footer -->
		<%@include file="common/footer.jsp"%>
	</div>


	<!-- Bootstrap core JavaScript -->
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.bundle.min.js"></script>
	<script src="resources/js/onlineshopping.js"></script>

</body>

</html>
