package com.cafe24.susinsa.dto.cart;

public class CartDTO {
	private String product_name;
	private long product_price;
	private String opt_full_detail_name;
	private int opt_full_detail_extra;
	private int cart_count;
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public long getProduct_price() {
		return product_price;
	}
	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}
	public String getOpt_full_detail_name() {
		return opt_full_detail_name;
	}
	public void setOpt_full_detail_name(String opt_full_detail_name) {
		this.opt_full_detail_name = opt_full_detail_name;
	}
	public int getOpt_full_detail_extra() {
		return opt_full_detail_extra;
	}
	public void setOpt_full_detail_extra(int opt_full_detail_extra) {
		this.opt_full_detail_extra = opt_full_detail_extra;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	@Override
	public String toString() {
		return "CartDTO [product_name=" + product_name + ", product_price=" + product_price + ", opt_full_detail_name="
				+ opt_full_detail_name + ", opt_full_detail_extra=" + opt_full_detail_extra + ", cart_count="
				+ cart_count + "]";
	}
	public CartDTO(String product_name, long product_price, String opt_full_detail_name, int opt_full_detail_extra,
			int cart_count) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
		this.opt_full_detail_name = opt_full_detail_name;
		this.opt_full_detail_extra = opt_full_detail_extra;
		this.cart_count = cart_count;
	}
	
	public CartDTO() {
		
	}
}
