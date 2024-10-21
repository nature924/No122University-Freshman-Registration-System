package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaodaoliuchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaodaoliuchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaodaoliuchengView;


/**
 * 报道流程
 *
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
public interface BaodaoliuchengService extends IService<BaodaoliuchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaodaoliuchengVO> selectListVO(Wrapper<BaodaoliuchengEntity> wrapper);
   	
   	BaodaoliuchengVO selectVO(@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);
   	
   	List<BaodaoliuchengView> selectListView(Wrapper<BaodaoliuchengEntity> wrapper);
   	
   	BaodaoliuchengView selectView(@Param("ew") Wrapper<BaodaoliuchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaodaoliuchengEntity> wrapper);
   	

}

