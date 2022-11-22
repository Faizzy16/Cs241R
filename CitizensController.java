package vaccination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import vaccination.Citizen_New;
import vaccination.CitizenRepository;

@Controller
public class CitizensController {

	@Autowired
	CitizenRepository repo;
	
	@GetMapping("/Citizen")
	public String Citizen_New(){
		
		return "Homem.html";
		
	}
	
	@GetMapping("/saveCitizenData")
	@ResponseBody
	public String saveData(Citizen_New CitizenData) {
		repo.save(CitizenData);
		return "success";
		
		
	}
}