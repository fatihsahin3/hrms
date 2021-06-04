package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAd;
import kodlamaio.hrms.entities.dtos.JobAdDetailsDto;

public interface JobAdDao extends JpaRepository<JobAd, Integer>{
	
	@Query("From JobAd where is_active = true")
	List<JobAd> getAllActiveJobAdsList();
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobAdDetailsDto(e.companyName, jt.jobTitle, j.openPositionQty, j.publishedAt, j.deadline) From JobAd j Inner Join j.employer e Inner Join j.jobTitle jt")
	List<JobAdDetailsDto> getJobAdsByDetails();

}
