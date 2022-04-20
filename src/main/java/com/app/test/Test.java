package com.app.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.app.config.EmpConfig;
import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(EmpConfig.class);
		JdbcTemplate jt=(JdbcTemplate) ac.getBean("jt");
		
		//Retriving 
		
/*		EmployeeInsert e=new EmployeeInsert();
		String sql="select * from employee";
		List<Employee> em= jt.query(sql, e);
		System.out.println(em.toString());  
		*/
		
		RowMapper<Employee> rm=(rs,rowNum)->{
			return new Employee(rs.getInt(1),rs.getString(2),rs.getDouble(3));
		};
		String sql="select * from employee where eid=?";
		Employee e =jt.queryForObject(sql, rm,101);
		System.out.println(e.toString());
		
		//Inserting 
		
		/*
		 * String sql="insert into employee values(?,?,?)"; 
		 * int count=jt.update(sql,
		 * 102,"Shekar",20000.0); 
		 * if(count>0) {
		 * System.out.println("Employee inserted!...."); }
		 */
		
		//Updating
		/*
		 * String sql="update employee set ename=? where eid=?"; int
		 * count=jt.update(sql,"Ramu",102); 
		 * if(count>0) {
		 * System.out.println("One row updated..."); 
		 * }
		 */
		
		//Deleting
		/*
		 * String sql="delete from employee where eid=?";
		 *  int count=jt.update(sql,102);
		 * if(count>0)System.out.println("one row deleted..");
		 */
	}
}
