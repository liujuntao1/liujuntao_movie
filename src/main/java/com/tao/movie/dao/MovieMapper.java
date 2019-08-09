package com.tao.movie.dao;

import java.util.List;

import com.tao.movie.domain.Movie;
import com.tao.movie.vo.MovieVO;

public interface MovieMapper {
	List<Movie> selects(MovieVO movieVO);
}
