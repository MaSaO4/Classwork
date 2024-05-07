import { useState } from "react";
import axios from "axios";

const Emp = () => {

    // const empData = {
    //     id:101,
    //     firstName:"Pintu",
    //     salary:12.6,
    //     isIndian : true,
    //     phones :''
    // }

    // let salary = 100000;
    //let firstName = "Chintu"
    const[fName,setFName] = useState('');

    const handleInput = (evt) =>{
        // console.log(firstName);
       // firstName = evt.target.value;     // NOT WORKING
        setFName(evt.target.value);
        console.log(fName);
    }
    return(
    <>
    {/* {/* <h1>Employee Component</h1> */}
     {/* <p> Employee component</p>
    <h4>Object employee's id is {empData.id}</h4> */}
    {/* <p>Employee's name is {firstName}</p> */}
    <form>
        <input type="text" name="firstName" value={fName} onChange={handleInput} />
    </form>
    {/* <h4>Object employee's name is {empData.firstName}</h4> */}
    {/* <h2>{firstName}'s salary is {salary}.</h2>
    <h4>Object employee's salary is {empData.salary}</h4>
    <p>But the inhand salary is {salary-1909} :( </p>
    <>
    {
    empData.isIndian &&
    <h4>Object employee is Indian </h4>
    }
    </>
    <>
    {
        empData.phones &&
        <h4>Object employee's phone numbers are {empData.phones[0]}, {empData.phones[1]}</h4>
    }
    </> */}
    </>
    )
}

export default Emp;