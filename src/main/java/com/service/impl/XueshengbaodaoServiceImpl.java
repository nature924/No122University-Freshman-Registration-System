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


import com.dao.XueshengbaodaoDao;
import com.entity.XueshengbaodaoEntity;
import com.service.XueshengbaodaoService;
import com.entity.vo.XueshengbaodaoVO;
import com.entity.view.XueshengbaodaoView;

@Service("xueshengbaodaoService")
public class XueshengbaodaoServiceImpl extends ServiceImpl<XueshengbaodaoDao, XueshengbaodaoEntity> implements XueshengbaodaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengbaodaoEntity> page = this.selectPage(
                new Query<XueshengbaodaoEntity>(params).getPage(),
                new EntityWrapper<XueshengbaodaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengbaodaoEntity> wrapper) {
		  Page<XueshengbaodaoView> page =new Query<XueshengbaodaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengbaodaoVO> selectListVO(Wrapper<XueshengbaodaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengbaodaoVO selectVO(Wrapper<XueshengbaodaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengbaodaoView> selectListView(Wrapper<XueshengbaodaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengbaodaoView selectView(Wrapper<XueshengbaodaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
