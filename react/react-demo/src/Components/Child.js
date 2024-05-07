import { useState } from "react";

const Child = (props) => {
    let parentDataInChild =props.parentToChild;
    let childData='Monu';

    const passDataToParent = () =>{
        console.log(childData);
        props.childToParent(childData);
    }

    return(
        <>
            <h1>Child Component</h1>
            <p>ChildData in child component : {childData}</p>
            <p>ParentData in child component : {parentDataInChild}</p>
            <button onClick={passDataToParent} >Pass Data to Parent</button>
        </>
    )
}

export default Child;