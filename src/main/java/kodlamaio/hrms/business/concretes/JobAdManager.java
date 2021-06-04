package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdDao;
import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdDetailsDto;

@Service
public class JobAdManager implements JobAdService{
	
	private JobAdDao jobAdDao;

	@Autowired
	public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}

	@Override
	public DataResult<List<JobAd>> getAll() {
		return new SuccessDataResult<List<JobAd>>(jobAdDao.findAll());
	}

	@Override
	public DataResult<JobAd> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobAd candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(JobAd candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(JobAd candidate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobAd>> getAllActiveJobAdsList() {
		return new SuccessDataResult<List<JobAd>>(jobAdDao.getAllActiveJobAdsList());
	}

	@Override
	public DataResult<List<JobAdDetailsDto>> getJobAdsByDetails() {
		return new SuccessDataResult<List<JobAdDetailsDto>>(jobAdDao.getJobAdsByDetails());
	}

}
