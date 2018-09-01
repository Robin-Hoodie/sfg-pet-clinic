package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Pet;
import io.oreon.sfgpetclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

}
