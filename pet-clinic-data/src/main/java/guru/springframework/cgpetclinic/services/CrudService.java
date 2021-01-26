package guru.springframework.cgpetclinic.services;

import java.util.Set;

/**
 * Common interface that mimics the Spring data repository (CrudRepository)
 *
 * @author Caleb
 * @param <T>
 * @param <ID>
 */

public interface CrudService<T, ID>  {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
