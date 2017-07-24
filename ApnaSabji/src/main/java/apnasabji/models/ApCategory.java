package apnasabji.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ap_category database table.
 * 
 */
@Entity
@Table(name="ap_category")
@NamedQuery(name="ApCategory.findAll", query="SELECT a FROM ApCategory a")
public class ApCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cat_id")
	private int catId;

	@Column(name="cat_name")
	private String catName;

	@Column(name="cat_super")
	private int catSuper;

	public ApCategory() {
	}

	public int getCatId() {
		return this.catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatSuper() {
		return this.catSuper;
	}

	public void setCatSuper(int catSuper) {
		this.catSuper = catSuper;
	}

}