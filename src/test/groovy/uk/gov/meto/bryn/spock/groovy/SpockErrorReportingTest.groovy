/**
 * SpockErrorReportingTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import spock.lang.Specification

/**
 * @author bryn.lloyd
 *
 */
class SpockErrorReportingTest extends Specification {

    def 'should selext max of two numbers'(){
        expect:
        Math.max(a, b)  == c

        where:
        a | b | c
        5 | 1 | 5
        9 | 9 | 8
    }
}
