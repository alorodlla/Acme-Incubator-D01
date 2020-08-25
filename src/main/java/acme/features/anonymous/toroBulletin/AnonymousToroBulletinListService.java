
package acme.features.anonymous.toroBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.toroBulletins.ToroBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousToroBulletinListService implements AbstractListService<Anonymous, ToroBulletin> {

	//Internal state

	@Autowired
	AnonymousToroBulletinRepository repository;

	//AbstractListService interface


	@Override
	public boolean authorise(final Request<ToroBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<ToroBulletin> request, final ToroBulletin entity, final Model model) {

		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "likes", "dislikes");

	}

	@Override
	public Collection<ToroBulletin> findMany(final Request<ToroBulletin> request) {

		assert request != null;

		Collection<ToroBulletin> result;

		result = this.repository.findMany();

		return result;

	}
}
