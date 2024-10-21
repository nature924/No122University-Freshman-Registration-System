package com.entity.view;

import com.entity.BanjifenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 班级分配
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
@TableName("banjifenpei")
public class BanjifenpeiView  extends BanjifenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BanjifenpeiView(){
	}
 
 	public BanjifenpeiView(BanjifenpeiEntity banjifenpeiEntity){
 	try {
			BeanUtils.copyProperties(this, banjifenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
