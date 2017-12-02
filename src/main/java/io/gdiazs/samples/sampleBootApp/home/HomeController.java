package io.gdiazs.samples.sampleBootApp.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("salute", "Hello World");
		return "/home/index";
	}
	
}
