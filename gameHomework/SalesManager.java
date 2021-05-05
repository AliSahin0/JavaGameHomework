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
				           "oyunu" + campaign.getCampaignAmounth() + "kampanyasý ile almýþtýr");
	}
	@Override
	public void addSales(Sales sales) {
		
		System.out.println(gamer.getGamerFirstName() + " " + gamer.getGamerLastName() + " oyuncusuna" + " " +
							sales.getGameName() + "oyun satýþý gerçekleþti");
		
		
	}

	@Override
	public void deleteSales(Sales sales) {
		System.out.println(sales.getGameName() + "oyunu satýþý iptal edildi");
		
	}

	@Override
	public void updateSales(Sales sales) {
		
		System.out.println(sales.getGameName() + "oyunu satýþý silindi");
		
		
	}

}
