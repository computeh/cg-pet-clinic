package guru.springframework.cgpetclinic.repositories;

import guru.springframework.cgpetclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
