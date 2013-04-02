package nima.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import nima.Archetype;
import nima.Combat;
import nima.Config;
import nima.NimaPackage;
import nima.diagram.edit.parts.ArchetypeCibleEditPart;
import nima.diagram.edit.parts.ArchetypeEditPart;
import nima.diagram.edit.parts.CombatEditPart;
import nima.diagram.edit.parts.ConfigEditPart;
import nima.diagram.edit.parts.ConfigEnchaineEditPart;
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
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getCombat_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getArchetype_2001ContainedLinks(
			View view) {
		Archetype modelElement = (Archetype) view.getElement();
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Archetype_Cible_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getConfig_3001ContainedLinks(
			View view) {
		Config modelElement = (Config) view.getElement();
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Config_Enchaine_4004(modelElement));
		return result;
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
		result.addAll(getIncomingFeatureModelFacetLinks_Archetype_Cible_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getConfig_3001IncomingLinks(View view) {
		Config modelElement = (Config) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Config_Enchaine_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getArchetype_2001OutgoingLinks(
			View view) {
		Archetype modelElement = (Archetype) view.getElement();
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Archetype_Cible_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<NimaLinkDescriptor> getConfig_3001OutgoingLinks(View view) {
		Config modelElement = (Config) view.getElement();
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Config_Enchaine_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getIncomingFeatureModelFacetLinks_Archetype_Cible_4003(
			Archetype target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == NimaPackage.eINSTANCE
					.getArchetype_Cible()) {
				result.add(new NimaLinkDescriptor(setting.getEObject(), target,
						NimaElementTypes.ArchetypeCible_4003,
						ArchetypeCibleEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getIncomingFeatureModelFacetLinks_Config_Enchaine_4004(
			Config target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == NimaPackage.eINSTANCE
					.getConfig_Enchaine()) {
				result.add(new NimaLinkDescriptor(setting.getEObject(), target,
						NimaElementTypes.ConfigEnchaine_4004,
						ConfigEnchaineEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Archetype_Cible_4003(
			Archetype source) {
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		Archetype destination = source.getCible();
		if (destination == null) {
			return result;
		}
		result.add(new NimaLinkDescriptor(source, destination,
				NimaElementTypes.ArchetypeCible_4003,
				ArchetypeCibleEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<NimaLinkDescriptor> getOutgoingFeatureModelFacetLinks_Config_Enchaine_4004(
			Config source) {
		LinkedList<NimaLinkDescriptor> result = new LinkedList<NimaLinkDescriptor>();
		Config destination = source.getEnchaine();
		if (destination == null) {
			return result;
		}
		result.add(new NimaLinkDescriptor(source, destination,
				NimaElementTypes.ConfigEnchaine_4004,
				ConfigEnchaineEditPart.VISUAL_ID));
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
