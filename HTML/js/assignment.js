const details = [{id:101,name:"ram",sal:10},{id:102,name:"jam",sal:10},{id:103,name:"shyam",sal:10}];

// 1. Create a function that takes an array of objects containing employees
// and returns the average / max / min salaries of all the employees

console.log("1 :-");
console.log();

const empDet = ([{a},{b},{c}])=>{
    let avg = (a.sal+b.sal+c.sal)/3;
    let maxSal = ()=>{if(a.sal>b.sal && c.sal){
        return a.sal;
    }else if(b.sal>a.sal&& c.sal){
        return b.sal
    }else{return c.sal};};
    let minSal = ()=>{if(a.sal<b.sal && c.sal){
        return a.sal;
    }else if(b.sal<a.sal&& c.sal){
        return b.sal
    }else{return c.sal};};
    console.log(`The average of the employee salaries is ${avg}`);
    console.log(`The maximum salary is ${maxSal}`);
    console.log(`The minimum salary is ${minSal}`);
}
// empDet(details);

//2. Write a function that takes an array of objects
//  sorts them based on a specified property (e.g., salary or firstName)

console.log("2 :-");
console.log();

const sortFunc = ()=>{

}

// 3. Write a function that takes a string and converts it to a number.
// Handle cases where the string cannot be converted to a number
// and return an error message.

console.log("3 :-");
console.log();



// 4. Write a function that takes a string and
// and returns the number of vowels it contains.
console.log("4 :-");
console.log();

let str = "aeioulkjhg";
let counter = 0;
for(let char of str){
    if(char == 'a' || char == 'e'|| char == 'i'|| char == 'o'|| char == 'u' || char == 'A' || char == 'E'|| char == 'I'|| char == 'O'|| char == 'U'){
        counter++;
    }
}
console.log(counter);

console.log();

// 5. Create a function that takes a string and
// reverses the order of words (not characters) in it.
console.log("5 :-");
console.log();

let string = "hi hello bye tata";
let splitStr=string.split(" ");
for(let i= splitStr.length-1;i>=0;i--){
    let reversedStr = "";
    reversedStr = reversedStr + splitStr[i];
    console.log(reversedStr);
};

console.log();

// 6. Demonstrate your understanding of rest parameters and spread operators 
console.log("6 :-");
console.log();
console.log("REST");
const[first,second,...rest]=[1,2,3,4,5];
console.log(first);
console.log(second);
console.log(rest);
//const addNums = (a,b)=>a+b
const addNums = (...args)=>args.reduce((sum,elem)=>sum+elem);
const sum = addNums(10,20,30);
console.log(sum);
console.log("SPREAD")
const arr = [ 1,2,3,4];
const [a,b,c,d] = [...arr];
console.log(b);