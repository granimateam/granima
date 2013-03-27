package nima.diagram.edit.policies;

import nima.diagram.providers.NimaElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class AttaqueItemSemanticEditPolicy extends
		NimaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AttaqueItemSemanticEditPolicy() {
		super(NimaElementTypes.Attaque_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
