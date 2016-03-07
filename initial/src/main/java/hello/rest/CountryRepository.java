package hello.rest;

import hello.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author Ken De Leon
 * @version $Revision: #1 $ submitted $DateTime: 2013/08/29 10:34:55 $ by $Author: vdeleke $
 */
@RepositoryRestResource(collectionResourceRel = "country", path = "country")
public interface CountryRepository extends PagingAndSortingRepository<Country, String>{

}


