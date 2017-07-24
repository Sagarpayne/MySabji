package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ap_order database table.
 * 
 */
@Entity
@Table(name="ap_order")
@NamedQuery(name="ApOrder.findAll", query="SELECT a FROM ApOrder a")
public class ApOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_id")
	private int orderId;

	@Column(name="address_id")
	private int addressId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="order_created_date")
	private Date orderCreatedDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="order_del_date")
	private Date orderDelDate;

	@Column(name="order_status")
	private String orderStatus;

	@Column(name="order_store")
	private int orderStore;

	@Column(name="order_total_price")
	private double orderTotalPrice;

	@Column(name="person_id")
	private int personId;

	public ApOrder() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Date getOrderCreatedDate() {
		return this.orderCreatedDate;
	}

	public void setOrderCreatedDate(Date orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public Date getOrderDelDate() {
		return this.orderDelDate;
	}

	public void setOrderDelDate(Date orderDelDate) {
		this.orderDelDate = orderDelDate;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderStore() {
		return this.orderStore;
	}

	public void setOrderStore(int orderStore) {
		this.orderStore = orderStore;
	}

	public double getOrderTotalPrice() {
		return this.orderTotalPrice;
	}

	public void setOrderTotalPrice(double orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

}