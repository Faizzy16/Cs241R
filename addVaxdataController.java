package vaccination.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class addVaxdataController {
	
@GetMapping("/addVaxData")
public String add()
{
	return"addVaxData.html";
	
}


}
