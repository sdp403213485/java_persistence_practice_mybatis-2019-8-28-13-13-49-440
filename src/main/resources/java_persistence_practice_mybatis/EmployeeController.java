package java_persistence_practice_mybatis;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mapper.EmployeeMapper;

@RestController
@RequestMapping("/employess")
public class EmployeeController {
	private EmployeeMapper employeeMapper;
	
	@PostMapping
	public void addEmployee(@RequestBody Employee employee) {
		employeeMapper.insertEmployee(employee);
	}
	
	@GetMapping("")
	public ResponseEntity<List<Employee>>getAllEmployee(){
		return ResponseEntity.ok(employeeMapper.searchEmployee());
	}

}
