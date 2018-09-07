package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Specialty;
import io.oreon.sfgpetclinic.service.SpecialtyService;
import org.springframework.stereotype.Service;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {
}
