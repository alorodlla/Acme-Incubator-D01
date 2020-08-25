/**
 *
 */

package acme.features.anonymous.toroBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.toroBulletins.ToroBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

/**
 * @author diamo
 *
 */
@Controller
@RequestMapping("/anonymous/toroBulletin")
public class AnonymousToroBulletinController extends AbstractController<Anonymous, ToroBulletin> {

	//Internal state

	@Autowired
	private AnonymousToroBulletinListService	listService;

	@Autowired
	private AnonymousToroBulletinCreateService	createService;


	//Constructors

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);

	}
}
