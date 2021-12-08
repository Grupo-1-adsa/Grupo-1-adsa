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
echo -e "\e[36;1mAssistente de instalação: \e[m" "Seja bem-vindo $nome ao assistente de instalação do procastinator!"
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
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Sistema atualizado!"
            sleep 2
            clear
            mvn -v
            if [ $? -eq 0 ]
	            then
		            echo -e "\e[36;1mAssistente de instalação: \e[m" "Você já tem instalado o maven!"
                else
                    echo -e "\e[36;1mAssistente de instalação: \e[m" "Não identifiquei o maven instalado!"
                    sudo apt install maven
                    echo -e "\e[36;1mAssistente de instalação: \e[m" "Maven instalado!"
                    sleep 2
                    clear
            fi
            if [ -d "procastinator" ]
                then
                    cd procastinator
                else
                    mkdir procastinator
                    cd procastinator
            fi
            curl --version
                if [ $? -eq 0 ]
	                then
		                echo -e "\e[36;1mAssistente de instalação: \e[m" "Você já tem instalado o curl!"
                        echo -e "\e[36;1mAssistente de instalação: \e[m" "Baixando .jar"
                        sudo curl -# -O https://transfer.sh/HoBASN/tela-swing-1.0-SNAPSHOT-jar-with-dependencies.jar
                        sudo curl -# -O https://transfer.sh/Mb3DJg/procastinator.sh
                        echo "Colaborador: $nome ID:$id concluiu a instalacao" | mail -s "Colaborador id:$id" tfast5234@gmail.com
                        echo -e "\e[36;1mAssistente de instalação: \e[m" "Email enviado com sucesso!"
                        sleep 2
                        clear
                    else
                        echo -e "\e[36;1mAssistente de instalação: \e[m" "Não identifiquei o curl instalado!"
                        sleep 2
                        sudo apt-get install curl
                        echo -e "\e[36;1mAssistente de instalação: \e[m" "Curl instalado!"
                        sleep 2
                        clear
                        echo -e "\e[36;1mAssistente de instalação: \e[m" "Baixando .jar"
                        sudo curl -# -O https://transfer.sh/HoBASN/tela-swing-1.0-SNAPSHOT-jar-with-dependencies.jar
                        sudo curl -# -O https://transfer.sh/Mb3DJg/procastinator.sh
                        echo "Colaborador: $nome ID:$id concluiu a instalacao" | mail -s "Colaborador id:$id" tfast5234@gmail.com
                        echo -e "\e[36;1mAssistente de instalação: \e[m" "Email enviado com sucesso!"
                        sleep 2
                        clear
                fi
    fi
sudo chmod +x procastinator.sh
echo -e "\e[36;1mAssistente de instalação: \e[m" "Deseja iniciar o programa? [s/n]"
read iniciar
    if [[ $iniciar == "n" ]]
        then
            echo -e "\e[36;1mAssistente de instalação: \e[m" "Até mais <3"
            sleep 2
            exit
        else
            java -jar tela-swing-1.0-SNAPSHOT-jar-with-dependencies.jar
            sleep 2
            exit
    fi


#https://www.gnulinuxbrasil.com.br/2020/08/20/como-enviar-email-usando-linha-de-comando-no-linux/
# sudo vim /etc/ssmtp/ssmtp.conf
# empresaprocastinator@gmail.com
# urubu100