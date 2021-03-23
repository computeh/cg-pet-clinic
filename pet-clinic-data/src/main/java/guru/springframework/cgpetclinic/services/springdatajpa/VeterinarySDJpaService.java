package guru.springframework.cgpetclinic.services.springdatajpa;

import guru.springframework.cgpetclinic.model.Veterinary;
import guru.springframework.cgpetclinic.repositories.VeterinaryRepository;
import guru.springframework.cgpetclinic.services.VeterinaryService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VeterinarySDJpaService implements VeterinaryService {
    
    private final VeterinaryRepository veterinaryRepository;

    public VeterinarySDJpaService(VeterinaryRepository veterinaryRepository) {
        this.veterinaryRepository = veterinaryRepository;
    }

    @Override
    public Set<Veterinary> findAll() { // Creates a new HashSet and adds all instances of Vet to it
                                       // This is considered good programming practice
        Set<Veterinary> vets = new HashSet<>();
        veterinaryRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Veterinary findById(Long aLong) {
        return veterinaryRepository.findById(aLong).orElse(null);
    }

    @Override
    public Veterinary save(Veterinary object) {
        return veterinaryRepository.save(object);
    }

    @Override
    public void delete(Veterinary object) {
        veterinaryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        veterinaryRepository.deleteById(aLong);
    }
}
