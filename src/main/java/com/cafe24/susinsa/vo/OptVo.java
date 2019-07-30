package com.cafe24.susinsa.vo;

public class OptVo {
	private long opt_no;
	private String opt_name;
	private long opt_product_no;
	
	public OptVo() {
		
	}

	public OptVo(long opt_no, String opt_name, long opt_product_no) {
		super();
		this.opt_no = opt_no;
		this.opt_name = opt_name;
		this.opt_product_no = opt_product_no;
	}

	@Override
	public String toString() {
		return "OptVo [opt_no=" + opt_no + ", opt_name=" + opt_name + ", opt_product_no=" + opt_product_no + "]";
	}

	public long getOpt_no() {
		return opt_no;
	}

	public void setOpt_no(long opt_no) {
		this.opt_no = opt_no;
	}

	public String getOpt_name() {
		return opt_name;
	}

	public void setOpt_name(String opt_name) {
		this.opt_name = opt_name;
	}

	public long getOpt_product_no() {
		return opt_product_no;
	}

	public void setOpt_product_no(long opt_product_no) {
		this.opt_product_no = opt_product_no;
	}

}
