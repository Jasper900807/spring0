package tw.test.spring0.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @Column(name = "CategoryID")
    private Long categoryId;

    @Column(name = "CategoryName")
    private String categoryName; 

}
