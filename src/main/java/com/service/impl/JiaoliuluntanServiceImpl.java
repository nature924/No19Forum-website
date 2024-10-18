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


import com.dao.JiaoliuluntanDao;
import com.entity.JiaoliuluntanEntity;
import com.service.JiaoliuluntanService;
import com.entity.vo.JiaoliuluntanVO;
import com.entity.view.JiaoliuluntanView;

@Service("jiaoliuluntanService")
public class JiaoliuluntanServiceImpl extends ServiceImpl<JiaoliuluntanDao, JiaoliuluntanEntity> implements JiaoliuluntanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoliuluntanEntity> page = this.selectPage(
                new Query<JiaoliuluntanEntity>(params).getPage(),
                new EntityWrapper<JiaoliuluntanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoliuluntanEntity> wrapper) {
		  Page<JiaoliuluntanView> page =new Query<JiaoliuluntanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoliuluntanVO> selectListVO(Wrapper<JiaoliuluntanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoliuluntanVO selectVO(Wrapper<JiaoliuluntanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoliuluntanView> selectListView(Wrapper<JiaoliuluntanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoliuluntanView selectView(Wrapper<JiaoliuluntanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
