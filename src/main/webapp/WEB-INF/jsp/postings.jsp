<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
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
				id="bs-example-navbar-collapse-1" style="float: right">
				<ul class="nav navbar-nav">
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
					<li><a href="#">Log Out</a></li>
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
				<p class="lead">SwaProcity</p>
				<div class="list-group">
					<a href="#" class="list-group-item">Items</a> <a href="#"
						class="list-group-item">Services</a> <a href="#"
						class="list-group-item">Resources</a>
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
			                 Display post here.
					<!--  this is just one post message from here....  -->
						<div class="row">
							<div class="col-sm-3">
								<div class="well">
									<p>
										<!-- because we joined the post and person tables  -->
										<c:out value="${post.user.firstName}" />
									</p>
									<img src="${loggedInUser.profilePic}"
										class="img-circle" height="55" width="55" alt="Avatar">
								</div>
							</div>
							<div class="col-sm-9">
								<div class="well">
									<p>
										<c:out value="${post.type}" />
									</p>
									<p>
										<c:out value="${post.title}" />
									</p>
									<p>
										<c:out value="${post.description}" />
									</p>
									<p>
									<img src="${post.picture}" class="img-circle"
										height="55" width="55" alt="Posting Image">
									</p>
								</div>
								<div class="well">
								<p>
										<c:out value="${post.value}" />
									</p>
									<p>
										<!-- because we joined the post and person tables  -->
										<c:out value="${post.user.firstName}" />
									</p>
									<img src="${post.user.profilePic}" class="img-circle"
										height="55" width="55" alt="Avatar">
									<c:out value="${post.user.rating}" />
								</div>
								<button type="button" class="btn btn-default btn-sm">
									<span class="glyphicon glyphicon-airplane"></span> Swap!
								</button>
							</div>
						</div>
						<!--  to here -->
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