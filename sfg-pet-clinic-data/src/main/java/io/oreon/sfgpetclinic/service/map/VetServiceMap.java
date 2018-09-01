package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Vet;
import io.oreon.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
