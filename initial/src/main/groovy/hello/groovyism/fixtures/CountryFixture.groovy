package hello.groovyism.fixtures

import hello.Country
import hello.groovyism.repository.CountryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Profile
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

/**
 * Simple fixture to standup some contries during application startup
 */
@Profile("DEV")
@Component
class CountryFixture implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    CountryRepository countryRepository

    @Override
    @Transactional
    void onApplicationEvent(ContextRefreshedEvent event) {
        countryRepository.save(new Country(code:"USA", name: "United States of America", language: "English"))
        countryRepository.save(new Country(code:"PH", name: "Philippines", language: "Filipino"))
        countryRepository.save(new Country(code:"IND", name: "India", language: "Hindi"))
        countryRepository.save(new Country(code:"JPN", name: "Japan", language: "Japanese"))
        countryRepository.save(new Country(code:"ITA", name: "Italy", language: "Italian"))
    }
}
