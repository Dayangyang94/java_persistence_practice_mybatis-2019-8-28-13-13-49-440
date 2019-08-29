package tws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.mapper.EmployeeMapper;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployee(){
		List<Employee> employees=employeeMapper.selectAll();
				return ResponseEntity.ok(employees);
	} 
	

}
