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


import com.dao.KaifangjiluDao;
import com.entity.KaifangjiluEntity;
import com.service.KaifangjiluService;
import com.entity.vo.KaifangjiluVO;
import com.entity.view.KaifangjiluView;

@Service("kaifangjiluService")
public class KaifangjiluServiceImpl extends ServiceImpl<KaifangjiluDao, KaifangjiluEntity> implements KaifangjiluService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaifangjiluEntity> page = this.selectPage(
                new Query<KaifangjiluEntity>(params).getPage(),
                new EntityWrapper<KaifangjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaifangjiluEntity> wrapper) {
		  Page<KaifangjiluView> page =new Query<KaifangjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaifangjiluVO> selectListVO(Wrapper<KaifangjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaifangjiluVO selectVO(Wrapper<KaifangjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaifangjiluView> selectListView(Wrapper<KaifangjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaifangjiluView selectView(Wrapper<KaifangjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
