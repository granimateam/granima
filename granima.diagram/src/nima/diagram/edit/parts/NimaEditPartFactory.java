package nima.diagram.edit.parts;

import nima.diagram.part.NimaVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class NimaEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (NimaVisualIDRegistry.getVisualID(view)) {

			case CombatEditPart.VISUAL_ID:
				return new CombatEditPart(view);

			case ArchetypeEditPart.VISUAL_ID:
				return new ArchetypeEditPart(view);

			case ArchetypeNomEditPart.VISUAL_ID:
				return new ArchetypeNomEditPart(view);

			case ConfigEditPart.VISUAL_ID:
				return new ConfigEditPart(view);

			case AttaqueEditPart.VISUAL_ID:
				return new AttaqueEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
