package it.univpm.streamingmoviesStats;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public class StatsKeyWord extends Stats {
	
	private JSONObject kW= new JSONObject();
	
	public StatsKeyWord(ArrayList<StreamingWebsite> website) {
		super(website);
	}
	
	public JSONObject returnStats() {
		return this.kW;
	}
	/*
	 * metodo da cui si ottengono le statistiche sulle parole chiave utilizzate
	 */
	@Override
	@SuppressWarnings({ "unchecked" })
	public void StreamingStats() {
		int countFirstKeyword=0;
		int countSecondKeyword=0;
		int countThirdKeyword=0;
		for(StreamingWebsite sW : super.website) {
			if(sW.getName().contains("cinema")) countFirstKeyword++;
			if(sW.getName().contains("movie")) countSecondKeyword++;
			if(sW.getName().contains("streaming")) countThirdKeyword++;
		}
		this.kW.put("cinema", countFirstKeyword );
		this.kW.put("movie", countSecondKeyword);
		this.kW.put("streaming", countThirdKeyword);
	}
}
