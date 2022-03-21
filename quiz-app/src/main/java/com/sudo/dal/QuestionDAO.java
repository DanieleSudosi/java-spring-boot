package com.sudo.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudo.entities.Question;

public interface QuestionDAO extends JpaRepository<Question, Integer> {

}
