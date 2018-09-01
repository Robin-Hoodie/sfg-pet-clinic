package io.oreon.sfgpetclinic.bootstrap;

import io.oreon.sfgpetclinic.model.Owner;
import io.oreon.sfgpetclinic.model.Vet;
import io.oreon.sfgpetclinic.service.OwnerService;
import io.oreon.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner(1L, "Michael", "Weston");
        ownerService.save(owner);
        owner = new Owner(2L, "Fiona", "Glennane");
        ownerService.save(owner);

        System.out.println("Loaded owners..");

        Vet vet = new Vet(1L, "Sam", "Axe");
        vetService.save(vet);
        vet = new Vet(2L, "Jessie", "Porter");
        vetService.save(vet);

        System.out.println("Loaded vets...");
    }
}
