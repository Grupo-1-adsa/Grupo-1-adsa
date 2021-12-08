export default class Submenu{
  constructor(li,menu){
    this.li = document.querySelector(li);
    this.menu = document.querySelector(menu);
  }
  openMenu(event){
    this.menu.classList.toggle('ativo');
    this.li.classList.toggle('ativo');
  }
  AddEvent(){
    this.li.addEventListener("click",this.openMenu)
  }
  Bind(){
    this.openMenu = this.openMenu.bind(this);
  }
  init(){
    this.Bind();
    this.AddEvent();
  }
}