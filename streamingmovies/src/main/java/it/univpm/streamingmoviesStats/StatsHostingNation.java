package it.univpm.streamingmoviesStats;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public class StatsHostingNation extends Stats {
	
	private JSONObject hN = new JSONObject();
	
	public StatsHostingNation(ArrayList<StreamingWebsite> website) {
		super(website);
	}
	@Override
	public JSONObject returnStats() {
		return this.hN;
	}
	/*
	 * metodo da cui si ottengono le statistiche sulle nazioni di hosting
	 */
	@Override
	@SuppressWarnings({ "unchecked" })
	public void StreamingStats() {
		int countNull=0;
		int countRu=0;
		int countDe=0;
		int countDk=0;
		int countUs=0;
		int countGb=0;
		int countNl=0;
		int countIt=0;
		int countOther=0;
		for(StreamingWebsite sW : super.website) {
			if(sW.getCountry().contains("null")) countNull++;
			if(sW.getCountry().contains("RU")) countRu++;
			if(sW.getCountry().contains("DE")) countDe++;
			if(sW.getCountry().contains("DK")) countDk++;
			if(sW.getCountry().contains("US")) countUs++;
			if(sW.getCountry().contains("GB")) countGb++;
			if(sW.getCountry().contains("NL")) countNl++;
			if(sW.getCountry().contains("IT")) countIt++;
			if(sW.getCountry().contains("other")) countOther++;
		}
		this.hN.put("null", countNull);
		this.hN.put("RU", countRu);
		this.hN.put("DE", countDe);
		this.hN.put("DK", countDk);
		this.hN.put("US", countUs);
		this.hN.put("GB", countGb);
		this.hN.put("NL", countNl);
		this.hN.put("IT", countIt);
		this.hN.put("other", countOther);
	}
}
