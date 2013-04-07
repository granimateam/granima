/**
 * Generated with Acceleo
 */
package nima.components;

// Start of user code for imports
import nima.Combat;
import nima.NimaPackage;
import nima.parts.CombatPropertiesEditionPart;
import nima.parts.NimaViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;


// End of user code

/**
 * 
 * 
 */
public class CombatPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CombatPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject combat, String editing_mode) {
		super(editingContext, combat, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NimaViewsRepository.class;
		partKey = NimaViewsRepository.Combat.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final Combat combat = (Combat)elt;
			final CombatPropertiesEditionPart basePart = (CombatPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NimaViewsRepository.Combat.Properties.nbRound)) {
				basePart.setNbRound(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), combat.getNbRound()));
			}
			
			// init filters
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}




	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == NimaViewsRepository.Combat.Properties.nbRound) {
			return NimaPackage.eINSTANCE.getCombat_NbRound();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Combat combat = (Combat)semanticObject;
		if (NimaViewsRepository.Combat.Properties.nbRound == event.getAffectedEditor()) {
			combat.setNbRound((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CombatPropertiesEditionPart basePart = (CombatPropertiesEditionPart)editingPart;
			if (NimaPackage.eINSTANCE.getCombat_NbRound().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Combat.Properties.nbRound)) {
				if (msg.getNewValue() != null) {
					basePart.setNbRound(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setNbRound("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (NimaViewsRepository.Combat.Properties.nbRound == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getCombat_NbRound().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getCombat_NbRound().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
