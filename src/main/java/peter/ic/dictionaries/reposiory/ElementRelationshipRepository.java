package peter.ic.dictionaries.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peter.ic.dictionaries.entity.ElementRelationship;

@RepositoryRestResource(collectionResourceRel = "elementRelationship", path = "elementRelationship")
public interface ElementRelationshipRepository extends JpaRepository<ElementRelationship, Integer> {
}
