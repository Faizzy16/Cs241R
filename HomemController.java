package vaccination.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomemController {
	
@GetMapping("/Homem")
public String homem()
{
	return"Homem.html";
}

}