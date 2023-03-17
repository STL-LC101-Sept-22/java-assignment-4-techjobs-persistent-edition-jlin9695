package org.launchcode.techjobs.persistent.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Skill extends AbstractEntity {

    @NotBlank
    @Size(min = 5, max = 60)
    private String description;

    public String getDescription() {
        return description;
    }

    public Skill() {
    }

}