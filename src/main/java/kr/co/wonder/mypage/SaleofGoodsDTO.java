package kr.co.wonder.mypage;


public class SaleofGoodsDTO {
	
	private int saleshistory_id;
	private String mem_id;
	private String product_name;
	public int getSaleshistory_id() {
		return saleshistory_id;
	}
	public void setSaleshistory_id(int saleshistory_id) {
		this.saleshistory_id = saleshistory_id;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	@Override
	public String toString() {
		return "SaleofGoodsDTO [saleshistory_id=" + saleshistory_id + ", mem_id=" + mem_id + ", product_name="
				+ product_name + "]";
	}
	
	
	

	
}
