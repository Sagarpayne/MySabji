package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ap_stores database table.
 * 
 */
@Entity
@Table(name="ap_stores")
@NamedQuery(name="ApStore.findAll", query="SELECT a FROM ApStore a")
public class ApStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="store_id")
	private int storeId;

	@Column(name="store_add_id")
	private int storeAddId;

	@Column(name="store_contact")
	private String storeContact;

	@Column(name="store_contact2")
	private String storeContact2;

	@Column(name="store_created")
	private String storeCreated;

	@Column(name="store_location")
	private String storeLocation;

	@Column(name="store_manager")
	private String storeManager;

	@Column(name="store_name")
	private String storeName;

	@Column(name="store_remark")
	private String storeRemark;

	@Column(name="store_status")
	private String storeStatus;

	public ApStore() {
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getStoreAddId() {
		return this.storeAddId;
	}

	public void setStoreAddId(int storeAddId) {
		this.storeAddId = storeAddId;
	}

	public String getStoreContact() {
		return this.storeContact;
	}

	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}

	public String getStoreContact2() {
		return this.storeContact2;
	}

	public void setStoreContact2(String storeContact2) {
		this.storeContact2 = storeContact2;
	}

	public String getStoreCreated() {
		return this.storeCreated;
	}

	public void setStoreCreated(String storeCreated) {
		this.storeCreated = storeCreated;
	}

	public String getStoreLocation() {
		return this.storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getStoreManager() {
		return this.storeManager;
	}

	public void setStoreManager(String storeManager) {
		this.storeManager = storeManager;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreRemark() {
		return this.storeRemark;
	}

	public void setStoreRemark(String storeRemark) {
		this.storeRemark = storeRemark;
	}

	public String getStoreStatus() {
		return this.storeStatus;
	}

	public void setStoreStatus(String storeStatus) {
		this.storeStatus = storeStatus;
	}

}