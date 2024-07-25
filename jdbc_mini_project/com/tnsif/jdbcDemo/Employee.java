package com.tnsif.jdbcDemo;

public class Employee {
	 private String emp_name;
	    private int emp_id;
	    private double emp_salary;
	    private String emp_des;
	    
	    
		public Employee(String emp_name, int emp_id, double emp_salary, String emp_des) {
			
			this.emp_name = emp_name;
			this.emp_id = emp_id;
			this.emp_salary = emp_salary;
			this.emp_des = emp_des;
			
			
		}


		public String getEmp_name() {
			return emp_name;
		}


		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}


		public int getEmp_id() {
			return emp_id;
		}


		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}


		public double getEmp_salary() {
			return emp_salary;
		}


		public void setEmp_salary(double emp_salary) {
			this.emp_salary = emp_salary;
		}


		public String getEmp_des() {
			return emp_des;
		}


		public void setEmp_des(String emp_des) {
			this.emp_des = emp_des;
		}



		public String toString() {
			return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", emp_salary=" + emp_salary + ", emp_des="
					+ emp_des + "]";
		}
		
		

}
