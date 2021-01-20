package it.univpm.streamingmoviesFilters;

import java.util.ArrayList;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public class LastUpdateFilter extends Filter{

	
	protected LastUpdateFilter(String category) {
		super(category);
	}
	

	public void toFilter(ArrayList<StreamingWebsite> ListToFilter) {
		ArrayList<StreamingWebsite> filtered = new ArrayList<StreamingWebsite>();
		for (StreamingWebsite website : ListToFilter) {
			if (website.getUpdateDate().equals(category)) filtered.add(website);
		}
	}
}
