
package acme.features.anonymous.rodriguezBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.rodriguezBulletins.RodriguezBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRodriguezBulletinRepository extends AbstractRepository {

	@Query("select r from RodriguezBulletin r")
	Collection<RodriguezBulletin> findMany();

}
