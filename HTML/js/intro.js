let firstName = "Sonu";
let message = "Hi " + firstName + "! How are you?";
let message2 = `Hi ${firstName}! How are you?`;
console.log(message);
console.log(message2);

console.log('Javascript');

// keywords, identifiers, literals, operators, seperators, 
// variables declarations,  datatypes, objects
// function, definitions,classes and objects   

let myValue =10;
console.log(myValue);
console.log(typeof(myValue));
myValue ='aab';
console.log(myValue);
console.log(typeof(myValue));
myValue =false;
console.log(myValue);
console.log(typeof(myValue));
myValue =123.543;
console.log(myValue);
console.log(typeof(myValue));
const num2 = 20;
console.log(num2);
// num2= 'abc';
// console.log(num2);   // cannot reassignt value to a const

let v1 = 10;
let v2 = 20;
console.log(v1+v2);

let v3 = 30;
let v4 = 'abx';
console.log(v3+v4);
console.log(v3-v4);

const myArrray = [10,true,"abc",12.45,[10,'poi',undefined],]; //Array.Any value types can be put

const empData = {
    eid : 101,
    firstName : 'Chintu',
    salary : 12.5,
    phones : [1234,4321],
    isIndian : true,
    address : {city : 'Pune', pin : 2222},
    printData : ()=>{}
};
console.log(empData);

class MyClass{

}

function myFun (){
    console.log("myFun invoked");
}
myFun();

const myFun2 = ()=>{
    console.log("myFun2 invoked");
}
myFun2();

//ARGUMENTS
const myFun3 = (a,b)=>{
    console.log(a+b);
}
let num = myFun3();   // A function returns undefined
console.log(num);
myFun3(10,20);

(function (){
    console.log("iife invoked");
}())

// main funciton 
const myFun5 = (arg) => {
    console.log('myFun5 invoked.');
    arg(); // function call 
};

// callback function 
const anotherFun = () => {
    console.log('anotherFun named invoked');
};

myFun5(anotherFun);

myFun(() => { });

myFun5(() => {
    console.log('another anonymous function invoked');
 });

 // ASYNCHRONOUS LANGUAGE
 console.log("111111");             
 setTimeout(()=>{
    console.log("222222"),1000
 });
 console.log("333333");

 //----------------------------//

 const getMessage = (arg)=>{
    console.log("getMessage function called");
    arg({message:"Have fun!"})
 };
 getMessage((abc)=>{
    console.log("callback function called")
    console.log(abc.message);
 });

 // LOOOOOOPS 

 const myFriends = [ "Sonu", " Monu","Tonu","Ponu"];
 for(let i =0;i<myFriends.length;i++){
    console.log(myFriends[i]);
 };

 for(let friend of myFriends){    // of - returns values
    console.log(friend);
 };
 for(let friend in myFriends){    // in - returns indexes
    console.log(friend);
 };

 myFriends.forEach((friend)=>{
    console.log(friend);
 });

 console.log(myFriends.forEach(arg=>arg+2));

 console.log(myFriends.includes("Ponu"));
 console.log(myFriends.includes("Ronu"));

 const frnds = myFriends.map(friend => friend.toUpperCase());
 frnds.forEach(f=>console.log(f));

 const frnds2 = myFriends.map(friend => friend.toUpperCase()).forEach(f=>console.log(f));  //Alternate + Shorter way

 const empData2 = {
    eid : 101,
    firstName : 'Chintu',
    salary : 12.5,
    phones : [1234,4321],
    isIndian : true,
    address : {city : 'Pune', pin : 2222},
    printData : ()=>{}
};

Object.keys(empData2).forEach(k =>console.log(k));
Object.values(empData2).forEach(v =>console.log(v));
Object.entries(empData2).forEach(e =>console.log(e));