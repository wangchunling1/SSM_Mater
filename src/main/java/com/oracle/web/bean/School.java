package com.oracle.web.bean;

public class School {

    private Integer schoolId;

    private String sname;

    private String address;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", sname=" + sname + ", address=" + address + "]";
	}
}