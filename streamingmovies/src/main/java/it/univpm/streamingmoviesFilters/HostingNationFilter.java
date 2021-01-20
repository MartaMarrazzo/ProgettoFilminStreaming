package it.univpm.streamingmoviesFilters;

import java.util.ArrayList;


import it.univpm.streamingmoviesModel.StreamingWebsite;

public class HostingNationFilter extends Filter {

	protected HostingNationFilter(String category) {
		super(category);
	}

	
	public void toFilter(ArrayList<StreamingWebsite> ListToFilter) {
		ArrayList<StreamingWebsite> filtered = new ArrayList<StreamingWebsite>();
		for (StreamingWebsite website : ListToFilter) {
			if (website.getCountry().equals(category)) filtered.add(website);
		}
	}


}
