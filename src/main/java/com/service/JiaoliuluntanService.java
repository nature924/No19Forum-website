package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoliuluntanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoliuluntanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoliuluntanView;


/**
 * 交流论坛
 *
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
public interface JiaoliuluntanService extends IService<JiaoliuluntanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoliuluntanVO> selectListVO(Wrapper<JiaoliuluntanEntity> wrapper);
   	
   	JiaoliuluntanVO selectVO(@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);
   	
   	List<JiaoliuluntanView> selectListView(Wrapper<JiaoliuluntanEntity> wrapper);
   	
   	JiaoliuluntanView selectView(@Param("ew") Wrapper<JiaoliuluntanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoliuluntanEntity> wrapper);
   	
}

