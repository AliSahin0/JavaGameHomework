package gameHomework;

public class GamerManager implements GamerService  {

	@Override
	public void add(Gamer gamer) {
		System.out.println("Player added: " + gamer.getGamerFirstName() + " " + gamer.getGamerLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Player deleted: " + gamer.getGamerFirstName() + " " + gamer.getGamerLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Player updated: " + gamer.getGamerFirstName() + " " + gamer.getGamerLastName());
		
	}

}
