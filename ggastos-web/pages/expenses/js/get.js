function useGet(url) {
    let request = new XMLHttpRequest();
    request.open("GET", url, false);
    request.send();
    return request.responseText;
};

function createRow(expense) {
    row = document.createElement("tr");
    tdId = document.createElement("td");
    tdValue = document.createElement("td");
    tdFixed = document.createElement("td");
    tdType = document.createElement("td");
    tdId.innerHTML = expense.id;
    tdValue.innerHTML = expense.value;
    tdFixed.innerHTML = expense.fixed;
    tdType.innerHTML = expense.type;
    row.appendChild(tdId);
    row.appendChild(tdValue);
    row.appendChild(tdFixed);
    row.appendChild(tdType);

    return row;
};

function main() {
    let data = useGet("http://localhost:8080/expenses");
    let expenses = JSON.parse(data);
    let tableExpense = document.getElementById("tableExpense");
    expenses.forEach(element => {
        let row = createRow(element);
        tableExpense.appendChild(row);
    });
};

main();