package com.cafe24.susinsa.vo;

public class OptionVo {
	Long option_no;
	String option_contents;
	Integer option_count;
	Long product_no;
	public Long getOption_no() {
		return option_no;
	}
	@Override
	public String toString() {
		return "OptionVo [option_no=" + option_no + ", option_contents=" + option_contents + ", option_count="
				+ option_count + ", product_no=" + product_no + "]";
	}
	public void setOption_no(Long option_no) {
		this.option_no = option_no;
	}
	public String getOption_contents() {
		return option_contents;
	}
	public void setOption_contents(String option_contents) {
		this.option_contents = option_contents;
	}
	public Integer getOption_count() {
		return option_count;
	}
	public void setOption_count(Integer option_count) {
		this.option_count = option_count;
	}
	public Long getProduct_no() {
		return product_no;
	}
	public void setProduct_no(Long product_no) {
		this.product_no = product_no;
	}
	public OptionVo(Long option_no, String option_contents, Integer option_count, Long product_no) {
		super();
		this.option_no = option_no;
		this.option_contents = option_contents;
		this.option_count = option_count;
		this.product_no = product_no;
	}
}
