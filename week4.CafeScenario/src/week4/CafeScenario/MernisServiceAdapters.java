package week4.CafeScenario;


import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result=true;
		
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.nationalId) ,
					customer.firstName.toUpperCase() ,
					customer.lastName.toUpperCase() ,
					customer.dateOfBirth.year);
			
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
