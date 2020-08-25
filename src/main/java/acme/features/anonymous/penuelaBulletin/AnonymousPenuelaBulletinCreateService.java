
package acme.features.anonymous.penuelaBulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.penuelaBulletins.PenuelaBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousPenuelaBulletinCreateService implements AbstractCreateService<Anonymous, PenuelaBulletin> {

	@Autowired
	AnonymousPenuelaBulletinRepository repository;


	@Override
	public boolean authorise(final Request<PenuelaBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<PenuelaBulletin> request, final PenuelaBulletin entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<PenuelaBulletin> request, final PenuelaBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "pros", "cons");

	}

	@Override
	public PenuelaBulletin instantiate(final Request<PenuelaBulletin> request) {
		assert request != null;

		PenuelaBulletin result;

		result = new PenuelaBulletin();
		result.setName("John Doe");
		result.setPros("Kind");
		result.setCons("Lazy");

		return result;
	}

	@Override
	public void validate(final Request<PenuelaBulletin> request, final PenuelaBulletin entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<PenuelaBulletin> request, final PenuelaBulletin entity) {

		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
