let arrayazul = document.querySelectorAll('.blue');
let arrayvermelho = document.querySelectorAll('.red');
let arrayverde = document.querySelectorAll('.green');
let resazul = document.querySelectorAll('.resa');
let resred = document.querySelectorAll('.resv');
let resgreen = document.querySelectorAll('.resve');
let num;

let azul = Array.from(arrayazul);
let vermelho = Array.from(arrayvermelho);
let verde = Array.from(arrayverde);

function gerarGrafico() {
  num = +(Math.random() * 100).toFixed(0);
  azul.map((azu) => {
    azu.style.width = num + '%';
    resazul.forEach((a) => (a.innerHTML = num + '%'));
  });
  num = +(Math.random() * 100).toFixed(0);
  vermelho.map((azu) => {
    azu.style.width = num + '%';
    resred.forEach((a) => (a.innerHTML = num + '%'));
  });
  num = +(Math.random() * 100).toFixed(0);
  verde.map((azu) => {
    azu.style.width = num + '%';
    resgreen.forEach((a) => (a.innerHTML = num + '%'));
  });
}

setInterval(() => {
  gerarGrafico();
  nome();
}, 1000);

const team = document.querySelector('.team');

function nome() {
  team.innerHTML = '';
  const name = [
    'Thiago',
    'Fernando',
    'Leonardo',
    'Breno',
    'Julio',
    'Ellen',
    'Beatriz',
  ];

  for (var i = 0; i < 3; i++) {
    const num = +(Math.random() * 3).toFixed(0);
    const nome = document.createElement('p');
    nome.innerText = name[num];
    team.innerHTML += `<div class="funcp"> ${nome.innerText}</div>`;
  }
}

nome();
