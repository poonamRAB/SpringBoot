package org.geekster;


import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {


        URL url = null;
        HttpURLConnection connection = null;

        String urlString = "https://api.chucknorris.io/jokes/random";

        try {
            url = new URL(urlString);
        }
        catch(MalformedURLException e){
            System.out.println("Invalid URL");
        }

        //connection

        try{
            connection = (HttpURLConnection) url.openConnection();
        }
        catch(Exception e){
            System.out.println("connection failed");
        }

        // creating response
        int responseCode = 0;
        try{
            responseCode = connection.getResponseCode();
        }
        catch(IOException e){
            System.out.println("Something is wrong, try again!");
        }

        //extract information from connection object;

        StringBuilder apiData =new StringBuilder();

        if(responseCode == 200){
           try{
               BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
               String readLine = null;

               while((readLine = in.readLine()) != null){
                   apiData.append(readLine);
               }

               in.close();
           }
           catch(IOException e){
               System.out.println("404 error found");
           }




            JSONObject jsonAPIResponse = new JSONObject(apiData.toString());



            System.out.println(apiData);
            System.out.println(apiData.toString());
            System.out.println(jsonAPIResponse);

           // System.out.println(jsonAPIResponse.get("post code"));
            System.out.println(jsonAPIResponse.get("country"));
            System.out.println(jsonAPIResponse.get("country abbreviation"));
            System.out.println(jsonAPIResponse.get("places"));


        }
        else{
            System.out.println("API call could not be made!!!");
        }
    }
}