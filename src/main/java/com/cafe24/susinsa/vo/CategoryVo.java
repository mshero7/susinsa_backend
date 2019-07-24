package com.cafe24.susinsa.vo;

public class CategoryVo {
	Long category_no;
	String pre_category_name;
	String new_category_name;
	String category_name;
	int category_left;
	int category_right;
	Long category_product_no;
	int result;
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public CategoryVo() {
		
	}
	
	public CategoryVo(Long category_no, String pre_category_name, String new_category_name, String category_name,
			int category_left, int category_right, Long category_product_no) {
		super();
		this.category_no = category_no;
		this.pre_category_name = pre_category_name;
		this.new_category_name = new_category_name;
		this.category_name = category_name;
		this.category_left = category_left;
		this.category_right = category_right;
		this.category_product_no = category_product_no;
	}
	@Override
	public String toString() {
		return "CategoryVo [category_no=" + category_no + ", pre_category_name=" + pre_category_name
				+ ", new_category_name=" + new_category_name + ", category_name=" + category_name + ", category_left="
				+ category_left + ", category_right=" + category_right + ", category_product_no=" + category_product_no
				+ "]";
	}
	public Long getCategory_no() {
		return category_no;
	}
	public void setCategory_no(Long category_no) {
		this.category_no = category_no;
	}
	public String getPre_category_name() {
		return pre_category_name;
	}
	public void setPre_category_name(String pre_category_name) {
		this.pre_category_name = pre_category_name;
	}
	public String getNew_category_name() {
		return new_category_name;
	}
	public void setNew_category_name(String new_category_name) {
		this.new_category_name = new_category_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getCategory_left() {
		return category_left;
	}
	public void setCategory_left(int category_left) {
		this.category_left = category_left;
	}
	public int getCategory_right() {
		return category_right;
	}
	public void setCategory_right(int category_right) {
		this.category_right = category_right;
	}
	public Long getCategory_product_no() {
		return category_product_no;
	}
	public void setCategory_product_no(Long category_product_no) {
		this.category_product_no = category_product_no;
	}
		
}
