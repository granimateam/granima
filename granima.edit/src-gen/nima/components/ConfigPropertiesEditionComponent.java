/**
 * Generated with Acceleo
 */
package nima.components;

// Start of user code for imports
import nima.Archetype;
import nima.Config;
import nima.NimaFactory;
import nima.NimaPackage;
import nima.TypeAttaque;
import nima.TypeDef;
import nima.typeAtt;
import nima.parts.ConfigPropertiesEditionPart;
import nima.parts.NimaViewsRepository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class ConfigPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for owner EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings ownerSettings;
	
	/**
	 * Settings for enchaine EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings enchaineSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ConfigPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject config, String editing_mode) {
		super(editingContext, config, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NimaViewsRepository.class;
		partKey = NimaViewsRepository.Config.class;
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
			final Config config = (Config)elt;
			final ConfigPropertiesEditionPart basePart = (ConfigPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NimaViewsRepository.Config.Properties.init)) {
				basePart.setInit(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), config.getInit()));
			}
			
			if (isAccessible(NimaViewsRepository.Config.Properties.defense)) {
				basePart.setDefense(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), config.getDefense()));
			}
			
			if (isAccessible(NimaViewsRepository.Config.Properties.degats)) {
				basePart.setDegats(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), config.getDegats()));
			}
			
			if (isAccessible(NimaViewsRepository.Config.Properties.typeDegat)) {
				basePart.initTypeDegat((EEnum) NimaPackage.eINSTANCE.getConfig_TypeDegat().getEType(), config.getTypeDegat());
			}
			if (config.getNom() != null && isAccessible(NimaViewsRepository.Config.Properties.nom))
				basePart.setNom(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), config.getNom()));
			
			if (config.getDescription() != null && isAccessible(NimaViewsRepository.Config.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), config.getDescription()));
			
			if (isAccessible(NimaViewsRepository.Config.Properties.owner)) {
				// init part
				ownerSettings = new EObjectFlatComboSettings(config, NimaPackage.eINSTANCE.getConfig_Owner());
				basePart.initOwner(ownerSettings);
				// set the button mode
				basePart.setOwnerButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NimaViewsRepository.Config.Properties.attaque)) {
				basePart.setAttaque(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), config.getAttaque()));
			}
			
			if (isAccessible(NimaViewsRepository.Config.Properties.nbAttaques)) {
				basePart.setNbAttaques(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), config.getNbAttaques()));
			}
			
			if (isAccessible(NimaViewsRepository.Config.Properties.enchaine)) {
				// init part
				enchaineSettings = new EObjectFlatComboSettings(config, NimaPackage.eINSTANCE.getConfig_Enchaine());
				basePart.initEnchaine(enchaineSettings);
				// set the button mode
				basePart.setEnchaineButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NimaViewsRepository.Config.Properties.typeDef)) {
				basePart.initTypeDef((EEnum) NimaPackage.eINSTANCE.getConfig_TypeDef().getEType(), config.getTypeDef());
			}
			if (isAccessible(NimaViewsRepository.Config.Properties.typeAttaque)) {
				basePart.initTypeAttaque((EEnum) NimaPackage.eINSTANCE.getConfig_TypeAttaque().getEType(), config.getTypeAttaque());
			}
			// init filters
			
			
			
			
			
			
			basePart.addFilterToOwner(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof Archetype);
				}
			
			});
			// Start of user code for additional businessfilters for owner
			// End of user code
			
			
			
			basePart.addFilterToEnchaine(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Config); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for enchaine
			// End of user code
			
			
			
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
		if (editorKey == NimaViewsRepository.Config.Properties.init) {
			return NimaPackage.eINSTANCE.getConfig_Init();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.defense) {
			return NimaPackage.eINSTANCE.getConfig_Defense();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.degats) {
			return NimaPackage.eINSTANCE.getConfig_Degats();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.typeDegat) {
			return NimaPackage.eINSTANCE.getConfig_TypeDegat();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.nom) {
			return NimaPackage.eINSTANCE.getConfig_Nom();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.description) {
			return NimaPackage.eINSTANCE.getConfig_Description();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.owner) {
			return NimaPackage.eINSTANCE.getConfig_Owner();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.attaque) {
			return NimaPackage.eINSTANCE.getConfig_Attaque();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.nbAttaques) {
			return NimaPackage.eINSTANCE.getConfig_NbAttaques();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.enchaine) {
			return NimaPackage.eINSTANCE.getConfig_Enchaine();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.typeDef) {
			return NimaPackage.eINSTANCE.getConfig_TypeDef();
		}
		if (editorKey == NimaViewsRepository.Config.Properties.typeAttaque) {
			return NimaPackage.eINSTANCE.getConfig_TypeAttaque();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Config config = (Config)semanticObject;
		if (NimaViewsRepository.Config.Properties.init == event.getAffectedEditor()) {
			config.setInit((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Config.Properties.defense == event.getAffectedEditor()) {
			config.setDefense((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Config.Properties.degats == event.getAffectedEditor()) {
			config.setDegats((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Config.Properties.typeDegat == event.getAffectedEditor()) {
			config.setTypeDegat((typeAtt)event.getNewValue());
		}
		if (NimaViewsRepository.Config.Properties.nom == event.getAffectedEditor()) {
			config.setNom((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NimaViewsRepository.Config.Properties.description == event.getAffectedEditor()) {
			config.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NimaViewsRepository.Config.Properties.owner == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				ownerSettings.setToReference((Archetype)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Archetype eObject = NimaFactory.eINSTANCE.createArchetype();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				ownerSettings.setToReference(eObject);
			}
		}
		if (NimaViewsRepository.Config.Properties.attaque == event.getAffectedEditor()) {
			config.setAttaque((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Config.Properties.nbAttaques == event.getAffectedEditor()) {
			config.setNbAttaques((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Config.Properties.enchaine == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				enchaineSettings.setToReference((Config)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Config eObject = NimaFactory.eINSTANCE.createConfig();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				enchaineSettings.setToReference(eObject);
			}
		}
		if (NimaViewsRepository.Config.Properties.typeDef == event.getAffectedEditor()) {
			config.setTypeDef((TypeDef)event.getNewValue());
		}
		if (NimaViewsRepository.Config.Properties.typeAttaque == event.getAffectedEditor()) {
			config.setTypeAttaque((TypeAttaque)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ConfigPropertiesEditionPart basePart = (ConfigPropertiesEditionPart)editingPart;
			if (NimaPackage.eINSTANCE.getConfig_Init().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.init)) {
				if (msg.getNewValue() != null) {
					basePart.setInit(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setInit("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_Defense().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.defense)) {
				if (msg.getNewValue() != null) {
					basePart.setDefense(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setDefense("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_Degats().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.degats)) {
				if (msg.getNewValue() != null) {
					basePart.setDegats(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setDegats("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_TypeDegat().equals(msg.getFeature()) && isAccessible(NimaViewsRepository.Config.Properties.typeDegat))
				basePart.setTypeDegat((Enumerator)msg.getNewValue());
			
			if (NimaPackage.eINSTANCE.getConfig_Nom().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.nom)) {
				if (msg.getNewValue() != null) {
					basePart.setNom(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setNom("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_Description().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_Owner().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.owner))
				basePart.setOwner((EObject)msg.getNewValue());
			if (NimaPackage.eINSTANCE.getConfig_Attaque().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.attaque)) {
				if (msg.getNewValue() != null) {
					basePart.setAttaque(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setAttaque("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_NbAttaques().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.nbAttaques)) {
				if (msg.getNewValue() != null) {
					basePart.setNbAttaques(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setNbAttaques("");
				}
			}
			if (NimaPackage.eINSTANCE.getConfig_Enchaine().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Config.Properties.enchaine))
				basePart.setEnchaine((EObject)msg.getNewValue());
			if (NimaPackage.eINSTANCE.getConfig_TypeDef().equals(msg.getFeature()) && isAccessible(NimaViewsRepository.Config.Properties.typeDef))
				basePart.setTypeDef((Enumerator)msg.getNewValue());
			
			if (NimaPackage.eINSTANCE.getConfig_TypeAttaque().equals(msg.getFeature()) && isAccessible(NimaViewsRepository.Config.Properties.typeAttaque))
				basePart.setTypeAttaque((Enumerator)msg.getNewValue());
			
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == NimaViewsRepository.Config.Properties.owner;
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
				if (NimaViewsRepository.Config.Properties.init == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_Init().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_Init().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.defense == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_Defense().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_Defense().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.degats == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_Degats().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_Degats().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.typeDegat == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_TypeDegat().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_TypeDegat().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.nom == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_Nom().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_Nom().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_Description().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.attaque == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_Attaque().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_Attaque().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.nbAttaques == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_NbAttaques().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_NbAttaques().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.typeDef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_TypeDef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_TypeDef().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Config.Properties.typeAttaque == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getConfig_TypeAttaque().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getConfig_TypeAttaque().getEAttributeType(), newValue);
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
