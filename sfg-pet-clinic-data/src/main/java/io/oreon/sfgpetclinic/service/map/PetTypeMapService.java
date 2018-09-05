package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.PetType;
import io.oreon.sfgpetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
