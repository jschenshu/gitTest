package cn.chen.service.impl;

import cn.chen.dao.ItemDao;
import cn.chen.domain.Item;
import cn.chen.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;

    @Override
    public Item getItemById(Integer id) {

        return itemDao.getItemById(id);
    }
}
