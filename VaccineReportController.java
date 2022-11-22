package vaccination.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VaccineReportController {
	
@GetMapping("/VaccineReport")
public String report()
{
	return"VaccineReport.html";
}

}
