package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTypeService;
import kodlamaio.hrms.entities.concretes.JobType;

@RestController
@RequestMapping("api/jobtypes")
public class JobTypesController {
	
	private JobTypeService jobTypeService;
	
	@Autowired
	public JobTypesController(JobTypeService jobTypeService) {
		super();
		this.jobTypeService = jobTypeService;
	}
	
	@GetMapping("/getall")
	public List<JobType> getAll(){
		return this.jobTypeService.getAll();
	}

}
