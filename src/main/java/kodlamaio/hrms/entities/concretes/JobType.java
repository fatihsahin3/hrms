package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_types")
public class JobType {
	
	@Id
	@GeneratedValue
	@Column(name="job_type_id")
	private int id;
	
	@Column(name="job_name")
	private String name;

	public JobType(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public JobType() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
