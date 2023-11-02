let btnList = document.getElementById("header-btn-list");
let loginBtnli = document.createElement("li");
let loginBtna = document.createElement("a");
let loginbtn = document.createElement("button");

loginBtnli.setAttribute("class", "btn-list");
loginBtnli.setAttribute("id", "btn-login");

function addNewMemberBtn() {
  let btnList = document.getElementById("header-btn-list");

  let newMemberLi = document.createElement("li");
  newMemberLi.setAttribute("id", "btn-new-member");
  newMemberLi.setAttribute("class", "btn-list");

  let NewMemberBtn = document.createElement("a");
  NewMemberBtn.setAttribute("href", "/new-member");

  let btn = document.createElement("button");
  btn.innerHTML = "New member";

  NewMemberBtn.appendChild(btn);
  newMemberLi.appendChild(NewMemberBtn);
  btnList.appendChild(newMemberLi);
}

function loginBtn() {
  let logdin = localStorage.getItem("id");
  if (logdin) {
    addNewMemberBtn();
    loginbtn.innerHTML = "Loga ut";
    loginbtn.addEventListener("click", logOut);
    loginBtnli.appendChild(loginbtn);
    btnList.appendChild(loginBtnli);
  } else {
    loginbtn.innerHTML = "Loga in";
    loginBtna.appendChild(loginbtn);
    loginBtnli.appendChild(loginBtna);
    btnList.appendChild(loginBtnli);
    loginBtna.setAttribute("href", "/login");
  }
}

function logOut() {
  localStorage.removeItem("id");
  location.reload();
}

loginBtn();
