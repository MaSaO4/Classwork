import logo from './logo.svg';
import './App.css';
import { Component } from 'react';
import Emp from './Components/Employee';
import Log from './Components/Login';
import Parent from './Components/Parent';
import AppR from './Components/AppRoutes';

function App() {                         // MOST PREFFERED
  return (
    <>
      <h1>IBM React Demo App</h1>
      <p>IBM ReactJS Demo Application</p>
    </>
  );
}

// export default App;

function App2() {                         // LESS PREFFERED COS ITS HEAVY
  return (
    <div>
      <h1>IBM React Demo App</h1>
      <p>IBM ReactJS Demo Application</p>
    </div>
  );
}

// export default App2;

class App3 extends Component{             //POSSIBLE BUT NOT PREFFERED
  render = () => {
  return (
    <div>
      {/* <h1>IBM React Demo App</h1>
      <p>IBM ReactJS Demo Application</p>
      <hr></hr> */}
      {/* <Emp/>
      <Log/>
      <Parent/> */}
      <AppR/>
    </div>
  );
}
}

export default App3;
