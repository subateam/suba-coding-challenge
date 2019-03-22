package au.com.suba.codingchallenge.rest;

import au.com.suba.codingchallenge.data.CustomerRepository;
import au.com.suba.codingchallenge.domain.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/customer")
public class CustomerController {

    public CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(Customer customer) {
        Customer newCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(newCustomer);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer customerId) {
        Optional<Customer> queryResponse = customerRepository.findById(customerId);

        if (queryResponse.isPresent()) {
            return ResponseEntity.ok(queryResponse.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
