package a2s11197826.s2s11197526.repository;

import org.springframework.data.repository.CrudRepository;

import a2s11197826.s2s11197526.entities.Citizen;

public interface citizenrepo extends CrudRepository<Citizen, Long> {
    Citizen findByid (int id);
   
}