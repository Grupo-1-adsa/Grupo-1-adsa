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


   