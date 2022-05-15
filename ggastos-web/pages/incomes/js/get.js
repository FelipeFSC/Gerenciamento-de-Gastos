function useGet(url) {
    let request = new XMLHttpRequest();
    request.open("GET", url, false);
    request.send();
    return request.responseText;
};

function createRow(income) {
    row = document.createElement("tr");
    tdId = document.createElement("td");
    tdIncomeType = document.createElement("td");
    tdValue = document.createElement("td");
    tdIFixed = document.createElement("td");
    tdId.innerHTML = income.id;
    tdIncomeType.innerHTML = income.typeName;
    tdValue.innerHTML = income.value;
    tdIFixed.innerHTML = income.fixed;

    row.appendChild(tdId);
    row.appendChild(tdIncomeType);
    row.appendChild(tdValue);
    row.appendChild(tdIFixed);

    return row;
}

function main() {
    let data = useGet("http://localhost:8080/incomes");
    let incomes = JSON.parse(data);
    let tableIncome = document.getElementById("tableIncome");
    incomes.forEach(element => {
        let row = createRow(element);
        tableIncome.appendChild(row);
    });
};

main();