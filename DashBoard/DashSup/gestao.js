import Submenu from "./jsEfeitos/submenu.js";
import Menu from "./jsEfeitos/menu.js";
import Pesquisa from "./jsEfeitos/pesquisa.js";

const submenu = new Submenu(".dwn",".lista_submenu");
submenu.init();

const opcaoPefil = new Submenu(".gestorPerfil h4",".box_perfil");
opcaoPefil.init();

const menu = new Menu(".mphone",".containerMenu");
menu.init();

const btnmenu = new Menu(".close",".containerMenu");
btnmenu.init();

const pesquisa = new Pesquisa(".ipt",".perfilFunc h1",".infoBalao",".btnback");
pesquisa.init();