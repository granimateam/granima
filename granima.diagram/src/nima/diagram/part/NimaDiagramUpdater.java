package nima.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import nima.Archetype;
import nima.Attaque;
import nima.Combat;
import nima.Config;
import nima.NimaPackage;
import nima.diagram.edit.parts.ArchetypeEditPart;
import nima.diagram.edit.parts.AttaqueEditPart;
import nima.diagram.edit.parts.CombatEditPart;
import nima.diagram.edit.parts.ConfigEditPart;
import nima.diagram.providers.NimaElementTypes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class NimaDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<NimaNodeDescriptor> getSemanticChildren(View view) {
		switch (NimaVisualIDRegistry.getVisualID(view)) {
		case CombatEditPart.VISUAL_ID:
			return getCombat_1000SemanticChildren(view);
		case ArchetypeEditPart.VISUAL_ID:
			return getArchetype_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaNodeDescriptor> getCombat_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Combat modelElement = (Combat) view.getElement();
		LinkedList<NimaNodeDescriptor> result = new LinkedList<NimaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getArchetypes().iterator(); it
				.hasNext();) {
			Archetype childElement = (Archetype) it.next();
			int visualID = NimaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArchetypeEditPart.VISUAL_ID) {
				result.add(new NimaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaNodeDescriptor> getArchetype_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Archetype modelElement = (Archetype) view.getElement();
		LinkedList<NimaNodeDescriptor> result = new LinkedList<NimaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getConfigs().iterator(); it
				.hasNext();) {
			Config childElement = (Config) it.next();
			int visualID = NimaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConfigEditPart.VISUAL_ID) {
				result.add(new NimaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getContainedLinks(View view) {
		switch (NimaVisualIDRegistry.getVisualID(view)) {
		case CombatEditPart.VISUAL_ID:
			return getCombat_1000ContainedLinks(view);
		case ArchetypeEditPart.VISUAL_ID:
			return getArchetype_2001ContainedLinks(view);
		case ConfigEditPart.VISUAL_ID:
			return getConfig_3001ContainedLinks(view);
		case AttaqueEditPart.VISUAL_ID:
			return getAttaque_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getIncomingLinks(View view) {
		switch (NimaVisualIDRegistry.getVisualID(view)) {
		case ArchetypeEditPart.VISUAL_ID:
			return getArchetype_2001IncomingLinks(view);
		case ConfigEditPart.VISUAL_ID:
			return getConfig_3001IncomingLinks(view);
		case AttaqueEditPart.VISUAL_ID:
			return getAttaque_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getOutgoingLinks(View view) {
		switch (NimaVisualIDRegistry.getVisualID(view)) {
		case ArchetypeEditPart.VISUAL_ID:
			return getArchetype_2001OutgoingLinks(view);
		case ConfigEditPart.VISUAL_ID:
			return getConfig_3001OutgoingLinks(view);
		case AttaqueEditPart.VISUAL_ID:
			return getAttaque_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getCombat_1000ContainedLinks(
			View view) {
		Combat modelElement = (Combat) view.getElement();
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Attaque_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getArchetype_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getConfig_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getAttaque_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getArchetype_2001IncomingLinks(
			View view) {
		Archetype modelElement = (Archetype) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Attaque_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getConfig_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getAttaque_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getArchetype_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getConfig_3001OutgoingLinks(View view) {
		Config modelElement = (Config) view.getElement();
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Attaque_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getAttaque_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getContainedTypeModelFacetLinks_Attaque_4001(
			Combat container) {
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		for (Iterator<?> links = container.getAttaques().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attaque) {
				continue;
			}
			Attaque link = (Attaque) linkObject;
			if (AttaqueEditPart.VISUAL_ID != NimaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Archetype dst = link.getCible();
			Config src = link.getAttaquant();
			result.add(new NimaLinkDescriptor(src, dst, link,
					NimaElementTypes.Attaque_4001, AttaqueEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getIncomingTypeModelFacetLinks_Attaque_4001(
			Archetype target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != NimaPackage.eINSTANCE
					.getAttaque_Cible()
					|| false == setting.getEObject() instanceof Attaque) {
				continue;
			}
			Attaque link = (Attaque) setting.getEObject();
			if (AttaqueEditPart.VISUAL_ID != NimaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Config src = link.getAttaquant();
			result.add(new NimaLinkDescriptor(src, target, link,
					NimaElementTypes.Attaque_4001, AttaqueEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getOutgoingTypeModelFacetLinks_Attaque_4001(
			Config source) {
		Combat container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Combat) {
				container = (Combat) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		for (Iterator<?> links = container.getAttaques().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Attaque) {
				continue;
			}
			Attaque link = (Attaque) linkObject;
			if (AttaqueEditPart.VISUAL_ID != NimaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Archetype dst = link.getCible();
			Config src = link.getAttaquant();
			if (src != source) {
				continue;
			}
			result.add(new NimaLinkDescriptor(src, dst, link,
					NimaElementTypes.Attaque_4001, AttaqueEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<NimaNodeDescriptor> getSemanticChildren(View view) {
			return NimaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<NimaLinkDescriptor> getContainedLinks(View view) {
			return NimaDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<NimaLinkDescriptor> getIncomingLinks(View view) {
			return NimaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<NimaLinkDescriptor> getOutgoingLinks(View view) {
			return NimaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
