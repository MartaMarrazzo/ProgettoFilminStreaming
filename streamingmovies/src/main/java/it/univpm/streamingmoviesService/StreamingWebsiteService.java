package it.univpm.streamingmoviesService;

import java.util.ArrayList;
import it.univpm.streamingmoviesModel.StreamingWebsite;


public interface StreamingWebsiteService {
	
	public abstract ArrayList<StreamingWebsite> getWebsites(String url);
	public abstract void deleteWebsite(String Name, boolean isDead);
	
	
	
	
	


}