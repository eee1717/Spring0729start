package com.korea.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor 
@AllArgsConstructor//모든 생성자를 받아낼수있는 명령어  defalut생성자가 필요할때  이명령어를 사용하면 오류가 나기도한다 .
@Builder  //이 코드가 추가되면 
@Component
public class TestDTO {
  
	private String name;
	private String age;
	private String addr;

	
}
