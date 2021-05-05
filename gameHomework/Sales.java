package gameHomework;

public class Sales {
	
	private int salesId;
	String gameName;
	String price;
	
	
	public Sales () {
		
	}
	
	public Sales(int salesId, String gameName, String price) {
		
		this.salesId=salesId;
		this.gameName=gameName;
		this.price=price;
		
	}

	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
