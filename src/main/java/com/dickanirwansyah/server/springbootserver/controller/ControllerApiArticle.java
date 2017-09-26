/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.server.springbootserver.controller;

import com.dickanirwansyah.server.springbootserver.dao.ArticleDAO;
import com.dickanirwansyah.server.springbootserver.entity.Article;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author java-spring
 */
@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ControllerApiArticle {
    
    private static final Logger LOGGER = 
            LoggerFactory.getLogger(ControllerApiArticle.class);
    
    @Autowired
    private ArticleDAO articleDAO;
    
    @GetMapping(value = "/articles")
    public ResponseEntity<List<Article>> findAllArticle(){
        
        LOGGER.info("Menampilkan data article");
        
        List<Article> listarticle=articleDAO.findAllArticle();
        
        if(listarticle.isEmpty()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
            return new ResponseEntity<List<Article>>(listarticle, HttpStatus.OK);
    }
    
}
