let contador = 0;
let nav_bar = document.getElementById("nav_bar");
let body = document.getElementById("body");

 const nav_button =()=> {
    if (contador === 0) {
            
        contador++
        nav_bar.style.opacity = "1"
        body.style.overflow = "hidden"

    } else if (contador === 1) {

        contador--
        nav_bar.style.opacity = "0.60"

    }
   
 }