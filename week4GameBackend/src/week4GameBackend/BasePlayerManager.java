package week4GameBackend;

public abstract class BasePlayerManager implements PlayerService{	
	
	public void add(Player player) {
		System.out.println(player.getFirstName()+" "+ player.getLastName()+" has been added the server.");
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
