package com.entity.view;

import com.entity.TuifangjiezhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 退房结账
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
@TableName("tuifangjiezhang")
public class TuifangjiezhangView  extends TuifangjiezhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuifangjiezhangView(){
	}
 
 	public TuifangjiezhangView(TuifangjiezhangEntity tuifangjiezhangEntity){
 	try {
			BeanUtils.copyProperties(this, tuifangjiezhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
