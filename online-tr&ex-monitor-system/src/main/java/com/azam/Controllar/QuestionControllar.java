package com.azam.Controllar;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.azam.common.ICommonController;
import com.azam.model.Course;
import com.azam.model.Question;
import com.azam.model.Results;
import com.azam.service.CourseService;
import com.azam.service.QuestionService;

@RestController
@RequestMapping(value = "question")
public class QuestionControllar implements ICommonController {

	@Autowired
	QuestionService questionService;

	@Autowired
	CourseService courseService;

	@Override
	@RequestMapping(value = "/add")
	public ModelAndView create() {

		List<Course> courses = courseService.getAll();

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("courses", courses);
		return new ModelAndView("quiz/Addquestion", "map", map);
	}

	@Override
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		Question q = questionService.save(request);
		//System.out.println(q.getCourse_name());
		//System.out.println(q.getCourse_code());
		return new ModelAndView("quiz/Addquestion");
	}

	@Override
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id) {

//		int qid = Integer.valueOf(id);
		Question q = questionService.getById(id);

		return new ModelAndView("alledit/editquestion", "q", q);

	}

	@Override
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		Question q = questionService.update(request);
		List<Question> questions = questionService.getAll();
		return new ModelAndView("showall/qshowall", "questions", questions);
	}

	@Override
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public ModelAndView delete(@PathVariable String id) {
		int delete = questionService.delete(id);

		List<Question> questions = questionService.getAll();
		return new ModelAndView("showall/qshowall", "questions", questions);
	}

	@Override
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getAll() {

		List<Question> questions = questionService.getAll();
		return new ModelAndView("showall/qshowall", "questions", questions);
	}

	@RequestMapping(value = "/startq", method = RequestMethod.POST)
	public ModelAndView startquiz(HttpServletRequest request, ModelMap map) {
		map.addAttribute("username", request.getParameter("username"));
	
		List<Question> questions1 = questionService.starq(request.getParameter("course_code"));
		return new ModelAndView("quiz/showquiz", "questions1", questions1);
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public ModelAndView result(HttpServletRequest request, Model model) {
		String qid = request.getParameter("question_code");

		List<Question> questions1 = questionService.starq(qid);

		int correct = 0;
		int incorrect = 0;
		for (int i = 0; i < questions1.size(); i++) {
			String rep = request.getParameter(String.valueOf(questions1.get(i).getId()));
			System.out.println("............... " + rep);
			if (rep.equals(questions1.get(i).getCorrect())) {
				correct += 1;
			} else {
				incorrect += 1;
			}
		}
		System.out.println(request.getParameter("username"));
		questionService.saveResult(request, questions1, correct, incorrect);
		String username = request.getParameter("username");
		  List<Results>result = questionService.getResult(username);
		  model.addAttribute("result", result);
		
		
		return new ModelAndView("/user/result");
	}
	
	
	@RequestMapping(value = "/usereshow", method = RequestMethod.GET)
	public ModelAndView getAllre() {

		List<Results> resultsallu = questionService.getAlll();
		return new ModelAndView("showall/showuserresult", "resultsallu", resultsallu);
	}

}

