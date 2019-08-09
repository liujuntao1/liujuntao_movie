package com.tao.movie.service;

import java.util.List;

import com.tao.movie.domain.Movie;
import com.tao.movie.vo.MovieVO;

public interface MovieService {
	List<Movie> selects(MovieVO movieVO);
}
