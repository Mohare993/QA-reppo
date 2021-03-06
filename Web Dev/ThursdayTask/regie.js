function makeRequest(method, url, body) {
    return new Promise((resolve, reject) => {
        const xhr = new XMLHttpRequest();
        xhr.onload = () => {
            if (xhr.status >= 200 && xhr.status <= 299) {
                resolve(JSON.parse(xhr.responseText));
            } else {
                reject('Error!: ' + xhr.responseText);
            }
        };
        xhr.open(method, url);
        xhr.setRequestHeader('Content-Type', 'application/json');
        xhr.send(body || null);
    });
}

// Example call

const userData = {};


function handleSubmit(form) {

    console.log("submitted");

    for (let element of form.elements) {
        if (element.id) {
            userData[element.id] = element.value;
        }
    }

    const dataString = JSON.stringify(userData);
    sessionStorage.setItem('alltheDetails', dataString);

    makeRequest('POST', 'https://us-central1-qac-sandbox.cloudfunctions.net/setUser', dataString)
        .then((value) => {
            window.location = "userDetails.html";
            console.log(value);
        }).catch((error) => {
            console.warn(error);
        });

    return false;
}


function handleLogin(form) {

    const loginData = {};

    console.log("submitted");

    for (let element of form.elements) {
        if (element.id) {
            loginData[element.id] = element.value;
        }
    }

    makeRequest('GET', 'https://us-central1-qac-sandbox.cloudfunctions.net/login?username=' + loginData.username + "&" + "password=" + loginData.password)
        .then((value) => {
            const dataString2 = JSON.stringify(value);
            sessionStorage.setItem('alltheDetails', dataString2)
            sessionStorage.setItem('username', loginData.username)
            window.location = "userDetails.html";
            console.log(value);
        }).catch((error) => {
            console.warn(error);
        });

    return false;
}

function deleteUser(username) {


    makeRequest('DELETE', 'https://us-central1-qac-sandbox.cloudfunctions.net/deleteUser?username=' + username)
        .then((value) => {
            console.log(value, "DELETED");
        }).catch((error) => {
            console.warn(error);
        });

    return false;
}

function handleUpdateSubmit(form) {

    console.log("submitted");

    for (let element of form.elements) {
        if (element.id) {
            userData[element.id] = element.value;
        }
    }

    const dataString = JSON.stringify(userData);
    sessionStorage.setItem('alltheDetails', dataString);

    makeRequest('POST', 'https://us-central1-qac-sandbox.cloudfunctions.net/setUser', dataString)
        .then((value) => {
            console.log(value);
        }).catch((error) => {
            console.warn(error);
        });

    return false;
}