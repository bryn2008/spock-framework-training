/**
 * VeryCostlyObject.java
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy;

/**
 * @author bryn.lloyd
 *
 */
public class VeryCostlyObject {

    public VeryCostlyObject() {
        System.out.println("Instantiating very costly object...");
        System.out.println("...5 minutes later ;-)");
        System.out.println("Done!");
    }

}
