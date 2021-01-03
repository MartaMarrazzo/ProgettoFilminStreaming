package it.univpm.streamingmoviesController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	/*
	 * /chiamo su postman prima/seconda/terza parola chiave che mi restituiscono l'intero arraylist
	 * definito in StreamingWebsite con gli attributi (formato uguale alla pagina di domainsdb)
	 *  preso-->domainsdb.info 
	 */
	
	@RequestMapping(value="FirstKeyword",method = RequestMethod.GET)
	public ResponseEntity<Object> getWebSites1(@RequestParam(value = "cinema" , defaultValue = "cinema") String FirstKeyword)
{
		
		url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + FirstKeyword;
		return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);


	}
	@RequestMapping(value="SecondKeyword")
	public ResponseEntity<Object> getWebSites2(@RequestParam(value = "movie" , defaultValue = "movie") String SecondKeyword)
{
		
		url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + SecondKeyword;
		return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);


	}
	@RequestMapping(value="ThirdKeyword")
	public ResponseEntity<Object> getWebSites3(@RequestParam(value = "streaming" , defaultValue = "streaming") String ThirdKeyword)
{
		
		url = "https://api.domainsdb.info/v1/domains/search?limit=50&domain=" + ThirdKeyword;
		return new ResponseEntity<>(website.getWebsites(url),HttpStatus.OK);


	}}
