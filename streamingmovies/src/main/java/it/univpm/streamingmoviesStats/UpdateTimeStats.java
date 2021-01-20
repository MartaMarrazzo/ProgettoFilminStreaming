package it.univpm.streamingmoviesStats;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public class UpdateTimeStats extends Stats{
	
	protected int uT;
	
	protected JSONObject UpdateTime = new JSONObject();
	
	public UpdateTimeStats(ArrayList<StreamingWebsite> website) {
		super(website);
	}

	@Override
	public JSONObject returnStats() {
		return this.UpdateTime;
	}
	/*
	 * metodo da cui si ottengono le statistiche sul tempo medio di update
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void StreamingStats() {
		this.uT=((StreamingWebsite) super.website.get(uT)).getUpdateTime();
		UpdateTime.put("Tempo di update", uT);
	}
}
