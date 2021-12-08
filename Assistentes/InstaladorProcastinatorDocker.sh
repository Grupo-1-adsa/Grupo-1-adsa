#!/bin/bash

echo -e "\e[36;1mAssistente de instalação: \e[m" "Verificando requisitos mínimos para inicialização..."
sleep 2
figlet -v
if [ $? -eq 0 ]
	then
	  echo -e "\e[36;1mAssistente de instalação: \e[m" "Você já tem instalado o figlet!"
  else
    echo -e "\e[36;1mAssistente de instalação: \e[m" "Não identifiquei o figlet instalado!"
    sudo apt install figlet
fi
sleep 2
clear
echo "+-----------------------------------------------+"
echo ""
figlet FastTech
echo ""
echo "+-----------------------------------------------+"
echo ""
echo -e "\e[36;1mAssistente de instalação: \e[m" "Digite seu nome:"
read nome
echo -e "\e[36;1mAssistente de instalação: \e[m" "Digite seu id:"
read id
echo ""
echo -e "\e[36;1mAssistente de instalação: \e[m" "Seja bem-vindo $nome ao assistente de instalação do procastinator em ambiente docker!"
echo -e "\e[36;1mAssistente de instalação: \e[m" "$nome deseja prosseguir adiante com a instalação?[s/n]"
read respUm
if [[ $respUm == "n" ]]
  then
    echo -e "\e[36;1mAssistente de instalação: \e[m" "Você optou por não prosseguir"
    echo -e "\e[36;1mAssistente de instalação: \e[m" "Até mais!"
    sleep 2
    exit
  else
    sudo apt-get update
    sudo apt-get upgrade
    clear
    curl --version
    if [ $? -eq 0 ]
	    then
	      echo -e "\e[36;1mAssistente de instalação: \e[m" "Você já tem instalado o curl!"
      else
        echo -e "\e[36;1mAssistente de instalação: \e[m" "Não identifiquei o curl instalado!"
        sudo apt-get install curl
    fi
    sleep 2
    clear
    docker version
    if [ $? -eq 0 ]
      then
        echo -e "\e[36;1mAssistente de instalação: \e[m" "Você já tem instalado o docker!"
        cd Desktop
        if [ -d "docker" ]
          then
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Diretório já existe"
            cd docker
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do dockerfile!"
            sleep 2
            sudo curl -# -O https://transfer.sh/CmeHTf/Dockerfile
            clear
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do .jar!"
            sleep 2
            sudo curl -# -O https://transfer.sh/LWA3LT/jar-docker-1.0-SNAPSHOT-jar-with-dependencies.jar
            clear
            su root
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Criando uma imagem!"
            docker build . -t procastinator
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Rodando a imagem em um container!"
            sleep 2
            docker run -it procastinator
          else
            mkdir docker
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Diretório criado"
            cd docker
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do dockerfile!"
            sleep 2
            sudo curl -# -O https://transfer.sh/CmeHTf/Dockerfile
            clear
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do .jar!"
            sleep 2
            sudo curl -# -O https://transfer.sh/LWA3LT/jar-docker-1.0-SNAPSHOT-jar-with-dependencies.jar
            clear
            su root
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Criando uma imagem!"
            docker build . -t procastinator
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Rodando a imagem em um container!"
            sleep 2
            docker run -it procastinator
        fi
      else
        echo -e "\e[36;1mAssistente de instalação: \e[m" "Não identifiquei o docker instalado!"
        sleep 2
        sudo apt-get install docker.io
        clear
        cd Desktop
        if [ -d "docker" ]
          then
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Diretório já existe"
            cd docker
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do dockerfile!"
            sleep 2
            sudo curl -# -O https://transfer.sh/CmeHTf/Dockerfile
            clear
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do .jar!"
            sleep 2
            sudo curl -# -O https://transfer.sh/LWA3LT/jar-docker-1.0-SNAPSHOT-jar-with-dependencies.jar
            clear
            su root
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Criando uma imagem!"
            docker build . -t procastinator
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Rodando a imagem em um container!"
            sleep 2
            docker run -it procastinator
          else
            mkdir docker
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Diretório criado"
            cd docker
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do dockerfile!"
            sleep 2
            sudo curl -# -O https://transfer.sh/CmeHTf/Dockerfile
            clear
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Iniciando o download do .jar!"
            sleep 2
            sudo curl -# -O https://transfer.sh/LWA3LT/jar-docker-1.0-SNAPSHOT-jar-with-dependencies.jar
            clear
            su root
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Criando uma imagem!"
            docker build . -t procastinator
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Rodando a imagem em um container!"
            sleep 2
            docker run -it procastinator
        fi
    fi
fi
