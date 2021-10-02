package com.azam.Controllar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.azam.common.ICommonController;
import com.azam.model.Categories;
import com.azam.service.CategoriesService;


@RestController
@RequestMapping(value = "categori")

public class CategorieControllar implements ICommonController{
	@Autowired
	CategoriesService categoriesService;
	@Override
	@RequestMapping(value = "/add")
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView ("quiz/Addcategori");
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		 Categories c = categoriesService.save(request);
	        return new ModelAndView("quiz/Addcategori");
		
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
