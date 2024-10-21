package com.dao;

import com.entity.XueshengbaodaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengbaodaoVO;
import com.entity.view.XueshengbaodaoView;


/**
 * 学生报到
 * 
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
public interface XueshengbaodaoDao extends BaseMapper<XueshengbaodaoEntity> {
	
	List<XueshengbaodaoVO> selectListVO(@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);
	
	XueshengbaodaoVO selectVO(@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);
	
	List<XueshengbaodaoView> selectListView(@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);

	List<XueshengbaodaoView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);
	
	XueshengbaodaoView selectView(@Param("ew") Wrapper<XueshengbaodaoEntity> wrapper);
	

}
