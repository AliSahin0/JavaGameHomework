package gameHomework;

public class Gamer {
	
	private int gamerId;
	private String gamerFirstName;
	private String gamerLastName;
	private String gamerAge;
	
	public Gamer () {
		
	}
	
	public Gamer (int gamerId, String gamerFirstName, String gamerLastName, String gamerAge) {
		
		this.gamerId=gamerId;
		this.gamerFirstName=gamerFirstName;
		this.gamerLastName=gamerLastName;
		this.gamerAge=gamerAge;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getGamerFirstName() {
		return gamerFirstName;
	}

	public void setGamerFirstName(String gamerFirstName) {
		this.gamerFirstName = gamerFirstName;
	}

	public String getGamerLastName() {
		return gamerLastName;
	}

	public void setGamerLastName(String gamerLastName) {
		this.gamerLastName = gamerLastName;
	}

	public String getGamerAge() {
		return gamerAge;
	}

	public void setGamerAge(String gamerAge) {
		this.gamerAge = gamerAge;
	}

}
