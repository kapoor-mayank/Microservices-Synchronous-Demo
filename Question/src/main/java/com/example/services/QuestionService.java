package com.example.services;

import com.example.entities.*;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> get();
    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}