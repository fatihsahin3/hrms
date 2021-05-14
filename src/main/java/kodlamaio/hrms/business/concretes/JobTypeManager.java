package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTypeService;
import kodlamaio.hrms.dataAccess.abstracts.JobTypeDao;
import kodlamaio.hrms.entities.concretes.JobType;

@Service
public class JobTypeManager implements JobTypeService{
	
	private JobTypeDao jobTypeDao;

	public JobTypeManager(JobTypeDao jobTypeDao) {
		super();
		this.jobTypeDao = jobTypeDao;
	}

	@Override
	public List<JobType> getAll() {
		return this.jobTypeDao.findAll();
	}

}
