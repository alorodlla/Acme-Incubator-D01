
package acme.entities.rodriguezBulletins;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RodriguezBulletin extends DomainEntity {

	//Serialisation identifier

	private static final long	serialVersionUID	= 1L;

	//Atributtes

	@NotBlank
	private String				project;

	@NotBlank
	private String				company;

	@PositiveOrZero
	private Integer				complexity;
}
