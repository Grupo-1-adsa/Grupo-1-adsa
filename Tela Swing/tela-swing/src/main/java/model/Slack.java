package model;

import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.nimbusds.jose.shaded.json.JSONObject;
import org.springframework.dao.EmptyResultDataAccessException;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest;


public class Slack {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String URL = "https://hooks.slack.com/services/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";

    public static void sendMessage(JSONObject content) throws IOException, InterruptedException {

        try {
            HttpRequest request = HttpRequest.newBuilder(
                            URI.create(URL))
                    .header("accept", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(content.toString()))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(String.format("Status: %s", response.statusCode()));
            System.out.println(String.format("Response: %s", response.body()));
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Não enviou a mensagem do Slack");
        }
    }
    public void enviaMensagem(String nomeFunc) throws IOException, InterruptedException {
        Processador processador = new Processador();
        Memoria memoria = new Memoria();
        JSONObject json = new JSONObject();

        json.put("text", "inativo? :shrug: :Smile: @"+nomeFunc);

        sendMessage(json);
    }
}