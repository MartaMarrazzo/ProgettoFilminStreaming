package it.univpm.streamingmoviesStats;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;


public class StatsQuantity extends Stats{
	
	protected int q;
	
	JSONObject Total = new JSONObject();
	
	public StatsQuantity(ArrayList<StreamingWebsite> website){
		super(website);
	}
	
	@Override
	public JSONObject returnStats() {
		return this.Total;
	}
	/*
	 * metodo da cui si ottengono le statistiche sulla quantità di siti trovati
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void StreamingStats() {
		this.q=((StreamingWebsite) super.website.get(q)).getQuantity();
		Total.put("Domini trovati", this.q);	
	}  
}
