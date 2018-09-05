package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Owner;
import io.oreon.sfgpetclinic.service.OwnerService;
import io.oreon.sfgpetclinic.service.PetService;
import io.oreon.sfgpetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner save(Owner owner) {
        if (owner != null) {
            owner.getPets().forEach(pet -> {
                if (pet.getType() != null) {
                    if (pet.isNew()) {
                        pet.setType(petTypeService.save(pet.getType()));
                    }
                } else {
                    throw new RuntimeException("Type is required!");
                }
                if (pet.isNew()) {
                    pet.setId(petService.save(pet).getId());
                }
            });
            return super.save(owner);
        }
        return null;
    }

    @Override
    public Owner findByLastName() {
        throw new UnsupportedOperationException();
    }
}
