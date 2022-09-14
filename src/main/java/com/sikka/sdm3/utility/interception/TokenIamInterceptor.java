package com.sikka.sdm3.utility.interception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import com.sikka.sdm3.utility.excaption.ProbisValidationExaption;

public class TokenIamInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(
			  HttpServletRequest request,
			  HttpServletResponse response, 
			  Object handler) throws Exception {
			    
				String tokenIam = request.getHeader("Token-IAM");
				
		if (tokenIam == null) {
			System.out.println("Tidak Ditemukan TOken Iam");
			throw new ProbisValidationExaption(HttpStatus.BAD_REQUEST, "error iam ga ada");
		}else {
			System.out.println(tokenIam);
			return true;
		}

		
		
	}

}
