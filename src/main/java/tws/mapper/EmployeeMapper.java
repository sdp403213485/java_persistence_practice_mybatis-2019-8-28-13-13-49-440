package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.DeleteMapping;

import tws.model.Employee;

@Mapper
public interface EmployeeMapper {
	@Insert("insert into employee values (#{employee.id},#{employee.name},#{employee.age})")
	void insertEmployee(@Param("employee") Employee employee);
	
	@Select("select * from employee")
	List<Employee> searchEmployee();
	
	@Update("update employee set name=#{employee.name},age=#{employee.age}, id =#{employee.id}")
	int updateEmployee(@Param("id") int id, @Param("employee") Employee employee);

	@Delete("delete from employee where id = #{id}")
	int deleteEmployee(@Param("id") int id);
}
