package cz.zdenek.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.zdenek.demo.model.CustomerEntity;
import cz.zdenek.demo.model.SubscriptionEntity;

/**
 * Repository for management of {@link SubscriptionEntity}.
 *
 * @author Zdeněk Hák
 */
public interface SubscriptionRepository extends JpaRepository<SubscriptionEntity, Integer> {

}
