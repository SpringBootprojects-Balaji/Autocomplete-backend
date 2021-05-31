package com.web.search.model;



public class PageData {
	
	Integer id;
	String  pagename;
	String searchterm;
	
	
	
	public PageData(Integer id, String pagename, String searchterm) {
		super();
		this.id = id;
		this.pagename = pagename;
		this.searchterm = searchterm;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPagename() {
		return pagename;
	}
	public void setPagename(String pagename) {
		this.pagename = pagename;
	}
	public String getSearchterm() {
		return searchterm;
	}
	public void setSearchterm(String searchterm) {
		this.searchterm = searchterm;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pagename == null) ? 0 : pagename.hashCode());
		result = prime * result + ((searchterm == null) ? 0 : searchterm.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PageData other = (PageData) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pagename == null) {
			if (other.pagename != null)
				return false;
		} else if (!pagename.equals(other.pagename))
			return false;
		if (searchterm == null) {
			if (other.searchterm != null)
				return false;
		} else if (!searchterm.equals(other.searchterm))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "pageData [id=" + id + ", pagename=" + pagename + ", searchterm=" + searchterm + "]";
	}
	
	
	
	
	

}
