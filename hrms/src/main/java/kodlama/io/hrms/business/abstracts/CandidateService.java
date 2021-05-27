package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entities.concretes.CandidateUser;

public interface CandidateService {
	List<CandidateUser> getAll();
}
