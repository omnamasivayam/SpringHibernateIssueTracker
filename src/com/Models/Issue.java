package com.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Issue {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;

	@Temporal(TemporalType.DATE)
	Date openedDate;

	@Temporal(TemporalType.DATE)
	Date closedDate;

	String bugId;
	@Column(columnDefinition="clob")
	@Lob // choose Clob for charactey large object, or Blob for Byte Large
			// Object
	String descr;
	@Column(columnDefinition="clob")
	@Lob
	String remarks;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	String status;

	public Issue() {

	}

	public Issue(String bugId, String descr, String status, String remarks, Date openedDate, Date closedDate) {
		this.openedDate = openedDate;
		if(closedDate != null){
			this.closedDate = openedDate;
		}else{
			this.closedDate = openedDate;
		}
		this.bugId = bugId;
		this.descr = descr;
		this.status = status;
		this.remarks = remarks;
	}

	public Date getOpenedDate() {
		return openedDate;
	}

	public void setOpenedDate(Date openedDate) {
		this.openedDate = openedDate;
	}

	public Date getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(Date closedDate) {
		this.closedDate = closedDate;
	}

	public String getBugId() {
		return bugId;
	}

	public void setBugId(String bugId) {
		this.bugId = bugId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId() {
		return bugId;
	}

	public void setId(String id) {
		this.bugId = id;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
