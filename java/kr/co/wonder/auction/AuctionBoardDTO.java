/*
ab_id varchar(25) PK 
ab_title varchar(20) 
ab_date date 
ab_limit date 
ab_currentprice int 
ab_startprice int 
ab_minimumprice int 
ab_endprice int 
ab_category varchar(45) 
ab_delete varchar(45) 
ab_content varchar(60)
 */

package kr.co.wonder.auction;



public class AuctionBoardDTO {
	private String ab_id;
	private String ab_title;
	private String ab_date;
	private String ab_limit;
	private int ab_currentprice;
	private int ab_startprice;
	private int ab_minimumprice;
	private int ab_endprice;
	private String ab_category;
	private int ab_delete;
	private String ab_content;
	private int ab_pricerise;
	public String getAb_id() {
		return ab_id;
	}
	public void setAb_id(String ab_id) {
		this.ab_id = ab_id;
	}
	public String getAb_title() {
		return ab_title;
	}
	public void setAb_title(String ab_title) {
		this.ab_title = ab_title;
	}
	public String getAb_date() {
		return ab_date;
	}
	public void setAb_date(String ab_date) {
		this.ab_date = ab_date;
	}
	public String getAb_limit() {
		return ab_limit;
	}
	public void setAb_limit(String ab_limit) {
		this.ab_limit = ab_limit;
	}
	public int getAb_currentprice() {
		return ab_currentprice;
	}
	public void setAb_currentprice(int ab_currentprice) {
		this.ab_currentprice = ab_currentprice;
	}
	public int getAb_startprice() {
		return ab_startprice;
	}
	public void setAb_startprice(int ab_startprice) {
		this.ab_startprice = ab_startprice;
	}
	public int getAb_minimumprice() {
		return ab_minimumprice;
	}
	public void setAb_minimumprice(int ab_minimumprice) {
		this.ab_minimumprice = ab_minimumprice;
	}
	public int getAb_endprice() {
		return ab_endprice;
	}
	public void setAb_endprice(int ab_endprice) {
		this.ab_endprice = ab_endprice;
	}
	public String getAb_category() {
		return ab_category;
	}
	public void setAb_category(String ab_category) {
		this.ab_category = ab_category;
	}
	public int getAb_delete() {
		return ab_delete;
	}
	public void setAb_delete(int ab_delete) {
		this.ab_delete = ab_delete;
	}
	public String getAb_content() {
		return ab_content;
	}
	public void setAb_content(String ab_content) {
		this.ab_content = ab_content;
	}
	public int getAb_pricerise() {
		return ab_pricerise;
	}
	public void setAb_pricerise(int ab_pricerise) {
		this.ab_pricerise = ab_pricerise;
	}
	@Override
	public String toString() {
		return "AuctionBoardDTO [ab_id=" + ab_id + ", ab_title=" + ab_title + ", ab_date=" + ab_date + ", ab_limit="
				+ ab_limit + ", ab_currentprice=" + ab_currentprice + ", ab_startprice=" + ab_startprice
				+ ", ab_minimumprice=" + ab_minimumprice + ", ab_endprice=" + ab_endprice + ", ab_category="
				+ ab_category + ", ab_delete=" + ab_delete + ", ab_content=" + ab_content + ", ab_pricerise="
				+ ab_pricerise + "]";
	}
	
	

	

}
