package day42.dataAccess.abstracts;

import day42.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : "+ customer.firstName );
		
		
	}

}
