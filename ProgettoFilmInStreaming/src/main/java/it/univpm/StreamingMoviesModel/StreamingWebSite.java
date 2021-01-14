package it.univpm.StreamingMoviesModel;


	import java.util.ArrayList;

import it.univpm.StreamingMoviesService.StreamingWebsiteServiceImpl;


	public class StreamingWebSite extends StreamingWebsiteServiceImpl {
		private String Name;
		private String Country;
		private float UpdateTime;
		private String UpdateDate;
		private String CreateDate;
		private boolean isDead;
		ArrayList<StreamingWebSite> getStreamingWebsite(String url) {
			return null;
		}
		
		public StreamingWebSite( String Name,String Country, String UpdateDate,String CreateDate, boolean isDead ) {
			this.setName(Name);
			this.setCountry(Country);
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
