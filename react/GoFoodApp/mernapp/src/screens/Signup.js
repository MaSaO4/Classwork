import React ,{useState}from 'react'
import { Link } from 'react-router-dom';

export default function Signup() {
    const[credentials,setCredentials]=useState({name:"",email:"",password:"",geolocation:""})

const handleSubmit=async(e)=>{
    e.preventDefault();
    const response = await fetch("http://localhost:5000/api/createuser",{
        method:'POST',
        header:{
            'Content-Type':'application/json'
        },
        body:JSON.stringify({name:credentials.name,email:credentials.email,password:credentials.password,location:credentials.geolocation})
    });
    const json =await response.json()
    console.log(json);

    if(!json.success){
        alert("Enter Valid Credentials");
    }
}

    const onChange = ()=>{
        setCredentials({...credentials,[event.target.name]:event.target.value})
    }

    return (
        <>
        <div className='container'>
            <htmlForm onSubmit={handleSubmit}>
                <div className="mb-3">
                    <label htmlFor="name" className="htmlForm-label">Name</label>
                    <input type="text" className="htmlForm-control" name='name' value={credentials.name} onChange={onChange} />
                </div>
                <div className="mb-3">
                    <label htmlFor="exampleInputEmail1" className="htmlForm-label">Email address</label>
                    <input type="email" className="htmlForm-control" id="exampleInputEmail1" aria-describedby="emailHelp" name='email' value={credentials.email} />
                    <div id="emailHelp" className="htmlForm-text">We'll never share your email with anyone else.</div>
                </div>
                <div className="mb-3">
                    <label htmlFor="exampleInputPassword1" className="htmlForm-label">Password</label>
                    <input type="password" className="htmlForm-control" id="exampleInputPassword1" name='password' value={credentials.password} />
                </div>
                <div className="mb-3">
                    <label htmlFor="location" className="htmlForm-label">Location</label>
                    <input type="text" className="htmlForm-control" name='geolocation' value={credentials.geolocation} />
                </div>
                <button type="submit" className="m-3 btn btn-success">Submit</button>
                <Link to="/login" className='m-3 btn btn-danger'>Already a user?</Link>
            </htmlForm>
        </div>
        </>
    )
}
