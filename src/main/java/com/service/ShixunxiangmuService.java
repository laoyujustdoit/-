package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixunxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixunxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixunxiangmuView;


/**
 * 实训项目
 *
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public interface ShixunxiangmuService extends IService<ShixunxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixunxiangmuVO> selectListVO(Wrapper<ShixunxiangmuEntity> wrapper);
   	
   	ShixunxiangmuVO selectVO(@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);
   	
   	List<ShixunxiangmuView> selectListView(Wrapper<ShixunxiangmuEntity> wrapper);
   	
   	ShixunxiangmuView selectView(@Param("ew") Wrapper<ShixunxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixunxiangmuEntity> wrapper);
   	
}

