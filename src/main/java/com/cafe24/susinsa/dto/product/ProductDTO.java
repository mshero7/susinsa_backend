package com.cafe24.susinsa.dto.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cafe24.susinsa.vo.OptDetailVo;
import com.cafe24.susinsa.vo.OptFullDetailVo;
import com.cafe24.susinsa.vo.OptVo;

public class ProductDTO {
	// PRODUCT
	private Long product_no;
	private String product_name;
	private Integer product_price;
	private Boolean product_sale;
	private Date product_date;
	private Integer product_weight;
	private Long product_brand_no;
	private Long product_category_no;

	// OPT
	private ArrayList<OptVo> list_opt;
	
	// OPT_DETAIL
	private ArrayList<OptDetailVo> list_opt_detail;
	
	// OPT_FULL_DETAIL
	private ArrayList<OptFullDetailVo> list_opt_full_detail;
	
	// IMAGE
	private long image_no;
	private String image_upload_name;
	private Date image_date;
	private long image_product_no;
	
	public ProductDTO() {
		
	}

	@Override
	public String toString() {
		return "ProductDTO [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_sale=" + product_sale + ", product_date=" + product_date
				+ ", product_weight=" + product_weight + ", product_brand_no=" + product_brand_no
				+ ", product_category_no=" + product_category_no + ", list_opt=" + list_opt + ", list_opt_detail="
				+ list_opt_detail + ", list_opt_full_detail=" + list_opt_full_detail + ", image_no=" + image_no
				+ ", image_upload_name=" + image_upload_name + ", image_date=" + image_date + ", image_product_no="
				+ image_product_no + "]";
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

	public Boolean getProduct_sale() {
		return product_sale;
	}

	public void setProduct_sale(Boolean product_sale) {
		this.product_sale = product_sale;
	}

	public Date getProduct_date() {
		return product_date;
	}

	public void setProduct_date(Date product_date) {
		this.product_date = product_date;
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

	public Long getProduct_category_no() {
		return product_category_no;
	}

	public void setProduct_category_no(Long product_category_no) {
		this.product_category_no = product_category_no;
	}


	public ArrayList<OptVo> getList_opt() {
		return list_opt;
	}

	public void setList_opt(ArrayList<OptVo> list_opt) {
		this.list_opt = list_opt;
	}

	public ArrayList<OptDetailVo> getList_opt_detail() {
		return list_opt_detail;
	}

	void setList_opt_detail(ArrayList<OptDetailVo> list_opt_detail) {
		this.list_opt_detail = list_opt_detail;
	}

	ArrayList<OptFullDetailVo> getList_opt_full_detail() {
		return list_opt_full_detail;
	}

	void setList_opt_full_detail(ArrayList<OptFullDetailVo> list_opt_full_detail) {
		this.list_opt_full_detail = list_opt_full_detail;
	}

	public long getImage_no() {
		return image_no;
	}

	public void setImage_no(long image_no) {
		this.image_no = image_no;
	}

	public String getImage_upload_name() {
		return image_upload_name;
	}

	public void setImage_upload_name(String image_upload_name) {
		this.image_upload_name = image_upload_name;
	}

	public Date getImage_date() {
		return image_date;
	}

	public void setImage_date(Date image_date) {
		this.image_date = image_date;
	}

	public long getImage_product_no() {
		return image_product_no;
	}

	public void setImage_product_no(long image_product_no) {
		this.image_product_no = image_product_no;
	}
	
	
}
