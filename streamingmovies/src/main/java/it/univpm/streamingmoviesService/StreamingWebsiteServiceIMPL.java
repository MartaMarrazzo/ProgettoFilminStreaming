package it.univpm.streamingmoviesService;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;


import it.univpm.streamingmoviesFilter.*;
import it.univpm.streamingmoviesModel.StreamingWebsite;
import it.univpm.streamingmoviesUtil.StreamingWebsiteDomains;

public class StreamingWebsiteServiceIMPL implements StreamingWebsiteService{
	ArrayList<StreamingWebsite> websites;
	@SuppressWarnings("static-access")
	@Override
	public ArrayList<StreamingWebsite> getWebsites(String url) throws Exception {
		StreamingWebsiteDomains website = new StreamingWebsiteDomains();
		try {
			this.websites = website.GetJsonObject(url);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(this.websites);
		return websites;
	}

	@Override
	public ArrayList<StreamingWebsite> returnFilters(JSONObject body, String url)  {

	
		@SuppressWarnings("unused")
		StreamingWebsiteDomains website = new StreamingWebsiteDomains();
		ArrayList<StreamingWebsite> websiteslist = new ArrayList<>();
		Filter fil = new Filter();
			fil.parseFilter(body);
		if (fil.getCountryFilter().isEmpty())
			for (Filter filt : fil.getCountryFilter())
				filt.toFilter(websiteslist);
		if (fil.getCreateDateFilter().isEmpty())
			for (Filter filt : fil.getCreateDateFilter())
				filt.toFilter(websiteslist);
		if (fil.getLastUpdateFilter().isEmpty())
			for (Filter filt : fil.getLastUpdateFilter())
				filt.toFilter(websiteslist);

		return websiteslist;
	}
	

	@Override
	public ArrayList<StreamingWebsite> returnStatistics() {
		return null;
	}

}
