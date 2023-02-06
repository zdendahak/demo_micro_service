package cz.zdenek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.zdenek.demo.model.CustomerEntity;
import cz.zdenek.demo.model.QuotationEntity;

/**
 * Repository for management of {@link QuotationEntity}.
 *
 * @author Zdeněk Hák
 */
public interface QuotationRepository extends JpaRepository<QuotationEntity, Integer> {

}
