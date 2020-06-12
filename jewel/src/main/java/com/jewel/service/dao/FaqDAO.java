package com.jewel.service.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jewel.common.dao.AbstractDAO;

@Repository("faqDAO")
public class FaqDAO extends AbstractDAO{

	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> faqListAll(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("faq.faqListAll", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> faqList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("faq.faqList", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> faqDetail(Map<String, Object> map) throws Exception{
		return (Map<String, Object>) selectOne("faq.faqDetail", map);
	}
	
	public int getTotalList(Map<String, Object> map) {
		return  (Integer) selectOne("faq.getTotalList", map);
}
	
	
}
