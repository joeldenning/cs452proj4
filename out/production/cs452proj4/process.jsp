<%@ page import="main.One" %><%
    String sNumber = request.getParameter("number");
    Number number;
    switch(sNumber) {
        case "1":
            number = new One(request);
            break;
        case "2":
            break;
        case "3":
            break;
        case "4":
            break;
        default:
            number = null;
            break;
    }
%>