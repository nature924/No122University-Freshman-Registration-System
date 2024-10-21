package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengbaodaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengbaodaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengbaodaoView;


/**
 * 学生报到
 *
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
public interface XueshengbaodaoService extends IService<XueshengbaodaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengbaodaoVO> selectListVO(Wrapper<XueshengbaodaoEntity> wrapper);
   	
   	XueshengbaodaoVO selectVO(@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);
   	
   	List<XueshengbaodaoView> selectListView(Wrapper<XueshengbaodaoEntity> wrapper);
   	
   	XueshengbaodaoView selectView(@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengbaodaoEntity> wrapper);
   	

}

