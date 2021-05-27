package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	
	
	
}
