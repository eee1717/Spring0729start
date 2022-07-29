package com.korea.domain;

import org.junit.Test;

public class DTOTest {

	@Test
	public void test() {
		
		 
		/*
		 * TestDTO dto = new TestDTO("홍길동","44","대구"); dto.setAddr("울산");
		 */
		
	 TestDTO dto = TestDTO.builder()
			 .age("55")
			 .name("홍길동")
			 .addr("주소주소")
			 .build();
		System.out.println(dto);
		
		
		
	}

}
