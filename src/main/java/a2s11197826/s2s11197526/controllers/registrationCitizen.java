package a2s11197826.s2s11197526.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import a2s11197826.s2s11197526.entities.Citizen;
import a2s11197826.s2s11197526.repository.citizenrepo;

@Controller
public class registrationCitizen {
    @Autowired
	private citizenrepo citizenrepo;

@GetMapping("/Registercitizen")
public String search(Model model)
{
	model.addAttribute("citizen", new Citizen());

	return "Registerascitizen";
}
@PostMapping("/Regcitizen")
public String travelc (Citizen citizen, RedirectAttributes ra)
{
	this.citizenrepo.save(citizen);
	ra.addAttribute("saved", true);
	return "redirect:/Registercitizen";
} 
}
