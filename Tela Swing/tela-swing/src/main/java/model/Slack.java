package model;

import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.nimbusds.jose.shaded.json.JSONObject;
import controller.AdvertenciaDAO;
import org.springframework.dao.EmptyResultDataAccessException;
import logging.Log;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URI;
import java.net.http.HttpRequest;
import java.util.Timer;
import java.util.TimerTask;


public class Slack {

    private static final HttpClient client = HttpClient.newHttpClient();
    private static final String URL = "";

    public static void sendMessage(JSONObject content) throws IOException, InterruptedException {
        Log log = new Log();
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
            log.slackLog();
        }
    }

    public void loginMensagem(String nomeFunc) throws IOException, InterruptedException {
        Log log = new Log();
        JSONObject json = new JSONObject();

        json.put("text", "O @" + nomeFunc + " acabou de se conectar no Procrastinator :smiley:");
        try {
            sendMessage(json);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public void enviaMensagem(String nomeFunc, Integer fkFuncionario) throws IOException, InterruptedException {
        Log log = new Log();
        AdvertenciaDAO advertenciaDAO = new AdvertenciaDAO();
        Processador processador = new Processador();

        Memoria memoria = new Memoria();
        JSONObject json = new JSONObject();
        Timer timer = new Timer();
        final long segundos = 600000;
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {

                Integer contador = 0;

                if (memoria.getEmUso() / memoria.getTotal() <= 0.6 && processador.getUso() <= 50.0) {
                    try {
                        json.put("text", "O @" + nomeFunc + " pode estar inativo é melhor verificar :male-detective:");
                        advertenciaDAO.enviarAdvertencia(fkFuncionario,"medio");
                        sendMessage(json);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (memoria.getEmUso() / memoria.getTotal() <= 0.4 && processador.getUso() <= 30.0) {
                    try {
                        json.put("text", "O @" + nomeFunc + " está inativo é melhor verificar :angry:");
                        advertenciaDAO.enviarAdvertencia(fkFuncionario,"grave");
                        sendMessage(json);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        };
        timer.scheduleAtFixedRate(tarefa, 10, segundos);


    }
}