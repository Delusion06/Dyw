package com.yc.biz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yc.bean.Film;
import com.yc.dao.FilmDao;

public class FilmBiz {

	FilmDao film=new FilmDao();

	public Map<String,Object>findByPage(Integer pageNum,Integer pageSize) throws Exception{
		List<Film> list=film.findByPage(pageNum, pageSize);
		int rows=film.totalRows();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("rows", rows);//О▄лл╩§
		map.put("films", list);//
		return map;

	}
}
