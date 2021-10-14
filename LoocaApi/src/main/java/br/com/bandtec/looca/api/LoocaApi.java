/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.looca.api;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import com.github.britooo.looca.api.group.sistema.Sistema;
import com.github.britooo.looca.api.group.temperatura.Temperatura;

/**
 *
 * @author betis
 */
public class LoocaApi {
    public static void main(String[] args) {
        Looca looca = new Looca();
        
        Sistema sistema = looca.getSistema();
        Memoria memoria = looca.getMemoria();
        Processador processador = looca.getProcessador();
        Temperatura temperatura = looca.getTemperatura();
        DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
        ProcessosGroup grupoDeProcessos = looca.getGrupoDeProcessos();
         
        
        System.out.println(sistema);
        System.out.println(memoria);
        System.out.println(processador);
        System.out.println(temperatura);
        System.out.println(grupoDeDiscos);
        System.out.println(grupoDeProcessos);
    }
}
