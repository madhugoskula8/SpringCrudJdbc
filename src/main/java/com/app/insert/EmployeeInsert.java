package com.app.insert;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Employee;

public class EmployeeInsert implements  RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee e=new Employee();
		e.setEid(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setEsal(rs.getDouble(3));
		return e;
	}

}
