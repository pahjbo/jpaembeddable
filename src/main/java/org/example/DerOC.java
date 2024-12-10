package org.example;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

/*
 * Created on 10/12/2024 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
public class DerOC extends BaseO{

   @Embedded
   private DerDC derDC;

    public DerOC(DerDC derDC) {
        this.derDC = derDC;
    }

    public DerOC() {

    }

   public DerDC getDerDC() {
      return derDC;
   }
}
