package com.dao;

import com.entity.BanjifenpeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanjifenpeiVO;
import com.entity.view.BanjifenpeiView;


/**
 * 班级分配
 * 
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
public interface BanjifenpeiDao extends BaseMapper<BanjifenpeiEntity> {
	
	List<BanjifenpeiVO> selectListVO(@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);
	
	BanjifenpeiVO selectVO(@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);
	
	List<BanjifenpeiView> selectListView(@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);

	List<BanjifenpeiView> selectListView(Pagination page,@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);
	
	BanjifenpeiView selectView(@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);
	

}
