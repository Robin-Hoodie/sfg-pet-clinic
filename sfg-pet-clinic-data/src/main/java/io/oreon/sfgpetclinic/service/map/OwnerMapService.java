package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Owner;
import io.oreon.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner entity) {
        return super.save(entity.getId(), entity);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findByLastName() {
        throw new UnsupportedOperationException();
    }
}
