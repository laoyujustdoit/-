package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShixunxiangmuEntity;
import com.entity.view.ShixunxiangmuView;

import com.service.ShixunxiangmuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 实训项目
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
@RestController
@RequestMapping("/shixunxiangmu")
public class ShixunxiangmuController {
    @Autowired
    private ShixunxiangmuService shixunxiangmuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShixunxiangmuEntity shixunxiangmu, HttpServletRequest request){

        EntityWrapper<ShixunxiangmuEntity> ew = new EntityWrapper<ShixunxiangmuEntity>();
		PageUtils page = shixunxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixunxiangmu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShixunxiangmuEntity shixunxiangmu, HttpServletRequest request){
        EntityWrapper<ShixunxiangmuEntity> ew = new EntityWrapper<ShixunxiangmuEntity>();
		PageUtils page = shixunxiangmuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shixunxiangmu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShixunxiangmuEntity shixunxiangmu){
       	EntityWrapper<ShixunxiangmuEntity> ew = new EntityWrapper<ShixunxiangmuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shixunxiangmu, "shixunxiangmu")); 
        return R.ok().put("data", shixunxiangmuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShixunxiangmuEntity shixunxiangmu){
        EntityWrapper< ShixunxiangmuEntity> ew = new EntityWrapper< ShixunxiangmuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shixunxiangmu, "shixunxiangmu")); 
		ShixunxiangmuView shixunxiangmuView =  shixunxiangmuService.selectView(ew);
		return R.ok("查询实训项目成功").put("data", shixunxiangmuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShixunxiangmuEntity shixunxiangmu = shixunxiangmuService.selectById(id);
        return R.ok().put("data", shixunxiangmu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShixunxiangmuEntity shixunxiangmu = shixunxiangmuService.selectById(id);
        return R.ok().put("data", shixunxiangmu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShixunxiangmuEntity shixunxiangmu, HttpServletRequest request){
    	shixunxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixunxiangmu);

        shixunxiangmuService.insert(shixunxiangmu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShixunxiangmuEntity shixunxiangmu, HttpServletRequest request){
    	shixunxiangmu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shixunxiangmu);

        shixunxiangmuService.insert(shixunxiangmu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShixunxiangmuEntity shixunxiangmu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shixunxiangmu);
        shixunxiangmuService.updateById(shixunxiangmu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shixunxiangmuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShixunxiangmuEntity> wrapper = new EntityWrapper<ShixunxiangmuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = shixunxiangmuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
