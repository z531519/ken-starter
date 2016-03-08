package hello.groovyism.rest
import hello.Country
import hello.groovyism.repository.CountryRepository
import spock.lang.Specification

class CountryRestControllerTest extends Specification {

    CountryRestController controller = new CountryRestController()
    def repository = Mock(CountryRepository)
    def setup() {
        controller.countryRepository = repository
    }
    def "Get Countries"() {
        def country = new Country()
        when:
        def result = controller.getCountries()
        then:
        1 * repository.findAll() >> [country]
        result == [country]
    }

    def "Update Country"() {
        def country = new Country()
        when:
        def result = controller.updateCountry("A", country)
        then:
        1 * repository.save(country)
        country == result
    }

    def "Create Employee"() {
        def country = new Country()
        when:
        def result = controller.createCountry("A", country)
        then:
        1 * repository.save(country)
        country == result
    }
}
