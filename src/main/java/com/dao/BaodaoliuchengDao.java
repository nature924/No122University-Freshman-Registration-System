package com.dao;

import com.entity.BaodaoliuchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaodaoliuchengVO;
import com.entity.view.BaodaoliuchengView;


/**
 * 报道流程
 * 
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
public interface BaodaoliuchengDao extends BaseMapper<BaodaoliuchengEntity> {
	
	List<BaodaoliuchengVO> selectListVO(@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);
	
	BaodaoliuchengVO selectVO(@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);
	
	List<BaodaoliuchengView> selectListView(@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);

	List<BaodaoliuchengView> selectListView(Pagination page,@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);
	
	BaodaoliuchengView selectView(@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);
	

}
