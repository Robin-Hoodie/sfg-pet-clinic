package io.oreon.sfgpetclinic.service;

import io.oreon.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName();

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
