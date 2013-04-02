package nima.diagram.part;

import nima.Combat;
import nima.NimaPackage;
import nima.diagram.edit.parts.ArchetypeEditPart;
import nima.diagram.edit.parts.ArchetypeNomEditPart;
import nima.diagram.edit.parts.CombatEditPart;
import nima.diagram.edit.parts.ConfigEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class NimaVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "granima.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CombatEditPart.MODEL_ID.equals(view.getType())) {
				return CombatEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return nima.diagram.part.NimaVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				NimaDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (NimaPackage.eINSTANCE.getCombat().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Combat) domainElement)) {
			return CombatEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = nima.diagram.part.NimaVisualIDRegistry
				.getModelID(containerView);
		if (!CombatEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CombatEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = nima.diagram.part.NimaVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CombatEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CombatEditPart.VISUAL_ID:
			if (NimaPackage.eINSTANCE.getArchetype().isSuperTypeOf(
					domainElement.eClass())) {
				return ArchetypeEditPart.VISUAL_ID;
			}
			break;
		case ArchetypeEditPart.VISUAL_ID:
			if (NimaPackage.eINSTANCE.getConfig().isSuperTypeOf(
					domainElement.eClass())) {
				return ConfigEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = nima.diagram.part.NimaVisualIDRegistry
				.getModelID(containerView);
		if (!CombatEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CombatEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = nima.diagram.part.NimaVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CombatEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CombatEditPart.VISUAL_ID:
			if (ArchetypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArchetypeEditPart.VISUAL_ID:
			if (ArchetypeNomEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConfigEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Combat element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case CombatEditPart.VISUAL_ID:
			return false;
		case ConfigEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return nima.diagram.part.NimaVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return nima.diagram.part.NimaVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return nima.diagram.part.NimaVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return nima.diagram.part.NimaVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return nima.diagram.part.NimaVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return nima.diagram.part.NimaVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
