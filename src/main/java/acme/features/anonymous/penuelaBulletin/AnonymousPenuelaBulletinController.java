
package acme.features.anonymous.penuelaBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.penuelaBulletins.PenuelaBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/penuelaBulletin")
public class AnonymousPenuelaBulletinController extends AbstractController<Anonymous, PenuelaBulletin> {

	//Internal state

	@Autowired
	private AnonymousPenuelaBulletinListService		listService;

	@Autowired
	private AnonymousPenuelaBulletinCreateService	createService;


	//Constructors

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);

	}

}
