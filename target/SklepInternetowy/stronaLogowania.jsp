<%--
  Created by IntelliJ IDEA.
  User: barts
  Date: 26.09.2019
  Time: 12:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>stronaLogowania</title>
</head>
<body>


<link rel="stylesheet" type="text/css" href="https://.....">

<div class="col-lg-1"></div>
<div class="col-xs-12 col-lg-5 loginForm">

    <h2>Witamy w Sklepinternetowy.pl</h2>

    <input type="text" name="userLogin" class="text username" placeholder="login">

    <input type="password" name="userLogin" class="text password" placeholder="hasło">

    <button id="hpLoginFormSubmit" class="btn btn-lg sh-component ctabutton btn btn-fullcolor btn--rounded">zaloguj się</button>

    <a class="lostPasswordRemainder" title="Zapomniałeś hasła? Kliknij tu" data-position="homepage">Zapomniałeś hasła? Kliknij tu</a>

    <!--        <h3 class="regMsg">Nie masz jeszcze konta?</h3>

            <button id="hpLoginFormRegForm" class="btn btn-lg sh-component ctabutton btn btn-fullcolor btn--rounded">zarejestruj się</button>-->

</div>

<div class="col-xs-12 col-lg-5 quickOrder">
    <div class="content">
        <a href="#order" class="quickOrderButton hvr-icon-wobble-horizontal" title="Złóż szybkie zamówienie">
            <div>
                <span class="glyphicon glyphicon-shopping-cart"></span>
                <span>złóż zamówienie</span>
                <span class="arrowGo glyphicon glyphicon-arrow-right hvr-icon"></span>
            </div>
        </a>
    </div>
    <div class="content">
        <a href="#orders" class="extendContractButton hvr-icon-wobble-horizontal" title="Złóż szybkie zamówienie">
            <span class="glyphicon glyphicon-calendar"></span>
            <span>przedłuż umowę *</span>
            <span class="arrowGo glyphicon glyphicon-arrow-right hvr-icon"></span>
        </a>
    </div>
    <p>* Chcesz skorzystać z oferty <a href="https://........./">ZOSTAŃ Z NAMI</a>?<br> Użyj przycisku PRZEDŁUŻ UMOWĘ</p>
</div>
<div class="col-lg-1"></div>

<div class="col-xs-12 goToSite">
    <span class="lab">Chcesz dowiedzieć się więcej?<br> Zapraszamy na <a href="http://sklepinternetowy.pl" title="SKLEP - Twój Sklep Internetowy" target="_blank">sklepinternetowy.pl</a></span>
    <a href="http://sklepinternetowy.pl" title="Sklep - Twój Sklep Internetowy" target="_blank" class="img"><img src="http://www.praktycznyebiznes.pl/wp-content/uploads/2014/11/sklep.jpg" alt="Sklep - Twój Sklep Internetowy"></a>
</div>

</body>
</html>
