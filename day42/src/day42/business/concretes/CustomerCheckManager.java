package day42.business.concretes;

import day42.business.abstracts.CustomerCheckService;
import day42.entities.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

	

}
