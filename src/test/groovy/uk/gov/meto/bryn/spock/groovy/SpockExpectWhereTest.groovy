/**
 * SpockExpectWhereTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import org.spockframework.compiler.model.Spec

/**
 * @author bryn.lloyd
 *
 */
class SpockExpectWhereTest extends Spec {

    def 'should select a max of two numbers'(){
        expect:
        Math.max(a, b) == c

        where:
        a | b | c // these are vars that will be available in the above test
        5 | 1 | 5 // initialised to these values!
        9 | 9 | 9
    }
}