//set up username and password
const username = "admin";
const password = "admin";
const id = 345553788779;

let logdinMesage = document.createElement("h1");
logdinMesage.innerHTML = "Du är nu inloggad";

let logoutBtn = document.createElement("button");
logoutBtn.innerHTML = "Loga ut";

let inputusernameElement = document.getElementById("userName");
let inputpasswordElement = document.getElementById("password");
let usernameLabel = document.getElementById("username-label");
let passwordLabel = document.getElementById("password-labal");
let loginBtn = document.getElementById("loginBtn");

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

//function for verifying username and password
function verifyUser() {
  let inputusername = document.getElementById("userName").value;
  let inputpassword = document.getElementById("password").value;

  if (inputusername == username && inputpassword == password) {
    localStorage.setItem("id", id);

    console.log(username);
  }

  //console.log(id);
}
function newMember() {
  let localStorageId = localStorage.getItem("id");
  if (localStorageId == id) {
    addNewMemberBtn();
    inputpasswordElement.remove();
    inputusernameElement.remove();
    passwordLabel.remove();
    usernameLabel.remove();
    loginBtn.remove();
    loginWindow.appendChild(logdinMesage);
    loginWindow.appendChild(logoutBtn);
  }
}
function logOut() {
  localStorage.removeItem("id");
}

//funktion för att publicera ny medlem.
loginBtn.addEventListener("click", verifyUser);
logoutBtn.addEventListener("click", logOut);
newMember();
