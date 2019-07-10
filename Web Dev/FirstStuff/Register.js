const userData = {};


function handleSubmit(form) {

    console.log("submitted");

    for (let element of form.elements) {
        if (element.id) {
            userData[element.id] = element.value;
            // sessionStorage.setItem(element.id, element.value);
        }
    }

    const dataString =JSON.stringify(userData);
    sessionStorage.setItem('userData', dataString);

    window.location = "regDone.html";

    return false;
}

