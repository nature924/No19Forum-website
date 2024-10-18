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


import com.dao.DiscussjiaoliuluntanDao;
import com.entity.DiscussjiaoliuluntanEntity;
import com.service.DiscussjiaoliuluntanService;
import com.entity.vo.DiscussjiaoliuluntanVO;
import com.entity.view.DiscussjiaoliuluntanView;

@Service("discussjiaoliuluntanService")
public class DiscussjiaoliuluntanServiceImpl extends ServiceImpl<DiscussjiaoliuluntanDao, DiscussjiaoliuluntanEntity> implements DiscussjiaoliuluntanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaoliuluntanEntity> page = this.selectPage(
                new Query<DiscussjiaoliuluntanEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaoliuluntanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaoliuluntanEntity> wrapper) {
		  Page<DiscussjiaoliuluntanView> page =new Query<DiscussjiaoliuluntanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaoliuluntanVO> selectListVO(Wrapper<DiscussjiaoliuluntanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaoliuluntanVO selectVO(Wrapper<DiscussjiaoliuluntanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaoliuluntanView> selectListView(Wrapper<DiscussjiaoliuluntanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaoliuluntanView selectView(Wrapper<DiscussjiaoliuluntanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
