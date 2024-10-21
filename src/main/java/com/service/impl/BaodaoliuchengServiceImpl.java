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


import com.dao.BaodaoliuchengDao;
import com.entity.BaodaoliuchengEntity;
import com.service.BaodaoliuchengService;
import com.entity.vo.BaodaoliuchengVO;
import com.entity.view.BaodaoliuchengView;

@Service("baodaoliuchengService")
public class BaodaoliuchengServiceImpl extends ServiceImpl<BaodaoliuchengDao, BaodaoliuchengEntity> implements BaodaoliuchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaodaoliuchengEntity> page = this.selectPage(
                new Query<BaodaoliuchengEntity>(params).getPage(),
                new EntityWrapper<BaodaoliuchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaodaoliuchengEntity> wrapper) {
		  Page<BaodaoliuchengView> page =new Query<BaodaoliuchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaodaoliuchengVO> selectListVO(Wrapper<BaodaoliuchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaodaoliuchengVO selectVO(Wrapper<BaodaoliuchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaodaoliuchengView> selectListView(Wrapper<BaodaoliuchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaodaoliuchengView selectView(Wrapper<BaodaoliuchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
