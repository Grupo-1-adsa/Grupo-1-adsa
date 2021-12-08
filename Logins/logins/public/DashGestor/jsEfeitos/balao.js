export default class Balao{
  constructor(infoBalao){
    this.info = document.querySelectorAll(infoBalao);
  }

  grow({target}){
    const bl =target;
    bl.classList.toggle("ativo");
  }
  addEvent(){
   this.info.forEach((i)=>{
    i.addEventListener("click",this.grow);
   });
  }

  init(){
    this.addEvent();
  }
}