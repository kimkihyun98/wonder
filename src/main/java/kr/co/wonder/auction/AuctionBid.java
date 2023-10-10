package kr.co.wonder.auction;


public class AuctionBid {
	private String ab_id;
	private String mem_id;
	
	private int total;

	public String getAb_id() {
		return ab_id;
	}

	public void setAb_id(String ab_id) {
		this.ab_id = ab_id;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "AuctionBid [ab_id=" + ab_id + ", mem_id=" + mem_id + ", total=" + total + "]";
	}
	
	
}
