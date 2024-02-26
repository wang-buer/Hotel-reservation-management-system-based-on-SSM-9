package com.entity.vo;

import com.entity.JiudiankefangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 酒店客房
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
public class JiudiankefangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 客房名称
	 */
	
	private String kefangmingcheng;
		
	/**
	 * 客房设施
	 */
	
	private String kefangsheshi;
		
	/**
	 * 客房价格
	 */
	
	private Integer kefangjiage;
		
	/**
	 * 定金
	 */
	
	private Float dingjin;
		
	/**
	 * 客房介绍
	 */
	
	private String kefangjieshao;
		
	/**
	 * 客房图片
	 */
	
	private String kefangtupian;
		
	/**
	 * 客房状态
	 */
	
	private String kefangzhuangtai;
				
	
	/**
	 * 设置：客房类型
	 */
	 
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
				
	
	/**
	 * 设置：客房名称
	 */
	 
	public void setKefangmingcheng(String kefangmingcheng) {
		this.kefangmingcheng = kefangmingcheng;
	}
	
	/**
	 * 获取：客房名称
	 */
	public String getKefangmingcheng() {
		return kefangmingcheng;
	}
				
	
	/**
	 * 设置：客房设施
	 */
	 
	public void setKefangsheshi(String kefangsheshi) {
		this.kefangsheshi = kefangsheshi;
	}
	
	/**
	 * 获取：客房设施
	 */
	public String getKefangsheshi() {
		return kefangsheshi;
	}
				
	
	/**
	 * 设置：客房价格
	 */
	 
	public void setKefangjiage(Integer kefangjiage) {
		this.kefangjiage = kefangjiage;
	}
	
	/**
	 * 获取：客房价格
	 */
	public Integer getKefangjiage() {
		return kefangjiage;
	}
				
	
	/**
	 * 设置：定金
	 */
	 
	public void setDingjin(Float dingjin) {
		this.dingjin = dingjin;
	}
	
	/**
	 * 获取：定金
	 */
	public Float getDingjin() {
		return dingjin;
	}
				
	
	/**
	 * 设置：客房介绍
	 */
	 
	public void setKefangjieshao(String kefangjieshao) {
		this.kefangjieshao = kefangjieshao;
	}
	
	/**
	 * 获取：客房介绍
	 */
	public String getKefangjieshao() {
		return kefangjieshao;
	}
				
	
	/**
	 * 设置：客房图片
	 */
	 
	public void setKefangtupian(String kefangtupian) {
		this.kefangtupian = kefangtupian;
	}
	
	/**
	 * 获取：客房图片
	 */
	public String getKefangtupian() {
		return kefangtupian;
	}
				
	
	/**
	 * 设置：客房状态
	 */
	 
	public void setKefangzhuangtai(String kefangzhuangtai) {
		this.kefangzhuangtai = kefangzhuangtai;
	}
	
	/**
	 * 获取：客房状态
	 */
	public String getKefangzhuangtai() {
		return kefangzhuangtai;
	}
			
}
