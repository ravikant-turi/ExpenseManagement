package com.java.jsf.model;


public class Group {
	
    private int id;
    
    private String name;
    
    private java.sql.Timestamp createdAt;
    
    
    private Integer createdBy;
  
    private Integer noOfDays;
    
    
   

	private Double totalAmount;
    
    private Double minimumAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.sql.Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(java.sql.Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(Double minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", createdAt=" + createdAt + ", createdBy=" + createdBy
				+ ", noOfDays=" + noOfDays + ", totalAmount=" + totalAmount + ", minimumAmount=" + minimumAmount
				+ "]";
	}
    
    
    
    
    
    
    

    
	
    
    


   
}
