package it.univpm.streamingmoviesController;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.streamingmoviesModel.StreamingWebsite;

@RestController
public class StreamingMoviesController {
	public String url;
	@Autowired
	StreamingWebsite website;

/**	
 * rotte per effettuare delle chiamate GET su postman:
 * sono state scelte tre parole chiave per effettuare la ricerca dei siti streaming
 * le quali vengono chiamate rispettivamente dalle rotte FirstKeyword-SecondKeyword-ThirdKeyword
 * sarebbe possibile effettuare la stessa chiamata con il metodo seguente:
 * 
 * @GetMapping("/FirstKeyword")
	public ResponseEntity<Object> getWebSites(@RequestParam(value = "cinema" , defaultValue = "cinema") String keyword ) throws Exception
	
	{url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + keyword;
	return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);
		
	}*/
	
	
	
	@RequestMapping(value="FirstKeyword",method = RequestMethod.GET)
	public ResponseEntity<Object> getWebSites1(@RequestParam(value = "cinema" , defaultValue = "cinema") String FirstKeyword) throws Exception
{
		url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + FirstKeyword;
		return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);
}
	
	@RequestMapping(value="SecondKeyword",method= RequestMethod.GET)
	public ResponseEntity<Object> getWebSites2(@RequestParam(value = "movie" , defaultValue = "movie") String SecondKeyword) throws Exception
{	
		url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + SecondKeyword;
		return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);
	}
	
@RequestMapping(value="ThirdKeyword",method = RequestMethod.GET)
	public ResponseEntity<Object> getWebSites3(@RequestParam(value = "streaming" , defaultValue = "streaming") String ThirdKeyword) throws Exception
{
		
		url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + ThirdKeyword;
		return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);


	}

/**
 * Effettuiamo una richiesta di tipo POST che ci consente di aggiungere informazioni 
 * alla richiesta che effettuiamo: tali informazioni riguardano le categorie in base
 * ale quali è possibile filtrare
 * @param body
 * @param FirstKeyword  
 * @param createdate filtriamo in base alla data di creazione del sito streaming
 * @param updatedate filtriamo in base all' ultimo film caricato dal sito streaming
 * @param country    filtriamo in base 
 * @return chiamiamo un metodo implementato nel Service grazie al quale ottenere un 
 * ArrayList di domini ottenuti in base al filtraggio
 */

@RequestMapping(value="filter",method = RequestMethod.POST)
public ResponseEntity<Object> returnFilters(@RequestBody JSONObject body,
		@RequestParam(name = "domain", defaultValue = "") String FirstKeyword,
		@RequestParam(value = "create_date", defaultValue = "") String createdate,
		@RequestParam(value = "update_date", defaultValue = "") String updatedate,
		@RequestParam(value = "country", defaultValue = "") String country)

{	
	
	url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + FirstKeyword;
	return new ResponseEntity<>(website.returnFilters(body,url),HttpStatus.OK);
}

/**
 * Effettuiamo una chiamata con metodo GET per visualizzare le statistiche relative
 * ai vari parametri
 * @param body
 * @param FirstKeyword
 * @param createdate
 * @param updatedate
 * @param country
 * @return
 */
@RequestMapping(value="statistics",method = RequestMethod.GET)
public ResponseEntity<Object> returnStatistics(@RequestBody JSONObject body,
	 @RequestParam(name = "domain", defaultValue = "") String FirstKeyword,
     @RequestParam(value = "create_date", defaultValue = "") String createdate,
     @RequestParam(value = "update_date", defaultValue = "") String updatedate,
     @RequestParam(value = "country", defaultValue = "") String country)
{
url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + FirstKeyword;
return new ResponseEntity<>(website.returnStatistics(),HttpStatus.OK);
}

}


