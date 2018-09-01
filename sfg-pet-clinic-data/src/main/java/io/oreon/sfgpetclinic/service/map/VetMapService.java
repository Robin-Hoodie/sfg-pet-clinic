package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Vet;
import io.oreon.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

}
