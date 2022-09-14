package com.sikka.sdm3.tester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("api/v1/izin_belajar/upk/anggotatimseleksi/test")
public class TesController {
	
	
	@GetMapping("/testku")
	public String tessatu(
			@RequestHeader(value ="Token-IAM") String tokenIam,
			@RequestHeader(value ="Nama") String nama){
			
		String iString ="Hallo :"+nama;
		
		return iString;
		
	}

}
