function usePost(url, body) {

    let request = new XMLHttpRequest();
    request.open("POST", url, true);
    request.setRequestHeader("Content-type", "application/json");
    request.send(JSON.stringify(body));
    request.onload = function() {};

    return request.responseText;
};

function saveExpense() {

    //event.preventDefault();
    let url = "http://localhost:8080/expenses";
    let inputValue = document.getElementById("inputValue").value;
    let inputType = document.getElementById("inputType").value;
    let inputFixed = document.getElementById("inputFixed").value;

    //https://pt.stackoverflow.com/questions/361099/jpa-object-references-an-unsaved-transient-instance-save-the-transient-instanc
    body = {
        "value":inputValue,
        "fixed":inputFixed,
        "type":{
            "name":inputType
        }
    };

    usePost(url, body);
};