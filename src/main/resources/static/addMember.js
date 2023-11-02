let localStorageId = localStorage.getItem("id");
const id = 345553788779;

if (localStorageId != id) {
  document.body.innerHTML = "";
  let notLogdin = document.createElement("h1");
  notLogdin.innerHTML =
    " Du måste logga in för att kunna lägga till nya medlemmar";

  let startBtn = document.createElement("a");
  startBtn.setAttribute("href", "/");

  let btn = document.createElement("button");
  btn.innerHTML = "Tilbacka till Start";
  btn.setAttribute("id", "back-to-start-btn");

  startBtn.appendChild(btn);

  document.body.appendChild(notLogdin);
  document.body.appendChild(startBtn);
}
