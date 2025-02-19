package org.example;


import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;

/*
 * Created on 03/12/2024 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Embeddable
public abstract class BaseD { //TODO would really like this to be abstract
  public String baseprop;

   public BaseD(String baseprop) {
      this.baseprop = baseprop;
   }

   public BaseD() {

   }

   public String getBaseprop() {
      return baseprop;
   }

}
