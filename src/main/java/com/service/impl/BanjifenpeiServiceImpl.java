package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BanjifenpeiDao;
import com.entity.BanjifenpeiEntity;
import com.service.BanjifenpeiService;
import com.entity.vo.BanjifenpeiVO;
import com.entity.view.BanjifenpeiView;

@Service("banjifenpeiService")
public class BanjifenpeiServiceImpl extends ServiceImpl<BanjifenpeiDao, BanjifenpeiEntity> implements BanjifenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanjifenpeiEntity> page = this.selectPage(
                new Query<BanjifenpeiEntity>(params).getPage(),
                new EntityWrapper<BanjifenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanjifenpeiEntity> wrapper) {
		  Page<BanjifenpeiView> page =new Query<BanjifenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanjifenpeiVO> selectListVO(Wrapper<BanjifenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanjifenpeiVO selectVO(Wrapper<BanjifenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanjifenpeiView> selectListView(Wrapper<BanjifenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanjifenpeiView selectView(Wrapper<BanjifenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
