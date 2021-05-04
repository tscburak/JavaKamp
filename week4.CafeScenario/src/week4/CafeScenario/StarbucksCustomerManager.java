package week4.CafeScenario;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	public void addServer(Customer customer)  {
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println(customer.firstName + " " + customer.lastName + " has been added the server!");
			
		}else {
//			throw new Exception("Not a valid person.");
			System.out.println("Giriþ bilgileriniz geçersiz.");
		}
		
		
		}
}
		
		


		
	
	
	



