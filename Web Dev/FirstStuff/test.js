// window.onload = init;

// function init() {

//     document.getElementById("1").innerHTML = sessionStorage.getItem("inputA");
//     document.getElementById("2").innerHTML = sessionStorage.getItem("inputB");
//     document.getElementById("3").innerHTML = sessionStorage.getItem("inputC");
//     document.getElementById("4").innerHTML = sessionStorage.getItem("inputD");
//     document.getElementById("5").innerHTML = sessionStorage.getItem("inputE");

// }



function doSomething() {


    const resultss = document.getElementById("resultss");
    const userData = sessionStorage.getItem("userData");
    const userDataObj = JSON.parse(userData);
    // document.getElementById("usernameValue").innerText = userDataObj.inputA;

    for (let key in userDataObj) {
        let newLine = document.createElement('p');
        newLine.innerHTML = key +  ": " + userDataObj[key] + "<br><br><br>";
        resultss.append(newLine);
    }
}

doSomething();