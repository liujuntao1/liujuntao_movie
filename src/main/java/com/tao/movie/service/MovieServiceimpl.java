package com.tao.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tao.movie.dao.MovieMapper;
import com.tao.movie.domain.Movie;
import com.tao.movie.vo.MovieVO;
@Service
public class MovieServiceimpl implements MovieService {
	
	@Autowired
	private MovieMapper mapper;
	@Override
	public List<Movie> selects(MovieVO movieVO) {
		// TODO Auto-generated method stub
		return mapper.selects(movieVO);
	}

}
