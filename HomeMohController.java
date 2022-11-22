package vaccination.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeMohController {
	
@GetMapping("/homeMoh")
public String homemoh()
{
	return"homeMoh.html";
}

}
