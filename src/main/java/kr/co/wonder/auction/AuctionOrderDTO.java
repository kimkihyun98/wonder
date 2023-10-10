/*
 * product_id varchar(25) PK 
mem_id varchar(25) 
ab_id varchar(25)
 */
package kr.co.wonder.auction;


public class AuctionOrderDTO {
	private String product_id;
	private String mem_id;
	private String ab_id;
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getAb_id() {
		return ab_id;
	}
	public void setAb_id(String ab_id) {
		this.ab_id = ab_id;
	}
	@Override
	public String toString() {
		return "AuctionOrderDTO [product_id=" + product_id + ", mem_id=" + mem_id + ", ab_id=" + ab_id + "]";
	}
	
	
	

}
