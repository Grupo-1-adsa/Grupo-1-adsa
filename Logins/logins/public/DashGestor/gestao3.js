setTimeout(()=>{
  const container = document.querySelector(".containerInfoBalao");
  const btns = document.querySelectorAll(".btnStatus ul li");
  const statusAlerta = document.querySelectorAll(".status span");
  const balao = document.querySelectorAll(".infoBalao");
  const linsk = document.querySelectorAll(".infoBalao a");
  const nomes = document.querySelectorAll(".perfilFunc h1");
  const ids = document.querySelectorAll(".identificador")
    
  function salvarNome(index){
    window.localStorage.setItem('name', nomes[index].innerText);
    window.localStorage.setItem('idFunc',ids[index].innerText.replace('Id:',''));
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
  }else if(parametro == "avaliar"){
    statusAlerta.forEach((st,index)=>{
  
      if(st.innerText != "Pendente"){
          balao[index].classList.add("hid");
      };
  });
  }
  
  }

  validacao('Alertas');
  magicaBalao('nok')
  function magicaBalao(parametro){
    let st = "ALERTAS"
    let contexto = 'ALERTAS';
    if(parametro != 'ok'){
      contexto = st
    }
   const lista = btns;

   validacao(contexto.toLowerCase());
   btns.forEach((btn,index)=>{
    btn.classList.remove(btn.innerText.toUpperCase());
    lista[index].classList.add('off');
   });
   lista[0].classList.remove('off');
   lista[0].classList.add(contexto);
  }
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
  container.style.opacity = 1;
},900);





