package a2s11197826.s2s11197526.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VaccineReportController {
	
@GetMapping("/VaccineReport")
public String report()
{
	return"VaccineReport";
}

}
