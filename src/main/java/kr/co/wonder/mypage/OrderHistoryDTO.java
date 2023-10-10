package kr.co.wonder.mypage;


public class OrderHistoryDTO {
	
	private int id_orderhistory;
	private String mem_id;
	private int order_id;
	private String product_id;
	public int getId_orderhistory() {
		return id_orderhistory;
	}
	public void setId_orderhistory(int id_orderhistory) {
		this.id_orderhistory = id_orderhistory;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	@Override
	public String toString() {
		return "OrderHistoryDTO [id_orderhistory=" + id_orderhistory + ", mem_id=" + mem_id + ", order_id=" + order_id
				+ ", product_id=" + product_id + "]";
	}
	
	

	
}
