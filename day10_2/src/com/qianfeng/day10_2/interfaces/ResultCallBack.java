package com.qianfeng.day10_2.interfaces;

import java.util.List;

import com.qianfeng.day10_2.domain.News;
/**
 * 回调的接口
 * @author Administrator
 *
 */
public interface ResultCallBack {
	/**
	 * 回调方法
	 */
	void callBack(List<News> datas);
}
