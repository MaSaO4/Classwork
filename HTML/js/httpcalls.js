//GET METHOD

// const url ="https://jsonplaceholder.typicode.com/users/2";
// fetch(url)
// .then(response => response.json())
// .then((resp)=>{console.log(resp);})
// .catch((error)=>{console.log(error);})

//POST METHOD

const springBootPostUrl="http://localhost:9090/Class2/add-emp";
const empDataToAdd = {
    firstName: 'Vinu',
    salary: 78900,
    email: 'vinu@gmail.com'
};

fetch(springBootPostUrl, {
    method: 'POST',
    headers: {
        "Content-Type": "application/json",
    },
    body: JSON.stringify(empDataToAdd)
})
    .then(res => res.json())
    .then(resp => console.log(resp))
    .catch(err => console.log(err));