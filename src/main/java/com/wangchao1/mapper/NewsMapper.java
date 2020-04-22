package com.wangchao1.mapper;

import java.util.List;

import com.wangchao1.domain.News;

public interface NewsMapper {
	
	/**
	 * 查找所有数据
	 * @return
	 */
	public List<News> finds();
	

}
