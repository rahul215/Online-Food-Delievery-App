package in.training.billingdetail.domain;

import java.util.Date;

public class Project {
	private Long id;
	private String projectName;
	private String FoodCart;
	private Date date;
	
	private Date created_At;
	private Date updated_At;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getFoodCart() {
		return FoodCart;
	}
	public void setFoodCart(String foodCart) {
		FoodCart = foodCart;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	

}
