package com.cafe24.susinsa.vo;

public class OptDetailVo {
	private long opt_detail_no;
	private String opt_detail_name;
	private long opt_detail_opt_no;
	@Override
	public String toString() {
		return "OptDetailVo [opt_detail_no=" + opt_detail_no + ", opt_detail_name=" + opt_detail_name
				+ ", opt_detail_opt_no=" + opt_detail_opt_no + "]";
	}
	public long getOpt_detail_no() {
		return opt_detail_no;
	}
	public void setOpt_detail_no(long opt_detail_no) {
		this.opt_detail_no = opt_detail_no;
	}
	public String getOpt_detail_name() {
		return opt_detail_name;
	}
	public void setOpt_detail_name(String opt_detail_name) {
		this.opt_detail_name = opt_detail_name;
	}
	public long getOpt_detail_opt_no() {
		return opt_detail_opt_no;
	}
	public void setOpt_detail_opt_no(long opt_detail_opt_no) {
		this.opt_detail_opt_no = opt_detail_opt_no;
	}
	public OptDetailVo(long opt_detail_no, String opt_detail_name, long opt_detail_opt_no) {
		super();
		this.opt_detail_no = opt_detail_no;
		this.opt_detail_name = opt_detail_name;
		this.opt_detail_opt_no = opt_detail_opt_no;
	}
}