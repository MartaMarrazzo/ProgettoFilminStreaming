package it.univpm.streamingmoviesFilters;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.streamingmoviesModel.StreamingWebsite;

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
