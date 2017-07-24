package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ap_address database table.
 * 
 */
@Entity
@Table(name="ap_address")
@NamedQuery(name="ApAddress.findAll", query="SELECT a FROM ApAddress a")
public class ApAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="a_id")
	private int aId;

	@Column(name="add_line1")
	private String addLine1;

	@Column(name="add_line2")
	private String addLine2;

	private String addresstype;

	private String ap_Addresscol1;

	private String area;

	@Column(name="created_date")
	private String createdDate;

	private String pincode;

	private String state;

	private String status;

	public ApAddress() {
	}

	public int getAId() {
		return this.aId;
	}

	public void setAId(int aId) {
		this.aId = aId;
	}

	public String getAddLine1() {
		return this.addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return this.addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getAddresstype() {
		return this.addresstype;
	}

	public void setAddresstype(String addresstype) {
		this.addresstype = addresstype;
	}

	public String getAp_Addresscol1() {
		return this.ap_Addresscol1;
	}

	public void setAp_Addresscol1(String ap_Addresscol1) {
		this.ap_Addresscol1 = ap_Addresscol1;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}