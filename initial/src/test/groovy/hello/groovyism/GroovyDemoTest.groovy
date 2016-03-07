package hello.groovyism

import spock.lang.Specification


/**
 *
 * @author Ken De Leon
 * @version $Revision: #1 $ submitted $DateTime: 2013/08/29 10:34:55 $ by $Author: vdeleke $
 */
class GroovyDemoTest extends Specification {

    def controller = new GroovyDemo()

    def "Simple Demo"() {
        when:
        def demo = controller.demo("Hello", null)
        then:
        demo.additional == null
        demo.message == "Hello"
    }
}
