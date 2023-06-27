package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixunpingguEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixunpingguVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixunpingguView;


/**
 * 实训评估
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public interface ShixunpingguService extends IService<ShixunpingguEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixunpingguVO> selectListVO(Wrapper<ShixunpingguEntity> wrapper);
   	
   	ShixunpingguVO selectVO(@Param("ew") Wrapper<ShixunpingguEntity> wrapper);
   	
   	List<ShixunpingguView> selectListView(Wrapper<ShixunpingguEntity> wrapper);
   	
   	ShixunpingguView selectView(@Param("ew") Wrapper<ShixunpingguEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixunpingguEntity> wrapper);
   	
}

