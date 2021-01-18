package it.univpm.streamingmoviesFilters;

import java.util.ArrayList;

import it.univpm.streamingmoviesModel.StreamingWebsite;

public class FirstUpdateFilter extends Filter{

	protected FirstUpdateFilter(String category) {
		super(category);
	}
	public void toFilter(ArrayList<StreamingWebsite> ListToFilter) {
		ArrayList<StreamingWebsite> filtered = new ArrayList<StreamingWebsite>();
		for (StreamingWebsite website : ListToFilter) {
			if (website.getCreateDate().equals(category)) filtered.add(website);
		}
	};

}
