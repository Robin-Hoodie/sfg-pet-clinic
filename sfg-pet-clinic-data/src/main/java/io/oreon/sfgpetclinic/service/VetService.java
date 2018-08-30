package io.oreon.sfgpetclinic.service;

import io.oreon.sfgpetclinic.model.Pet;
import io.oreon.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Pet pet);

    Set<Vet> findAll();
}
