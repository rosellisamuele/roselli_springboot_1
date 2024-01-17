package spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.model.User;

@RestController
public class MyController {

    @GetMapping("/")
	public String index(){
		return "<h1>Hello world!</h1>";
	}

    @GetMapping("/test")
    public String testResponse(){
        return String.format("Hello");
    }

    @GetMapping("/test/{name}")
    public String testResponse(@PathVariable String name){
        return String.format("Hello, %s!", name);
    }

	@GetMapping("/test/{name}/{surname}/{age}")
    public User testResponse(@PathVariable String name, @PathVariable String surname, @PathVariable int age){
        return new User(name,surname,age);
    }
    
}
