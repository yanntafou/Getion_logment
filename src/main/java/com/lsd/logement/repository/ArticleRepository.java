package com.lsd.logement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lsd.logement.entity.Stock.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}