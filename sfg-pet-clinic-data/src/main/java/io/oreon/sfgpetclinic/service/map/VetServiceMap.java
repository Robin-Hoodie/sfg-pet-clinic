package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Vet;
import io.oreon.sfgpetclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }
}
