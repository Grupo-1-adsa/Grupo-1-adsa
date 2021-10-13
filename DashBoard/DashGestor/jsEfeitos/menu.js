export default class Menu{
  constructor(li,menu){
    this.menu = document.querySelector(menu);
    this.li = document.querySelector(li);
  }

  openMenu(event){
    this.menu.classList.toggle('ativo');
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