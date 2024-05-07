import { Link } from "react-router-dom"

const  MenuBar = () => {
    return(
        <>
                    <ul>
                        <li><Link to={'/Login'}>Login</Link>/</li>
                        <li><Link to={'/Employee'}>Employee</Link>/</li>
                        <li><Link to={'/Parent'}>Parent</Link>/</li>
                        <li><Link to={'/EmpList'}>Employee List</Link>/</li>
                        <li><Link to={'/AddEmp'}>Add Employee</Link>/</li>
                        <li><Link to={'/Register'}>Register</Link>/</li>
                        <li><Link to={'/Profile'}>Profile</Link>/</li>
                        <li><Link to={'/Logout'}>Logout</Link>/</li>
                    </ul>
        </>
    )
}

export default MenuBar;