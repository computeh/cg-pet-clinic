package guru.springframework.cgpetclinic.repositories;

import guru.springframework.cgpetclinic.model.Owner;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;

@Configuration
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
