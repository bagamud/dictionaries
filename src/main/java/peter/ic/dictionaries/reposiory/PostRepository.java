package peter.ic.dictionaries.reposiory;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peter.ic.dictionaries.entity.Post;

@RepositoryRestResource(collectionResourceRel = "position", path = "position")
public interface PostRepository extends PagingAndSortingRepository<Post, Integer> {
}
