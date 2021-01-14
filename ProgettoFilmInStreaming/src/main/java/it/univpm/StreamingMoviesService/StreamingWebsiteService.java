package it.univpm.StreamingMoviesService;

import java.util.ArrayList;

import it.univpm.StreamingMoviesModel.StreamingWebSite;


public interface StreamingWebsiteService {
	
	public abstract ArrayList<StreamingWebSite> getWebsites(String url);
	public abstract void deleteWebsite(String Name, boolean isDead);
	
}
