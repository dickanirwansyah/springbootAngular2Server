/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.server.springbootserver.dao;

import com.dickanirwansyah.server.springbootserver.entity.Article;
import java.util.List;

/**
 *
 * @author java-spring
 */
public interface ArticleDAO {
    
    void insertArticle(Article article);
    
    void deleteArticle(Article article);
    
    void updateArticle(Article article);
    
    List<Article> findAllArticle();
    
    Article findByIdArticel(int idarticle);
}
