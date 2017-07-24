package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ap_person database table.
 * 
 */
@Entity
@Table(name="ap_person")
@NamedQuery(name="ApPerson.findAll", query="SELECT a FROM ApPerson a")
public class ApPerson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="p_id")
	private int pId;

	private String accept;

	@Column(name="address_1")
	private int address1;

	@Column(name="address_2")
	private int address2;

	@Column(name="address_a")
	private int addressA;

	@Column(name="address_b")
	private int addressB;

	@Column(name="contact_1")
	private String contact1;

	@Column(name="contact_2")
	private String contact2;

	@Column(name="contact_3")
	private String contact3;

	@Temporal(TemporalType.DATE)
	private Date createddate;

	private float discount;

	private String email;

	private String fname;

	private String image;

	//private Object json;

	@Temporal(TemporalType.DATE)
	private Date lastvisited;

	private String lname;

	private String member;

	private String pwd;

	private String remark;

	private String status;

	private String updatedby;

	@Temporal(TemporalType.DATE)
	private Date updateddate;

	private String username;

	public ApPerson() {
	}

	public int getPId() {
		return this.pId;
	}

	public void setPId(int pId) {
		this.pId = pId;
	}

	public String getAccept() {
		return this.accept;
	}

	public void setAccept(String accept) {
		this.accept = accept;
	}

	public int getAddress1() {
		return this.address1;
	}

	public void setAddress1(int address1) {
		this.address1 = address1;
	}

	public int getAddress2() {
		return this.address2;
	}

	public void setAddress2(int address2) {
		this.address2 = address2;
	}

	public int getAddressA() {
		return this.addressA;
	}

	public void setAddressA(int addressA) {
		this.addressA = addressA;
	}

	public int getAddressB() {
		return this.addressB;
	}

	public void setAddressB(int addressB) {
		this.addressB = addressB;
	}

	public String getContact1() {
		return this.contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return this.contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getContact3() {
		return this.contact3;
	}

	public void setContact3(String contact3) {
		this.contact3 = contact3;
	}

	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

//	public Object getJson() {
//		return this.json;
//	}
//
//	public void setJson(Object json) {
//		this.json = json;
//	}

	public Date getLastvisited() {
		return this.lastvisited;
	}

	public void setLastvisited(Date lastvisited) {
		this.lastvisited = lastvisited;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMember() {
		return this.member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getUpdateddate() {
		return this.updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}