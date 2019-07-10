function add(num1, num2) {
    const val = num1 + num2;
    return val;
}


function subtract(num1, num2) {
    const val = num1 - num2;
    return val;
}


function divide(num1, num2) {
    const val = num1 / num2;
    return val;
}


function multiply(num1, num2) {
    const val = num1 * num2;
    return val;
}

function calculate(calculation) {
    num1 = parseInt(document.getElementById("firstnum").value);
    num2 = parseInt(document.getElementById("secondnum").value);

    const val = calculation(num1, num2);
    const element = document.getElementById("result");
    element.innerText = val;

    const histEl = document.getElementById("history1");
    const newP = document.createElement("p");
    newP.innerHTML = val;
    histEl.append(newP);

}


function clearThings(){

    document.getElementById("result").innerText = "";
    document.getElementById("history1").innerText = "";
    document.getElementById("firstnum").value = "";
    document.getElementById("secondnum").value = "";

}

