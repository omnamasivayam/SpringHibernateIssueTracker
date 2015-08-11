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
	String description;

	String status;

	Issue() {

	}

	public Issue(int id, String bugId, String desc, String status, Date startDate) {
		this.id = id;
		this.openedDate = startDate;
		this.closedDate = startDate;
		this.bugId = bugId;
		this.description = desc;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
