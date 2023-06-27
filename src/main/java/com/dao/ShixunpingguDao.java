package com.dao;

import com.entity.ShixunpingguEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixunpingguVO;
import com.entity.view.ShixunpingguView;


/**
 * 实训评估
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public interface ShixunpingguDao extends BaseMapper<ShixunpingguEntity> {
	
	List<ShixunpingguVO> selectListVO(@Param("ew") Wrapper<ShixunpingguEntity> wrapper);
	
	ShixunpingguVO selectVO(@Param("ew") Wrapper<ShixunpingguEntity> wrapper);
	
	List<ShixunpingguView> selectListView(@Param("ew") Wrapper<ShixunpingguEntity> wrapper);

	List<ShixunpingguView> selectListView(Pagination page,@Param("ew") Wrapper<ShixunpingguEntity> wrapper);
	
	ShixunpingguView selectView(@Param("ew") Wrapper<ShixunpingguEntity> wrapper);
	
}
