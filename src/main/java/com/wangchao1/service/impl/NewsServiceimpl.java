package com.wangchao1.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.ws.soap.Addressing;

import com.wangchao1.domain.News;
import com.wangchao1.mapper.NewsMapper;
import com.wangchao1.service.NewsService;

public class NewsServiceimpl implements NewsService{
	
	@Resource
	private NewsMapper newsMapper;

	@Override
	
	public List<News> gets() {
		
		return newsMapper.finds();
	}

}
