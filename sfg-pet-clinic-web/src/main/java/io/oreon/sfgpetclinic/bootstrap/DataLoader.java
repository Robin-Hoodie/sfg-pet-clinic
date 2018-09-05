package io.oreon.sfgpetclinic.bootstrap;

import io.oreon.sfgpetclinic.model.Owner;
import io.oreon.sfgpetclinic.model.Pet;
import io.oreon.sfgpetclinic.model.PetType;
import io.oreon.sfgpetclinic.model.Vet;
import io.oreon.sfgpetclinic.service.OwnerService;
import io.oreon.sfgpetclinic.service.PetTypeService;
import io.oreon.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dogPetType = new PetType("Dog");
        dogPetType = petTypeService.save(dogPetType);

        PetType catPetType = new PetType("Cat");
        catPetType = petTypeService.save(catPetType);

        System.out.println("Loaded pet types... ");

        Owner owner = new Owner("Sherlock", "Holmes", "Baker Street 13B", "London", "02 376 43 12");
        Pet dog = new Pet(LocalDate.now(), dogPetType, owner, "Rosco");
        owner.addPet(dog);
        ownerService.save(owner);
        owner = new Owner("Bat", "Man", "Castle Road 1", "Gotham", "06 666 66 66");
        Pet cat = new Pet(LocalDate.now(), catPetType, owner, "Spooky");
        owner.addPet(cat);
        ownerService.save(owner);



        System.out.println("Loaded owners..");

        Vet vet = new Vet( "Sam", "Axe");
        vetService.save(vet);
        vet = new Vet("Jessie", "Porter");
        vetService.save(vet);

        System.out.println("Loaded vets...");
    }
}
