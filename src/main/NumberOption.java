package main;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: jbdennin
 * Date: 11/19/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class NumberOption {

    protected HttpServletRequest request;

    public NumberOption(HttpServletRequest request) {
        this.request = request;
    }

    public abstract Table getResponse();
}
