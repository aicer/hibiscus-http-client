package org.aicer.hibiscus.examples;

import org.aicer.hibiscus.http.client.HttpClient;
import org.aicer.hibiscus.http.client.Response;
import org.apache.http.Header;

public class ExampleGetRequest {

    public static void main(String[] args) {

        String elasticSearchStatusURL = "http://localhost:9200/";

        HttpClient client = new HttpClient();

        client.setRawUrl(elasticSearchStatusURL);

        client.execute();

        Response response = client.getLastResponse();

        String jsonString = response.getResponseBody();

        for (Header responseHeader : response.getResponseHeaders()) {

            System.out.println(responseHeader.getName() + ": " + responseHeader.getValue());
        }

        System.out.println("ElasticSearch Raw Response: " + jsonString);

        System.out.println("Elapsed Time: " + response.getElapsedTime() + " milliseconds ");
    }
}
