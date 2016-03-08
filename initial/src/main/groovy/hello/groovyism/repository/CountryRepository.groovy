package hello.groovyism.repository

import hello.Country
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CountryRepository extends CrudRepository<Country, String> {
}
