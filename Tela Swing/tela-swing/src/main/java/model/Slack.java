package model;

import com.nimbusds.jose.shaded.json.JSONObject;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest;


public class Slack {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String URL = "https://hooks.slack.com/services/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";

    public static void sendMessage(JSONObject content) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder(
                        URI.create(URL))
                .header("accept", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(content.toString()))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(String.format("Status: %s", response.statusCode()));
        System.out.println(String.format("Response: %s", response.body()));
    }
    public static void main( String Args[] ) throws IOException, InterruptedException {

        JSONObject json = new JSONObject();

        json.put("text", "inativo? :shrug: :Smile:");

        Slack.sendMessage(json);
    }
}