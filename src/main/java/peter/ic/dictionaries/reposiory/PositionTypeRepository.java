package peter.ic.dictionaries.reposiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import peter.ic.dictionaries.entity.PositionType;

@RepositoryRestResource(collectionResourceRel = "positionType", path = "positionType")
public interface PositionTypeRepository extends JpaRepository<PositionType, Integer> {
}
