package guru.springframework.cgpetclinic.services;

import guru.springframework.cgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
