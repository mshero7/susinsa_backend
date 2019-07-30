package com.cafe24.susinsa.vo;

import java.util.Date;

public class ProductVo {
	public long product_no;
	public String product_name;
	public int product_price;
	public boolean product_sale;
	public Date product_date;
	public int product_weight;
	public long product_brand_no;
	public long product_category_no;
	
	public ProductVo() {
		
	}
	
	public ProductVo(long product_no, String product_name, int product_price, boolean product_sale, Date product_date,
			int product_weight, long product_brand_no, long product_category_no) {
		super();
		this.product_no = product_no;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_sale = product_sale;
		this.product_date = product_date;
		this.product_weight = product_weight;
		this.product_brand_no = product_brand_no;
		this.product_category_no = product_category_no;
	}

	@Override
	public String toString() {
		return "ProductVo [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_sale=" + product_sale + ", product_date=" + product_date
				+ ", product_weight=" + product_weight + ", product_brand_no=" + product_brand_no
				+ ", product_category_no=" + product_category_no + "]";
	}

	public long getProduct_no() {
		return product_no;
	}

	public void setProduct_no(long product_no) {
		this.product_no = product_no;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public boolean isProduct_sale() {
		return product_sale;
	}

	public void setProduct_sale(boolean product_sale) {
		this.product_sale = product_sale;
	}

	public Date getProduct_date() {
		return product_date;
	}

	public void setProduct_date(Date product_date) {
		this.product_date = product_date;
	}

	public int getProduct_weight() {
		return product_weight;
	}

	public void setProduct_weight(int product_weight) {
		this.product_weight = product_weight;
	}

	public long getProduct_brand_no() {
		return product_brand_no;
	}

	public void setProduct_brand_no(long product_brand_no) {
		this.product_brand_no = product_brand_no;
	}

	public long getProduct_category_no() {
		return product_category_no;
	}

	public void setProduct_category_no(long product_category_no) {
		this.product_category_no = product_category_no;
	}
	
	
}
