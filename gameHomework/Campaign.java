package gameHomework;

public class Campaign {
	
	private int campaignId;
	private String campaignName;
	private String campaignAmounth;
	
	public Campaign() {
		
	}
	
	public Campaign (int campaignId, String campaignName, String campaignAmounth) {
		
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignAmounth() {
		return campaignAmounth;
	}

	public void setCampaignAmounth(String campaignAmounth) {
		this.campaignAmounth = campaignAmounth;
	}
	
}
