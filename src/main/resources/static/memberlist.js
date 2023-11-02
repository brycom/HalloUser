const closeEditBtn = document.createElement("button");
const id = 345553788779;

function AddDeleteBtn() {
  let liList = document.getElementById("memberlist").querySelectorAll("li");

  liList.forEach((item) => {
    console.log({ item });
    const id = item.id;
    const link = document.createElement("a");
    link.setAttribute("href", "/remove-member/" + id);
    const btn = document.createElement("BUTTON");
    btn.textContent = "Ta bort";
    link.setAttribute("class", "delete-btn");
    link.appendChild(btn);
    item.appendChild(link);
  });
}

function AddChangeBtn() {
  let liList = document.getElementById("memberlist").querySelectorAll("li");

  liList.forEach((item) => {
    console.log({ item });
    const id = item.id;
    const btn = document.createElement("BUTTON");
    btn.setAttribute("class", "edit-btn");
    btn.setAttribute("id", "edit-button" + id);
    btn.textContent = "Ändra";
    item.appendChild(btn);
    btn.addEventListener(
      "click",
      (e) => {
        createEditForm(item);
      },
      { once: true }
    );
  });
}

function addNewMemberBtn() {
  let btnList = document.getElementById("header-btn-list");

  let newMemberLi = document.createElement("li");
  newMemberLi.setAttribute("id", "btn-new-member");
  newMemberLi.setAttribute("class", "btn-list");

  let NewMemberBtn = document.createElement("a");
  NewMemberBtn.setAttribute("href", "/new-member");

  let btn = document.createElement("button");
  btn.innerHTML = "ny medlem";

  NewMemberBtn.appendChild(btn);
  newMemberLi.appendChild(NewMemberBtn);
  btnList.appendChild(newMemberLi);
}

//funtion för att skapa inputfält och spara knapp knyt till li när klickevet activerats

function createEditForm(item) {
  const editForm = document.createElement("form");
  const firstName = document.createElement("input");
  firstName.setAttribute("id", "first-name" + item.id);
  const lastName = document.createElement("input");
  lastName.setAttribute("id", "last-name" + item.id);
  const city = document.createElement("input");
  city.setAttribute("id", "city" + item.id);
  const yearsActive = document.createElement("input" + item.id);
  yearsActive.setAttribute("id", "years-active" + item.id);
  //close button
  const closeEditBtn = document.createElement("button");
  closeEditBtn.setAttribute("id", "close-edit-btn" + item.id);
  closeEditBtn.textContent = "Avsluta";

  //savebutton
  const save = document.createElement("input");
  save.setAttribute("type", "submit");
  save.setAttribute("value", "spara");

  editForm.appendChild(firstName);
  editForm.appendChild(lastName);
  editForm.appendChild(city);
  editForm.appendChild(yearsActive);
  editForm.appendChild(closeEditBtn);
  editForm.appendChild(save);
  item.appendChild(editForm);
}

closeEditBtn.addEventListener("click", (e) => {
  document.removeChild(editForm);
});

let localStorageId = localStorage.getItem("id");
if (localStorageId == id) {
  AddDeleteBtn();
  addNewMemberBtn();
}
