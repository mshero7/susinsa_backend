package com.cafe24.susinsa.vo;

public class ProductVo {
	Long product_no;
	String product_name;
	Integer product_price;
	Boolean product_regDate; 
	Integer product_weight;
	Long product_brand_no;
	
	public ProductVo(Long product_no, String product_name, Integer product_price, Boolean product_regDate,
			Integer product_weight, Long product_brand_no) {
		super();
		this.product_no = product_no;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_regDate = product_regDate;
		this.product_weight = product_weight;
		this.product_brand_no = product_brand_no;
	}
	public Long getProduct_no() {
		return product_no;
	}
	public void setProduct_no(Long product_no) {
		this.product_no = product_no;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Integer getProduct_price() {
		return product_price;
	}
	public void setProduct_price(Integer product_price) {
		this.product_price = product_price;
	}
	public Boolean getProduct_regDate() {
		return product_regDate;
	}
	public void setProduct_regDate(Boolean product_regDate) {
		this.product_regDate = product_regDate;
	}
	public Integer getProduct_weight() {
		return product_weight;
	}
	public void setProduct_weight(Integer product_weight) {
		this.product_weight = product_weight;
	}
	public Long getProduct_brand_no() {
		return product_brand_no;
	}
	public void setProduct_brand_no(Long product_brand_no) {
		this.product_brand_no = product_brand_no;
	}
	@Override
	public String toString() {
		return "ProductVo [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_regDate=" + product_regDate + ", product_weight=" + product_weight
				+ ", product_brand_no=" + product_brand_no + "]";
	}
	
	
}
