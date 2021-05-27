package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.EmployerUser;

public interface EmployerService {
	List<EmployerUser> getAll();
}
