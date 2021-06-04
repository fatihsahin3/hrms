package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdDetailsDto;

@RestController
@RequestMapping("api/jobads")
public class JobAdsController {
	
	private JobAdService jobAdService;

	@Autowired
	public JobAdsController(JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAd>> getAll(){
		return this.jobAdService.getAll();
	}
	
	@GetMapping("/getAllActiveJobAdsList")
	public DataResult<List<JobAd>> getAllActiveJobAdsList(){
		return this.jobAdService.getAllActiveJobAdsList();
	}
	
	@GetMapping("/getJobAdsByDetails")
	public DataResult<List<JobAdDetailsDto>> getJobAdsByDetails(){
		return this.jobAdService.getJobAdsByDetails();
	}

}
