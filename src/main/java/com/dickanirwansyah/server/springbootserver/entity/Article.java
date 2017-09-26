/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.server.springbootserver.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author java-spring
 */
@Entity
@Table(name = "article", 
        catalog = "belajar_angular")
public class Article implements Serializable{
    
 @Id @Column(name = "idarticle", nullable = false)
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int idarticle;
 
 @Column(name = "title", nullable = false)
 private String title;
 
 @Column(name = "category", nullable = false)
 private String category;
 
 public int getIdarticle(){
     return idarticle;
 }
 
 public void setIdarticle(int idarticle){
     this.idarticle=idarticle;
 }
 
 public String getTitle(){
     return title; 
}
 
 public void setTitle(String title){
     this.title =title;
 }
 
 public String getCategory(){
     return category;
 }
 
 public void setCategory(String category){
     this.category=category;
 }
}
