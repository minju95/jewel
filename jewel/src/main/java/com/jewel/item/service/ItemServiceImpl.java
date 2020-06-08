package com.jewel.item.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.jewel.item.dao.ItemDAO;
import com.jewel.member.dao.LoginDAO;

@Service("itemService")
public class ItemServiceImpl implements ItemService{
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="itemDAO")
	private ItemDAO itemDAO;

	@Override
	public List<Map<String, Object>> getItemList(Map<String, Object> map) {
	
		return itemDAO.getItemList(map);
	}

	@Override
	public int getTotalList(Map<String, Object> map) {
		return itemDAO.getTotalList(map);
	}
	
	@Override
	public Map<String, Object> getItem(Map<String, Object> map) {
		return itemDAO.getItem(map);
	}

	@Override
	public List<Map<String, Object>> getOption(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return itemDAO.getOption(map);
	}

	@Override
	public List<Map<String, Object>> getSelectOption(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return itemDAO.getSelectOption(map);
	}

	@Override
	public int addCart(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return itemDAO.addCart(map);
	}
	
	
}
