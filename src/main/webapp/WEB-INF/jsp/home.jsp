<%@page import="com.joelle.entity.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="Joelle Fronzaglio">

<title>SwaProfile</title>

<!-- Bootstrap Core CSS -->
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

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- <script type="text/javascript">
	var inputs = document.querySelectorAll('.inputfile');
	Array.prototype.forEach.call(inputs, function(input) {
		var label = input.nextElementSibling, labelVal = label.innerHTML;

		input.addEventListener('change', function(e) {
			var fileName = '';
			if (this.files && this.files.length > 1)
				fileName = (this.getAttribute('data-multiple-caption') || '')
						.replace('{count}', this.files.length);
			else
				fileName = e.target.value.split('\\').pop();

			if (fileName)
				label.querySelector('span').innerHTML = fileName;
			else
				label.innerHTML = labelVal;
		});
	});
</script> -->
</head>

<body id="page-top">

	<nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand page-scroll" href="#page-top">My
					SwaProcity Profile</a>

			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a class="page-scroll" href="#currentPosts">My Posts</a></li>
					<li><a class="page-scroll" href="about">About</a></li>
					<li><a class="page-scroll" href="#services">Services</a></li>
					<li><a class="page-scroll" href="#logout">Log Out</a></li>
					<li><a class="page-scroll" href="#contact">Contact</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<header>
		<div class="header-content">
			<div class="header-content-inner">
				<h1 id="homeHeading">Hello, ${userLogin.firstName}!</h1>
				<img src="${userLogin.profilePic}" class="img-circle" height="155px"
					width="155px" alt=""> <br>
				<form action="uploadProfile" method="POST"
					enctype="multipart/form-data">
					<h6>
						<input type="file" name="file" id="file" class="inputfile" /> <label
							for="file">Choose a profile picture</label>
					</h6>
					<button type="submit" class="page-scroll btn btn-default btn-m sr-button" style="color: white; background-color: #F05F40;">upload</button>
				</form>
				<hr>
				<h3>
					<b>Your SwaPoints balance is: ${userLogin.swaPointsBalance}</b>
				</h3>
				<h3>
					<b>How would you like to invest in your community today?</b>
				</h3>
				<a href="#post" class="btn btn-primary btn-l page-scroll">New
					post!</a> <br> <br>
				<form class="search--search-home" action="search" method="POST">
					<input type="search" name="term" value="" autocomplete="off"
						class="js-term" placeholder="Search Postings" /> <br> <br>
					<button type="submit" class="btn btn-primary btn-l page-scroll">Search!</button>
				</form>

			</div>
		</div>
	</header>

	<section class="bg-primary" id="currentPosts">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h2 class="section-heading">Your Current Posts</h2>
					<table style="" class="table table-hover">
						<c:choose>
							<c:when test="${empty myUserPost}">
							You don't currently have anything posted.
							</c:when>
							<c:otherwise>
								<tr>
									<th style="text-align: center">Type</th>
									<th style="text-align: center">Title</th>
									<th style="text-align: center">Value</th>
									<th style="text-align: center">Instances Remaining</th>
									<th style="text-align: center">Change</th>
								</tr>
								<c:forEach items="${myUserPost}" var="postedItem">

									<tr>
										<td><c:out value="${postedItem.type}"></c:out></td>
										<td><c:out value="${postedItem.title}"></c:out></td>
										<td><c:out value="${postedItem.value}"></c:out></td>
										<td><c:out value="${postedItem.instances}"></c:out></td>
										<td><a href="#"><span style="color: white">Delete</span></a></td>
									</tr>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</table>
					<br> <br> <a href="#post"
						class="page-scroll btn btn-default btn-xl sr-button">Post
						Something New</a>
				</div>
			</div>
		</div>
	</section>

	<%-- 	<section id="services" style="padding: 50px; background-color: #faf6d0">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="section-heading">Recent Transactions</h2>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<i class="fa fa-4x fa-diamond text-primary sr-icons"></i><br>
						<i class="fa fa-4x fa-paper-plane text-primary sr-icons"></i><br>
						<i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i><br>
						<i class="fa fa-4x fa-heart text-primary sr-icons"></i><br>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<p class="text-muted">
							Today ${transaction.date}<br>Test Title ${transaction.title}<br>Value
							${transaction.value}<br>User ${transaction.user}</p>
							<c:choose>
							<c:when test="${empty myUserPost}">
							You don't have any past transactions.
							</c:when>
							<c:otherwise>
								<tr>
									<th style="text-align:center">Date</th>
									<th style="text-align:center">Title</th>
									<th style="text-align:center">Value</th>
									<th style="text-align:center">User</th>
								</tr>
								<c:forEach items="${myUserPost}" var="postedItem">

									<tr>
										<td><c:out value="${postedItem.date}"></c:out></td>
										<td><c:out value="${postedItem.title}"></c:out></td>
										<td><c:out value="${postedItem.value}"></c:out></td>
										<td><c:out value="${postedItem.email}"></c:out></td>
									</tr>
								</c:forEach>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>
		</div>
	</section>
 --%>

	<section id="post" style="background-color: #222">
		<aside class="bg-dark" style="padding: 50px; height: 700px">
			<h1 style="align: center; color: #f05f40">SwaPosting</h1>
			<div class="bg-dark" style="width: 100%">
				<form action="CreatePosting" method="POST"
					enctype="multipart/form-data"
					style="align: center; Width: 40%; float: left; padding-right: 50px">
					<h3>Create a new post:</h3>
					<div class="form-group">
						<input type="hidden" class="form-control" value="${u.email}"
							name="email" id="email" placeholder="email" />
					</div>
					<input type="radio" name="type" value="item" id="type" /> <i
						class="fa fa-4x fa-diamond text-primary sr-icons"
						style="font-size: 125%"></i> <label for="item">Item</label> <br>
					<input type="radio" name="type" value="service" id="type" /> <i
						class="fa fa-4x fa-newspaper-o text-primary sr-icons"
						style="font-size: 125%"></i> <label for="service">Service</label>
					<br> <input type="radio" name="type" value="resource"
						id="type" /> <i
						class="fa fa-4x fa-paper-plane text-primary sr-icons"
						style="font-size: 125%"></i> <label for="resource">Resource</label>
					<br>

					<div class="form-group">
						<label for="title">Title</label> <input type="text"
							class="form-control" name="title" id="title" placeholder="Title">
					</div>
					<div class="form-group">
						<label for="description">Description</label> <input type="text"
							class="form-control" name="description" id="description"
							placeholder="Describe your item, service, or sharable resource">
					</div>
					<div class="form-group">
						<label for="value">Value</label> <input type="text"
							class="form-control" name="value" id="value" placeholder="Value">
					</div>
					<div class="form-group">
						<label for="instances">How Many?</label> <input type="text"
							class="form-control" name="instances" id="instances"
							placeholder="If this is a service/resource, enter 1000">
					</div>
					<div class="form-group">
						<label for="photo">Photo (please upload at least one
							quality photo)</label> <input type="file" class="form-control"
							name="file" id="photo">
					</div>
					<button type="submit" class="btn btn-default">POST!</button>
				</form>

				<div class="container" style="float: right; width: 60%">
					<h3>What should I post?</h3>
					<br> <i class="fa fa-4x fa-diamond text-primary sr-icons"
						style="font-size: 125%"></i><br>
					<p>
						Post any items you might discard that are in usable shape - think
						"One woman's trash is another woman's treasure".<br> Stained,
						in need of repair, or only usable as an upcycled item? Just be
						sure to be clear in your description. <br> Post about an item
						you're searching for - someone might just be inspired to pass
						something on to you.
					</p>
					<br> <i class="fa fa-4x fa-newspaper-o text-primary sr-icons"
						style="font-size: 125%"></i><br>
					<p>
						Post any skills you have or are in need of. Do you happen to be a
						very detailed house painter? Do you enjoy cleaning, cutting hair,
						walking dogs? Maybe you're an electrician, plumber, or consultant.
						<br> Is your roof leaking, car not running right, do you need
						your hair done for an upcoming event? Post a request for help
						here.
					</p>
					<br> <i class="fa fa-4x fa-paper-plane text-primary sr-icons"
						style="font-size: 125%"></i><br>
					<p>
						Do you have a garage full of tools? A beautiful space that someone
						could use for their special event? A specialty piece of machinery
						for the yard or kitchen? Maybe you have a kiln and a pottery
						wheel. <br> Do you need to use something that has a high
						initial investment cost? Maybe someone has what you need.
					</p>
				</div>
			</div>
		</aside>
	</section>
	<section id="contact" style="padding: 50px; background-color: #faf6d0">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h2 class="section-heading">Let's Get In Touch!</h2>
					<img src="resources/index/img/Reciprocity.jpg"
						class="img-responsive" style="max-width: 75%; margin: auto" alt="">
					<hr class="primary">
					<p>Have questions, suggestions, or requests?</p>
				</div>
				<div class="col-lg-4 col-lg-offset-2 text-center">
					<i class="fa fa-phone fa-3x sr-contact"></i>
					<p>(573)201-5332</p>
				</div>
				<div class="col-lg-4 text-center">
					<i class="fa fa-envelope-o fa-3x sr-contact"></i>
					<p>
						<a href="mailto:your-email@your-domain.com">fronsaglia@gmail.com</a>
					</p>
				</div>
			</div>
		</div>
	</section>

	<!-- jQuery -->
	<script src="resources/index/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/index/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
	<script src="resources/index/vendor/scrollreveal/scrollreveal.min.js"></script>
	<script
		src="resources/index/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

	<!-- Theme JavaScript -->
	<script src="js/creative.min.js"></script>


</body>
</html>