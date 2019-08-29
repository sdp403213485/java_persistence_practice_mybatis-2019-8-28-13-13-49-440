package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java_persistence_practice_mybatis.Employee;

@Mapper
public interface EmployeeMapper {
	@Insert("insert into employee values({#employee.id},{#employee.name},{#employee.age})")
	void insertEmployee(@Param("employee") Employee employee);
	
	@Select("select * from employee")
	List<Employee> searchEmployee();
}
