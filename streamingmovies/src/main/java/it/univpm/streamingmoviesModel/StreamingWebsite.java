package it.univpm.streamingmoviesModel;

import java.util.ArrayList;

import it.univpm.streamingmoviesService.StreamingWebsiteServiceIMPL;


public class StreamingWebsite extends StreamingWebsiteServiceIMPL {
	private String Name;
	private String Country;
	private float UpdateTime;
	private String UpdateDate;
	private String CreateDate;
	private boolean isDead;
	ArrayList<StreamingWebsite> getStreamingWebsite(String url) {
		return null;
	}
	
	public StreamingWebsite( String Name,String Country,float UpdateTime, 
			String UpdateDate,String CreateDate, boolean isDead ) {
		this.setName(Name);
		this.setCountry(Country);
		this.setUpdateTime(UpdateTime);
		this.setUpdateDate(UpdateDate);
		this.setCreateDate(CreateDate);
		this.setDead(isDead);
	
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





	public float getUpdateTime() {
		return UpdateTime;
	}





	public void setUpdateTime(float updateTime) {
		UpdateTime = updateTime;
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

}