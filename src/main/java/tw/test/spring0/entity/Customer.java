package tw.test.spring0.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {
	@Id
	@Column(name = "CustomerID ")
	private String customerID ;
	
	@Column(name = "CompanyName")
	private String companyName;
}
