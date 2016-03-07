package hello

import spock.lang.Specification


/**
 *
 * @author Ken De Leon
 * @version $Revision: #1 $ submitted $DateTime: 2013/08/29 10:34:55 $ by $Author: vdeleke $
 */
class HelloControllerTest extends Specification {

    def "Hello World"() {
        def controller = new HelloController()
        when:
        def result = controller.index()
        then:
        result == "Hello World!"
    }

}
