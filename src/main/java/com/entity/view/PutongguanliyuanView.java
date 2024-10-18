package com.entity.view;

import com.entity.PutongguanliyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 普通管理员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
@TableName("putongguanliyuan")
public class PutongguanliyuanView  extends PutongguanliyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PutongguanliyuanView(){
	}
 
 	public PutongguanliyuanView(PutongguanliyuanEntity putongguanliyuanEntity){
 	try {
			BeanUtils.copyProperties(this, putongguanliyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
