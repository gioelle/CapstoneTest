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
<link href="index/vendor/font-awesome/css/font-awesome.min.css"
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
				<a class="navbar-brand page-scroll" href="#page-top">SwaProcity Resources</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a class="page-scroll" href="#centers">Recycling</a></li>
					<li><a class="page-scroll" href="#thrift">Thrift &
							Upcycling</a></li>
					<li><a class="page-scroll" href="#points">SwaPoints FAQ</a></li>
			<!-- 	<li><a class="page-scroll" href="#contact">Contact</a></li> -->	
					<li><a class="page-scroll" href="about">SwaProcity Home</a></li>
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
				<h3
					style="font-style: oblique; font-weight: bold; color: #09b893; font-size: 25px">
					Invest in <span style="color: yellow; font-size: 35px">[
						YOUR COMMUNITY ]</span> Invests in You
				</h3>
				<br> <a href="#centers"
					class="btn btn-primary btn-xl page-scroll">Local Recycling Info</a><br>
				<br> <a href="#thrift"
					class="btn btn-primary btn-xl page-scroll">Thrift & Upcycling</a><br>
				<br> <a href="#points"
					class="btn btn-primary btn-xl page-scroll">SwaPoints FAQ</a><br>

			</div>
		</div>
	</header>

	<section class="bg-primary" id="centers">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h1 class="section-heading">Boone County Recycling</h1>
					<hr class="light">
					<a href="https://www.como.gov/PublicWorks/Solidwaste/recycling.php"><i
						style="color: white"
						class="fa fa-4x fa-recycle text-primary sr-icons"></i> </a>
					<p class="text-faded">Click to learn more about your local
						guidelines.</p>
					<div style="position: relative; height: 0; padding-bottom: 45%">
						<iframe width="560" height="315"
							src="https://www.youtube.com/embed/jobDjAb2VPM" frameborder="0"
							allowfullscreen></iframe>
					</div>
					<a
						href="https://www.como.gov/PublicWorks/Solidwaste/what-cannot-be-recycled.php"><i
						style="color: white"
						class="fa fa-4x fa-trash text-primary sr-icons"></i> </a>
					<p class="text-faded">
						Some things can't be recycled here. (click <i style="color: white"
							class="fa fa-1x fa-trash-o text-primary sr-icons"></i> above to
						learn more) <br>We recommend upcycling those items if you
						can't avoid purchasing them altogether. <br>In fact, that's
						what we're all about. <br>Log in or join up, and post your
						upcyclables to SwaProcity!
					</p>
					<a href="about"
						class="page-scroll btn btn-default btn-xl sr-button">Get
						Started!</a>
				</div>
			</div>
		</div>
	</section>

	<section id="thrift" style="padding: 25px; background-color: #faf6d0">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h1 class="section-heading">Thrift & Upcycling</h1>
					<p class="text-muted">Local resources for buying, selling or
						donating reusable goods and materials</p>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<a
							href="https://www.cardonationwizard.com/kbia/info/car-donation-columbia-mo.html"><i
							class="fa fa-4x fa-automobile text-primary sr-icons"></i></a>
						<h3>KBIA - Turn your Car into NPR</h3>
						<p class="text-muted" style="text-align: justify">Your gift
							makes a difference at KBIA! In addition to supporting the
							programs you love, your gift will make you a member of KBIA. Your
							vehicle is towed free of charge, and the donation is eligible for
							a tax deduction. KBIA accepts any vehicle - running or not -
							including cars, trucks, boats, RVs, motorcycles, and more. They
							work with their public radio colleagues at Car Talk Vehicle
							Donation Services, to ensure that your donation delivers the
							highest possible revenue to KBIA and that your experience is
							convenient, efficient and even fun.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<a href="http://www.showmehabitat.org/restore"><i
							class="fa fa-4x fa-home text-primary sr-icons"></i></a>
						<h3>Habitat for Humanity Restore</h3>
						<p class="text-muted" style="text-align: justify">The Restore
							is a division of Show-Me Central Habitat for Humanity - a
							non-profit economical organization dedicated to eliminating
							poverty housing. We recycle used, overstocked, discontinued,
							seconds and salvageable building material donated by individuals,
							firms and contractors. The donated items are used to build houses
							for low-income families or offered for sale to the general public
							to raise funds for building houses.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center"
					style="text-align: justify">
					<div class="service-box">
						<a href="http://www.onceuponachildcomo.com/"><i
							class="fa fa-4x fa-child text-primary sr-icons"></i></a>
						<h3>Once Upon a Child</h3>
						<p class="text-muted" style="text-align: justify">A store that
							strives to offer a fun and convenient way to sell your gently
							used items. Whether you’re buying or selling, they would love to
							help you find what you’re looking for. They offer payment
							on-the-spot for items we select that meet current style, safety
							and condition standards. We maintain high merchandise standards
							by thoroughly inspecting all toys and equipment for any safety
							recalls.</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<a href="http://www.midmorecycling.com/"><i
							class="fa fa-4x fa-laptop text-primary sr-icons"></i></a>
						<h3>Mid-Mo Recycling</h3>
						<p class="text-muted" style="text-align: justify">Mid-MO
							Recycling specializes in recycling out of date or inoperable
							electronics equipment including computers, monitors, keyboards,
							fax machines, mice, printers, telephone systems, main frame
							computer boards, wire and aluminum. Materials from your
							electronics equipment are processed in their facility and sent
							out to be re-used in a new product. This process helps avoid
							landfill dumping and it allows for responsible resource
							management.</p>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section id="points" class="bg-dark">
		<aside class="bg-dark">
			<div class="container" style="text-align: center">
				<div class="row">

					<h1 class="section-heading">SwaPoints - What's the point, and
						why "SwaProcity"?</h1>
					<i style="color: white"
						class="fa fa-5x fa-money text-primary sr-icons"></i>
					<p class="text-faded">
						<b>SwaProcity is based on the <i>Reciprocity</i> exchanged
							when a community comes together to <i>Swap</i> goods, services,
							and resources.
						</b> Every user starts with zero swap points. Points are earned when
						other users "purchase" the goods, services, and resources you have
						hosted on SwaProcity. They spend points to make those "purchases".
					</p>
					<p class="text-faded">
						<b>Negative points? Negative problemo.</b> Points are meant to
						encourage participation on SwaProcity. Negative points means you
						helped someone avoid throwing their excess items into a landfill
						and keep resources available locally.
					</p>
					<p class="text-faded">
						<b>What do I have to offer?</b> Think of SwaProcity before your
						next trip to donate to your local thrift store giant (they usually
						ship that stuff to headquarters for sorting, and redistribution
						anyway). Have a particular skill? Great! Let others know you can
						provide services to them. Remember that food dehydrator you had to
						have and have only used once but still want to keep it for tomato
						season? List it as a resource that others can use and return.
					</p>

					<p>Here's a little video about capitalism.</p>
						<iframe width="560" height="315"
						src="https://www.youtube.com/embed/qOP2V_np2c0" frameborder="0"
						allowfullscreen></iframe>
					</div>
				</div>
		</aside>
	</section>
	<section id="contact" style="padding: 50px; background-color: #faf6d0">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 text-center">
					<h2 class="section-heading">Let's Get In Touch!</h2>
					<img src="index/img/Reciprocity.jpg" class="img-responsive"
						style="max-width: 75%; margin: auto" alt="">
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