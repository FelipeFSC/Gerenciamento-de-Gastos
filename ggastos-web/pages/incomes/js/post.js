function usePost(url, body) {

    let request = new XMLHttpRequest();
    request.open("POST", url, true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify(body));
    request.onload = function() {

    };

    return request.responseText;
};

function saveIncome() {

    //event.preventDefault();
    let url = "http://localhost:8080/incomes";
    let inputIncomeType = document.getElementById("inputIncomeType").value;
    let inputValue = document.getElementById("inputValue").value;
    let inputFixed = document.getElementById("inputFixed").value;

    body = {
        "typeName":inputIncomeType,
        "value":inputValue,
        "fixed":inputFixed
    };

    usePost(url, body);
};