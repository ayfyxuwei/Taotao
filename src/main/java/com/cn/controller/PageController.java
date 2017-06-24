/**   
* @Title: PageController.java 
* @Package com.cn.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author （作者）徐伟  
* @date 2017年6月24日 上午10:00:54 
* @version V1.0   
*/
package com.cn.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
* @ClassName: PageController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author (作者) 徐伟 
* @date 2017年6月24日 上午10:00:54 
* @version V1.0 
*/
public class PageController {
	/** 
     * 打开首页 
     * @return 
     */  
    @RequestMapping("/")  
    public String showIndex() {  
        return "index";  
    }  
      
    /** 
     * 展示其他页面 
     * @param page 
     * @return 
     */  
    @RequestMapping("/{page}")  
    public String showPage(@PathVariable String page) {  
        return page;  
    }  
}
