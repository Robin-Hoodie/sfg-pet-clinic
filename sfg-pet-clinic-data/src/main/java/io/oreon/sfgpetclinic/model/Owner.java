package io.oreon.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {

    private Set<Pet> pets = new HashSet<>();

    public Owner(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Owner() {
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
