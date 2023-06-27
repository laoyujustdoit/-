package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixunbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixunbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixunbaogaoView;


/**
 * 实训报告
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public interface ShixunbaogaoService extends IService<ShixunbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixunbaogaoVO> selectListVO(Wrapper<ShixunbaogaoEntity> wrapper);
   	
   	ShixunbaogaoVO selectVO(@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);
   	
   	List<ShixunbaogaoView> selectListView(Wrapper<ShixunbaogaoEntity> wrapper);
   	
   	ShixunbaogaoView selectView(@Param("ew") Wrapper<ShixunbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixunbaogaoEntity> wrapper);
   	
}

