package xyz.renhono.beam;

import java.util.ArrayList;
import java.util.List;

public class Paramz {
	private String feeds;

	private int PageIndex;

	private int PageSize;

	private int TotalCount;

	private int TotalPage;
	
	@Override
	public String toString() {
		return "Paramz [feeds=" + feeds + ", PageIndex=" + PageIndex + ", PageSize=" + PageSize + ", TotalCount="
				+ TotalCount + ", TotalPage=" + TotalPage + "]";
	}

	public void setFeeds(String feeds) {
		this.feeds = feeds;
	}

	public String getFeeds() {
		return this.feeds;
	}

	public void setPageIndex(int PageIndex) {
		this.PageIndex = PageIndex;
	}

	public int getPageIndex() {
		return this.PageIndex;
	}

	public void setPageSize(int PageSize) {
		this.PageSize = PageSize;
	}

	public int getPageSize() {
		return this.PageSize;
	}

	public void setTotalCount(int TotalCount) {
		this.TotalCount = TotalCount;
	}

	public int getTotalCount() {
		return this.TotalCount;
	}

	public void setTotalPage(int TotalPage) {
		this.TotalPage = TotalPage;
	}

	public int getTotalPage() {
		return this.TotalPage;
	}

	public void setFeeds(Feeds feeds2) {
		// TODO Auto-generated method stub
		
	}
}