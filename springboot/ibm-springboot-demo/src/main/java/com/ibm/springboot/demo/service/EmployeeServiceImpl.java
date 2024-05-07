package com.ibm.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springboot.demo.Exception.EmployeeNotFoundException;
import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeRepository employeeRepository;

//	private List<Employee> empList = new ArrayList<>();
//	{
//		empList.addAll(Arrays.asList(new Employee(10, "Sonu", 12), new Employee(20, "Tonu", 15),
//				new EmployeeServiceImpl(30, "Ponu", 20)));
//	}
	@Override
	public Employee getEmpById(String employeeId) {
		LOG.info(employeeId.toString());
		Optional<Employee> empOption = employeeRepository.findById(employeeId);
		if (empOption.isEmpty()) {

			String errMsg = "Employee with id " + employeeId + " is not present.";
			LOG.warn(errMsg);
			throw new EmployeeNotFoundException(errMsg);

		} else {

			return empOption.get();

		}
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> db = employeeRepository.findAll();
		if (!db.isEmpty()) {

			LOG.info("All the records");
			return db;

		} else {

			String errMsg = "  NO EMPLOYEES PRESENT ";
			LOG.warn(errMsg);
			throw new EmployeeNotFoundException(errMsg);

		}
	}

	@Override
	public Employee deleteEmpById(String employeeId) {
		Employee emp = this.getEmpById(employeeId);
		employeeRepository.deleteById(emp.getEmployeeId());
		LOG.info("Employee Deleted");
		return null;
	}

	@Override
	public List<Employee> findByFirstName(String username) {
		LOG.info("All employees with the name " + username);
		List<Employee> lEmp = employeeRepository.findByUsername(username);
		if (lEmp.isEmpty()) {
			String errMsg = "NO SUCH EMPLOYEE PRESENT";
			LOG.warn(errMsg);
			throw new EmployeeNotFoundException(errMsg);
		} else {
			return lEmp;
		}
	}

	@Override
	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmp(String employeeId, Employee employee) {
		Employee emp = this.getEmpById(employeeId);
		if(employee.getusername()!=null) {
			emp.setusername(employee.getusername());
		}else if(employee.getEmail()!=null) {
			emp.setEmail(employee.getEmail());
		}else if(employee.getSalary()!=(Double)null) {
			emp.setSalary(employee.getSalary());
		}
		return employeeRepository.save(employee);
	}

//	@Override
//	public Employee getEmpById(Integer employeeId) {
//
//		LOG.info(employeeId.toString());
//		LOG.warn(employeeId.toString());
//		LOG.error(employeeId.toString());
//		return empList.stream().filter(e -> e.getEmployeeId() == employeeId).findFirst().orElse(null);
////		Employee resEmp = null;
////		for (Employee e : empList) {
////			System.out.println(employeeId);
////			System.out.println(e.getEmployeeId());
////			if (e.getEmployeeId() == (employeeId)) {
////				resEmp = e;
////			} else {
////				resEmp = null;
////			}
////		}
////		return resEmp;
//	}
//
//	@Override
//	public List<Employee> getAllEmp() {
//		LOG.info("Get All Employees");
//		return empList;
//	}
//
//	@Override
//	public Employee updateEmp(Integer employeeId, String newName) {
//		Employee emp = null;
//		for (Employee e : empList) {
//			if (e.getEmployeeId() == employeeId) {
//				emp = e;
//				e.setFirstName(newName);
//			} else {
//				System.out.println("NO SUCH ID PRESENT");
//			}
//		}
//		return emp;
//	}
//
//	@Override
//	public String deleteEmp(Integer employeeId) {
//		String resString = "";
//		for (Employee e : empList) {
//			if (e.getEmployeeId().equals(employeeId)) {
//				empList.remove(employeeId);
//				resString = "Deleted";
//			} else {
//				resString = "NO SUCH ID PRESENT";
//			}
//		}
//		return resString;
//	}
//
}