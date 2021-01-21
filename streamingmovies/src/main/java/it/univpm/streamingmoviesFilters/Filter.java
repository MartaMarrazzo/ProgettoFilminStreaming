package it.univpm.streamingmoviesFilters;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;
/**
 * 
 * @author marra
 *
 *classe Filter in cui definiamo tre arrayList destinati a contenere elementi
 *filtratri per nazione di hosting(country), ultimo update (last update) e data di 
 *creazione (first update)
 *
 *
 */
public class Filter {
	
protected String category;
protected ArrayList<Filter> filteringCountries = new ArrayList<>();
protected ArrayList<Filter> filteringFirstUpdates = new ArrayList<>();
protected ArrayList<Filter> filteringLastUpdates = new ArrayList<>();

protected Filter(String category) {
	this.category=category;
}

public Filter() {
}

public void toFilter(ArrayList<StreamingWebsite> ListToFilter) {};

public ArrayList<Filter> getCountryFilter() {
	return filteringCountries;
	}

public ArrayList<Filter> getLastUpdateFilter() {
	return filteringLastUpdates;
}

public ArrayList<Filter> getCreateDateFilter() {
	return filteringFirstUpdates;
	}

/**
 * parseFilter verifica che il JSONObject contenga la chiave interessata
 * (rispettivamente country,create_date,update_date affinchè queste vengano 
 * aggiunte all' arraylist relativo
 * 
 * @param body
 */
public void parseFilter(JSONObject body) {
	Filter f;
	if (body.containsKey("country")) {
		f = new HostingNationFilter((String) body.get("country"));
		filteringCountries.add(f);
	}
	if (body.containsKey("create_date")) {
		f = new FirstUpdateFilter((String) body.get("create_date"));
		filteringCountries.add(f);
	}
	if (body.containsKey("update_date")) {
		f = new LastUpdateFilter((String) body.get("update_date"));
		filteringCountries.add(f);
	}
	
}
		
}
