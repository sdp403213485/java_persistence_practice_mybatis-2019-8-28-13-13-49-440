package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.mapper.EmployeeMapper;
import tws.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@PostMapping
	public void addEmployee(@RequestBody Employee employee) {
		employeeMapper.insertEmployee(employee);
	}
	
	@GetMapping("")
	public ResponseEntity<List<Employee>>getAllEmployee(){
		return ResponseEntity.ok(employeeMapper.searchEmployee());
	}
	
	@PutMapping("/{id}")
	public void updateEmployee(@PathVariable int id,@RequestBody Employee employee){
		employeeMapper.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeMapper.deleteEmployee(id);
	}
			

}
