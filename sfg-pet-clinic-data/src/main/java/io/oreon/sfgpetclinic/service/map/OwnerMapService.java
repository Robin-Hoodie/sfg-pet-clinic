package io.oreon.sfgpetclinic.service.map;

import io.oreon.sfgpetclinic.model.Owner;
import io.oreon.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName() {
        throw new UnsupportedOperationException();
    }
}
