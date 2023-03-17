package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(min = 5, max = 60)
    private String location;

    public String getLocation() {
        return location;
    }

    public Employer() {
    }

}
