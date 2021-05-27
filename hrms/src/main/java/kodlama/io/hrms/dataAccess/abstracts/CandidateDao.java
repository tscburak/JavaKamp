package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.CandidateUser;

public interface CandidateDao extends JpaRepository<CandidateUser, Integer> {

}
