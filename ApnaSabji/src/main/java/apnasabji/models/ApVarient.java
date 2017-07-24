package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ap_varients database table.
 * 
 */
@Entity
@Table(name="ap_varients")
@NamedQuery(name="ApVarient.findAll", query="SELECT a FROM ApVarient a")
public class ApVarient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="v_id")
	private int vId;

	@Column(name="v_count")
	private int vCount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="v_created")
	private Date vCreated;

	@Column(name="v_hotel")
	private int vHotel;

	@Column(name="v_isitmain")
	private int vIsitmain;

	@Column(name="v_price")
	private double vPrice;

	@Column(name="v_product_id")
	private int vProductId;

	@Column(name="v_status")
	private int vStatus;

	@Column(name="v_unit")
	private String vUnit;

	public ApVarient() {
	}

	public int getVId() {
		return this.vId;
	}

	public void setVId(int vId) {
		this.vId = vId;
	}

	public int getVCount() {
		return this.vCount;
	}

	public void setVCount(int vCount) {
		this.vCount = vCount;
	}

	public Date getVCreated() {
		return this.vCreated;
	}

	public void setVCreated(Date vCreated) {
		this.vCreated = vCreated;
	}

	public int getVHotel() {
		return this.vHotel;
	}

	public void setVHotel(int vHotel) {
		this.vHotel = vHotel;
	}

	public int getVIsitmain() {
		return this.vIsitmain;
	}

	public void setVIsitmain(int vIsitmain) {
		this.vIsitmain = vIsitmain;
	}

	public double getVPrice() {
		return this.vPrice;
	}

	public void setVPrice(double vPrice) {
		this.vPrice = vPrice;
	}

	public int getVProductId() {
		return this.vProductId;
	}

	public void setVProductId(int vProductId) {
		this.vProductId = vProductId;
	}

	public int getVStatus() {
		return this.vStatus;
	}

	public void setVStatus(int vStatus) {
		this.vStatus = vStatus;
	}

	public String getVUnit() {
		return this.vUnit;
	}

	public void setVUnit(String vUnit) {
		this.vUnit = vUnit;
	}

}