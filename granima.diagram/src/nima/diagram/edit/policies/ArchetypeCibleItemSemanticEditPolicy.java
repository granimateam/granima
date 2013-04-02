package nima.diagram.edit.policies;

import nima.diagram.providers.NimaElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArchetypeCibleItemSemanticEditPolicy extends
		NimaBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArchetypeCibleItemSemanticEditPolicy() {
		super(NimaElementTypes.ArchetypeCible_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
