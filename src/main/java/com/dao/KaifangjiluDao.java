package com.dao;

import com.entity.KaifangjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaifangjiluVO;
import com.entity.view.KaifangjiluView;


/**
 * 开房记录
 * 
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
public interface KaifangjiluDao extends BaseMapper<KaifangjiluEntity> {
	
	List<KaifangjiluVO> selectListVO(@Param("ew") Wrapper<KaifangjiluEntity> wrapper);
	
	KaifangjiluVO selectVO(@Param("ew") Wrapper<KaifangjiluEntity> wrapper);
	
	List<KaifangjiluView> selectListView(@Param("ew") Wrapper<KaifangjiluEntity> wrapper);

	List<KaifangjiluView> selectListView(Pagination page,@Param("ew") Wrapper<KaifangjiluEntity> wrapper);
	
	KaifangjiluView selectView(@Param("ew") Wrapper<KaifangjiluEntity> wrapper);
	

}
