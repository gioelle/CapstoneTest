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

<title>SwaProcity Rating</title>

<!-- Bootstrap Core CSS -->
<link href="postings/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
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
<link href="postings/css/shop-homepage.css" rel="stylesheet">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script>
	function calculateAverage() {
		var rat0 = document.getElementsByName("comm");
		var rat1 = document.getElementsByName("over");
		var commRating = 0;
		var overRating = 0;
		var avgRating = 0;

		for (var i = 0; i < rat0.length; i++) {
			if (rat0[i].checked)
				commRating += rat0[i].value;
		}
		
		for (var i = 0; i < rat1.length; i++) {
			if (rat1[i].checked)
				overRating += rat1[i].value;
		}
		
		console.log(commRating);
		console.log(overRating);

		avgRating += commRating / 2;
		avgRating += overRating / 2;
		console.log(avgRating);
		return document.getElementById('avgRating').innerHTML = avgRating;

	}
</script>

</head>

<body>

	<!-- Navigation -->
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
					<li><a href="home">Profile Home</a>
					<li><a href="about">About</a></li>
					<li><a href="logout">Log Out</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<!--! SwaProcity<br> Rate Your Swap Experience</p> -->

	<section class="header-content-inner" style="text-align: center">
		<div class="header-content" style="color: white">
			<div class="header-content-inner">
				<form class=header-content-inner method="POST" action="rateUser">
					<h1 id="homeHeading">Hello, ${userLogin.firstName}!</h1>
					<h2>Thank you for rating your experience swapping with
						${ratedUser.firstName}.</h2>
					<img src="data:image/jpg;base64,${ratedUser.showPicture()}"
						class="img-circle" height="155px" width="155px" alt="SwapUser Pic">
					<br>
					<h3>
						Please rate your experience: <br> <b>1</b> (poor) to <b>5</b>
						(excellent)
					</h3>
					<h3>
						<br> <label>${ratedUser.firstName}'s Communication</label> 
							1<input	onClick="calculateAverage()" type="radio" value=1 id="comm"	name="comm"> 
							2<input onClick="calculateAverage()" type="radio" value=2 id="comm" name="comm"> 
							3<input onClick="calculateAverage()" type="radio" value=3 id="comm"	name="comm"> 
							4<input onClick="calculateAverage()" type="radio" value=4 id="comm" name="comm"> 
							5<input	onClick="calculateAverage()" type="radio" value=5 id="comm"	name="comm">
							<br> <label>Overall swap rating</label>
							1<input onClick="calculateAverage()" type="radio" value=1 id="over" name="over"> 
							2<input onClick="calculateAverage()" type="radio" value=2 id="over" name="over"> 
							3<input onClick="calculateAverage()" type="radio" value=3 id="over" name="over"> 
							4<input onClick="calculateAverage()" type="radio" value=4 id="over" name="over"> 
							5<input	onClick="calculateAverage()" type="radio" value=5 id="over"	name="over">
							<br> <input type="hidden" name="avgRating" value=avgRating id="avgRating">
					</h3>
					<button type="submit" value=avgRating class="btn btn-primary btn-l page-scroll"
						style="color: white; background-color: #F05F40">Rate!</button>
				</form>
				<hr>
			</div>
		</div>
	</section>
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