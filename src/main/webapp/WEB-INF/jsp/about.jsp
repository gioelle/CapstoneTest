<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SwaProcity</title>

<!-- Bootstrap Core CSS -->
<link href="index/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="index/vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'
	rel='stylesheet' type='text/css'>

<!-- Plugin CSS -->
<link href="index/vendor/magnific-popup/magnific-popup.css"
	rel="stylesheet">

<!-- Theme CSS -->
<link href="index/css/creative.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

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
				<a class="navbar-brand page-scroll" href="#page-top">SwaProcity
					Home</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a class="page-scroll" href="#about">About</a></li>
					<li><a class="page-scroll" href="#why">Why SwaP?</a></li>
					<li><a class="page-scroll" href="#register">Login/Sign Up</a></li>
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
				<h1 id="homeHeading">SwaProcity</h1>
				<hr>
				<h3 style="font-style: oblique; color: #09b893; font-size: 25px">
					Invest in <span style="color: yellow; font-size: 35px">[
						YOUR COMMUNITY ]</span> Invests in You
				</h3>
				<a href="#about" class="btn btn-primary btn-xl page-scroll">Find
					Out More</a>
			</div>
		</div>
	</header>

	<section class="bg-primary" id="why">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h2 class="section-heading">Why SwaProcity?</h2>
					<hr class="light">
					<p class="text-faded">Here's a helpful video to help you
						understand why consuming fewer new goods might be a good idea. No
						time to watch? Our consumerism is hurting the planet, and we only
						get one. That's why I hope you'll start sharing your unwanted
						items, reusable resources, and bartering for services within your
						community.</p>
					<div style="position: relative; height: 0; padding-bottom: 56.25%">
						<iframe src="https://www.youtube.com/embed/3eWBg8ojno4?ecver=2"
							width="640" height="360" frameborder="0"
							style="position: absolute; width: 100%; height: 100%; left: 0"
							allowfullscreen></iframe>
					</div>
					<br> <a href="#services"
						class="page-scroll btn btn-default btn-xl sr-button">Get
						Started!</a>
				</div>
			</div>
		</div>
	</section>

	<section id="about" style="padding: 25px; background-color: #faf6d0">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2 class="section-heading">What is SwaProcity?</h2>
					<p class="text-muted">SwaProcity is a virtual currency for local
						barter of items, services, and resources. It is what you make it.</p>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<i class="fa fa-4x fa-diamond text-primary sr-icons"></i>
						<h3>Coal to Diamonds</h3>
						<p class="text-muted">One woman's trash is another woman's
							treasure.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<i class="fa fa-4x fa-paper-plane text-primary sr-icons"></i>
						<h3>Borrow an Airplane</h3>
						<p class="text-muted">Need an air compressor? Monkey wrench?
							Food dehydrator? Borrow costly resources you might only use once,
							and share those things you already invested in.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<i class="fa fa-4x fa-newspaper-o text-primary sr-icons"></i>
						<h3>Your Neighborhood is Talented</h3>
						<p class="text-muted">Your neighbor's skill set compliments
							your own, get their help on that new firepit or help them put a
							new roof on.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<i class="fa fa-4x fa-heart text-primary sr-icons"></i>
						<h3>SwaProcity Community</h3>
						<p class="text-muted">Build relationships while working toward
							a greener earth and keeping dollars local.</p>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="register" class="bg-dark">
		<aside class="bg-dark">
			<div class="container text-center">
				<div class="call-to-action">
					<form:form class="container" action="login" method="post"
						modelAttribute="userLogin" style="width: 20%">
						<h3>Welcome Back!</h3>
						<div class="form-group">
							<form:label path="email">Email</form:label>
							<form:input path="email" class="form-control" name="userName"
								id="username" placeholder="email"></form:input>
						</div>
						<div class="form-group">
							<form:label path="password">Top-Secret Unsharable KeyPhrase here:</form:label>
							<form:input path="password" type="password" class="form-control"
								name="password" id="password" placeholder="password"></form:input>
						</div>
						<button type="submit" class="btn btn-default">To my
							account!</button>
						<!--  <a href="http://startbootstrap.com/template-overviews/creative/" class="btn btn-default btn-sm sr-button"><button type="submit" class="btn btn-default"></button></a> -->
					</form:form>
				</div>
				<br> <br> <br>
				<div class="container text-center">
					<form:form class="container" action="register" method="post"
						modelAttribute="userLogin" style="width:40%">
						<h3>Not yet in the club? Sign up here!</h3>
						<div class="form-group">
							<form:label path="firstName">First Name</form:label>
							<form:input path="firstName" type="text" class="form-control"
								name="firstName" id="firstName" placeholder="Jane"></form:input>
						</div>
						<div class="form-group">
							<form:label path="lastName">Last Name</form:label>
							<form:input path="lastName" type="text" class="form-control"
								name="lastName" id="lastName" placeholder="Doe"></form:input>
						</div>
						<div class="form-group">
							<form:label path="email">Email</form:label>
							<form:input path="email" type="email" class="form-control"
								name="username" id="email" placeholder="janeDoe@camelCase.com"></form:input>
						</div>

						<div class="form-group">
							<form:label path="password">Password</form:label>
							<form:input path="password" type="password" class="form-control"
								name="password" id="password"
								placeholder="s0m3t#ingComp!ex&un1que"></form:input>
						</div>

						<div class="form-group">
							<form:label path="address.streetAddress">Street Address</form:label>
							<form:input path="address.streetAddress" type="text"
								class="form-control" name="streetAddress" id="streetAddress"
								placeholder="123 Rebel Avenue"></form:input>
						</div>
						<div class="form-group">
							<form:label path="address.city">City</form:label>
							<form:input path="address.city" type="text" class="form-control"
								name="city" id="city" placeholder="Rock City"></form:input>
						</div>
						<div class="form-group">
							<form:label path="address.state">State</form:label>
							<form:input path="address.state" type="text" class="form-control"
								name="state" id="state" placeholder="Ofmind"></form:input>
						</div>
						<div class="form-group">
							<form:label path="address.zipcode">Zip Code</form:label>
							<form:input path="address.zipcode" type="text"
								class="form-control" name="zipCode" id="zipCode"
								placeholder="8675309"></form:input>
						</div>
						<div class="checkbox">
							<label> <input type="checkbox">I agree to the
								terms and conditions. <br>Terms and Conditions: We'll be
								thoughtful about how we perform business.
							</label>
						</div>
						<button type="submit" class="btn btn-default">Let's do
							this.</button>
					</form:form>
				</div>
			</div>
		</aside>
	</section>
	<section id="contact" style="padding: 50px; background-color: #faf6d0">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h2 class="section-heading">Let's Get In Touch!</h2>
					<img src="index/img/Reciprocity.jpg"
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