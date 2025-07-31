package tw.test.spring0.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private Integer employeeId;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "Title")
	private String title;
}