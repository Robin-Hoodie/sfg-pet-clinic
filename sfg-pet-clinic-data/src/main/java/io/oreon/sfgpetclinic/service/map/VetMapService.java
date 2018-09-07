package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Vet;
import io.oreon.sfgpetclinic.service.SpecialtyService;
import io.oreon.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet save(Vet vet) {
        vet.getSpecialties().forEach(specialty -> {
            if (specialty.isNew()) {
                specialty.setId(specialtyService.save(specialty).getId());
            }
        });
        return super.save(vet);
    }
}
