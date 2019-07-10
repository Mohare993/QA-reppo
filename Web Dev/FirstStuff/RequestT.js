const Http = new XMLHttpRequest();


Http.onload = function () {
    const data = JSON.parse(Http.responseText);
    console.log("HI", JSON.parse(Http.responseText));
    createPage(data);


};

const url = 'https://raw.githubusercontent.com/ewomackQA/JSONDataRepo/master/example.json';
Http.open("GET", url);
Http.send();




function createPage(data) {


    const resultss = document.getElementById("results");
    const wrapperEl = document.createElement('div');
    const El = document.createElement('h1');
    const newLine = document.createElement('p');
    let x ="";







    for (let key in data) {
        const El = document.createElement('h1');
        El.innerHTML = key + ": " + data[key] + "<br><br>";
        results.append(El);

    }


    // for (let stuff in data.members) {
    //     const wrapperEl = document.createElement('div');
    //     const newLine = document.createElement('p');
    //     wrapperEl.innerText = data.members[stuff].name;
    //     members.append(wrapperEl);
    //   for (let stuff in data.members) {
    //     const newLine = document.createElement('p');
    //     newLine.innerText = data.members[stuff].age;
    //     members.append(newLine);
    

    // for (let stuff in data.members) {
    //     const newLine = document.createElement('p');
    //     newLine.innerText = data.members[stuff].secretIdentity;
    //     members.append(newLine);
    

    // for (let stuff in data.members) {
    //     const newLine = document.createElement('p');
    //     newLine.innerText = data.members[stuff].powers;
    //     members.append(newLine);
    // }}}}

    for (let i in data.members) {
        x += "<p>" + data.members[i].name + "</p>";
        x += "<p>" + data.members[i].age + "</p>";
        x += "<p>" + data.members[i].secretIdentity + "</p>";
        x += "<p>" + data.members[i].powers + "</p>";
    }      

    

    document.getElementById("members").innerHTML = x;

}