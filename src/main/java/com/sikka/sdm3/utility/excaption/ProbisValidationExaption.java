package com.sikka.sdm3.utility.excaption;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ProbisValidationExaption extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private HttpStatus status;
	private String pesan;

}
