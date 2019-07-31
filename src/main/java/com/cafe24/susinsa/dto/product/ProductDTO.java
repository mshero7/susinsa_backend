package com.cafe24.susinsa.dto.product;

import java.util.ArrayList;
import java.util.Date;

import com.cafe24.susinsa.vo.ImageVo;
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
	private ArrayList<ImageVo> list_image;

	public ProductDTO(Long product_no, String product_name, Integer product_price, Boolean product_sale,
			Date product_date, Integer product_weight, Long product_brand_no, Long product_category_no,
			ArrayList<OptVo> list_opt, ArrayList<OptDetailVo> list_opt_detail,
			ArrayList<OptFullDetailVo> list_opt_full_detail, ArrayList<ImageVo> list_image) {
		super();
		this.product_no = product_no;
		this.product_name = product_name;
		this.product_price = product_price;
		this.product_sale = product_sale;
		this.product_date = product_date;
		this.product_weight = product_weight;
		this.product_brand_no = product_brand_no;
		this.product_category_no = product_category_no;
		this.list_opt = list_opt;
		this.list_opt_detail = list_opt_detail;
		this.list_opt_full_detail = list_opt_full_detail;
		this.list_image = list_image;
	}
	
	public ProductDTO() {
		
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

	public void setList_opt_detail(ArrayList<OptDetailVo> list_opt_detail) {
		this.list_opt_detail = list_opt_detail;
	}

	public ArrayList<OptFullDetailVo> getList_opt_full_detail() {
		return list_opt_full_detail;
	}

	public void setList_opt_full_detail(ArrayList<OptFullDetailVo> list_opt_full_detail) {
		this.list_opt_full_detail = list_opt_full_detail;
	}

	public ArrayList<ImageVo> getList_image() {
		return list_image;
	}

	public void setList_image(ArrayList<ImageVo> list_image) {
		this.list_image = list_image;
	}

	@Override
	public String toString() {
		return "ProductDTO [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_sale=" + product_sale + ", product_date=" + product_date
				+ ", product_weight=" + product_weight + ", product_brand_no=" + product_brand_no
				+ ", product_category_no=" + product_category_no + ", list_opt=" + list_opt + ", list_opt_detail="
				+ list_opt_detail + ", list_opt_full_detail=" + list_opt_full_detail + ", list_image=" + list_image
				+ "]";
	}
	
	
	
	
}
