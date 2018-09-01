package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Owner;
import io.oreon.sfgpetclinic.service.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }
}
