package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaoliuluntanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaoliuluntanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaoliuluntanView;


/**
 * 交流论坛评论表
 *
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
public interface DiscussjiaoliuluntanService extends IService<DiscussjiaoliuluntanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaoliuluntanVO> selectListVO(Wrapper<DiscussjiaoliuluntanEntity> wrapper);
   	
   	DiscussjiaoliuluntanVO selectVO(@Param("ew") Wrapper<DiscussjiaoliuluntanEntity> wrapper);
   	
   	List<DiscussjiaoliuluntanView> selectListView(Wrapper<DiscussjiaoliuluntanEntity> wrapper);
   	
   	DiscussjiaoliuluntanView selectView(@Param("ew") Wrapper<DiscussjiaoliuluntanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaoliuluntanEntity> wrapper);
   	
}

