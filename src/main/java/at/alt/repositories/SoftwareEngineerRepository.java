package at.alt.repositories;


import at.alt.entities.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {

}
