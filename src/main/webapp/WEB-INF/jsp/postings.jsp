<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SwaProcity - Browse</title>

<!-- Bootstrap Core CSS -->
<link href="postings/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="postings/css/shop-homepage.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation"
		style="background-color: #002f34">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">

				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">

					<!-- <img src=".//resources/postings/img/Reciprocity.jpg" style="width:15%"> -->
					<br> <span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">SwaProcity Postings</a>

			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1" style="float: right;">
				<ul class="nav navbar-nav">
					<li><a href="home">Profile Home</a>
					<li><a href="about">About</a></li>
					<li><a href="logout">Log Out</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<div class="col-md-3">
				<p class="lead" style="color: white">SwaProcity</p>
				<div class="list-group">
					<a href="item" class="list-group-item">Items</a> <a href="service"
						class="list-group-item">Services</a> <a href="resource"
						class="list-group-item">Resources</a> <a href="all"
						class="list-group-item">All</a>

				</div>
			</div>

			<div class="col-md-9">

				<div class="row carousel-holder">

					<div class="col-md-12">
						<div id="carousel-example-generic" class="carousel slide"
							data-ride="carousel">
							<ol class="carousel-indicators">
								<li data-target="#carousel-example-generic" data-slide-to="0"
									class="active"></li>
								<li data-target="#carousel-example-generic" data-slide-to="1"></li>
								<li data-target="#carousel-example-generic" data-slide-to="2"></li>
							</ol>
							<div class="carousel-inner">
								<div class="item active">
									<img class="slide-image" src="http://placehold.it/800x300"
										alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="http://placehold.it/800x300"
										alt="">
								</div>
								<div class="item">
									<img class="slide-image" src="http://placehold.it/800x300"
										alt="">
								</div>
							</div>
							<a class="left carousel-control" href="#carousel-example-generic"
								data-slide="prev"> <span
								class="glyphicon glyphicon-chevron-left"></span>
							</a> <a class="right carousel-control"
								href="#carousel-example-generic" data-slide="next"> <span
								class="glyphicon glyphicon-chevron-right"></span>
							</a>
						</div>
					</div>

				</div>
				<c:forEach var="post" items="${post}">
					<c:if test="${post.instances>0}">
						<!--  this is just one post message from here....  -->
						<!--<div class="row"> -->
							<div class="col-sm-5">
								<div class="well"
									style="height: 400px; margin-bottom: 5px; overflow: auto;"
									id="postHolder">
									<div>
										<div>
											<p>
												Title: <span style="font-weight: bold"><c:out value="${post.title}"/></span>
											</p>
											<hr style="margin-top: 10px; margin-bottom: 10px">
											<p>
												Type: <span style="font-weight: bold"><c:out
														value="${post.type}" /></span>
											</p>
											<hr style="margin-top: 10px; margin-bottom: 10px">
											<p>
												Description: <br> <span style="font-weight: bold"><c:out
														value="${post.description}" /></span>
											</p>
											<p>
												<br> <img src="${post.picture}" height="100%"
													width="100%" alt="Post Image">
											</p>
											<p>
												SwaPoints: <span style="font-weight: bold"><c:out
														value="${post.value}" /></span>
											</p>
											<img src="${post.user.profilePic}" class="img-circle"
												height="55" width="55" alt="Avatar"> <br>
											<p>
												Posted by: <span style="font-weight: bold"><c:out
														value="${post.user.firstName}" /></span>
											</p>
											User rating: <span style="font-weight: bold"><c:out
													value="${post.user.rating}" /></span> <br> <br>
										</div>
									</div>
								</div>
								<div class="button"
									style="text-align: center; font: bold; margin-top: 10px; margin-bottom: 50px;">
									<form action="swapPost" method="Post">
									<input type="hidden" value="${post.id}" name="postId"/>
									<button id="swapButton" type="submit" class="btn btn-default btn-sm;" 
									style="button-align: center; height: 1.42857143; font-weight: bold;">
										Swap!</button>
										</form>
								</div>
							</div>
					</c:if>
				</c:forEach>
			</div>
		</div>
	</div>
	<!-- /.container -->

	<div class="container">

		<hr>

		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; SwaProcity 2017</p>
				</div>
			</div>
		</footer>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>