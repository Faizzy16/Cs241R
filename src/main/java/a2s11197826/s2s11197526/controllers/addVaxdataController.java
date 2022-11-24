package a2s11197826.s2s11197526.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import a2s11197826.s2s11197526.entities.addvax;
import a2s11197826.s2s11197526.repository.addvaxrepo;

@Controller
public class addVaxdataController {

	

@Autowired
	private addvaxrepo addvaxrepo;


@GetMapping("/addVaxData")
public String add(Model model)
{

	model.addAttribute("addvax", new addvax());
	return"addVaxdata";
	
}
@PostMapping("/addv")
public String travelc (addvax addvax, RedirectAttributes ra)
{
	this.addvaxrepo.save(addvax);
	ra.addAttribute("saved", true);
	return "redirect:/addVaxData";
} 

}

