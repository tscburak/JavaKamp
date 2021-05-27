package kodlama.io.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.hrms.entities.concretes.EmployerUser;
import kodlama.io.hrms.business.abstracts.EmployerService;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

	private EmployerService employerService;
	
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}

	@GetMapping("/getall")
	public List<EmployerUser> getAll(){
		return this.employerService.getAll();
	}
	
}
