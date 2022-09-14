package com.sikka.sdm3.utility.configutation;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sikka.sdm3.utility.interception.TokenIamInterceptor;

@Configuration
public class TokenIamConfig implements WebMvcConfigurer {
	
	
	// ini ga bisa karana di clas webMvcCOnfigure tidak ada method addInterCeptor
//	@Override
//	public void addInterCeptor (InterceptorRegistry registry) {
//		
//		registry.addInterceptor(new TokenIamInterceptor()).addPathPatterns("/api/v1/**");
//	}
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
		
       registry.addInterceptor(new TokenIamInterceptor()).addPathPatterns("/api/v1/**");
    }
	
}
