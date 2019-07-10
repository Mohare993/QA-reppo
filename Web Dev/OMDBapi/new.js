

function doSomething() {




    const resultss = document.getElementById("movieDataResult");
    const movieData = sessionStorage.getItem("movieData");
    const movieDataObj = JSON.parse(movieData);



    for (let key in movieDataObj) {
        let newLine = document.createElement('h4');
        newLine.innerHTML = key + ": " + movieDataObj[key] + "<br><br><br>";
        resultss.append(newLine);
    }



}


 


doSomething();

// <img src="..." class="card-img-top" alt="..."></img>
//   x += "<p>" + data.Search[i].Type + "</p>";


//   //      }
  
  
//   //     document.getElementById("movieResult").innerHTML = x;