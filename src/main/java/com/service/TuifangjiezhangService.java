package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuifangjiezhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuifangjiezhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuifangjiezhangView;


/**
 * 退房结账
 *
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
public interface TuifangjiezhangService extends IService<TuifangjiezhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuifangjiezhangVO> selectListVO(Wrapper<TuifangjiezhangEntity> wrapper);
   	
   	TuifangjiezhangVO selectVO(@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);
   	
   	List<TuifangjiezhangView> selectListView(Wrapper<TuifangjiezhangEntity> wrapper);
   	
   	TuifangjiezhangView selectView(@Param("ew") Wrapper<TuifangjiezhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuifangjiezhangEntity> wrapper);
   	

}

