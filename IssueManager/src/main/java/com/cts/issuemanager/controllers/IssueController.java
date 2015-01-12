package com.cts.issuemanager.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IssueController {
	@RequestMapping(value="/issue",method=RequestMethod.GET)
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<String>("hello!",HttpStatus.OK);
	}
	
}
