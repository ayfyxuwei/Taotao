/**   
* @Title: TbItemService.java 
* @Package com.cn.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月24日 上午10:10:10 
* @version V1.0   
*/
package com.cn.service;

import java.util.List;

import com.cn.pojo.TbItem;

/** 
* @ClassName: TbItemService 
* @Description: 商品接口 
* @author (作者) 徐伟 
* @date 2017年6月24日 上午10:10:10 
* @version V1.0 
*/
public interface TbItemService {
	
	//id查询商品信息
	TbItem getTbItemById(long id);
	//查询全部商品信息
	List<TbItem> getAll();
}
