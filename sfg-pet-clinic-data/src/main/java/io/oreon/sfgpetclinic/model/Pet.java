package io.oreon.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {

    private LocalDate birthDate;

    private PetType type;

    private Owner owner;

    private String name;

    public Pet(LocalDate birthDate, PetType type, Owner owner, String name) {
        this.birthDate = birthDate;
        this.type = type;
        this.owner = owner;
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
