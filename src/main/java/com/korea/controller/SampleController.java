package com.korea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class SampleController {

	@GetMapping("/test")
	public void test() {
		log.info("TESTSETSET!!!!");
	}
}
