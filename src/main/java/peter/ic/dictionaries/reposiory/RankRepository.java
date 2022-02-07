package peter.ic.dictionaries.reposiory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peter.ic.dictionaries.entity.Rank;

@RepositoryRestResource(collectionResourceRel = "rank", path = "rank")
public interface RankRepository extends PagingAndSortingRepository<Rank, Integer> {
}
