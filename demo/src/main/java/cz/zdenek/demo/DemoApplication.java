package cz.zdenek.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cz.zdenek.demo.model.CustomerEntity;
import cz.zdenek.demo.repository.CustomerRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		// Inserting the data in the h2 db.
		CustomerEntity first = new CustomerEntity(1, null, "A", "A", "A", "A", "A", LocalDate.now());
		// first.save() method
		customerRepository.save(first);
	}

}
