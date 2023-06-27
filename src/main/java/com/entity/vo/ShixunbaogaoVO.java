package com.entity.vo;

import com.entity.ShixunbaogaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 实训报告
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 15:40:37
 */
public class ShixunbaogaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 文件
	 */
	
	private String wenjian;
		
	/**
	 * 训练态度
	 */
	
	private String xunliantaidu;
		
	/**
	 * 满意程度
	 */
	
	private String manyichengdu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：文件
	 */
	 
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
				
	
	/**
	 * 设置：训练态度
	 */
	 
	public void setXunliantaidu(String xunliantaidu) {
		this.xunliantaidu = xunliantaidu;
	}
	
	/**
	 * 获取：训练态度
	 */
	public String getXunliantaidu() {
		return xunliantaidu;
	}
				
	
	/**
	 * 设置：满意程度
	 */
	 
	public void setManyichengdu(String manyichengdu) {
		this.manyichengdu = manyichengdu;
	}
	
	/**
	 * 获取：满意程度
	 */
	public String getManyichengdu() {
		return manyichengdu;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
