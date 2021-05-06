package week4GameBackend;

public class DiscountManager implements DiscountService {

	@Override
	public void add(int discount) {
		System.out.println("%" + discount + " rate has been added.");
		
	}

	@Override
	public void del(int discount) {
		System.out.println("%" + discount + " rate has been deleted.");
		
	}

	@Override
	public void update(int discount) {
		System.out.println("%" + discount + " rate has been updated.");
		
	}

	

	

	
	

}
