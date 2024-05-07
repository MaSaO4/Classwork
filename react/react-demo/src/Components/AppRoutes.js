import {BrowserRouter,Route,Routes} from "react-router-dom"
import Log from "./Login";
import Parent from "./Parent";
import Emp from "./Employee";
import Page404 from "./Page404";
import Home from "./Home";
import MenuBar from "./Menu";
import EmpList from "./EmpList";
import AddEmployee from "./AddEmp";
import axios from "axios";
import { useState } from "react";
import LogO from "./Logout";
import Profile from "./Prof";
import Register from "./Register";

const AppR = () => {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const updateLoginStatus = (status) => {
        console.log(status);
        setIsLoggedIn(status);
    };

    if (isLoggedIn) {
        return (
            <>
                <BrowserRouter>
                    <MenuBar loginStatus={isLoggedIn} />
                    <Routes>
                        <Route path="home" element={<Home />} />
                        <Route path="Login" element={<Log />} />
                        <Route path="Employee" element={<Emp />} />
                        <Route path="Parent" element={<Parent />} />
                        <Route path="Logout" element={<LogO setLoginStatus={updateLoginStatus} />} />
                        {<Route path="Profile" element={<Profile setLoginStatus={updateLoginStatus}/>} /> }
                        <Route exact path="/" element={<Home />} />
                        <Route path="*" element={<Page404 loginStatus={isLoggedIn} />} />
                    </Routes>
                </BrowserRouter>
            </>
        );
    }
    else {
        return (
            <>
                <BrowserRouter>
                    <MenuBar />
                    <Routes>
                        <Route path="home" element={<Home />} />
                        <Route path="Login" element={<Log setLoginStatus={updateLoginStatus} />} />
                        { <Route path="Register" element={<Register setLoginStatus={updateLoginStatus}/>} /> } 
                        <Route exact path="/" element={<Home />} />
                        <Route path="*" element={<Page404 loginStatus={isLoggedIn} />} />
                    </Routes>
                </BrowserRouter>
            </>
        );
    }
};


export default AppR;