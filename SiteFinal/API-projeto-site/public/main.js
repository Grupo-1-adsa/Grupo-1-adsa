/* // import nav_fundo from './img/testeroxo.svg';

let contador = 0;
let nav_bar = document.getElementById("nav_bar");
// let fundo = document.getElementById("retRoxo1")

const nav_button =()=> {
    if (contador === 0) {

        contador++
        // nav_bar.style.opacity = "1"
        // nav_fundo.style.opacity="1"
        // fundo.style.opacity="1"
        nav_bar.style.backgroundColor = "var(--cor-primario-azul)"
        // nav_bar.style.position = "fixed"
        // nav_bar.style.top="0"
        // nav_bar.style.left="0"
        // nav_bar.style.height = "100px"
        // nav_bar.style.width = "100vh"

    } else if (contador === 1) {

        contador--
        // nav_bar.style.opacity = "0.60"
        // nav_fundo.style.opacity="0.60"
        // fundo.style.opacity="0.60"
        nav_bar.style.backgroundColor = ""
        nav_bar.position.position = "relative"

    }

 } */



const btn = document.querySelector(".burguer");
const menu = document.querySelector(".navegacao");
const cabeca = document.querySelector(".titulo");
const burger = document.querySelector(".burguer");


const links = document.querySelectorAll(".cont_li li a");
const arraylinks = Array.from(links);

console.log(links);

links.forEach((link) => {
    link.addEventListener("click", () => {
        menu.classList.toggle("ativo");
        cabeca.classList.toggle("fx");
        btn.classList.toggle("open");
    });
})

var contador = 0;
function enviando() {
    contador++
    sendEmail()
}

function validar() {

    if (email.value.length != 0) {
        tremerEmail.style.display = "none"
    }
    else if (tel.value.length == 11) {
        tremerTel.style.display = "none"
        tremerEmail.style.display = "block"
    }
    else if (cep.value.length == 8) {
        tremerCep.style.display = "none"
        tremerTel.style.display = "block"
    }
    else if (cnpj.value.length == 14) {
        tremerCnpj.style.display = "none"
        tremerCep.style.display = "block"
    }
    else if (username.value.length >= 2) {
        tremerUsername.style.display = "none"
        tremerCnpj.style.display = "block"
    }

    else { tremerUsername.style.display = "block" }

}

function sendEmail() {
    if (username.value.length > 0 && cnpj.value.length == 14 &&
        cep.value.length == 8 && tel.value.length == 11 &&
        email.value.length > 0 && contador >= 1 ) {

        fetch(`/email/1`, {
            method: "POST",
            body: new URLSearchParams(new FormData(formCadastro))
        }).then(res => {
            console.log(res.json.success + "true")
            console.log(res.json)
            if (res.json.success = true) {
                redirecionando()
            }
        })
    }
}

function redirecionando() {

    const titulo = document.querySelector(".emp");
    titulo.innerText = "Em breve falaremos com você!"
    const corpo = document.querySelector(".formularioCadastro");
    corpo.innerHTML = ` <div class="contef">
        <h1>Obrigado por entrar em contato</h1>
        <p class="check">Dados enviados com sucesso!</p>
        <img class="cartinha" src="../img/carta.gif" alt="#">
     </div>`;
    corpo.classList.add("send");
};


    // Função whatsApp
    function isMobile() {
        if (sessionStorage.desktop)
            return false;
        else if (localStorage.mobile)
            return true;
        var mobile = ['iphone', 'ipad', 'android', 'blackberry', 'nokia', 'opera mini', 'windows mobile', 'windows phone', 'iemobile'];
        for (var i in mobile)
            if (navigator.userAgent.toLowerCase().indexOf(mobile[i].toLowerCase()) > 0) return true;
        return false;
    }
    
    const formulario = document.querySelector('#formulario');
    const buttonSubmit = document.querySelector('#submit');
    const urlDesktop = 'https://web.whatsapp.com/';
    const urlMobile = 'whatsapp://';
    const whatsapp = '5511945999956';
    formulario.addEventListener('submit', (event) => {
        event.preventDefault()
        buttonSubmit.innerHTML = '<i class="fas fa-circle-notch fa-spin"></i>'
        buttonSubmit.disabled = true
        setTimeout(() => {
            let nome = document.querySelector('#id_nome').value
            let email = document.querySelector('#id_email').value
            let texto = document.querySelector('#id_mensagem').value
            let form = document.querySelector('#formularioEscolha').value
            let mensagem = 'send?phone=' + whatsapp + '&text=Olá, meu nome é ' + nome + '%0AMeu email é: ' 
            + email  + '%0AMinha ' + form + ' é: ' + texto
            
            if (isMobile()) {
                window.open(urlMobile + mensagem, '_blank')
            } else {
                window.open(urlDesktop + mensagem, '_blank')
            }
            buttonSubmit.innerHTML = '<i class="fab fa-whatsapp"></i> Enviar WhatsApp'
            buttonSubmit.disabled = false
        }, 3000);
    });