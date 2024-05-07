import Child from "./Child";
import { useState } from "react";
import axios from "axios";

const Parent = (props) => {
    let parentData = 'Sonu';
    const[childDataInParent,setChildDataInParent]=useState('')

    const recieveDataFromChild = (data) => {
        console.log(data);
        setChildDataInParent(data);
    }
    return (
        <>
            <h1>Parent Component</h1>
            <p>ParentData in parent component: {parentData}</p>
            <p>ChildData in Parent component: {childDataInParent}</p>
            <Child parentToChild={parentData} childToParent={recieveDataFromChild} />
        </>
    )
}

export default Parent;