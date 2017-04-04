package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(Model model){
		
		Person per = new Person();
		per.setFirstName("Praveen");
		per.setLastName("Aela sudhakar");
		per.setAge(30);
		
		//In real time get data from DB and set it 
		model.addAttribute("person", per);
		
		//refer the HTML name personview.html
		return "personview";
	}
	
	@RequestMapping("/helloPerson")
	public String helloPerson(Model model){
		
		Person per = new Person();
		per.setFirstName("Praveen");
		per.setLastName("Aela sudhakar");
		per.setAge(30);
		
		//In real time get data from DB and set it 
		model.addAttribute("person", per);
		
		//refer the HTML name personview.html
		return "personview";
	}
	 
	 
	
	@ResponseBody
	@RequestMapping("/")
	public String entry(){
		return "My Spring Boot App";
	}
	
}
