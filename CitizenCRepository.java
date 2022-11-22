package vaccination;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizenCRepository extends JpaRepository<Citizen, Long>{

}