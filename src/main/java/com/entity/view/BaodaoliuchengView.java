package com.entity.view;

import com.entity.BaodaoliuchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报道流程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
@TableName("baodaoliucheng")
public class BaodaoliuchengView  extends BaodaoliuchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaodaoliuchengView(){
	}
 
 	public BaodaoliuchengView(BaodaoliuchengEntity baodaoliuchengEntity){
 	try {
			BeanUtils.copyProperties(this, baodaoliuchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
