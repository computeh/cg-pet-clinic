package guru.springframework.cgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Simple JavaBean domain object with an id property.
 * Used as a base class for objects needing this property
 *
 * @author Caleb
 */

@Getter
@Setter
@MappedSuperclass // JPA Base Class

public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
