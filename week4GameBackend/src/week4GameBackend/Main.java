package week4GameBackend;

public class Main {

	public static void main(String[] args) {

		BasePlayerManager playerManager = new GamePlayerManager(new EdevletServiceAdapters());
		GameService gameManager = new GamePurchaseManager();
		
		DiscountService discountManager = new DiscountManager();
		Game game = new Game(1,"Astroneer","System Era Softworks","Adventure",35,20);
		
		Player player = new Player(1 ,
				"pilwin", "Burak", "Taþçý",
				new DateOfBirth(2001 , 05 , 28) ,
				"buraktasci2001@gmail.com",
				"00000000000");
		
		Player playernew = new Player(1 ,
				"lipwin", "Burak", "Taþçý",
				new DateOfBirth(2001 , 01 , 10) ,
				"buraktasci2001@gmail.com",
				"00000000000");
		
		
		playerManager.add(player);
		System.out.println("----------------");
		playerManager.del(player);
		System.out.println("----------------");
		playerManager.update(player,playernew);
		System.out.println("----------------");
		System.out.println("----------------");
		
		gameManager.sell(game, playernew);
		System.out.println("----------------");
		gameManager.rebate(game, playernew);
		System.out.println("----------------");
		
		discountManager.add(game.getDiscount());
		discountManager.del(game.getDiscount());
		
		

	}

}
