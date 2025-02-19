package org.example;


import jakarta.persistence.*;

/*
 * Created on 03/12/2024 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
public class DerOA extends BaseO{
   public DerOA(DerDA derda) {
      this.derda = derda;
   }

   @Embedded
   public BaseD derda;

   public DerOA() {

   }
}
