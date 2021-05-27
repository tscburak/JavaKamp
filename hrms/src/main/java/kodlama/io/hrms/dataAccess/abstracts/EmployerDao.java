package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.EmployerUser;

public interface EmployerDao extends JpaRepository<EmployerUser, Integer> {

}
