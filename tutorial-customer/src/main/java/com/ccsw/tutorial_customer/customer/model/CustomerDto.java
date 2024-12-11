package com.ccsw.tutorial_customer.customer.model;

import jakarta.validation.constraints.NotBlank;

/**
 * @author Ana Piqueras
 *
 */
public class CustomerDto {

    private Long id;

    @NotBlank
    private String name;

    /**
     * @return id
     */
    public Long getId() {

        return this.id;
    }

    /**
     * @param id new value of {@link #getId}.
     */
    public void setId(Long id) {

        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {

        return this.name;
    }

    /**
     * @param name new value of {@link #getName}.
     */
    public void setName(String name) {

        this.name = name;
    }
}
