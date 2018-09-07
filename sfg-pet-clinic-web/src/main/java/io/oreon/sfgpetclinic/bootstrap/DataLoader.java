package io.oreon.sfgpetclinic.bootstrap;

import io.oreon.sfgpetclinic.model.*;
import io.oreon.sfgpetclinic.service.OwnerService;
import io.oreon.sfgpetclinic.service.PetTypeService;
import io.oreon.sfgpetclinic.service.SpecialtyService;
import io.oreon.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) {
        boolean noPetTypes = petTypeService.findAll().isEmpty();
        if (noPetTypes) {
            loadData();
        }
    }

    private void loadData() {
        PetType dogPetType = new PetType("Dog");
        dogPetType = petTypeService.save(dogPetType);
        PetType catPetType = new PetType("Cat");
        catPetType = petTypeService.save(catPetType);
        System.out.println("Loaded pet types... ");

        Specialty radiology = new Specialty("radiology");
        radiology = specialtyService.save(radiology);
        Specialty surgery = new Specialty("surgery");
        surgery = specialtyService.save(surgery);
        Specialty dentistry = new Specialty("dentistry");
        dentistry = specialtyService.save(dentistry);
        System.out.println("Loaded specialties... ");

        Owner owner = new Owner("Sherlock", "Holmes", "Baker Street 13B", "London", "02 376 43 12");
        Pet dog = new Pet(LocalDate.now(), dogPetType, owner, "Rosco");
        owner.addPet(dog);
        ownerService.save(owner);
        owner = new Owner("Bat", "Man", "Castle Road 1", "Gotham", "06 666 66 66");
        Pet cat = new Pet(LocalDate.now(), catPetType, owner, "Spooky");
        owner.addPet(cat);
        ownerService.save(owner);
        System.out.println("Loaded owners..");

        Vet vet = new Vet("Sam", "Axe");
        vet.addSpecialty(radiology);
        vetService.save(vet);
        vet = new Vet("Jessie", "Porter");
        vet.addSpecialty(surgery);
        vetService.save(vet);
        System.out.println("Loaded vets...");
    }
}
