package com.wangchao1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.tools.internal.xjc.model.Model;
import com.wangchao1.domain.News;
import com.wangchao1.service.NewsService;
@Controller
public class NewsController {
	
	
	@Resource
	private NewsService newsService;
	
	@RequestMapping({"/", "/index"})
	public String home(){
		return "home";
	}
	
	@RequestMapping({"/news"})
	public String news(Model model){
		List<News> newses = newsService.gets();
		//model.addAttribute("newses", newses);
		return "list";
	}

}
