
package acme.features.anonymous.toroBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.toroBulletins.ToroBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousToroBulletinRepository extends AbstractRepository {

	@Query("select s from ToroBulletin s")
	Collection<ToroBulletin> findMany();

}
