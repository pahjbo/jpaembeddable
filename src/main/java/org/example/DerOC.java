package org.example;


import jakarta.persistence.*;

/*
 * Created on 10/12/2024 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Entity
public class DerOC extends BaseO{

   @Embedded
   @AttributeOverrides({
         @AttributeOverride(name="baseprop",column = @Column(name="basep"))
   })
   private BaseD derDC;

    public DerOC(DerDC derDC) {
        this.derDC = derDC;
    }

    public DerOC() {

    }

   public DerDC getDerDC() {
      return (DerDC) derDC;
   }
}
