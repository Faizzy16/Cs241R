package a2s11197826.s2s11197526.repository;

import org.springframework.data.repository.CrudRepository;

import a2s11197826.s2s11197526.entities.addvax;

public interface addvaxrepo extends CrudRepository<addvax, Long> {
    addvax findByid (int id);
    
}
