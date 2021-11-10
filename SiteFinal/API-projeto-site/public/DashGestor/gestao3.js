setTimeout(()=>{
  const btns = document.querySelectorAll(".btnStatus ul li");
  const statusAlerta = document.querySelectorAll(".status span");
  const balao = document.querySelectorAll(".infoBalao");
  const linsk = document.querySelectorAll(".infoBalao a");
  const nomes = document.querySelectorAll(".perfilFunc h1");
  
  console.log('teste');
  
  function salvarNome(index){
    window.localStorage.setItem('name', nomes[index].innerText);
  }
  
  linsk.forEach((link,index)=>{
    link.addEventListener("click",()=>{
      salvarNome(index);
    });
  });
  
  
  function validacao(parametro){
    balao.forEach((bl)=>{
      bl.classList.remove("hid");
    });
  if(parametro == "alertas"){
  
    statusAlerta.forEach((st,index)=>{
  
      if(st.innerText != "Alerta"){
          balao[index].classList.add("hid");
      };
  
    })
  
  }else if(parametro == "ativos"){
    statusAlerta.forEach((st,index)=>{
  
      if(st.innerText != "Ativo"){
          balao[index].classList.add("hid");
      };
  });
  }else if(parametro == "pendentes"){
    statusAlerta.forEach((st,index)=>{
  
      if(st.innerText != "Pendente"){
          balao[index].classList.add("hid");
      };
  });
  }
  
  }
  
  
  validacao("Alerta");
  function ativarBtn(){
    const contexto = this.innerText.toUpperCase();
    const lista = this;
    validacao(contexto.toLowerCase());
    btns.forEach((btn)=>{
     btn.classList.remove(btn.innerText.toUpperCase());
     lista.classList.add('off');
    });
    lista.classList.remove('off');
    lista.classList.add(contexto);
  }
  btns.forEach((btn)=>{
    btn.addEventListener("click",ativarBtn)
  });
  
  btns.forEach((btn,index)=>{
    if(index != 0){
      btn.classList.add("off");
    }else{
      btn.classList.add("ALERTAS");
  
    }
    
  
  });
  
},1000);



