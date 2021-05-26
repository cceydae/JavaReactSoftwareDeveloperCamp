package day42.dataAccess.concretes;

import day42.business.abstracts.CustomerCheckService;
import day42.dataAccess.abstracts.BaseCustomerManager;
import day42.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		
		else {
			System.out.println("Not a valid person");
		}
		
	}
	
	
	
}
