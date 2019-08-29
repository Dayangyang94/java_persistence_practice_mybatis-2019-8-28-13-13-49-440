package tws.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import tws.entity.Employee;

@Mapper
public interface EmployeeMapper {
	
	public List<Employee> selectAll();

}
