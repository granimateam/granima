/**
 * Generated with Acceleo
 */
package nima.components;

// Start of user code for imports
import nima.Archetype;
import nima.Config;
import nima.NimaFactory;
import nima.NimaPackage;
import nima.TypeDef;
import nima.parts.ArchetypePropertiesEditionPart;
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
public class ArchetypePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for active EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings activeSettings;
	
	/**
	 * Settings for cible EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings cibleSettings;
	
	/**
	 * Settings for current EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings currentSettings;
	
	/**
	 * Settings for contre EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings contreSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ArchetypePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject archetype, String editing_mode) {
		super(editingContext, archetype, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = NimaViewsRepository.class;
		partKey = NimaViewsRepository.Archetype.class;
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
			final Archetype archetype = (Archetype)elt;
			final ArchetypePropertiesEditionPart basePart = (ArchetypePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(NimaViewsRepository.Archetype.Properties.hp)) {
				basePart.setHp(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getHp()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.init)) {
				basePart.setInit(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getInit()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.attaque)) {
				basePart.setAttaque(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getAttaque()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.defense)) {
				basePart.setDefense(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getDefense()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.typeDef)) {
				basePart.initTypeDef((EEnum) NimaPackage.eINSTANCE.getArchetype_TypeDef().getEType(), archetype.getTypeDef());
			}
			if (isAccessible(NimaViewsRepository.Archetype.Properties.rphy)) {
				basePart.setRphy(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getRphy()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.rmys)) {
				basePart.setRmys(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getRmys()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.rpsy)) {
				basePart.setRpsy(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getRpsy()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.perf)) {
				basePart.setPerf(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getPerf()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.tran)) {
				basePart.setTran(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getTran()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.con)) {
				basePart.setCon(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getCon()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.cha)) {
				basePart.setCha(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getCha()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.froid)) {
				basePart.setFroid(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getFroid()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.elec)) {
				basePart.setElec(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getElec()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.ener)) {
				basePart.setEner(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getEner()));
			}
			
			if (archetype.getNom() != null && isAccessible(NimaViewsRepository.Archetype.Properties.nom))
				basePart.setNom(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), archetype.getNom()));
			
			if (archetype.getDescription() != null && isAccessible(NimaViewsRepository.Archetype.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEString(), archetype.getDescription()));
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.active)) {
				// init part
				activeSettings = new EObjectFlatComboSettings(archetype, NimaPackage.eINSTANCE.getArchetype_Active());
				basePart.initActive(activeSettings);
				// set the button mode
				basePart.setActiveButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NimaViewsRepository.Archetype.Properties.nbDef)) {
				basePart.setNbDef(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getNbDef()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.joueur)) {
				basePart.setJoueur(archetype.isJoueur());
			}
			if (isAccessible(NimaViewsRepository.Archetype.Properties.nbAction)) {
				basePart.setNbAction(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getNbAction()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.peutAgir)) {
				basePart.setPeutAgir(archetype.isPeutAgir());
			}
			if (isAccessible(NimaViewsRepository.Archetype.Properties.rolledInit)) {
				basePart.setRolledInit(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getRolledInit()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.cible)) {
				// init part
				cibleSettings = new EObjectFlatComboSettings(archetype, NimaPackage.eINSTANCE.getArchetype_Cible());
				basePart.initCible(cibleSettings);
				// set the button mode
				basePart.setCibleButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NimaViewsRepository.Archetype.Properties.hpMax)) {
				basePart.setHpMax(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getHpMax()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.malusCritTemp)) {
				basePart.setMalusCritTemp(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getMalusCritTemp()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.bonusAtaque)) {
				basePart.setBonusAtaque(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getBonusAtaque()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.bonusDef)) {
				basePart.setBonusDef(EEFConverterUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), archetype.getBonusDef()));
			}
			
			if (isAccessible(NimaViewsRepository.Archetype.Properties.current)) {
				// init part
				currentSettings = new EObjectFlatComboSettings(archetype, NimaPackage.eINSTANCE.getArchetype_Current());
				basePart.initCurrent(currentSettings);
				// set the button mode
				basePart.setCurrentButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(NimaViewsRepository.Archetype.Properties.contre)) {
				// init part
				contreSettings = new EObjectFlatComboSettings(archetype, NimaPackage.eINSTANCE.getArchetype_Contre());
				basePart.initContre(contreSettings);
				// set the button mode
				basePart.setContreButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			basePart.addFilterToActive(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Config); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for active
			// End of user code
			
			
			
			
			
			
			basePart.addFilterToCible(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Archetype); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for cible
			// End of user code
			
			
			
			
			
			basePart.addFilterToCurrent(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Config); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for current
			// End of user code
			
			basePart.addFilterToContre(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Config); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for contre
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
		if (editorKey == NimaViewsRepository.Archetype.Properties.hp) {
			return NimaPackage.eINSTANCE.getArchetype_Hp();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.init) {
			return NimaPackage.eINSTANCE.getArchetype_Init();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.attaque) {
			return NimaPackage.eINSTANCE.getArchetype_Attaque();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.defense) {
			return NimaPackage.eINSTANCE.getArchetype_Defense();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.typeDef) {
			return NimaPackage.eINSTANCE.getArchetype_TypeDef();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.rphy) {
			return NimaPackage.eINSTANCE.getArchetype_Rphy();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.rmys) {
			return NimaPackage.eINSTANCE.getArchetype_Rmys();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.rpsy) {
			return NimaPackage.eINSTANCE.getArchetype_Rpsy();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.perf) {
			return NimaPackage.eINSTANCE.getArchetype_Perf();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.tran) {
			return NimaPackage.eINSTANCE.getArchetype_Tran();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.con) {
			return NimaPackage.eINSTANCE.getArchetype_Con();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.cha) {
			return NimaPackage.eINSTANCE.getArchetype_Cha();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.froid) {
			return NimaPackage.eINSTANCE.getArchetype_Froid();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.elec) {
			return NimaPackage.eINSTANCE.getArchetype_Elec();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.ener) {
			return NimaPackage.eINSTANCE.getArchetype_Ener();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.nom) {
			return NimaPackage.eINSTANCE.getArchetype_Nom();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.description) {
			return NimaPackage.eINSTANCE.getArchetype_Description();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.active) {
			return NimaPackage.eINSTANCE.getArchetype_Active();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.nbDef) {
			return NimaPackage.eINSTANCE.getArchetype_NbDef();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.joueur) {
			return NimaPackage.eINSTANCE.getArchetype_Joueur();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.nbAction) {
			return NimaPackage.eINSTANCE.getArchetype_NbAction();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.peutAgir) {
			return NimaPackage.eINSTANCE.getArchetype_PeutAgir();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.rolledInit) {
			return NimaPackage.eINSTANCE.getArchetype_RolledInit();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.cible) {
			return NimaPackage.eINSTANCE.getArchetype_Cible();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.hpMax) {
			return NimaPackage.eINSTANCE.getArchetype_HpMax();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.malusCritTemp) {
			return NimaPackage.eINSTANCE.getArchetype_MalusCritTemp();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.bonusAtaque) {
			return NimaPackage.eINSTANCE.getArchetype_BonusAtaque();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.bonusDef) {
			return NimaPackage.eINSTANCE.getArchetype_BonusDef();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.current) {
			return NimaPackage.eINSTANCE.getArchetype_Current();
		}
		if (editorKey == NimaViewsRepository.Archetype.Properties.contre) {
			return NimaPackage.eINSTANCE.getArchetype_Contre();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Archetype archetype = (Archetype)semanticObject;
		if (NimaViewsRepository.Archetype.Properties.hp == event.getAffectedEditor()) {
			archetype.setHp((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.init == event.getAffectedEditor()) {
			archetype.setInit((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.attaque == event.getAffectedEditor()) {
			archetype.setAttaque((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.defense == event.getAffectedEditor()) {
			archetype.setDefense((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.typeDef == event.getAffectedEditor()) {
			archetype.setTypeDef((TypeDef)event.getNewValue());
		}
		if (NimaViewsRepository.Archetype.Properties.rphy == event.getAffectedEditor()) {
			archetype.setRphy((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.rmys == event.getAffectedEditor()) {
			archetype.setRmys((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.rpsy == event.getAffectedEditor()) {
			archetype.setRpsy((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.perf == event.getAffectedEditor()) {
			archetype.setPerf((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.tran == event.getAffectedEditor()) {
			archetype.setTran((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.con == event.getAffectedEditor()) {
			archetype.setCon((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.cha == event.getAffectedEditor()) {
			archetype.setCha((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.froid == event.getAffectedEditor()) {
			archetype.setFroid((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.elec == event.getAffectedEditor()) {
			archetype.setElec((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.ener == event.getAffectedEditor()) {
			archetype.setEner((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.nom == event.getAffectedEditor()) {
			archetype.setNom((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NimaViewsRepository.Archetype.Properties.description == event.getAffectedEditor()) {
			archetype.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.eINSTANCE.getEString(), (String)event.getNewValue()));
		}
		if (NimaViewsRepository.Archetype.Properties.active == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				activeSettings.setToReference((Config)event.getNewValue());
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
				activeSettings.setToReference(eObject);
			}
		}
		if (NimaViewsRepository.Archetype.Properties.nbDef == event.getAffectedEditor()) {
			archetype.setNbDef((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.joueur == event.getAffectedEditor()) {
			archetype.setJoueur((Boolean)event.getNewValue());
		}
		if (NimaViewsRepository.Archetype.Properties.nbAction == event.getAffectedEditor()) {
			archetype.setNbAction((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.peutAgir == event.getAffectedEditor()) {
			archetype.setPeutAgir((Boolean)event.getNewValue());
		}
		if (NimaViewsRepository.Archetype.Properties.rolledInit == event.getAffectedEditor()) {
			archetype.setRolledInit((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.cible == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				cibleSettings.setToReference((Archetype)event.getNewValue());
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
				cibleSettings.setToReference(eObject);
			}
		}
		if (NimaViewsRepository.Archetype.Properties.hpMax == event.getAffectedEditor()) {
			archetype.setHpMax((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.malusCritTemp == event.getAffectedEditor()) {
			archetype.setMalusCritTemp((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.bonusAtaque == event.getAffectedEditor()) {
			archetype.setBonusAtaque((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.bonusDef == event.getAffectedEditor()) {
			archetype.setBonusDef((EEFConverterUtil.createIntFromString(EcorePackage.eINSTANCE.getEInt(), (String)event.getNewValue())));
		}
		if (NimaViewsRepository.Archetype.Properties.current == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				currentSettings.setToReference((Config)event.getNewValue());
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
				currentSettings.setToReference(eObject);
			}
		}
		if (NimaViewsRepository.Archetype.Properties.contre == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				contreSettings.setToReference((Config)event.getNewValue());
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
				contreSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ArchetypePropertiesEditionPart basePart = (ArchetypePropertiesEditionPart)editingPart;
			if (NimaPackage.eINSTANCE.getArchetype_Hp().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.hp)) {
				if (msg.getNewValue() != null) {
					basePart.setHp(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setHp("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Init().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.init)) {
				if (msg.getNewValue() != null) {
					basePart.setInit(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setInit("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Attaque().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.attaque)) {
				if (msg.getNewValue() != null) {
					basePart.setAttaque(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setAttaque("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Defense().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.defense)) {
				if (msg.getNewValue() != null) {
					basePart.setDefense(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setDefense("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_TypeDef().equals(msg.getFeature()) && isAccessible(NimaViewsRepository.Archetype.Properties.typeDef))
				basePart.setTypeDef((Enumerator)msg.getNewValue());
			
			if (NimaPackage.eINSTANCE.getArchetype_Rphy().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.rphy)) {
				if (msg.getNewValue() != null) {
					basePart.setRphy(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setRphy("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Rmys().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.rmys)) {
				if (msg.getNewValue() != null) {
					basePart.setRmys(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setRmys("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Rpsy().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.rpsy)) {
				if (msg.getNewValue() != null) {
					basePart.setRpsy(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setRpsy("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Perf().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.perf)) {
				if (msg.getNewValue() != null) {
					basePart.setPerf(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setPerf("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Tran().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.tran)) {
				if (msg.getNewValue() != null) {
					basePart.setTran(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setTran("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Con().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.con)) {
				if (msg.getNewValue() != null) {
					basePart.setCon(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setCon("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Cha().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.cha)) {
				if (msg.getNewValue() != null) {
					basePart.setCha(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setCha("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Froid().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.froid)) {
				if (msg.getNewValue() != null) {
					basePart.setFroid(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setFroid("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Elec().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.elec)) {
				if (msg.getNewValue() != null) {
					basePart.setElec(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setElec("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Ener().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.ener)) {
				if (msg.getNewValue() != null) {
					basePart.setEner(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setEner("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Nom().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.nom)) {
				if (msg.getNewValue() != null) {
					basePart.setNom(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setNom("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Description().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Active().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.active))
				basePart.setActive((EObject)msg.getNewValue());
			if (NimaPackage.eINSTANCE.getArchetype_NbDef().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.nbDef)) {
				if (msg.getNewValue() != null) {
					basePart.setNbDef(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setNbDef("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Joueur().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.joueur))
				basePart.setJoueur((Boolean)msg.getNewValue());
			
			if (NimaPackage.eINSTANCE.getArchetype_NbAction().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.nbAction)) {
				if (msg.getNewValue() != null) {
					basePart.setNbAction(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setNbAction("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_PeutAgir().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.peutAgir))
				basePart.setPeutAgir((Boolean)msg.getNewValue());
			
			if (NimaPackage.eINSTANCE.getArchetype_RolledInit().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.rolledInit)) {
				if (msg.getNewValue() != null) {
					basePart.setRolledInit(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setRolledInit("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Cible().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.cible))
				basePart.setCible((EObject)msg.getNewValue());
			if (NimaPackage.eINSTANCE.getArchetype_HpMax().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.hpMax)) {
				if (msg.getNewValue() != null) {
					basePart.setHpMax(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setHpMax("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_MalusCritTemp().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.malusCritTemp)) {
				if (msg.getNewValue() != null) {
					basePart.setMalusCritTemp(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setMalusCritTemp("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_BonusAtaque().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.bonusAtaque)) {
				if (msg.getNewValue() != null) {
					basePart.setBonusAtaque(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setBonusAtaque("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_BonusDef().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.bonusDef)) {
				if (msg.getNewValue() != null) {
					basePart.setBonusDef(EcoreUtil.convertToString(EcorePackage.eINSTANCE.getEInt(), msg.getNewValue()));
				} else {
					basePart.setBonusDef("");
				}
			}
			if (NimaPackage.eINSTANCE.getArchetype_Current().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.current))
				basePart.setCurrent((EObject)msg.getNewValue());
			if (NimaPackage.eINSTANCE.getArchetype_Contre().equals(msg.getFeature()) && basePart != null && isAccessible(NimaViewsRepository.Archetype.Properties.contre))
				basePart.setContre((EObject)msg.getNewValue());
			
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
				if (NimaViewsRepository.Archetype.Properties.hp == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Hp().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Hp().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.init == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Init().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Init().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.attaque == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Attaque().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Attaque().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.defense == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Defense().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Defense().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.typeDef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_TypeDef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_TypeDef().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.rphy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Rphy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Rphy().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.rmys == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Rmys().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Rmys().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.rpsy == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Rpsy().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Rpsy().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.perf == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Perf().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Perf().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.tran == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Tran().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Tran().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.con == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Con().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Con().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.cha == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Cha().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Cha().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.froid == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Froid().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Froid().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.elec == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Elec().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Elec().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.ener == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Ener().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Ener().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.nom == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Nom().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Nom().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Description().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.nbDef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_NbDef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_NbDef().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.joueur == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_Joueur().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_Joueur().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.nbAction == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_NbAction().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_NbAction().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.peutAgir == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_PeutAgir().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_PeutAgir().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.rolledInit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_RolledInit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_RolledInit().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.hpMax == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_HpMax().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_HpMax().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.malusCritTemp == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_MalusCritTemp().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_MalusCritTemp().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.bonusAtaque == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_BonusAtaque().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_BonusAtaque().getEAttributeType(), newValue);
				}
				if (NimaViewsRepository.Archetype.Properties.bonusDef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(NimaPackage.eINSTANCE.getArchetype_BonusDef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(NimaPackage.eINSTANCE.getArchetype_BonusDef().getEAttributeType(), newValue);
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
