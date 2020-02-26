package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.FinalBean;
import com.example.demo.model.Student;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student1(ModelMap model) {
		/*Student s1 = new Student();
		List<String> sArr = new ArrayList<String>();
		sArr.add("c");
		sArr.add("d");
		s1.setAge(11);
		s1.setId(11);
		s1.setName(sArr);*/
		//model.addAttribute("SpringWeb", s1);	
		//model.addAttribute("myStu", new Student());	
		return "Student";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String student2(FinalBean finBean, ModelMap model) {
		
		System.out.println(finBean.getStuList().get(0).getName());
		System.out.println(finBean.getStuList().get(0).getAge());
		System.out.println(finBean.getStuList().get(0).getId());
		System.out.println(finBean.getStuList().get(1).getName());
		System.out.println(finBean.getStuList().get(1).getAge());
		System.out.println(finBean.getStuList().get(1).getId());
		
		model.addAttribute("name", finBean.getStuList().get(0).getName());
		model.addAttribute("age", finBean.getStuList().get(0).getAge());
		model.addAttribute("id", finBean.getStuList().get(0).getId());
		
		
		return "StuResult";
	}
}
