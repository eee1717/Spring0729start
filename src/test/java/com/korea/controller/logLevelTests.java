package com.korea.controller;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class logLevelTests {

	@Test
	public void test() {
	    log.trace("TraceTest");
	    log.debug("DebugTest");
	    log.info("InfoTest");
	    log.warn("WarnTest");
	}

}
