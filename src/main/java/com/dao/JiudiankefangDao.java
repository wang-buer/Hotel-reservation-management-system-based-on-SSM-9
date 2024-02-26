package com.dao;

import com.entity.JiudiankefangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiudiankefangVO;
import com.entity.view.JiudiankefangView;


/**
 * 酒店客房
 * 
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
public interface JiudiankefangDao extends BaseMapper<JiudiankefangEntity> {
	
	List<JiudiankefangVO> selectListVO(@Param("ew") Wrapper<JiudiankefangEntity> wrapper);
	
	JiudiankefangVO selectVO(@Param("ew") Wrapper<JiudiankefangEntity> wrapper);
	
	List<JiudiankefangView> selectListView(@Param("ew") Wrapper<JiudiankefangEntity> wrapper);

	List<JiudiankefangView> selectListView(Pagination page,@Param("ew") Wrapper<JiudiankefangEntity> wrapper);
	
	JiudiankefangView selectView(@Param("ew") Wrapper<JiudiankefangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiudiankefangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiudiankefangEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiudiankefangEntity> wrapper);
}
