package week4GameBackend;

public class GamePlayerManager extends BasePlayerManager {

	PlayerCheckService playerCheckService;
	
	public GamePlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
		
	}
	
	public void add(Player player) {
		if(playerCheckService.CheckIfRealPerson(player))
		{
			System.out.println(player.getFirstName()+" "+ player.getLastName()+" has been added the server.");
		}else {
			System.out.println("Giriþ bilgileriniz geçersiz.");
		}
		
	}
	
	public void del(Player player) {
		System.out.println(player.getFirstName()+" "+ player.getLastName()+" has been removed the server.");
	}
	
	
	public void update(Player playerold,Player playernew) {
		System.out.println(playerold.getFirstName()+" "+ playernew.getLastName()+"'s information has been updated.");
		System.out.println(playerold.getFirstName()+" ==> "+playernew.getFirstName());
		System.out.println(playerold.getLastName()+" ==> "+playernew.getLastName());
		System.out.println(playerold.getNickname()+" ==> "+playernew.getNickname());
		System.out.println(playerold.getMail()+" ==> "+playernew.getMail());
		System.out.println(playerold.getDateOfBirth() +" ==> "+playernew.getDateOfBirth());
		System.out.println(playerold.getNationalId()+" ==> "+playernew.getNationalId());
		
	}
	
	
		
}

	

	
	
	

