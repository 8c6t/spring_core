package com.hachicore.demospring51;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  @Autowired
  BookRepository myBookRepository;

  // public void printBookRepository() {
  //   System.out.println(myBookRepository.getClass());
  // }

  @PostConstruct
  public void setup() {
    System.out.println(myBookRepository.getClass());
  }

}