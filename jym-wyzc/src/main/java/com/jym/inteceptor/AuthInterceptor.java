package com.jym.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		
		String value = arg1.getHeader("Access-Control-Allow-Origin");
		if (value == null || value.length() <= 0 || !value.equals("*")){
			arg1.addHeader("Access-Control-Allow-Origin","*");
		}
		
		value = arg1.getHeader("AAccess-Control-Allow-Methods");
		if (value == null || value.length() <= 0 || value.indexOf("GET, POST, OPTIONS") < 0){
			arg1.addHeader("AAccess-Control-Allow-Methods","GET, POST, OPTIONS");
		}
		
		value = arg1.getHeader("Access-Control-Allow-Headers");
		if (value == null || value.length() <= 0 || 
				value.indexOf("Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With") < 0){
			arg1.addHeader("Access-Control-Allow-Headers","Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
		}
		
		return true;
	}
}
