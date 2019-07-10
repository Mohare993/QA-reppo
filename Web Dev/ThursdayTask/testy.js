





function load_data() {


    const inUsername = document.getElementById("username"); 
    const inUserFullname = document.getElementById("name");  
    const inUserEmail = document.getElementById("email");  
    const inUserPass = document.getElementById("password");    


    const abc = sessionStorage.getItem("alltheDetails");

    const abcd = sessionStorage.getItem("username");

    const ddd = JSON.parse(abc);

    inUsername.value = ddd.username || abcd;
    inUserFullname.value = ddd.fullname;
    inUserEmail.value = ddd.email;
    inUserPass.value =ddd.password;



  }


  load_data()