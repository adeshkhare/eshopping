<div class="container">
	<div class="row">

		<!-- Sidebar have to show  -->
		<div class="col-md-3">
			<%@include file="/WEB-INF/views/common/sidebar.jsp"%>
		</div>

		<!--  Display Actual product  -->
		<div class="col-md-9">
			<!-- Added breadcrum component  -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllProducts ==  true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home </a></li> 
							<li class="active"> / All Products</li> 
						</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProduct ==  true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home </a></li> 
							<li class="active"> / Category </li>
							<li class="active"> / ${category.name} </li> 
						</ol>
					</c:if>
					
				</div>
			</div>
		</div>
	</div>
</div>