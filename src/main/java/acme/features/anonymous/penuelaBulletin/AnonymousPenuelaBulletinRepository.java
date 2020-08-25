
package acme.features.anonymous.penuelaBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.penuelaBulletins.PenuelaBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPenuelaBulletinRepository extends AbstractRepository {

	@Query("select s from PenuelaBulletin s")
	Collection<PenuelaBulletin> findMany();

}
