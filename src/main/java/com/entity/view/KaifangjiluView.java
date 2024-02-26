package com.entity.view;

import com.entity.KaifangjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 开房记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
@TableName("kaifangjilu")
public class KaifangjiluView  extends KaifangjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaifangjiluView(){
	}
 
 	public KaifangjiluView(KaifangjiluEntity kaifangjiluEntity){
 	try {
			BeanUtils.copyProperties(this, kaifangjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
