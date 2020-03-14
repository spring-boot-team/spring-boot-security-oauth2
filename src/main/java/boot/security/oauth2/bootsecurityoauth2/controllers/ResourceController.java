package boot.security.oauth2.bootsecurityoauth2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {

	@GetMapping("/greetings/{user}")
	public String helloWorld(@PathVariable String user) {
		return "Hello "+user;
	}
}
