package guru.springframework.cgpetclinic.repositories;

import guru.springframework.cgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
