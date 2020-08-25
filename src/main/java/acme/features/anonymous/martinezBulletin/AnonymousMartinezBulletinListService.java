
package acme.features.anonymous.martinezBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.martinezBulletins.MartinezBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousMartinezBulletinListService implements AbstractListService<Anonymous, MartinezBulletin> {

	//Internal State

	@Autowired
	AnonymousMartinezBulletinRepository repository;


	//AbstractListService<Anonymous, MartinezBulletin> interface

	@Override
	public boolean authorise(final Request<MartinezBulletin> request) {
		assert request != null;
		return true;

	}

	@Override
	public Collection<MartinezBulletin> findMany(final Request<MartinezBulletin> request) {
		assert request != null;
		Collection<MartinezBulletin> result;
		result = this.repository.findMany();
		return result;
	}

	@Override
	public void unbind(final Request<MartinezBulletin> request, final MartinezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "autor", "nota", "comentarios");
	}
}
