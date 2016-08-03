/**
 * BasicListTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import spock.lang.Specification

/**
 * @author bryn.lloyd
 *
 */
class BasicListTest extends Specification {

    def "should not be empty after adding element"(){
        given:
        // [] is Groovy for literal for List and is infered
        def list = []

        when:
        list.add(42)

        then:
        // Asserts are impicit and not needed to be stated
        // change "==" to "!=" and see what is happening!

        list.size() == 1
        list == [42]
    }
}
