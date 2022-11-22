package vaccination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import A2_S11197826.entities.*;
@Repository
public interface CitizenRepository extends JpaRepository<Citizen_New,Long> {
	

}
