package io.oreon.sfgpetclinic.service;

import io.oreon.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName();
}
