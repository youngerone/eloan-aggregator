package com.younger.eloan.basice.query;

//所有高级查询对象的共同代码封装
public class QueryObject {
	private Integer currentPage = 1;
	private Integer pageSize = 5;

	public int getStart() {
		return (currentPage - 1) * pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
