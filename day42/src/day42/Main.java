package day42;

import java.time.LocalDate;

import day42.adapters.MernisServiceAdepter;
import day42.dataAccess.abstracts.BaseCustomerManager;
import day42.dataAccess.concretes.NeroCustomerManager;
import day42.dataAccess.concretes.StarbucksCustomerManager;
import day42.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.save(new Customer(1,"Ceyda","Eser",LocalDate.of(2000,07,18),"12345678900"));
		
	
		BaseCustomerManager customerManager1=new StarbucksCustomerManager(new MernisServiceAdepter());
		customerManager1.save(new Customer(1,"Seda","Eser",LocalDate.of(1993,07,18),"12345678900"));
	
	}

}


