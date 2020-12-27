package com.kosmo.veve.model;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kosmo.veve.model.service.GallaryCommentService;

@Repository
public class GallaryCommentDAO implements GallaryCommentService{

	@Resource(name ="template")
	private SqlSessionTemplate sqlMapper;
	
	@Override
	public List<Map> selectList(Map map) {
		return sqlMapper.selectList("galcommnetSelectList", map);
	}

	@Override
	public int insert(Map map) {
		return sqlMapper.insert("galcommentInsert", map);
	}

	@Override
	public int delete(Map map) {
		return sqlMapper.delete("galcommentDelete", map);
	}

	@Override
	public int update(Map map) {
		return sqlMapper.update("galcommentUpdate", map);
	}

}
