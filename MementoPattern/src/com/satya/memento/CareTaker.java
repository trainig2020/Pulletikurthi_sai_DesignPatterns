package com.satya.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {  
    
    private List<Memento> mementoList = new ArrayList<Memento>();  
  
       public void add(Memento state){  
          mementoList.add(state);  
       }  
  
       public Memento get(int index){  
          return mementoList.get(index);  
       }  
  
}// End of the Caretaker class.  
