package com.cafe24.susinsa.vo;

public class OptFullDetailVo {
	long opt_full_detail_no;
	String opt_full_detail_name;
	boolean opt_full_detail_display;
	boolean opt_full_detail_sales;
	int opt_full_detail_extra;
	int opt_full_detail_stock;
	long opt_full_detail_product_no;
	
	

	public OptFullDetailVo(long opt_full_detail_no, String opt_full_detail_name, boolean opt_full_detail_display,
			boolean opt_full_detail_sales, int opt_full_detail_extra, int opt_full_detail_stock,
			long opt_full_detail_product_no) {
		super();
		this.opt_full_detail_no = opt_full_detail_no;
		this.opt_full_detail_name = opt_full_detail_name;
		this.opt_full_detail_display = opt_full_detail_display;
		this.opt_full_detail_sales = opt_full_detail_sales;
		this.opt_full_detail_extra = opt_full_detail_extra;
		this.opt_full_detail_stock = opt_full_detail_stock;
		this.opt_full_detail_product_no = opt_full_detail_product_no;
	}


	public OptFullDetailVo() {
		
	}
	
	public long getOpt_full_detail_no() {
		return opt_full_detail_no;
	}
	public void setOpt_full_detail_no(long opt_full_detail_no) {
		this.opt_full_detail_no = opt_full_detail_no;
	}
	public String getOpt_full_detail_name() {
		return opt_full_detail_name;
	}
	public void setOpt_full_detail_name(String opt_full_detail_name) {
		this.opt_full_detail_name = opt_full_detail_name;
	}
	public boolean isOpt_full_detail_display() {
		return opt_full_detail_display;
	}
	public void setOpt_full_detail_display(boolean opt_full_detail_display) {
		this.opt_full_detail_display = opt_full_detail_display;
	}
	public boolean isOpt_full_detail_sales() {
		return opt_full_detail_sales;
	}
	public void setOpt_full_detail_sales(boolean opt_full_detail_sales) {
		this.opt_full_detail_sales = opt_full_detail_sales;
	}
	public int getOpt_full_detail_extra() {
		return opt_full_detail_extra;
	}
	public void setOpt_full_detail_extra(int opt_full_detail_extra) {
		this.opt_full_detail_extra = opt_full_detail_extra;
	}
	public int getOpt_full_detail_stock() {
		return opt_full_detail_stock;
	}
	public void setOpt_full_detail_stock(int opt_full_detail_stock) {
		this.opt_full_detail_stock = opt_full_detail_stock;
	}

	public long getOpt_full_detail_product_no() {
		return opt_full_detail_product_no;
	}


	public void setOpt_full_detail_product_no(long opt_full_detail_product_no) {
		this.opt_full_detail_product_no = opt_full_detail_product_no;
	}


	@Override
	public String toString() {
		return "OptFullDetailVo [opt_full_detail_no=" + opt_full_detail_no + ", opt_full_detail_name="
				+ opt_full_detail_name + ", opt_full_detail_display=" + opt_full_detail_display
				+ ", opt_full_detail_sales=" + opt_full_detail_sales + ", opt_full_detail_extra="
				+ opt_full_detail_extra + ", opt_full_detail_stock=" + opt_full_detail_stock
				+ ", opt_full_detail_product_no=" + opt_full_detail_product_no + "]";
	}
	
	
}
