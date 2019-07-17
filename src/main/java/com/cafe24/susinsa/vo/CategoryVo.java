package com.cafe24.susinsa.vo;

public class CategoryVo {
	Long category_no;
	String category_name;
	Long category_product_no;
	public CategoryVo(Long category_no, String category_name, Long category_product_no) {
		super();
		this.category_no = category_no;
		this.category_name = category_name;
		this.category_product_no = category_product_no;
	}
	@Override
	public String toString() {
		return "CategoryVo [category_no=" + category_no + ", category_name=" + category_name + ", category_product_no="
				+ category_product_no + "]";
	}
	public Long getCategory_no() {
		return category_no;
	}
	public void setCategory_no(Long category_no) {
		this.category_no = category_no;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Long getCategory_product_no() {
		return category_product_no;
	}
	public void setCategory_product_no(Long category_product_no) {
		this.category_product_no = category_product_no;
	}
	
}
