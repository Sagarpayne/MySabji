package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ap_products database table.
 * 
 */
@Entity
@Table(name="ap_products")
@NamedQuery(name="ApProduct.findAll", query="SELECT a FROM ApProduct a")
public class ApProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id_sku")
	private int productIdSku;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="product_created_date")
	private Date productCreatedDate;

	@Column(name="product_details")
	private String productDetails;

	@Column(name="product_information")
	private String productInformation;

	@Column(name="product_main_img")
	private int productMainImg;

	@Column(name="product_name")
	private String productName;

	@Column(name="product_return_policy")
	private int productReturnPolicy;

	@Column(name="product_status")
	private int productStatus;

	@Column(name="product_stock_current")
	private String productStockCurrent;

	@Column(name="product_stock_maximum")
	private int productStockMaximum;

	@Column(name="product_stock_minimum")
	private int productStockMinimum;

	@Column(name="product_varient")
	private int productVarient;

	public ApProduct() {
	}

	public int getProductIdSku() {
		return this.productIdSku;
	}

	public void setProductIdSku(int productIdSku) {
		this.productIdSku = productIdSku;
	}

	public Date getProductCreatedDate() {
		return this.productCreatedDate;
	}

	public void setProductCreatedDate(Date productCreatedDate) {
		this.productCreatedDate = productCreatedDate;
	}

	public String getProductDetails() {
		return this.productDetails;
	}

	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	public String getProductInformation() {
		return this.productInformation;
	}

	public void setProductInformation(String productInformation) {
		this.productInformation = productInformation;
	}

	public int getProductMainImg() {
		return this.productMainImg;
	}

	public void setProductMainImg(int productMainImg) {
		this.productMainImg = productMainImg;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductReturnPolicy() {
		return this.productReturnPolicy;
	}

	public void setProductReturnPolicy(int productReturnPolicy) {
		this.productReturnPolicy = productReturnPolicy;
	}

	public int getProductStatus() {
		return this.productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductStockCurrent() {
		return this.productStockCurrent;
	}

	public void setProductStockCurrent(String productStockCurrent) {
		this.productStockCurrent = productStockCurrent;
	}

	public int getProductStockMaximum() {
		return this.productStockMaximum;
	}

	public void setProductStockMaximum(int productStockMaximum) {
		this.productStockMaximum = productStockMaximum;
	}

	public int getProductStockMinimum() {
		return this.productStockMinimum;
	}

	public void setProductStockMinimum(int productStockMinimum) {
		this.productStockMinimum = productStockMinimum;
	}

	public int getProductVarient() {
		return this.productVarient;
	}

	public void setProductVarient(int productVarient) {
		this.productVarient = productVarient;
	}

}