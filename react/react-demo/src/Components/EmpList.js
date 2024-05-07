import { useEffect, useState } from "react"
import axios from "axios";

const EmpList = () => {

        const [EmpList, setEmpList]=useState('');

        useEffect(()=>{
            console.log("useEffect");
            axios.get('https://jsonplaceholder.typicode.com/users')
            .then((resp)=>{
                console.log(resp);
                setEmpList(resp.data);
            })
        },[])
        return(
        <>
            <h1>EmpList Component</h1>
            <table>
                <thead>
                    <th>Name</th> <th>Username</th> <th>Email</th> <th>City</th>
                </thead>
                <tbody>
                    {EmpList && EmpList.map(emp =>
                        <tr key={emp.id}>
                            <td >{emp.name} </td>
                            <td >{emp.username} </td>
                            <td >{emp.email} </td>
                            <td >{emp.address.city} </td>
                        </tr>
                    )}
                </tbody>
            </table>
            <p>{EmpList && EmpList.length}</p>
        </>
    )
}

export default EmpList