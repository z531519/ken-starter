package hello.groovyism.rest

import hello.Country
import hello.groovyism.repository.CountryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/country")
class CountryRestController {

    @Autowired
    CountryRepository countryRepository;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Country> getCountries() {
        return countryRepository.findAll()
    }

    @ResponseBody
    @RequestMapping( value = "/{id}", method = RequestMethod.POST)
    public Country updateCountry(@PathVariable('id') String id, @RequestBody Country country) {
        countryRepository.save(country);
        return country;
    }

    @ResponseBody
    @RequestMapping( method = [RequestMethod.POST, RequestMethod.PUT])
    public Country createCountry(@RequestBody Country country) {
        countryRepository.save(country);
        return country;
    }
}
