package vaccination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import vaccination.Citizen;
import vaccination.service.CitizenService;

@Controller
public class CitizenController {




	
    @Autowired
    private CitizenService service;

    @GetMapping("/")
    public String add(Model model) {
    	List<Citizen> listCitizen =service.listAll();
        model.addAttribute("Citizen", new Citizen());
		return "index";

    }

    
    @PostMapping("/search")
     public String doSearchCitizen(@ModelAttribute("CitizenSearchFormData") Citizen formData, Model model) {
            Citizen ctn = service.get(formData.getId());
            model.addAttribute("Citizen", ctn);
    		return "index";            
     }

}