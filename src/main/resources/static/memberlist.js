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

let localStorageId = localStorage.getItem("id");
if (localStorageId == id) {
  AddDeleteBtn();
  addNewMemberBtn();
}
