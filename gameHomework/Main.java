package gameHomework;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1, "Ali", "Sahin", "23");
		
		Campaign campaign = new Campaign(1, "Zula indirimi", "Yüzde 80 indirim");
		
		Sales sales = new Sales (1, "Zula", "100");
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager(gamer);
		salesManager.addSales(sales);
		
		

	}

}
