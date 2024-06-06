package com.telusko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.telusko.dao.QuestionDao;
import com.telusko.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questiondao;

	public ResponseEntity<List<Question>> getAllquestions() {
		try {
			return new ResponseEntity<>(questiondao.findAll(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

	}

	public List<Question> getQuestionsByCategory(String category) {
		
		return questiondao.findByCategory(category);
	}

	public String addQuestion(Question question) {
		questiondao.save(question);
		return "Success";
	}

}
