package com.dao;

import com.entity.TuifangjiezhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuifangjiezhangVO;
import com.entity.view.TuifangjiezhangView;


/**
 * 退房结账
 * 
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
public interface TuifangjiezhangDao extends BaseMapper<TuifangjiezhangEntity> {
	
	List<TuifangjiezhangVO> selectListVO(@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);
	
	TuifangjiezhangVO selectVO(@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);
	
	List<TuifangjiezhangView> selectListView(@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);

	List<TuifangjiezhangView> selectListView(Pagination page,@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);
	
	TuifangjiezhangView selectView(@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);
	

}
