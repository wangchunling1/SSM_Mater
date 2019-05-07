package com.oracle.web.bean;

public class SubMonster extends Monster {

	//拓展自己的属性
	public School school;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "SubMonster [school=" + school + "]";
	}
	
	
}
