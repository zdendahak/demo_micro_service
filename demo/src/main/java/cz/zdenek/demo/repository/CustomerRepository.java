package cz.zdenek.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cz.zdenek.demo.model.CustomerEntity;

/**
 * Repository for management of {@link CustomerEntity}.
 *
 * @author Zdeněk Hák
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
