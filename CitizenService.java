package vaccination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import vaccination.CitizenCRepository;
import vaccination.Citizen;

@Service
public class CitizenService {
	
	
	@Autowired
    private CitizenCRepository repo;
	
	public List<Citizen> listAll() {
        return repo.findAll();
    }
     
    
     
    public Citizen get(long id) {
        return repo.findById(id).get();
    }

}