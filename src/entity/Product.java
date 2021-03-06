package entity;

import java.util.Date;
//商品类
public class Product {
	private int product_id;//商品编号
	private String product_name;//商品名称
	private String product_info;//商品简介
	private int product_price;//商品价格
	private int product_stock;//商品库存量
	private int product_fid;//商品分类编号
	private int product_cid;//商品细分分类编号
	private String product_photo;//商品图片
	private String product_style;//商品风格类型
	private int product_sales;//商品交易数量
	private Date product_time;//商品上货时间

	public Product(){

	}

	public Product(String product_name, String product_info, int product_price, int product_stock, int product_fid, int product_cid, String product_photo,Date product_time) {
		this.product_name = product_name;
		this.product_info = product_info;
		this.product_price = product_price;
		this.product_stock = product_stock;
		this.product_fid = product_fid;
		this.product_cid = product_cid;
		this.product_photo = product_photo;
		this.product_time = product_time;
	}

	public Product(String product_name, String product_info, int product_price, int product_stock, int product_fid, int product_cid, String product_photo) {
		this.product_name = product_name;
		this.product_info = product_info;
		this.product_price = product_price;
		this.product_stock = product_stock;
		this.product_fid = product_fid;
		this.product_cid = product_cid;
		this.product_photo = product_photo;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_info() {
		return product_info;
	}

	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public int getProduct_stock() {
		return product_stock;
	}

	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}

	public int getProduct_fid() {
		return product_fid;
	}

	public void setProduct_fid(int product_fid) {
		this.product_fid = product_fid;
	}

	public int getProduct_cid() {
		return product_cid;
	}

	public void setProduct_cid(int product_cid) {
		this.product_cid = product_cid;
	}

	public String getProduct_photo() {
		return product_photo;
	}

	public void setProduct_photo(String product_photo) {
		this.product_photo = product_photo;
	}

	public String getProduct_style() {
		return product_style;
	}

	public void setProduct_style(String product_style) {
		this.product_style = product_style;
	}

	public int getProduct_sales() {
		return product_sales;
	}

	public void setProduct_sales(int product_sales) {
		this.product_sales = product_sales;
	}


	public Date getProduct_time() {
		return product_time;
	}

	public void setProduct_time(Date product_time) {
		this.product_time = product_time;
	}

	@Override
	public String toString() {
		return "Product{" +
				"product_id=" + product_id +
				", product_name='" + product_name + '\'' +
				", product_info='" + product_info + '\'' +
				", product_price=" + product_price +
				", product_stock=" + product_stock +
				", product_fid=" + product_fid +
				", product_cid=" + product_cid +
				", product_photo='" + product_photo + '\'' +
				", product_style='" + product_style + '\'' +
				", product_sales=" + product_sales +
				", product_time=" + product_time +
				'}';
	}
}
