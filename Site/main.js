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
btn.addEventListener("click", () => {

    menu.classList.toggle("ativo");
    cabeca.classList.toggle("fx");
    btn.classList.toggle("open");


});

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



