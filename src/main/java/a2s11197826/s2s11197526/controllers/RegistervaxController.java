package a2s11197826.s2s11197526.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import a2s11197826.s2s11197526.entities.vaxData;
import a2s11197826.s2s11197526.repository.registervaxrepo;


@Controller
public class RegistervaxController {
	
	@Autowired
	private registervaxrepo registervaxrepo;

@GetMapping("/Registervax")
public String search(Model model)
{
	model.addAttribute("vaxdata", new vaxData());

	return "Registervax";
}
@PostMapping("/regvax")
public String travelc (vaxData vaxdata, RedirectAttributes ra)
{
	this.registervaxrepo.save(vaxdata);
	ra.addAttribute("saved", true);
	return "redirect:/Registervax";
} 
@GetMapping("/searchdata")
public String getData(Model model)
{
	model.addAttribute("vax_data", this.registervaxrepo.findAll());
	return "vaxdatalist";
}
}
