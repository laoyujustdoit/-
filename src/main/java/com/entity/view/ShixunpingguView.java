package com.entity.view;

import com.entity.ShixunpingguEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实训评估
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
@TableName("shixunpinggu")
public class ShixunpingguView  extends ShixunpingguEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShixunpingguView(){
	}
 
 	public ShixunpingguView(ShixunpingguEntity shixunpingguEntity){
 	try {
			BeanUtils.copyProperties(this, shixunpingguEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
