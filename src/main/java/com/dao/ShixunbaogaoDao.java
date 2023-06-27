package com.dao;

import com.entity.ShixunbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixunbaogaoVO;
import com.entity.view.ShixunbaogaoView;


/**
 * 实训报告
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public interface ShixunbaogaoDao extends BaseMapper<ShixunbaogaoEntity> {
	
	List<ShixunbaogaoVO> selectListVO(@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);
	
	ShixunbaogaoVO selectVO(@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);
	
	List<ShixunbaogaoView> selectListView(@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);

	List<ShixunbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);
	
	ShixunbaogaoView selectView(@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);
	
}
