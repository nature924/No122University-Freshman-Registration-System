package com.dao;

import com.entity.SushexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushexinxiVO;
import com.entity.view.SushexinxiView;


/**
 * 宿舍信息
 * 
 * @author 
 * @email 
 * @date 2023-02-11 22:44:50
 */
public interface SushexinxiDao extends BaseMapper<SushexinxiEntity> {
	
	List<SushexinxiVO> selectListVO(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	SushexinxiVO selectVO(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	List<SushexinxiView> selectListView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);

	List<SushexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	SushexinxiView selectView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	

}
