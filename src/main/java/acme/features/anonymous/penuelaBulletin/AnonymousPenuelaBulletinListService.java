
package acme.features.anonymous.penuelaBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.penuelaBulletins.PenuelaBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousPenuelaBulletinListService implements AbstractListService<Anonymous, PenuelaBulletin> {

	//Internal state

	@Autowired
	AnonymousPenuelaBulletinRepository repository;

	//AbstractListService interface


	@Override
	public boolean authorise(final Request<PenuelaBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<PenuelaBulletin> request, final PenuelaBulletin entity, final Model model) {

		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "pros", "cons");

	}

	@Override
	public Collection<PenuelaBulletin> findMany(final Request<PenuelaBulletin> request) {

		assert request != null;

		Collection<PenuelaBulletin> result;

		result = this.repository.findMany();

		return result;

	}

}
