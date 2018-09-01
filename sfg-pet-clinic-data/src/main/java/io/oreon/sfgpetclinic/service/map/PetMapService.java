package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Pet;
import io.oreon.sfgpetclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }
}
