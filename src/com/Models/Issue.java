package com.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Issue {
	@Id
	int id;

	@Temporal(TemporalType.DATE)
	Date openedDate;

	@Temporal(TemporalType.DATE)
	Date closedDate;

	String bugId;

	@Lob // choose Clob for charactey large object, or Blob for Byte Large
			// Object
	String descr;

	String status;

	public Issue() {

	}

	public Issue(int id, String bugId, String descr, String status, Date openedDate) {
		this.id = id;
		this.openedDate = openedDate;
		this.closedDate = openedDate;
		this.bugId = bugId;
		this.descr = descr;
		this.status = status;
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
