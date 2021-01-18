package it.univpm.streamingmoviesFilters;

import java.util.ArrayList;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public class Filter {
protected String category;
protected ArrayList<Filter> filteringCountries = new ArrayList<>();
protected ArrayList<Filter> filteringFirstUpdates = new ArrayList<>();
protected ArrayList<Filter> filteringLastUpdates = new ArrayList<>();
protected Filter(String category) {
	this.category=category;
}
protected void toFilter(ArrayList<StreamingWebsite> ListToFilter) {};

}
