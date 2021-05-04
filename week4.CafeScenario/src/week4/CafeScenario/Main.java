package week4.CafeScenario;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		
		customerManager.addServer(new Customer(1,"Burak","Taþçý",new DateOfBirth(2001,5,28),"00000000000"));
		
		
		
		
		

	}

}
