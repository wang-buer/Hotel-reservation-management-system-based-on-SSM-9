package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaifangjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaifangjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaifangjiluView;


/**
 * 开房记录
 *
 * @author 
 * @email 
 * @date 2022-04-25 14:54:56
 */
public interface KaifangjiluService extends IService<KaifangjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaifangjiluVO> selectListVO(Wrapper<KaifangjiluEntity> wrapper);
   	
   	KaifangjiluVO selectVO(@Param("ew") Wrapper<KaifangjiluEntity> wrapper);
   	
   	List<KaifangjiluView> selectListView(Wrapper<KaifangjiluEntity> wrapper);
   	
   	KaifangjiluView selectView(@Param("ew") Wrapper<KaifangjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaifangjiluEntity> wrapper);
   	

}

