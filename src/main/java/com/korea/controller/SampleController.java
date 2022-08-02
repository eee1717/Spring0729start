package com.korea.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.domain.SampleDTO;
import com.korea.domain.SampleDTOList;
import com.korea.domain.TodoDTO;
import com.korea.domain.TodoDTO2;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public void test1()
	{
		log.info("URL: /test");
		
	}
	
	
	@GetMapping("/test2") //method가 get인녀석만 받아드린다.
	public void test2() {
		log.info("URL :/test2");
	}
	
	
	@PostMapping("/test3") //method가 post인 녀석만 받아드린다. 
	public void test3() {
		log.info("URL :/test3");
	}
	
	@GetMapping("/SampleDTO")
	public void SampleDTO(SampleDTO dto)
	{
	
		
		log.info("dto's info:" +dto);
	}
	
	@GetMapping("/test4") //실패함 이유알아내기  웹페이지에 RequestParam에들어갈 값을 넣어야지 console에 정상작동호출함.
	public void test4(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		log.info("URL: /test4");
		log.info("name:"+name+ "age :"+age);
	}
	
	@GetMapping("/test5")
	public void test5(@RequestParam("name") String[] list) {
		log.info("URL :/test5");
		for(String str :list) {
			System.out.println(str+" ");
		}
	}
	
	@GetMapping("/test6") //실패함   SampleDTO랑연결
	public void test6(SampleDTOList list) {
		log.info("URL: /test6");
		for(SampleDTO dto : list.getList()) {
			log.info(dto);
		}
	}
	
	@InitBinder //특정한 날짜코드로 통일가능
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(java.util.Date.class,new CustomDateEditor(df,false));
	}
	
	
	@GetMapping("/test7") //TodoDTO랑 연결 성공
	public void test7(TodoDTO dto) {
		log.info("URL: /test7");
		log.info(dto);
	}
	
	@GetMapping("/test8") //TodoDTO랑 연결 성공
	public void test8(TodoDTO2 dto) {
		log.info("URL: /test8");
		log.info(dto);
	}
	
	
	
}
