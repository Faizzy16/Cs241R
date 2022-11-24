package a2s11197826.s2s11197526.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeMohController {
	
@GetMapping("/homeMoh")
public String homemoh()
{
	return"HomeMoh";
}

}
/*home for moh */