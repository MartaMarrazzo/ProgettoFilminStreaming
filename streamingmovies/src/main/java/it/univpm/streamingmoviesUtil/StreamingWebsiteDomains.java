package it.univpm.streamingmoviesUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import it.univpm.streamingmoviesModel.StreamingWebsite;


/**
 * 
 * @param <JSONArray> serve per salvare il JSONObject e 
 * @requestUrl corrisponde all'url che dobbiamo leggere (diversa a seconda delle
 * keyword cui è associato 'elenco dei siti streaming)
 * InputStreamReader prende lo stream di URL
 * BufferedReader legge il contenuto e lo appende allo StringBuilder
 * StringBuilder lo utilizziamo per costruire la stringa 
 * 
 *

 

 *
 */

public class StreamingWebsiteDomains {
	   public JSONParser parser= new JSONParser();
       public JSONObject jo= new JSONObject();
    
    public ArrayList<StreamingWebsite> GetJsonObject(String requestUrl) throws ParseException{
     
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
    
    String input;
    BufferedReader reader = null;
    try {
        reader = new BufferedReader((new InputStreamReader(connection.getInputStream())));
    } catch (IOException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
        StringBuilder sb = new StringBuilder();
        try {
        while ( (input=reader.readLine()) != null) {    
            sb.append('\n');
            jo = (JSONObject) parser.parse(input);
            /*
             * con il ciclo for accediamo al JSONObject e inseriamo i vari campi nei tipi corrispondenti per usarli nelle varie classi
             */
            JSONArray ja = (JSONArray) jo.get("domains");
            for(Object o: ja) {
                jo = (JSONObject) o;
                
                String Name =(String) jo.get("domain");
                String CreateDate = (String) jo.get("create_date");
                String UpdateDate=(String) jo.get("update_date");
                String Country=(String) jo.get("contry");
                Boolean IsDead=(Boolean) jo.get("isDead");
                Integer quantity=(Integer) jo.get("total");
                Integer updateTime=(Integer) jo.get("time"); 
                StreamingWebsite st= new StreamingWebsite(Name, CreateDate, UpdateDate, Country, IsDead, updateTime, quantity);
                result.add(st);
        }
    }
  }
    catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }    
    return (ArrayList<StreamingWebsite>)result;
}    
}


