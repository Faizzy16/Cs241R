package vaccination.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import vaccination.Citizen_New;
import vaccination.service.CitizenService;

@RestController
public class RegisterascitizenController {
	
	

	private CitizenService citizensservice;
@GetMapping("/Registerascitizen")
public String register(Model model)
{
	
	Citizen_New citizen = new Citizen_New();
	model.addAttribute("Citizen",citizen);
	return"Registerascitizen.html";
}
@PostMapping("/registerCitizen")
public String registerCitizen(@ModelAttribute("citizen")Citizen_New citizen)
{
	System.out.println(citizen);
	 return "index";
}
}
