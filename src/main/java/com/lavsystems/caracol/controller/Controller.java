package com.lavsystems.caracol.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "{caracol-problem.basepath}")
public class Controller {


	@GetMapping(value = "${caracol-problem.enpoints.get-dias}")
	public ResponseEntity<String> diasSuperficie(){

		log.debug(":::::::::::CARACOL PROBLEM!::::::::::::::");
		 int h = 10;
		 int dia = 5;
		 int ret = 3;
		 int real = 0;

		int diaspSalir = 0;

			while(true){

			 real += dia-ret;

			 if(real >=h){

				 //log.debug("dias {}", diaspSalir);
				 break;
			 }

			 diaspSalir++;
			 log.debug("dias salir {}",diaspSalir);
		}

		log.debug(":::::::::::FINISH CARACOL PROBLEM!::::::::::::::");
		return new ResponseEntity<String>(new String ("dias en salir: "+diaspSalir),HttpStatus.OK);
	}

}
