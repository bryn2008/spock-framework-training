/**
 * GivenWhenThenTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import spock.lang.Specification

/**
 * @author bryn.lloyd
 *
 */
class GivenWhenThenTest extends Specification {

    def 'should sort list of numbers'(){
        given:
        def list = [a, b]

        when:
        def calculated  = list.sort()

        then:
        calculated  == expectedResult

        where:
        a | b | expectedResult
        5 | 1 | [1, 5]
        9 | 9 | [9, 9]
    }

    def 'should compute the maximum of two numbers'(){
        expect:
        Math.max(a, b) == c

        where:
        a << [1, 4]
        b << [2, 3]
        c << [2, 4]
    }
}
