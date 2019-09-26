<%@ page import="pl.sda.bart.controller.LangProvider" %>
<html>
<body>
<H2>WITAMY BARDZO W NASZYM SKLEPIE INTERNETOWYM!</H2>
<H1><%= LangProvider.INSTANCE.getMessage("greeting")%></H1>
<a href="/languageServlet?lang=pl"></a>
podaj linka z neta do obrazku z pl
<a href="/languageServlet?lang=en"></a>

//https://www.britishairways.com/cms/global/assets/images/Wherewefly/routemaps2010/flags/24/gb.png

<form method="post" action="waliduj.jsp">
    Podaj swój login: <br />
    <input type="text" name="name" /><br />
    Podaj swoje hasło: <br />
    <input type="text" name="password" /><br />
    <input type="submit" value="zaloguj">
</form>

</body>
</html>