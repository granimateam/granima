package nima.diagram.edit.commands;

import nima.Archetype;
import nima.Attaque;
import nima.Combat;
import nima.Config;
import nima.diagram.edit.policies.NimaBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class AttaqueReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public AttaqueReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Attaque) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Config && newEnd instanceof Config)) {
			return false;
		}
		Archetype target = getLink().getCible();
		if (!(getLink().eContainer() instanceof Combat)) {
			return false;
		}
		Combat container = (Combat) getLink().eContainer();
		return NimaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAttaque_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Archetype && newEnd instanceof Archetype)) {
			return false;
		}
		Config source = getLink().getAttaquant();
		if (!(getLink().eContainer() instanceof Combat)) {
			return false;
		}
		Combat container = (Combat) getLink().eContainer();
		return NimaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistAttaque_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setAttaquant(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setCible(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Attaque getLink() {
		return (Attaque) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Config getOldSource() {
		return (Config) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Config getNewSource() {
		return (Config) newEnd;
	}

	/**
	 * @generated
	 */
	protected Archetype getOldTarget() {
		return (Archetype) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Archetype getNewTarget() {
		return (Archetype) newEnd;
	}
}
