/**
 * SharingElementsTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import spock.lang.Shared
import spock.lang.Specification

/**
 * @author bryn.lloyd
 *
 */
class SharingElementsTest extends Specification {

    // Will be instantiated only once for all the tests!
    def @Shared  heavyObject = new VeryCostlyObject()

    def 'should test this'(){
        expect:
        heavyObject != null
    }

    def 'should test that'(){
        expect:
        heavyObject != null
    }
}
