package com.telusko.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{

}
