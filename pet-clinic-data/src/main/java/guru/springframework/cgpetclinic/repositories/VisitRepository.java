package guru.springframework.cgpetclinic.repositories;

import guru.springframework.cgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
