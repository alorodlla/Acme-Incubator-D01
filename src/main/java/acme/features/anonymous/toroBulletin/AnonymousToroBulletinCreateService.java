
package acme.features.anonymous.toroBulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.toroBulletins.ToroBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousToroBulletinCreateService implements AbstractCreateService<Anonymous, ToroBulletin> {

	@Autowired
	AnonymousToroBulletinRepository repository;


	@Override
	public boolean authorise(final Request<ToroBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<ToroBulletin> request, final ToroBulletin entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<ToroBulletin> request, final ToroBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "likes", "dislikes");

	}

	@Override
	public ToroBulletin instantiate(final Request<ToroBulletin> request) {
		assert request != null;

		ToroBulletin result;

		result = new ToroBulletin();
		result.setAuthor("John Dad");
		result.setLikes("Chocolate");
		result.setDislikes("Pimiento");

		return result;
	}

	@Override
	public void validate(final Request<ToroBulletin> request, final ToroBulletin entity, final Errors errors) {

		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<ToroBulletin> request, final ToroBulletin entity) {

		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}
}
