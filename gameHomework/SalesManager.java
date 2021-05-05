package gameHomework;

public class SalesManager implements SalesService{
	
	Gamer gamer;
	
	public SalesManager() {
		
	}
	
	public SalesManager(Gamer gamer) {
		this.gamer=gamer;
	}

	
	public void gameSales(Sales sales, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getGamerFirstName() + " " + gamer.getGamerLastName() + "isimli oyuncu " +  sales.getGameName() +
				           "oyunu" + campaign.getCampaignAmounth() + "kampanyas� ile alm��t�r");
	}
	@Override
	public void addSales(Sales sales) {
		
		System.out.println(gamer.getGamerFirstName() + " " + gamer.getGamerLastName() + " oyuncusuna" + " " +
							sales.getGameName() + "oyun sat��� ger�ekle�ti");
		
		
	}

	@Override
	public void deleteSales(Sales sales) {
		System.out.println(sales.getGameName() + "oyunu sat��� iptal edildi");
		
	}

	@Override
	public void updateSales(Sales sales) {
		
		System.out.println(sales.getGameName() + "oyunu sat��� silindi");
		
		
	}

}
