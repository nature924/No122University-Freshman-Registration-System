package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanjifenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanjifenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanjifenpeiView;


/**
 * 班级分配
 *
 * @author 
 * @email 
 * @date 2023-02-11 22:44:49
 */
public interface BanjifenpeiService extends IService<BanjifenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanjifenpeiVO> selectListVO(Wrapper<BanjifenpeiEntity> wrapper);
   	
   	BanjifenpeiVO selectVO(@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);
   	
   	List<BanjifenpeiView> selectListView(Wrapper<BanjifenpeiEntity> wrapper);
   	
   	BanjifenpeiView selectView(@Param("ew") Wrapper<BanjifenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanjifenpeiEntity> wrapper);
   	

}

