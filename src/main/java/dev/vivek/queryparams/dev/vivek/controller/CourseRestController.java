package dev.vivek.queryparams.dev.vivek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CourseRestController {
    @GetMapping(value="/course", produces = "text/plain")
    public String getCourseDetails(@RequestParam(value = "name", defaultValue ="JRTP" ) String name){
        String msg = "";
        if("SBMS".equals(name)){
            msg = "Spring Boot Microservices";
        }else if("JRTP".equals(name)){
            msg = "Java Restful Web Services";
        }else if("AWS".equals(name)){
            msg = "Amazon Web Services";
        }else{
            msg = "Please vivist for more details";
        }
        return msg;
    }
    @GetMapping(value="/fee")
    public String getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname){
        String msg = cname + " course fee is 5000/- and trainer name is " + tname;
        return msg;
    }
}
