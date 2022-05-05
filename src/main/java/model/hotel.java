package model;

public class hotel {
	private String name;
	private Integer rank;
	private Integer regularWeekdayPrice;
	private Integer regularWeekendPrice;
	private Integer rewardWeekdayPrice;
	private Integer rewardWeekendPrice;
	
	public hotel(String name, Integer rank, Integer regularWeekdayPrice, Integer regularWeekendPrince,
			Integer rewardWeekdayPrice, Integer rewardWeekendPrice) {
		super();
		this.name = name;
		this.rank = rank;
		this.regularWeekdayPrice = regularWeekdayPrice;
		this.regularWeekendPrice = regularWeekendPrince;
		this.rewardWeekdayPrice = rewardWeekdayPrice;
		this.rewardWeekendPrice = rewardWeekendPrice;
	}

	public String getName() {
		return name;
	}

	public Integer getRank() {
		return rank;
	}

	public Integer getRegularWeekdayPrice() {
		return regularWeekdayPrice;
	}

	public Integer getRegularWeekendPrice() {
		return regularWeekendPrice;
	}

	public Integer getRewardWeekdayPrice() {
		return rewardWeekdayPrice;
	}

	public Integer getRewardWeekendPrice() {
		return rewardWeekendPrice;
	}
	
	

}
