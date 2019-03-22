package au.com.suba.codingchallenge.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private Integer customerId;
    private String name;
    private String phoneNumber;

    public Customer(Integer customerId, String name, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


}
