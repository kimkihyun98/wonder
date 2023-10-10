package kr.co.wonder.auction;


public class AuctionBoardReplyDTO {
	private int auction_reno;
	private String rewriter;
	private String rememo;
	private String redate;
	private int ab_id;
	public int getAuction_reno() {
		return auction_reno;
	}
	public void setAuction_reno(int auction_reno) {
		this.auction_reno = auction_reno;
	}
	public String getRewriter() {
		return rewriter;
	}
	public void setRewriter(String rewriter) {
		this.rewriter = rewriter;
	}
	public String getRememo() {
		return rememo;
	}
	public void setRememo(String rememo) {
		this.rememo = rememo;
	}
	public String getRedate() {
		return redate;
	}
	public void setRedate(String redate) {
		this.redate = redate;
	}
	public int getAb_id() {
		return ab_id;
	}
	public void setAb_id(int ab_id) {
		this.ab_id = ab_id;
	}
	@Override
	public String toString() {
		return "AuctionBoardReplyDTO [auction_reno=" + auction_reno + ", rewriter=" + rewriter + ", rememo=" + rememo
				+ ", redate=" + redate + ", ab_id=" + ab_id + "]";
	}
	
	

}
