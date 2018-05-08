package com.jxufe.controller;/**
 * Created by 响 on 2018/5/8.
 */

import com.jxufe.pojo.TbItem;
import com.jxufe.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2018/5/8 18:12
 * |  @
 * +---------------------------------Oooo---------------------------------------+
 */
@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId){
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }
}
