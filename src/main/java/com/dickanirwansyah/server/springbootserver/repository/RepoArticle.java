/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.server.springbootserver.repository;

import com.dickanirwansyah.server.springbootserver.entity.Article;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author java-spring
 */
public interface RepoArticle extends JpaRepository<Article, Integer>{
    
}
