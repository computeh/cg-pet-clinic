package guru.springframework.cgpetclinic.bootstrap;

import guru.springframework.cgpetclinic.model.Owner;
import guru.springframework.cgpetclinic.model.PetType;
import guru.springframework.cgpetclinic.model.Veterinary;
import guru.springframework.cgpetclinic.services.OwnerService;
import guru.springframework.cgpetclinic.services.PetTypeService;
import guru.springframework.cgpetclinic.services.VeterinaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinaryService veterinaryService;
    private final PetTypeService petTypeService;

    // Spring wires data into a Spring context
    // @autowired is not needed if we are using a constructor configuration


    public DataLoader(OwnerService ownerService, VeterinaryService veterinaryService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.veterinaryService = veterinaryService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Caleb");
        owner1.setLastName("G");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michael");
        owner2.setLastName("Weston");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Veterinary vet1 = new Veterinary();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        veterinaryService.save(vet1);

        Veterinary vet2 = new Veterinary();
        vet2.setFirstName("George");
        vet2.setLastName("Watkins");

        veterinaryService.save(vet2);

        System.out.println("Loaded Vets....");



    }
}
