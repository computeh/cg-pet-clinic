package guru.springframework.cgpetclinic.repositories;

import guru.springframework.cgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
