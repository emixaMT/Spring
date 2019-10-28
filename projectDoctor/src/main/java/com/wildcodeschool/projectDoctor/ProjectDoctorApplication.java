package com.wildcodeschool.projectDoctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ProjectDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDoctorApplication.class, args);
	}

	@RequestMapping("/doctor/")
    @ResponseBody
    public String index() {
        return "<ul>"
        		+ "<li><a href='./1'>First doctor</a></li>"
        		+ "<li><a href='./2'>Second doctor</a></li>"
        		+ "<li><a href='./3'>Third doctor</a></li>"
        		+ "<li><a href='./4'>Fourth doctor</a></li>"
        	 + "</ul>";
        
    }
	@RequestMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
    @ResponseBody
    public String secondDoctor() {
		return "Partick Troughton";
	}
	
	@RequestMapping("/doctor/3")
    @ResponseBody
    public String thirdDoctor() {
		return "Jon Pertwee";
	}
	
	@RequestMapping("/doctor/4")
    @ResponseBody
    public String fourthDoctor() {
		return "Tom Baker";
	}
}
