package org.example;


import jakarta.persistence.Embeddable;

/*
 * Created on 10/12/2024 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
@Embeddable
public class DerDC extends DerDA {
   String c;

   public DerDC(String a, String bprop, String c) {
      super(a, bprop);
      this.c = c;
   }

   public DerDC() {

   }
}
