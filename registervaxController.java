//package vaccination.Controller;
//
//
//
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import com.example.demo.VaccineRegister;
//import com.example.demo.VaccineRegisterRepo;
//
//@Controller
//public class registervaxController {
//	
//	@Autowired
//	VaccineRegisterRepo Vrepo;
//
//	@GetMapping("/VAXReg")
//	public String VAXREG(){
//		
//		return "vaccination_register.html";
//	}
//	
//	@GetMapping("/saveVaxData")
//	public String saveCitizenData(registervax vaxregister) {
//		Vrepo.save(vaxregister);
//		return "Citizen.html";
//	
//}
//}