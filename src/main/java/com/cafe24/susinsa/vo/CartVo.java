package com.cafe24.susinsa.vo;

public class CartVo {
	private long cart_no;
	private int cart_count;
	private long cart_client_no;
	private long cart_opt_full_detail_no;

	public CartVo() {
		
	}
	
	public long getCart_no() {
		return cart_no;
	}

	public void setCart_no(long cart_no) {
		this.cart_no = cart_no;
	}

	public int getCart_count() {
		return cart_count;
	}

	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}

	public long getCart_client_no() {
		return cart_client_no;
	}

	public void setCart_client_no(long cart_client_no) {
		this.cart_client_no = cart_client_no;
	}

	public long getCart_opt_full_detail_no() {
		return cart_opt_full_detail_no;
	}

	public void setCart_opt_full_detail_no(long cart_opt_full_detail_no) {
		this.cart_opt_full_detail_no = cart_opt_full_detail_no;
	}

	@Override
	public String toString() {
		return "CartVo [cart_no=" + cart_no + ", cart_count=" + cart_count + ", cart_client_no=" + cart_client_no
				+ ", cart_opt_full_detail_no=" + cart_opt_full_detail_no + "]";
	}

	public CartVo(long cart_no, int cart_count, long cart_client_no, long cart_opt_full_detail_no) {
		super();
		this.cart_no = cart_no;
		this.cart_count = cart_count;
		this.cart_client_no = cart_client_no;
		this.cart_opt_full_detail_no = cart_opt_full_detail_no;
	}

}
