/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.server.springbootserver.daoimpl;

import com.dickanirwansyah.server.springbootserver.dao.ArticleDAO;
import com.dickanirwansyah.server.springbootserver.entity.Article;
import com.dickanirwansyah.server.springbootserver.repository.RepoArticle;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author java-spring
 */
@Service("articleDAO")
@Transactional
public class ArticleDaoImpl implements ArticleDAO{

    @Autowired
    private RepoArticle repoArticle;
    
    @Override
    public void insertArticle(Article article) {
      repoArticle.save(article);
    }

    @Override
    public void deleteArticle(Article article) {
      repoArticle.delete(article);
    }

    @Override
    public void updateArticle(Article article) {
      repoArticle.save(article);
    }

    @Override
    public List<Article> findAllArticle() {
     return repoArticle.findAll();
    }

    @Override
    public Article findByIdArticel(int idarticle) {
      return repoArticle.findOne(idarticle);
    }
    
}
