package it.univpm.streamingmoviesUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import it.univpm.streamingmoviesModel.StreamingWebsite;

/**
 * 
 * @author marra
 * @requestUrl corrisponde all'url che dobbiamo leggere (diversa a seconda delle
 * keyword cui è associato 'elenco dei siti streaming)
 * InputStreamReader prende lo stream di URL
 * BufferedReader legge il contenuto e lo appende allo StringBuilder
 * StringBuilder lo utilizziamo per costruire la stringa 
 * 
 *
 *°°°°°°°bisogna trasformare la stringa in jSON object e metterla in un jsonArray 
 */

public class StreamingWebsiteRecord{
	
	
	public ArrayList<StreamingWebsite> GetJsonObject(String requestUrl){
	       ArrayList<StreamingWebsite> result = new ArrayList<>();
	     
		URL url = null;
		try {
			url = new URL(requestUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection)url.openConnection();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			connection.setRequestMethod("GET");
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.connect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
 	int status = 0;
	try {
		status = connection.getResponseCode();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("/nSending 'GET' request to URL : " + requestUrl);
	System.out.println("Response code : " + status);
	
	BufferedReader reader = null;
	try {
		reader = new BufferedReader((new InputStreamReader(connection.getInputStream())));
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		StringBuilder sb = new StringBuilder();
		try {
		while ( (reader.readLine()) != null) {	
			sb.append('\n');}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return (ArrayList<StreamingWebsite>)result;
	
	}}
