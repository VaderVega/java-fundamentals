package com.epam.courses.java.fundamentals.threads.waitexample;

import java.util.ArrayList;
import java.util.List;


public class SharedResource {

  List<Integer> list = new ArrayList<>();

  public void setElement(Integer element) {
    list.add(element);
  }


  public Integer getElement() {
    return !list.isEmpty() ? list.remove(0) : null;
  }

}
