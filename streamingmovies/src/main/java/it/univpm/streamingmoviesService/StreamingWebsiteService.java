package it.univpm.streamingmoviesService;

import java.util.ArrayList;

import org.json.JSONObject;


import it.univpm.streamingmoviesModel.StreamingWebsite;


public interface StreamingWebsiteService {
	
	public ArrayList<StreamingWebsite> websites = new ArrayList<>();
	
	public abstract ArrayList<StreamingWebsite> getWebsites(String url);
	
	public abstract ArrayList<StreamingWebsite> returnFilters(JSONObject filters,String url);
	
	public abstract ArrayList<StreamingWebsite> returnStatistics();
	
	
	
	


}