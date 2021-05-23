package day42.adapters;

import day42.business.abstracts.CustomerCheckService;
import day42.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdepter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
		result=proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(),
				customer.getDateOfBirth().getYear());
		}
		catch(Exception e) {
			System.out.println("Not a valid person");
		}
		return result;
	}

}
