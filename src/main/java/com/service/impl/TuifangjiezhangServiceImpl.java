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


import com.dao.TuifangjiezhangDao;
import com.entity.TuifangjiezhangEntity;
import com.service.TuifangjiezhangService;
import com.entity.vo.TuifangjiezhangVO;
import com.entity.view.TuifangjiezhangView;

@Service("tuifangjiezhangService")
public class TuifangjiezhangServiceImpl extends ServiceImpl<TuifangjiezhangDao, TuifangjiezhangEntity> implements TuifangjiezhangService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuifangjiezhangEntity> page = this.selectPage(
                new Query<TuifangjiezhangEntity>(params).getPage(),
                new EntityWrapper<TuifangjiezhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuifangjiezhangEntity> wrapper) {
		  Page<TuifangjiezhangView> page =new Query<TuifangjiezhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuifangjiezhangVO> selectListVO(Wrapper<TuifangjiezhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuifangjiezhangVO selectVO(Wrapper<TuifangjiezhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuifangjiezhangView> selectListView(Wrapper<TuifangjiezhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuifangjiezhangView selectView(Wrapper<TuifangjiezhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
