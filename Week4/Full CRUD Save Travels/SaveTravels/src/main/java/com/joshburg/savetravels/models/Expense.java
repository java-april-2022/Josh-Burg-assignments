package com.joshburg.savetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name= "expenses")
public class Expense {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @NotNull
    @Size(min = 1, max = 200)
    private String name;
    
    @NotNull( message="Amount must not be blank")
    @Min(value= 0, message= "Amount can not be 0")
    private Double amount;
    
    @NotNull
    @Size(min = 1, max = 200)
    private String vendor;
    
    @NotNull
    @Size(min = 1, max = 200, message="Description must not be blank")
    private String description;
   
    public Expense() {}
    

	public Expense(Long id, @NotNull @Size(min = 1, max = 200) String name,
			@NotNull(message = "Amount must not be blank") @Min(value = 0, message = "Amount can not be 0") Double amount,
			@NotNull @Size(min = 1, max = 200) String vendor,
			@NotNull @Size(min = 1, max = 200, message = "Description must not be blank") String description) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.vendor = vendor;
		this.description = description;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
	
}
