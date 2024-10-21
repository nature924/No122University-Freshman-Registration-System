package com.entity.view;

import com.entity.XueshengbaodaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生报到
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
@TableName("xueshengbaodao")
public class XueshengbaodaoView  extends XueshengbaodaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengbaodaoView(){
	}
 
 	public XueshengbaodaoView(XueshengbaodaoEntity xueshengbaodaoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengbaodaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
