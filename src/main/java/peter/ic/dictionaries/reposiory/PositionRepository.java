package peter.ic.dictionaries.reposiory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peter.ic.dictionaries.entity.Position;

@RepositoryRestResource(collectionResourceRel = "position", path = "position")
public interface PositionRepository extends PagingAndSortingRepository<Position, Integer> {
}
