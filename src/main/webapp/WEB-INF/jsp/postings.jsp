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
<!-- Theme CSS -->
<link href="home/css/creative.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="postings/css/shop-homepage.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<link href="home/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link href="home/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>

<!-- Plugin CSS -->
<link href="home/vendor/magnific-popup/magnific-popup.css"
	rel="stylesheet">

<!-- Theme CSS -->
<link href="home/css/creative.css" rel="stylesheet">
</head>

<body>
<nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand page-scroll" href="#page-top">SwaProcity Postings</a>

			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="home">Profile Home</a>
					<li><a href="about">About</a></li>
					<li><a href="logout">Log Out</a></li>
					
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

			<!-- Brand and toggle get grouped for better mobile display -->

	<!-- Page Content -->
	<div class="container">

		<div class="row">

			<div class="col-md-3">
				<p class="lead" id="homeHeading" style="color: white">SwaProcity</p>
				<div class="list-group">
					<i class="fa fa-4x fa-diamond text-primary sr-icons" style="color:white"></i><br><br><a
						href="item" class="btn btn-primary btn-l page-scroll">Items</a><br>
					<br> <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"style="color:white"></i><br><br><a
						href="service" class="btn btn-primary btn-l page-scroll">Services</a><br>
					<br> <i class="fa fa-4x fa-paper-plane text-primary sr-icons"style="color:white"></i><br><br>
					<a href="resource" class="btn btn-primary btn-l page-scroll">Resources</a><br>
					<br> <i class="fa fa-4x fa-heart text-primary sr-icons"style="color:white"></i><br><br><a
						href="all" class="btn btn-primary btn-l page-scroll">All</a><br>
					<br>




				</div>
			</div>

			<div class="col-md-9">

				<div class="row carousel-holder">

					<div class="col-md-12"></div>

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
											Title: <span style="font-weight: bold"><c:out
													value="${post.title}" /></span>
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
											<br><img src="data:image/jpg;base64,${post.showPicture()}" height="100%" width="100%" alt="Post Image">
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
												value="${post.user.getRating(user.count, user.rawRatingPoints)}" /></span> <br> <br>
									</div>
								</div>
							</div>
							<div class="button"
								style="text-align: center; font: bold; margin-top: 10px; margin-bottom: 50px;">
								<form action="swapPost" method="Post">
									<input type="hidden" value="${post.id}" name="postId" />
									<button id="swapButton" type="submit"
										class="btn btn-primary btn-l page-scroll"
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