package vaccination.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TravelcertController {
	
@GetMapping("/TravelCertificate")
public String search()
{
	return"Travelcert.html";
}

}