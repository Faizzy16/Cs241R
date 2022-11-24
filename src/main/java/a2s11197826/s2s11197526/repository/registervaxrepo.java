package a2s11197826.s2s11197526.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import a2s11197826.s2s11197526.entities.vaxData;


public interface registervaxrepo extends JpaRepository<vaxData, Long> {
    vaxData findByid (int id);
    List<vaxData> findAll();

}