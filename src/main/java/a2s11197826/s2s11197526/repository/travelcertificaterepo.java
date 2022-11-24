package a2s11197826.s2s11197526.repository;

import org.springframework.data.repository.CrudRepository;

import a2s11197826.s2s11197526.entities.travelcertificate;

public interface travelcertificaterepo extends CrudRepository<travelcertificate, Long> {
    travelcertificate findBycertificateId (int certificateId);
    
}
