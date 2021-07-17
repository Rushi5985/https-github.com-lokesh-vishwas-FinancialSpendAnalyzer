package com.si.app.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

@Component
public class CORSFilter extends GenericFilterBean {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        httpResponse.addHeader(
                "Access-Control-Allow-Credentials",
                "true");

        httpResponse.addHeader(
                "Access-Control-Allow-Headers",
                "Accept-Encoding, Authorization, Content-Type, X-Requested-With, X-CB-ApiKey, X-CB-Client-Id, X-CB-Client-Auth, X-CB-Researcher-Id");
        httpResponse.addHeader(
                "Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS, HEAD");

        chain.doFilter(request, response);
        
    }
}
