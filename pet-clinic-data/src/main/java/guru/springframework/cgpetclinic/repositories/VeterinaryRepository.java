package guru.springframework.cgpetclinic.repositories;

import guru.springframework.cgpetclinic.model.Veterinary;
import org.springframework.data.repository.CrudRepository;

public interface VeterinaryRepository extends CrudRepository<Veterinary, Long> {
}
