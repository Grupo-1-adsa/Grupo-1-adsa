import Submenu from "./jsEfeitos/submenu.js";
import Menu from "./jsEfeitos/menu.js";
import Balao from "./jsEfeitos/balao.js";
import More from "./jsEfeitos/more.js";


const submenu = new Submenu(".dwn",".lista_submenu");
submenu.init();

const opcaoPefil = new Submenu(".gestorPerfil h4",".box_perfil");
opcaoPefil.init();

const menu = new Menu(".mphone",".containerMenu");
menu.init();

const btnmenu = new Menu(".close",".containerMenu");
btnmenu.init();

const balaoInfo = new Balao(".infoBalao");
balaoInfo.init();

const more = new More(".more",".btnspan",".ballom",".gestor_cont");
more.init();
