package org.glenlivet;

import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by appledev122 on 1/16/17.
 */
public class MyFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        boolean throwException = servletRequest.getParameter("ex") != null;
        if(throwException) {
            throw new MyException("my exception");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

}
