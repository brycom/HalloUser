//skapa knapp för att ta bort
function AddDeleteBtn() {
  let liList = document.getElementById("memberlist").querySelectorAll("li");

  liList.forEach((item) => {
    console.log({ item });
    const id = item.id;
    const link = document.createElement("a");
    link.setAttribute("href", "/remove-member/" + id);
    const btn = document.createElement("BUTTON");
    btn.textContent = "Ta bort";
    link.appendChild(btn);
    item.appendChild(link);
  });
}

function AddChangeBtn() {
  let liList = document.getElementById("memberlist").querySelectorAll("li");

  liList.forEach((item) => {
    console.log({ item });
    const id = item.id;
    const link = document.createElement("a");
    link.setAttribute("href", "/change-member/" + id);
    const btn = document.createElement("BUTTON");
    btn.textContent = "Ändra";
    link.appendChild(btn);
    item.appendChild(link);
  });
}
AddDeleteBtn();
AddChangeBtn();

//funktion för att ta in index av medlem

//skicka indexet till funktionen i clubb för att ta bort medlem
