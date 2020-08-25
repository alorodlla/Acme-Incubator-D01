
package acme.features.anonymous.rodriguezBulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.rodriguezBulletins.RodriguezBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRodriguezBulletinCreateService implements AbstractCreateService<Anonymous, RodriguezBulletin> {

	@Autowired
	AnonymousRodriguezBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RodriguezBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<RodriguezBulletin> request, final RodriguezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<RodriguezBulletin> request, final RodriguezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "project", "company", "complexity");
	}

	@Override
	public RodriguezBulletin instantiate(final Request<RodriguezBulletin> request) {
		assert request != null;

		RodriguezBulletin result;

		result = new RodriguezBulletin();
		result.setProject("Project 1");
		result.setCompany("Company 1");
		result.setComplexity(1);

		return result;

	}

	@Override
	public void validate(final Request<RodriguezBulletin> request, final RodriguezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<RodriguezBulletin> request, final RodriguezBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
