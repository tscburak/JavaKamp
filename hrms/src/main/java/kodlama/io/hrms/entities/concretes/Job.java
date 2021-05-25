package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name="job_positions")
public class Job {
	@Id
	@GeneratedValue
	@Column(name="id")
		private int id;
	
	@Column(name="position")
		private String position;

	public Job() {
		
	}
}
