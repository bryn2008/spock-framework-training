/**
 * ListWithHelperTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import spock.lang.Specification

/**
 * @author bryn.lloyd
 *
 */
class ListWithHelperTest extends Specification {

    def "should be empty after removing element"(){
        given:
        def list = [42] // it's a list
        
        when:
        list.remove(0)
        
        then:
        // Spock can assert that an Exception was _NOT_ thrown:
        notThrown(IllegalArgumentException)
        // can call helper method here:
        doCommonAssertions(list)
    }
    
    // Assertion helpers have to have void return type and explicit asserts.
    def void doCommonAssertions(List<Integer> list) { // type is optional
        assert list != null
        assert list.isEmpty()
    }
}
