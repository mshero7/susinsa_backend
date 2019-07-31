package com.cafe24.susinsa.vo;

public class BrandVo {
	private long brand_no;
	private String brand_name;
	private String brand_division;

	public long getBrand_no() {
		return brand_no;
	}

	public BrandVo() {
		
	}
	
	public void setBrand_no(long brand_no) {
		this.brand_no = brand_no;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getBrand_division() {
		return brand_division;
	}

	public void setBrand_division(String brand_division) {
		this.brand_division = brand_division;
	}

	public BrandVo(long brand_no, String brand_name, String brand_division) {
		super();
		this.brand_no = brand_no;
		this.brand_name = brand_name;
		this.brand_division = brand_division;
	}

	@Override
	public String toString() {
		return "BrandVo [brand_no=" + brand_no + ", brand_name=" + brand_name + ", brand_division=" + brand_division
				+ "]";
	}

}
