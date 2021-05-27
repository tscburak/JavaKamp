package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers_users")
@AllArgsConstructor
@NoArgsConstructor

public class CandidateUser extends User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String firstName;
	
	@Column(name="surname")
	private String lastName;
	
	@Column(name="identity_number")
	private String nationalId;
	
	@Column(name="birth_year")
	private String birthYear;
}
