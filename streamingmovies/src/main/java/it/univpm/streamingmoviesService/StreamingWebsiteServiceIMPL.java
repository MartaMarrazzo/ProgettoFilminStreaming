package it.univpm.streamingmoviesService;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;
import org.yaml.snakeyaml.parser.ParserException;

import it.univpm.streamingmoviesFilters.Filter;
import it.univpm.streamingmoviesModel.StreamingWebsite;
import it.univpm.streamingmoviesUtil.StreamingWebsiteDomains;

public class StreamingWebsiteServiceIMPL implements StreamingWebsiteService{

	@SuppressWarnings("static-access")
	@Override
	public ArrayList<StreamingWebsite> getWebsites(String url) throws ParserException {
		StreamingWebsiteDomains website = new StreamingWebsiteDomains();
		this.websites = website.GetJsonObject(url);
		System.out.println(this.websites);
		return websites;
	}

	@Override
	public ArrayList<StreamingWebsite> returnFilters(JSONObject body, String url)  {

	
		@SuppressWarnings("unused")
		StreamingWebsiteDomains website = new StreamingWebsiteDomains();
		//ArrayList<StreamingWebsite> websiteslist = website.GetJsonObject(url);
		ArrayList<StreamingWebsite> websiteslist = new ArrayList<>();
		Filter fil = new Filter();
		try {
			fil.parseFilter(body);
		} catch (JSONException e) {
			
			e.printStackTrace();
		}
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
