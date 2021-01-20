package it.univpm.streamingmoviesStats;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public abstract class Stats {
	
	protected ArrayList<StreamingWebsite> website;
	
	public Stats(ArrayList<StreamingWebsite> website) {
		this.website=website;
	}
	/*
	 * metodo astratto che consente di lavorare con il JSONObject
	 */
	public abstract JSONObject returnStats();
	/*
	 * metodo astratto che consente di visualizzare le statistiche
	 */
	public abstract void StreamingStats();
}
