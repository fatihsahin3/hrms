package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdDetailsDto;

public interface JobAdService {
	
	DataResult<List<JobAd>> getAll();
	DataResult<List<JobAd>> getAllActiveJobAdsList();
	DataResult<List<JobAdDetailsDto>> getJobAdsByDetails();
	DataResult<JobAd> getById(int id);
	Result add(JobAd candidate);
	Result update(JobAd candidate);
	Result delete(JobAd candidate);

}
