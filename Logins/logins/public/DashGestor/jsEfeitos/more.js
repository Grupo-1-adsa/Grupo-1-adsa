export default class More{
    constructor(more,btn,info,container){
     this.btn = document.querySelector(btn);
     this.info = document.querySelector(info);
     this.container = document.querySelector(container);
     this.more = document.querySelector(more);
     this.m = document.querySelector(".btnspan div");
     this.containerDash = document.querySelector(".containerDash")
     this.contador=0;
    }
  
    openMenu(event){
        this.contador++;
        this.containerDash.classList.toggle('ativo');
        if(this.contador == 1){
            this.m.innerHTML="-";
            console.log(this.contador)
        }else{
            this.m.innerHTML="+";
            this.contador=0
        }
       
        this.info.classList.toggle("ativo");
    }
    Eventos(){
      this.btn.addEventListener("click",this.openMenu);
      
    }
    Bind(){
      this.openMenu = this.openMenu.bind(this);
    }
    
    init(){
       this.Bind();
       this.Eventos();
    }
  }