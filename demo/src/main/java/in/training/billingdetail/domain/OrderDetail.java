package in.training.billingdetail.domain;

public class OrderDetail {
	
	int orderId;
	Foodcart cart;
	
	public OrderDetail () {}
	
	

	public OrderDetail(int orderId, Foodcart cart) {
		super();
		this.orderId = orderId;
		this.cart = cart;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Foodcart getCart() {
		return cart;
	}

	public void setCart(Foodcart cart) {
		this.cart = cart;
	}
	
	

}
