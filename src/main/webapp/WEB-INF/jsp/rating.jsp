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
function calculateAverage(){
var rat0 = document.getElementsByName("comm");
var rat1 = document.getElementsByName("acc");
var rat2 = document.getElementsByName("over");
var commRating = 0;
var avgRating;

for(var i = 0; i < rat0.length; i++) {
   if(rat0[i].checked)
       commRating += rat0[i].value;
 }
for(var i = 0; i < rat1.length; i++) {
	   if(rat1[i].checked)
	       commRating += rat1[i].value;
	 }
for(var i = 0; i < rat2.length; i++) {
	   if(rat2[i].checked)
	       commRating += rat2[i].value;
	 }
avgRating=commRating/3;
document.getElementsById("avgRating").value=avgRating;
}
</script>

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
				<a class="navbar-brand" href="#">SwaProcity</a>

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

	<!--! SwaProcity<br> Rate Your Swap Experience</p> -->

	<section class="header-content-inner" style="text-align: center">
		<div class="header-content" style="color: white">
			<div class="header-content-inner">
				<form method="get" action="rateUser">
					<h1 id="homeHeading">Hello, ${userLogin.firstName}!</h1>
					<h2>Thank you for rating your experience swapping with
						${ratedUser.firstName}.</h2>
					<img src="${ratedUser.profilePic}" class="img-circle"
						height="155px" width="155px" alt=""> <br>
					<h3>
						Please rate your experience from <b>1</b> (poor) to <b>5</b>
						(excellent)
					</h3>
					<br> <label>Rate ${ratedUser.firstName}'s
						Communication</label> 1<input type="radio" value=1 id="comm" name="comm">
					2<input type="radio" value=2 id="comm" name="comm"> 3<input
						type="radio" value=3 id="comm" name="comm"> 4<input
						type="radio" value=4 id="comm" name="comm"> 5<input
						type="radio" value=5 id="comm" name="comm"><br> <label>Rate
						the accuracy of the description of your swap.</label> 1<input type="radio"
						value=1 id="acc" name="acc"> 2<input type="radio" value=2
						id="acc" name="acc"> 3<input type="radio" value=3 id="acc"
						name="acc"> 4<input type="radio" value=4 id="acc"
						name="acc"> 5<input type="radio" value=5 id="acc"
						name="acc"><br> <label>Give this swap
						experience an overall rating</label> 1<input type="radio" value=1
						id="over" name="over"> 2<input type="radio" value=2
						id="over" name="over"> 3<input type="radio" value=3
						id="over" name="over"> 4<input type="radio" value=4
						id="over" name="over"> 5<input type="radio" value=5
						id="over" name="over"><br>
						<input type="hidden" value="avgRating" id="avgRating" placeholder=avgRating>
					<button type="submit" onclick="calculateAverage()" class="btn btn-primary btn-l page-scroll"
						style="color: white; background-color: #F05F40;">Rate!</button>
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