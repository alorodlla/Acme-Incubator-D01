
package acme.features.anonymous.rodriguezBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.rodriguezBulletins.RodriguezBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRodriguezBulletinListService implements AbstractListService<Anonymous, RodriguezBulletin> {

	//Internal State

	@Autowired
	AnonymousRodriguezBulletinRepository repository;


	//AbstractListService<Administrator, Shout> interface

	@Override
	public boolean authorise(final Request<RodriguezBulletin> request) {
		assert request != null;
		return true;

	}

	@Override
	public Collection<RodriguezBulletin> findMany(final Request<RodriguezBulletin> request) {
		assert request != null;
		Collection<RodriguezBulletin> result;
		result = this.repository.findMany();
		return result;
	}

	@Override
	public void unbind(final Request<RodriguezBulletin> request, final RodriguezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "project", "company", "complexity");
	}
}
