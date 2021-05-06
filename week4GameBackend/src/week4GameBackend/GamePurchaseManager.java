package week4GameBackend;

public class GamePurchaseManager implements GameService{

	@Override
	public void sell(Game game, Player player) {
		System.out.println(game.getName()+ " has been bought by " + player.getFirstName()+ " "+ player.getLastName()+
				"\nOld Price: "+game.getPrice()+"\nDiscount: "+game.getDiscount()+"\nNew Price: "+game.getNewPrice());
		
	}

	@Override
	public void rebate(Game game, Player player) {
		System.out.println(game.getName()+ " has been rebated by " + player.getFirstName()+ " "+ player.getLastName());
		
	}
	

}
