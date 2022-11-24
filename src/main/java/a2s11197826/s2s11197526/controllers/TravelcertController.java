package a2s11197826.s2s11197526.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import a2s11197826.s2s11197526.entities.travelcertificate;
import a2s11197826.s2s11197526.repository.travelcertificaterepo;

@Controller
public class TravelcertController {
	@Autowired
	private travelcertificaterepo travelcertificaterepo;

@GetMapping("/TravelCertificate")
public String search(Model model)
{
	model.addAttribute("travelcertificate", new travelcertificate());

	return "Travelcert";
}
@PostMapping("/travelform")
public String travelc (travelcertificate travelcertificate, RedirectAttributes ra)
{
	this.travelcertificaterepo.save(travelcertificate);
	ra.addAttribute("saved", true);
	return "redirect:/TravelCertificate";
} 
}
