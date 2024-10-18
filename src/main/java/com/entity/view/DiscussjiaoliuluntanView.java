package com.entity.view;

import com.entity.DiscussjiaoliuluntanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交流论坛评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
@TableName("discussjiaoliuluntan")
public class DiscussjiaoliuluntanView  extends DiscussjiaoliuluntanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiaoliuluntanView(){
	}
 
 	public DiscussjiaoliuluntanView(DiscussjiaoliuluntanEntity discussjiaoliuluntanEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiaoliuluntanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
