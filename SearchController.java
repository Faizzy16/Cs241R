package vaccination.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchController {
	
@GetMapping("/Search")
public String search()
{
	return"Search.html";
}

}