package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShixunpingguDao;
import com.entity.ShixunpingguEntity;
import com.service.ShixunpingguService;
import com.entity.vo.ShixunpingguVO;
import com.entity.view.ShixunpingguView;

@Service("shixunpingguService")
public class ShixunpingguServiceImpl extends ServiceImpl<ShixunpingguDao, ShixunpingguEntity> implements ShixunpingguService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixunpingguEntity> page = this.selectPage(
                new Query<ShixunpingguEntity>(params).getPage(),
                new EntityWrapper<ShixunpingguEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixunpingguEntity> wrapper) {
		  Page<ShixunpingguView> page =new Query<ShixunpingguView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixunpingguVO> selectListVO(Wrapper<ShixunpingguEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixunpingguVO selectVO(Wrapper<ShixunpingguEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixunpingguView> selectListView(Wrapper<ShixunpingguEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixunpingguView selectView(Wrapper<ShixunpingguEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
