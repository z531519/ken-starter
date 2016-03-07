package hello.groovyism

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author Ken De Leon
 * @version $Revision: #1 $ submitted $DateTime: 2013/08/29 10:34:55 $ by $Author: vdeleke $
 */

@RestController()
@RequestMapping("/groovy")
public class GroovyDemo {

    @RequestMapping(path='/demo', method = RequestMethod.GET)
    public Demo demo(
            @RequestParam(name = "message", defaultValue = "Hello World!") message,
            @RequestParam(name = "additional", required = false) additional
    ) {
        new Demo(message: message + "YOEE", additional: additional)
    }

}
