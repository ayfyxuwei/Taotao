/**   
* @Title: TbItemController.java 
* @Package com.cn.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月24日 上午10:35:52 
* @version V1.0   
*/
package com.cn.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.pojo.TbItem;
import com.cn.service.TbItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/** 
* @ClassName: TbItemController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author (作者) 徐伟 
* @date 2017年6月24日 上午10:35:52 
* @version V1.0 
*/
@Controller
public class TbItemController {
	@Resource
	private TbItemService tbItemService;
	//id查询商品
	@ResponseBody
	@RequestMapping("/item/{id}")
	public TbItem getTbItemById(@PathVariable Long id){
		TbItem tbItem = tbItemService.getTbItemById(id);  
        return tbItem;
	}
	//全部查询商品
	@ResponseBody
	@RequestMapping("/item-list")
	public String getTbItems(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model){
		PageHelper.startPage(pn, 20);
		List<TbItem> tbItems = tbItemService.getAll();
		PageInfo page = new PageInfo(tbItems, 20);
		model.addAttribute("pageInfo", page);
		return "item-list";
	}
	
}
