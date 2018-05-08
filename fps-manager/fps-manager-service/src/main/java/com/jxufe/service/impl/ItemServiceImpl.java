package com.jxufe.service.impl;/**
 * Created by 响 on 2018/5/8.
 */

import com.jxufe.mapper.TbItemMapper;
import com.jxufe.pojo.TbItem;
import com.jxufe.pojo.TbItemExample;
import com.jxufe.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2018/5/8 18:05
 * |  @
 * +---------------------------------Oooo---------------------------------------+
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;
    @Override
    public TbItem getItemById(long itemId) {
        //根据主键查询
        //TbItem tbItem = itemMapper.selectByPrimaryKey(itemId);
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list!=null && list.size()>0) {
            return list.get(0);
        }
    return  null;
    }
}
