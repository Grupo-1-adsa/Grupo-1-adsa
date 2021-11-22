/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bantec.jar.docker;

import controller.EquipamentoDAO;
import controller.FuncionarioDAO;
import controller.LeituraDAO;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import logging.Log;
import model.Slack;

/**
 *
 * @author leoia
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("+-------------------------------------------------------------------------------------------+");
        System.out.println("| __________                        ____   ____.__            .___                          |\n"
                + "| \\______   \\ ____   _____          \\   \\ /   /|__| ____    __| _/____                      |\n"
                + "|  |    |  _// __ \\ /     \\   ______ \\   Y   / |  |/    \\  / __ |/  _ \\                     |\n"
                + "|  |    |   \\  ___/|  Y Y  \\ /_____/  \\     /  |  |   |  \\/ /_/ (  <_> )                    |\n"
                + "|  |______  /\\___  >__|_|  /           \\___/   |__|___|  /\\____ |\\____/                     |\n"
                + "|         \\/     \\/      \\/                            \\/      \\/                           |\n"
                + "|                                                                                           |\n"
                + "|    _____    ____                                                                          |\n"
                + "|    \\__  \\  /  _ \\                                                                         |\n"
                + "|     / __ \\(  <_> )                                                                        |\n"
                + "|    (____  /\\____/                                                                         |\n"
                + "|         \\/                                                                                |\n"
                + "| __________                                       __  .__               __                 |\n|"
                + "| \\______   \\_______  ____   ____ _____    _______/  |_|__| ____ _____ _/  |_  ___________ |\n"
                + "|  |     ___/\\_  __ \\/  _ \\_/ ___\\\\__  \\  /  ___/\\   __\\  |/    \\\\__  \\\\   __\\/  _ \\_  __ \\ |\n"
                + "|  |    |     |  | \\(  <_> )  \\___ / __ \\_\\___ \\  |  | |  |   |  \\/ __ \\|  | (  <_> )  | \\/ |\n"
                + "|  |____|     |__|   \\____/ \\___  >____  /____  > |__| |__|___|  (____  /__|  \\____/|__|    |\n"
                + "|                               \\/     \\/     \\/               \\/     \\/                    |");
        System.out.println("+-------------------------------------------------------------------------------------------+");

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        EquipamentoDAO equipamentoDAO = new EquipamentoDAO();
        LeituraDAO leituraDAO = new LeituraDAO();
        Slack slack = new Slack();
        Log log = new Log();
        Scanner scan = new Scanner(System.in);
        Console console = System.console();
        
        do {
            System.out.println("Entre com o username:");
            String login = scan.next();
            System.out.println("Entre com a senha:");
            String senha = scan.next();
            funcionarioDAO.loginBanco(login, senha);

            if (funcionarioDAO.verificaLogin() == true) {
                funcionarioDAO.loginBanco(login, senha);
                slack.enviaMensagem(funcionarioDAO.getNomeFunc());
                equipamentoDAO.enviarEquipamento(funcionarioDAO.getFkFuncionario());
                equipamentoDAO.selectEquipamento(funcionarioDAO.getFkFuncionario());
                System.out.println("\n(!) Login realizado com sucesso (!)\n");
                Timer timer = new Timer();
                final long segundos = 10000;
                TimerTask tarefa = new TimerTask() {
                    @Override
                    public void run() {

                        leituraDAO.enviarLeitura(equipamentoDAO.getFkLeitura());

                    }
                };
                timer.scheduleAtFixedRate(tarefa, 10, segundos);

            } else {
                System.out.println("Login ou senha incorretos.");
                log.insercaoLog();
            }
        } while (!funcionarioDAO.verificaLogin() == true);

    }
}


