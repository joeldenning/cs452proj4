<%@ page import="main.*" %><%
    String sNumber = request.getParameter("number");
    NumberOption number;
    switch(sNumber) {
        case "1":
            number = new One(request);
            break;
        case "2":
            number = new Two(request);
            break;
        case "3":
            number = new Three(request);
            break;
        case "4":
            number = new Four(request);
            break;
        default:
            number = null;
            break;
    }
    try {
        Table table = number.getResponse();
        %><%=table.toHTML()%><%
    } catch( Throwable t ) {
        %>Error:
        <%=t.getMessage()%><%
    }

%>