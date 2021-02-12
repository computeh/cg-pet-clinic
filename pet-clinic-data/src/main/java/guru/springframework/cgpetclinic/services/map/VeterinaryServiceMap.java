package guru.springframework.cgpetclinic.services.map;

import guru.springframework.cgpetclinic.model.Specialty;
import guru.springframework.cgpetclinic.model.Veterinary;
import guru.springframework.cgpetclinic.services.SpecialtyService;
import guru.springframework.cgpetclinic.services.VeterinaryService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VeterinaryServiceMap extends AbstractMapService<Veterinary, Long> implements VeterinaryService {

    private final SpecialtyService specialtyService;

    public VeterinaryServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Veterinary> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Veterinary object) {
        super.delete(object);
    }

    @Override
    public Veterinary save(Veterinary object) {

        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(specialty -> {
                if(specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty); // Creates ID for Specialty
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public Veterinary findById(Long id) {
        return super.findById(id);
    }
}
