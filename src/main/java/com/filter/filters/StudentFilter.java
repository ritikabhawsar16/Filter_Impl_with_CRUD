package com.filter.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class StudentFilter implements Filter{

	//Logger logger = LoggerFactory.getLogger(StudentFilter.class);

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("StudentFilter..........");
//		logger.info("[StudentFilter]Inside dofilter Method");
		chain.doFilter(request, response);
	}

}
