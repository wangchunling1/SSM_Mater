package com.oracle.web.bean;

import java.io.Serializable;
import java.util.List;

public class pageBean<T> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer pageNow;
	
	private int counts;
	
	private int pageSize;
	
	private List<T> beanList;

	public pageBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public int getPages() {
		
		int pages=this.counts/this.pageSize;
		return (this.counts%this.pageSize==0)?pages:pages+1;
	}


	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}

	@Override
	public String toString() {
		return "pageBeen [pageNow=" + pageNow + ", counts=" + counts + ", pageSize=" + pageSize
				+ ", beanList=" + beanList + "]";
	}

}
