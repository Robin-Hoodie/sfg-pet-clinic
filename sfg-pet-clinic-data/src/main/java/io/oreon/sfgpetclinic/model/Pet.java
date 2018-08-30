package io.oreon.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;
}
