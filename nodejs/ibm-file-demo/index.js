import fs from 'fs';
import express from 'express'

const dataFile = 'emp.json';

// fs.readFile(arg1(filepath), arg2(character encoding), ()=>{ }(body))   //SYNTAX
fs.readFile(dataFile,'utf8',(err,data) => { 

    if(err){
        console.log(err);
    }else{
    console.log(data);
    console.log(JSON.parse(data));
}});

const dataFile2 = 'emp2.json';
const content = {
    "eid":101,
    "firstName":"Chintu",
    "salary":30000
}

//WRITE=======================================================

// fs.writeFile(arg1(filepath),arg2(content),()=>{ }(body))
fs.writeFile(dataFile2,JSON.stringify(content),'utf8', (err,data) => {
    if(err){
        console.log(err);
    }else{
        console.log(`${data} written successfully`);
    }
});