package guru.springframework.cgpetclinic.services.map;

import guru.springframework.cgpetclinic.model.Veterinary;
import guru.springframework.cgpetclinic.services.CrudService;

import java.util.Set;

public class VeterinaryServiceMap extends AbstractMapService<Veterinary, Long>
        implements CrudService<Veterinary, Long> {
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
        return super.save(object.getId(), object);
    }

    @Override
    public Veterinary findById(Long id) {
        return super.findById(id);
    }
}
