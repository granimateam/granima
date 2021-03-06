package nima.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import nima.NimaPackage;
import nima.diagram.edit.parts.ArchetypeCibleEditPart;
import nima.diagram.edit.parts.ArchetypeEditPart;
import nima.diagram.edit.parts.CombatEditPart;
import nima.diagram.edit.parts.ConfigEditPart;
import nima.diagram.edit.parts.ConfigEnchaineEditPart;
import nima.diagram.part.NimaDiagramEditorPlugin;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class NimaElementTypes {

	/**
	 * @generated
	 */
	private NimaElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Combat_1000 = getElementType("granima.diagram.Combat_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Archetype_2001 = getElementType("granima.diagram.Archetype_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Config_3001 = getElementType("granima.diagram.Config_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchetypeCible_4003 = getElementType("granima.diagram.ArchetypeCible_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConfigEnchaine_4004 = getElementType("granima.diagram.ConfigEnchaine_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return NimaDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Combat_1000, NimaPackage.eINSTANCE.getCombat());

			elements.put(Archetype_2001, NimaPackage.eINSTANCE.getArchetype());

			elements.put(Config_3001, NimaPackage.eINSTANCE.getConfig());

			elements.put(ArchetypeCible_4003,
					NimaPackage.eINSTANCE.getArchetype_Cible());

			elements.put(ConfigEnchaine_4004,
					NimaPackage.eINSTANCE.getConfig_Enchaine());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Combat_1000);
			KNOWN_ELEMENT_TYPES.add(Archetype_2001);
			KNOWN_ELEMENT_TYPES.add(Config_3001);
			KNOWN_ELEMENT_TYPES.add(ArchetypeCible_4003);
			KNOWN_ELEMENT_TYPES.add(ConfigEnchaine_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CombatEditPart.VISUAL_ID:
			return Combat_1000;
		case ArchetypeEditPart.VISUAL_ID:
			return Archetype_2001;
		case ConfigEditPart.VISUAL_ID:
			return Config_3001;
		case ArchetypeCibleEditPart.VISUAL_ID:
			return ArchetypeCible_4003;
		case ConfigEnchaineEditPart.VISUAL_ID:
			return ConfigEnchaine_4004;
		}
		return null;
	}

}
