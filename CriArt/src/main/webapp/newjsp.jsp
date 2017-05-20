<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <title>Adventure Bootstrap Template</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS
   ================================================== -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Animate CSS
   ================================================== -->
        <link rel="stylesheet" href="css/animate.min.css">

        <!-- Font Icons
   ================================================== -->
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/et-line-font.css">

        <!-- Nivo Lightbox CSS
   ================================================== -->
        <link rel="stylesheet" href="css/nivo-lightbox.css">
        <link rel="stylesheet" href="css/nivo_themes/default/default.css">

        <!-- Owl Carousel CSS
   ================================================== -->
        <link rel="stylesheet" href="css/owl.theme.css">
        <link rel="stylesheet" href="css/owl.carousel.css">

        <!-- BxSlider CSS
   ================================================== -->
        <link rel="stylesheet" href="css/bxslider.css">

        <!-- Main CSS
        ================================================== -->
        <link rel="stylesheet" href="css/style.css">

        <!-- Google web font
   ================================================== -->
        <link href='https://fonts.googleapis.com/css?family=Raleway:700' rel='stylesheet' type='text/css'>

    </head>

    <body data-spy="scroll" data-target=".navbar-collapse" data-offset="50">


        <!-- Preloader section
        ================================================== -->
        <section  class="preloader">

            <div class="sk-rotating-plane"></div>

        </section>


        <!-- Navigation section
        ================================================== -->
        <section class="navbar navbar-fixed-top custom-navbar" role="navigation">
            <div class="container">

                <div class="navbar-header">
                    <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon icon-bar"></span>
                        <span class="icon icon-bar"></span>
                        <span class="icon icon-bar"></span>
                    </button>
                    <a href="#home" class="smoothScroll navbar-brand">CriART</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">

                        <!-- <li><a href="#home" class="smoothScroll">HOME</a></li> -->

                        <!-- <li><a href="#work" class="smoothScroll">WORK</a></li> -->
                        <!-- <li><a href="#about" class="smoothScroll">ABOUT</a></li> -->
                        <!-- <li><a href="#team" class="smoothScroll">TEAM</a></li> -->
                        <!-- <li><a href="#portfolio" class="smoothScroll">GALLERY</a></li>--> 
                        <!-- <li> <a href="#plan" class="smoothScroll">PLANS</a></li>-->
                        <li><a href="#contact" class="smoothScroll">Nova Conta</a></li>
                    </ul>
                </div>

            </div>
        </section>

        
 
        
        <!-- Navigation section
        ================================================== -->
        <section class="navbar navbar-fixed-top custom-navbar" role="navigation">
            <div class="container">

                <div class="navbar-header">
                    <button class="navbar-toggle">
                        <span class="icon icon-bar"></span>
                        <span class="icon icon-bar"></span>
                        <span class="icon icon-bar"></span>
                    </button>
                    <a href="#home" class="smoothScroll navbar-brand">CriART</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#contact" class="smoothScroll">Nova Conta</a></li>
                    </ul>
                </div>

            </div>
        </section>

        
        <!-- Work section
        ================================================== -->
        <section id="work" class="parallax-section">
            <div class="container">
                <div class="row">

                


                    <!-- Work Owl Carousel section
                    ================================================== -->
                    <div id="owl-work" class="owl-carousel">
                        
                        <c:forEach items="${usuarios}" var="usuario">
                            

                        <div class="item col-md-4 col-sm-6 wow fadeInUp" data-wow-delay="0.3s">
                            <i class="icon-profile-male medium-icon"></i>
                            <h3><c:out value="${usuario.nome}"/></h3>
                            <hr>
                            <p>e-mail: <c:out value="${usuario.email}"/></p>
                            <p>CPF: <c:out value="${usuario.cpf}"/></p>
                            <p>Nascimento: <c:out value="${usuario.nascimento}"/></p>
                            <p>Telefone: <c:out value="${usuario.telefone}"/></p>
                        </div>
                        
                        </c:forEach>

                    </div>

                </div>
            </div>
        </section>


        <!-- Footer section
        ================================================== -->
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-md-12 col-sm-12">

                        <h2 class="wow bounceIn">CriArt</h2>
                        <ul class="social-icon">
                            <li><a href="#" class="fa fa-facebook wow fadeIn" data-wow-delay="0.3s"></a></li>
                            <li><a href="#" class="fa fa-github wow fadeIn" data-wow-delay="1.3s"></a></li>
                        </ul>
                        <p>Copyright &copy; 2017 Adventure Studio 

                            | Design: <a rel="nofollow" href="http://www.tooplate.com/free-templates" target="_parent">Tooplate</a></p>

                    </div>
                </div>
            </div>
        </footer>


        <!-- Javascript 
        ================================================== -->
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/smoothscroll.js"></script>
        <script src="js/nivo-lightbox.min.js"></script>
        <script src="js/jquery.easing-1.3.js"></script>
        <script src="js/plugins.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.parallax.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/custom.js"></script>

    </body>
</html>