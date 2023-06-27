package com.dao;

import com.entity.ShixunxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixunxiangmuVO;
import com.entity.view.ShixunxiangmuView;


/**
 * 实训项目
 * 
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public interface ShixunxiangmuDao extends BaseMapper<ShixunxiangmuEntity> {
	
	List<ShixunxiangmuVO> selectListVO(@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);
	
	ShixunxiangmuVO selectVO(@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);
	
	List<ShixunxiangmuView> selectListView(@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);

	List<ShixunxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);
	
	ShixunxiangmuView selectView(@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);
	
}
