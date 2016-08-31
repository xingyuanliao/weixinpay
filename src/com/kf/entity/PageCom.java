package com.kf.entity;

import java.util.List;

import com.kf.entity.vo.MemberVo;


public class PageCom {
	private Integer count;
	private Integer per_page;
	private Integer total;
	private Integer page;
	
	private List<MemberVo> items;

	public List<MemberVo> getItems() {
		return items;
	}

	public void setItems(List<MemberVo> items) {
		this.items = items;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPer_page() {
		return per_page;
	}

	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
	
	
}
