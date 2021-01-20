package it.univpm.streamingmoviesModel;

import java.util.ArrayList;

import it.univpm.streamingmoviesService.StreamingWebsiteServiceIMPL;


public class StreamingWebsite extends StreamingWebsiteServiceIMPL {
	private String Name;
	private String Country;
	private String UpdateDate;
	private String CreateDate;
	private boolean isDead;
	private int updateTime;
	private int quantity;
	ArrayList<StreamingWebsite> getStreamingWebsite(String url) {
		return null;
	}
	
	public StreamingWebsite( String Name,String Country, 
			String UpdateDate,String CreateDate, boolean isDead, int updateTime, int quantity) {
		this.setName(Name);
		this.setCountry(Country);
		this.setUpdateDate(UpdateDate);
		this.setCreateDate(CreateDate);
		this.setDead(isDead);
		this.setUpdateTime(updateTime);
		this.setQuantity(quantity);
	
	}

	public String getName() {
		return Name;
	}

    public void setName(String name) {
		Name = name;
	}

	public String getCountry() {
		return Country;
	}
	
	public void setCountry(String country) {
		Country = country;
	}

	public String getUpdateDate() {
		return UpdateDate;
	}

	public void setUpdateDate(String updateDate) {
		UpdateDate = updateDate;
	}

	public String getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(String createDate) {
		CreateDate = createDate;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public int getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(int updateTime) {
		this.updateTime = updateTime;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}