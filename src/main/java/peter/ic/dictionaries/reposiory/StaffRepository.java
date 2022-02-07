package peter.ic.dictionaries.reposiory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peter.ic.dictionaries.entity.Staff;

@RepositoryRestResource(collectionResourceRel = "staff", path = "staff")
public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer>  {
}
