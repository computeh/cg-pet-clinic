package guru.springframework.cgpetclinic.model;

import java.io.Serializable;

/**
 * Simple JavaBean domain object with an id property.
 * Used as a base class for objects needing this property
 *
 * @author Caleb
 */

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
