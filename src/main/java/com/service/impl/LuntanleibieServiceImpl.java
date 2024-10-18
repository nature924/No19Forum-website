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


import com.dao.LuntanleibieDao;
import com.entity.LuntanleibieEntity;
import com.service.LuntanleibieService;
import com.entity.vo.LuntanleibieVO;
import com.entity.view.LuntanleibieView;

@Service("luntanleibieService")
public class LuntanleibieServiceImpl extends ServiceImpl<LuntanleibieDao, LuntanleibieEntity> implements LuntanleibieService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuntanleibieEntity> page = this.selectPage(
                new Query<LuntanleibieEntity>(params).getPage(),
                new EntityWrapper<LuntanleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuntanleibieEntity> wrapper) {
		  Page<LuntanleibieView> page =new Query<LuntanleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuntanleibieVO> selectListVO(Wrapper<LuntanleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuntanleibieVO selectVO(Wrapper<LuntanleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuntanleibieView> selectListView(Wrapper<LuntanleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuntanleibieView selectView(Wrapper<LuntanleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
