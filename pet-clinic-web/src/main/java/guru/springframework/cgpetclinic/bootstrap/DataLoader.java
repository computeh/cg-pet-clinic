package guru.springframework.cgpetclinic.bootstrap;

import guru.springframework.cgpetclinic.model.Owner;
import guru.springframework.cgpetclinic.model.Veterinary;
import guru.springframework.cgpetclinic.services.OwnerService;
import guru.springframework.cgpetclinic.services.VeterinaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VeterinaryService veterinaryService;

    // Spring wires data into a Spring context
    // @autowired is not needed if we are using a constructor configuration
    public DataLoader(OwnerService ownerService, VeterinaryService veterinaryService) {
        this.ownerService = ownerService;
        this.veterinaryService = veterinaryService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Caleb");
        owner1.setLastName("Ghir");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
       // owner2.setId(2L);
        owner2.setFirstName("Michael");
        owner2.setLastName("Weston");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Veterinary vet1 = new Veterinary();
       // vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        veterinaryService.save(vet1);

        Veterinary vet2 = new Veterinary();
       // vet2.setId(2L);
        vet2.setFirstName("George");
        vet2.setLastName("Watkins");

        veterinaryService.save(vet2);

        System.out.println("Loaded Vets....");



    }
}
