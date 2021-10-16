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



//Validações, vai melhorar prometo :3 

function validar() {

    if (username.value.length == 0 ) {
        tremerUsername.style.display = "block"
    }

    else if (cnpj.value.length != 14) {
        tremerUsername.style.display = "none"
        tremerCnpj.style.display = "block"
    }
    
    else if (cep.value.length != 8) {
        tremerCnpj.style.display = "none"
        tremerCep.style.display = "block"
    }
    else if (tel.value.length !=11){
        tremerCep.style.display = "none"
        tremerTel.style.display = "block"
    }
    else if (email.value.length == 0){
        tremerTel.style.display = "none"
        tremerEmail.style.display = "block"
    }

    else {
        tremerEmail.style.display = "none"
    }

}




const butt = document.querySelector("#btnjs");

butt.addEventListener("click",()=>{

    if (true) {
        const titulo = document.querySelector(".emp");
        titulo.innerText = "Em breve Entraremos em contato"
        const corpo =  document.querySelector(".formularioCadastro");
        corpo.innerHTML = ` <div class="contef">
        <h1>Obrigado por se cadastrar</h1>
        <p class="check">Seu email foi recebido com sucesso</p>
        <img class="cartinha" src="../img/carta.gif" alt="#">
     </div>`;
     corpo.classList.add("send");
    }
    else{
        validar()
    }
 
});