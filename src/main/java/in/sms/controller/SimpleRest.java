package in.sms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRest {

	@GetMapping("/")
	public String home()
	{
		return "this is home screen";
	}
}
