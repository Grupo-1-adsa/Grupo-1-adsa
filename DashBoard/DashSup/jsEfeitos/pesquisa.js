export default class Menu{
  constructor(input,baloes,all,btn){
    this.pesquisa = document.querySelector(input);
    this.baloes = document.querySelectorAll(baloes);
    this.geralBalao = document.querySelectorAll(all);
    this.btn = document.querySelector(btn);
    this.contador=-1;
  }
  back(){
    this.geralBalao.forEach((b)=>{
      b.classList.remove('off');
      b.classList.remove('on');
    });
    this.btn.classList.remove('on');
  }
  Encontrar(texto){
  
    this.baloes.forEach((balao)=>{
      let funcionario = balao.innerText.trim();
      this.contador++;
      if(funcionario == texto){
        console.log("Encontrou: " + this.contador);
        this.geralBalao.forEach((b)=>{
          b.classList.add('off');
          b.classList.remove('on');
        })
        this.geralBalao[this.contador].classList.add('on');
        this.geralBalao[this.contador].classList.remove('off');
      }
    });
  }

  openSearch({key}){
    if(key == "Enter"){
      this.Encontrar(this.pesquisa.value);
      console.log("ARMAZENAMENTO ZERADO");
      this.contador = -1;
      this.btn.classList.add('on');
    }else if(key !== "Enter" && key !== "CapsLock" && key !== "Backspace" && key !== "Shift" && key !== "Control"){
      this.armazenador += key;
    }
  }
  AddEvent(){
    this.pesquisa.addEventListener("keyup",this.openSearch)
    this.btn.addEventListener("click",this.back)
  }
  Bind(){
    this.openSearch = this.openSearch.bind(this);
    this.back = this.back.bind(this);
  }
  init(){
    this.Bind();
    this.AddEvent();
  }
}