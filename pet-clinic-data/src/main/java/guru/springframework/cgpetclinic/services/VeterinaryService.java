package guru.springframework.cgpetclinic.services;

import guru.springframework.cgpetclinic.model.Veterinary;

import java.util.Set;

public interface VeterinaryService {

    Veterinary findById(Long id);

    Veterinary save(Veterinary veterinary);

    Set<Veterinary> findAll();
}
