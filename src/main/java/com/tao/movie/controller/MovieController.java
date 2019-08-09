package com.tao.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tao.movie.domain.Movie;
import com.tao.movie.service.MovieService;
import com.tao.movie.vo.MovieVO;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService service;
	
	@RequestMapping("list")
	public String list(Model model,MovieVO movieVO,@RequestParam(defaultValue = "1")int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Movie> list = service.selects(movieVO);
		PageInfo info = new PageInfo(list);
		int pages = info.getPages();
		model.addAttribute("pages",pages);
		model.addAttribute("info", info);
		model.addAttribute("list", list);
		return "list";
	}
}
