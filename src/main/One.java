package main;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: jbdennin
 * Date: 11/19/13
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class One extends NumberOption {
    public One(HttpServletRequest request) {
        super(request);
    }

    @Override
    public Table getResponse() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
