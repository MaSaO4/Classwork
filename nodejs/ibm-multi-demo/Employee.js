class Employee{

    employeeId;
    firstName;
    salary;

    constructor(employeeId, firstName, salary) {
        this.employeeId=employeeId;
        this.firstName=firstName;
        this.salary=salary;
     };

    toString = ()=>{
        return `Employee id : ${this.employeeId} firstName : ${this.firstName} Salary : ${this.salary}`
    };

}

// Employee Employee = new Employee();  //JAVA
const employee = new Employee();        //JAVASCRIPT
const employee2 = new Employee(101,"Shawn",12);

console.log(employee.toString());
console.log(employee2.toString());