import axios from "axios";
import { useState } from "react";

const AddEmployee = () => {
    const backendUrl = 'https://jsonplaceholder.typicode.com/users';
    const [empData, setEmpData] = useState({ firstName: '', email: '', aadhaar: '', salary: '' });
    const [errors, setErrors] = useState({});

    const handleChange = (evt) => {
        setEmpData({ ...empData, [evt.target.name]: evt.target.value });
        setErrors({ ...errors, [evt.target.name]: '' });
    };

    const validateForm = () => {
        let isValid = true;
        const newErrors = {};
        if (empData.salary <= 0) {
            newErrors.salary = "Salary should be greater than 0.";
            isValid = false;
        }
        else if (empData.aadhaar.length!=12){
            newErrors.aadhaar="Enter a valid aadhar number.";
            isValid=false;
        }
        setErrors(newErrors);
        return isValid;
    };

    const handleSubmit = (evt) => {
        evt.preventDefault();
        if (validateForm()) {
            axios.post(backendUrl, empData)
                .then((resp) => {
                    alert(`${resp.data.firstName} with id ${resp.data.id} added successfully!`);
                    setEmpData({ firstName: '', email: '', aadhaar: '', salary: '' });
                })
                .catch(error => {
                    console.error("Error adding employee:", error);
                });
        }
    };

    return (
        <>
            <h1>Add Employee Component</h1>
            <form onSubmit={handleSubmit}>
                <label htmlFor="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" value={empData.firstName} onChange={handleChange} placeholder="Enter first name" required autoFocus />
                <br />
                <label htmlFor="email">Email:</label>
                <input type="email" id="email" name="email" value={empData.email} onChange={handleChange} placeholder="Enter email" />
                <br />
                <label htmlFor="aadhaar">Aadhaar:</label>
                <input type="number" id="aadhaar" name="aadhaar" value={empData.aadhaar} onChange={handleChange} placeholder="Enter aadhaar" />
                {errors.aadhaar && <span>{errors.aadhaar}</span>}
                <br />
                <label htmlFor="salary">Salary:</label>
                <input type="number" id="salary" name="salary" value={empData.salary} onChange={handleChange} placeholder="Enter salary" />
                {errors.salary && <span>{errors.salary}</span>}
                <br />
                <input type="submit" value="Add Employee" />
            </form>
        </>
    );
};

export default AddEmployee;


// import axios from "axios";
// import { useState } from "react";

// const AddEmployee = () => {

//     const backendUrl = 'https://jsonplaceholder.typicode.com/users';
//     const [empData, setEmpData] = useState({ firstName: '', email: '', aadhaar: '', salary: '' });

//     const handleChange = (evt) => {
//         console.log(evt.target);
//         setEmpData({ ...empData, [evt.target.name]: evt.target.value });
//     };

//     const handleSubmit = (evt) => {
//         evt.preventDefault();
//         console.log(empData);
//         axios.post(backendUrl, empData)
//             .then((resp) => {
//                 console.log(resp.data);
//                 alert(`${resp.data.firstName} with id ${resp.data.id} added successfully!`);
//                 setEmpData({ firstName: '', email: '', aadhaar: '', salary: '' });
//             });
//     };

//     return (
//         <>
//             <h1>Add Employee Component</h1>
//             <form onSubmit={handleSubmit} >
//                 <label htmlFor="firstName">First Name:</label>
//                 <input type="text" id="firstName" name="firstName" value={empData.firstName} onChange={handleChange} placeholder="Enter first name" required autoFocus />
//                 <br />
//                 <label htmlFor="email">Email:</label>
//                 <input type="email" id="email" name="email" value={empData.email} onChange={handleChange} placeholder="Enter email" />
//                 <br />
//                 <label htmlFor="aadhaar">Aadhaar:</label>
//                 <input type="number" id="aadhaar" name="aadhaar" value={empData.aadhaar} onChange={handleChange} placeholder="Enter aadhaar" />
//                 <br />
//                 <label htmlFor="salary">Salary:</label>
//                 <input type="number" id="salary" name="salary" value={empData.salary} onChange={handleChange} placeholder="Enter salary" />
//                 <br />
//                 <input type="submit" value="Add Employee" />
//             </form>
//         </>
//     );
// };

// export default AddEmployee;