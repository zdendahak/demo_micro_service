package cz.zdenek.demo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cz.zdenek.demo.model.CustomerEntity;
import cz.zdenek.demo.model.QuotationEntity;
import cz.zdenek.demo.model.SubscriptionEntity;
import cz.zdenek.demo.repository.CustomerRepository;
import cz.zdenek.demo.repository.QuotationRepository;
import cz.zdenek.demo.repository.SubscriptionRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	QuotationRepository quotationRepository;

	@Autowired
	SubscriptionRepository subscriptionRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		// Inserting the data in the h2 db.
		CustomerEntity first = new CustomerEntity(1, null, "A", "A", "A", "A", "A", LocalDate.now());
		// first.save() method
		CustomerEntity savedFirst = customerRepository.save(first);

		CustomerEntity first1 = new CustomerEntity(2, null, "B", "B", "B", "B", "B", LocalDate.now());
		// first1.save() method
		CustomerEntity savedFirst1 = customerRepository.save(first1);

		// Inserting the data in the h2 db.
		QuotationEntity second = new QuotationEntity(1, LocalDate.now(), new BigDecimal(1), LocalDate.now(), savedFirst );
		// second.save() method
		QuotationEntity savedSecond = quotationRepository.save(second);

		// Inserting the data in the h2 db.
		SubscriptionEntity third = new SubscriptionEntity(1, LocalDate.now(), LocalDate.now(), savedSecond);
		// third.save() method
		SubscriptionEntity savedThird = subscriptionRepository.save(third);
	}

}
