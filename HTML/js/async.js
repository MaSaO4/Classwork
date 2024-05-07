const getMessage=(arg12)=>{
    console.log("getMessage Function called");
    setTimeout(()=>{
        arg12({message : "Hii"})
    },2000);
};
getMessage((abc)=>{
    console.log(abc.message)
});

// solution 2 - Promise 
// ---------------------

// const getMessage = () => {
//     return new Promise();
// };

// const getMessage = () => {
//     return new Promise(() => { });
// };

// const getMessage = () => {
//     return new Promise((resolve, reject) => { });
// };

// getMessage()
//     .then(() => {}) // success 
//     .catch(() => {}); // error 


const getData = ()=>{
    let isDataAvailable = false;
    return new Promise((resolve, reject) => {
        if(isDataAvailable){
            resolve({message:"Have Fun!"});
        }
        else{
            reject({message:"Sorry, no data avaialable"});
        }
    })
}
getData().then((Response)=>{console.log(Response.message)}).catch((Error)=>{console.log(Error.message)});

//Solution 3 - async await

const printData = async()=>{
    try{
    const output = await getData();
    console.log(output.message);
    }catch(error){
        console.log(error.message);
    }
}
printData();