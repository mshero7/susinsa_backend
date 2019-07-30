package com.cafe24.susinsa.vo;

import java.util.Date;

public class ImageVo {
	private long image_no;
	private String image_upload_name;
	private Date image_date;
	private int image_order;
	private long image_product_no;
		
	public int getImage_order() {
		return image_order;
	}

	public void setImage_order(int image_order) {
		this.image_order = image_order;
	}

	public ImageVo() {
		
	}
	
	public ImageVo(long image_no, String image_upload_name, Date image_date, int image_order, long image_product_no) {
		super();
		this.image_no = image_no;
		this.image_upload_name = image_upload_name;
		this.image_date = image_date;
		this.image_order = image_order;
		this.image_product_no = image_product_no;
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

	@Override
	public String toString() {
		return "ImageVo [image_no=" + image_no + ", image_upload_name=" + image_upload_name + ", image_date="
				+ image_date + ", image_product_no=" + image_product_no + "]";
	}
	
}