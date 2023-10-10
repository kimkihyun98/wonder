/*
 * 
 * mem_id varchar(25) PK 
buyer_date date 
buyer_price int 
buyer_cash int 
product_id varchar(25)
 */

package kr.co.wonder.auction;

import java.util.Date;

public class AuctionBuyerDTO {
	private String mem_id;
	private Date buyer_date;
	private int buyer_price;
	private int buyer_cash;
	private String product_id;
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public Date getBuyer_date() {
		return buyer_date;
	}
	public void setBuyer_date(Date buyer_date) {
		this.buyer_date = buyer_date;
	}
	public int getBuyer_price() {
		return buyer_price;
	}
	public void setBuyer_price(int buyer_price) {
		this.buyer_price = buyer_price;
	}
	public int getBuyer_cash() {
		return buyer_cash;
	}
	public void setBuyer_cash(int buyer_cash) {
		this.buyer_cash = buyer_cash;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	@Override
	public String toString() {
		return "AuctionBuyerDTO [mem_id=" + mem_id + ", buyer_price=" + buyer_price + ", buyer_cash=" + buyer_cash
				+ ", product_id=" + product_id + "]";
	}
	
	
}
