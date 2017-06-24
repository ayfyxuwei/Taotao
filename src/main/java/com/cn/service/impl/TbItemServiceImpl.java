/**   
* @Title: TbItemServiceImpl.java 
* @Package com.cn.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月24日 上午10:26:35 
* @version V1.0   
*/
package com.cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.dao.TbItemMapper;
import com.cn.pojo.TbItem;
import com.cn.service.TbItemService;

/** 
* @ClassName: TbItemServiceImpl 
* @Description: 商品接口实现 
* @author (作者) 徐伟 
* @date 2017年6月24日 上午10:26:35 
* @version V1.0 
*/
@Service("TbItemService")
public class TbItemServiceImpl implements TbItemService{
	@Resource
	private TbItemMapper tbItemMapper;
	
	@Override
	public TbItem getTbItemById(long id) {
		
		return this.tbItemMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public List<TbItem> getAll() {
		
		return tbItemMapper.selectByExample(null);
	}

}
