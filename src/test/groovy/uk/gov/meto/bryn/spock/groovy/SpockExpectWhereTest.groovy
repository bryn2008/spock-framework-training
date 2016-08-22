/**
 * SpockExpectWhereTest.groovy
 *
 * (C) Crown Copyright 2016, the Met Office.
 */
package uk.gov.meto.bryn.spock.groovy

import spock.lang.Specification

/**
 * @author bryn.lloyd
 *
 */
class SpockExpectWhereTest extends Specification {

    def 'should select a max of two numbers'(){
        expect:
        Math.max(a, b) == c

        /*where:
         a | b | c // these are vars that will be available in the above test
         5 | 1 | 5 // initialised to these values!
         9 | 9 | 9*/

        /*        where:
         a << [5, 9]
         b << [1, 9]
         c << [5, 9]*/

        //def sql = Sql.newInstance("jdbc:h2:mem:", "org.h2.Driver")
        //where:
        //[a, b, c]<< sql.rows("select a, b, c from mytable")
        // or even:
        //[a, b, _, c]<< sql.rows("select * from mytable")
    }
}