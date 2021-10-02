package com.azam.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azam.common.ICommonService;
import com.azam.dao.CategoriesDao;
import com.azam.model.Categories;



@Service
public class CategoriesService implements ICommonService<Categories>{
	@Autowired
	CategoriesDao categoriesDao;
	@Override
	public Categories save(HttpServletRequest request) {
        String name = request.getParameter("Categori_name");
        Categories c = new Categories();
        c.setCatego_name(name);
        c.setCatego_code(request.getParameter("Categori_code"));
       
        return categoriesDao.save(c);
		
	}

	@Override
	public Categories edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categories update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categories> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
