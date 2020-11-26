package org.ex.controller;

import java.util.ArrayList;
import java.util.List;

import org.ex.domain.JsonObjectVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/rest")
public class HomeController {
	
	//@Controller일때는 String return 값은 view 파일이었음
	//@RestController일 때는 데이터임
	@RequestMapping("/")
	public String helloTEXT() {
		return "Hello REST";
	}
	
	@RequestMapping("/helloJSON")
	public JsonObjectVO helloJSON() {
	
		JsonObjectVO dto = new JsonObjectVO(1, "안녕","RESTFUL");
		
		return dto;
	}
	
	@RequestMapping(value="/helloJSONList")
	public List<JsonObjectVO> helloJSONList() {
	
		JsonObjectVO dto1 = new JsonObjectVO(1, "안녕","RESTFUL");
		JsonObjectVO dto2 = new JsonObjectVO(2, "안녕2","RESTFUL2");
		JsonObjectVO dto3 = new JsonObjectVO(3, "안녕3","RESTFUL2");
		
		List<JsonObjectVO> dtoLst = new ArrayList<>();
		dtoLst.add(dto1);
		dtoLst.add(dto2);
		dtoLst.add(dto3);
		
		return dtoLst;
	}
	
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") Integer pid){
	    return new String[] {"category: "+ cat, "productid:" +pid};
	}

}
