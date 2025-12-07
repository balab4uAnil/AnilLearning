package com.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestClass {
	Logger logger=LoggerFactory.getLogger(RestClass.class);
     @GetMapping("/welcome")

     public ResponseEntity<String> getMsg(){
         logger.info("getmsg started...........!");
    	   String s="spring web is created by anil kumar";
    	   logger.info("getmsg ended.......!");
    	 return ResponseEntity.ok(s);
     }
}
