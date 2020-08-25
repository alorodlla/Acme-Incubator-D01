
package acme.entities.toroBulletins;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ToroBulletin extends DomainEntity {

	//Serialisation identifier

	private static final long	serialVersionUID	= 1L;

	//Atributtes

	@NotBlank
	private String				author;

	@NotBlank
	private String				likes;

	@NotBlank
	private String				dislikes;

}
