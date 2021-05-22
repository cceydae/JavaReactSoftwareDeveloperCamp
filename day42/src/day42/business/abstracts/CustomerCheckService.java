package day42.business.abstracts;

import day42.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
}
