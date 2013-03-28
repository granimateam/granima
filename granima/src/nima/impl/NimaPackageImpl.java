/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import nima.Archetype;
import nima.Attaque;
import nima.Combat;
import nima.Config;
import nima.ConfigAoe;
import nima.ConfigCac;
import nima.ConfigLance;
import nima.ConfigTir;
import nima.DualHandConfig;
import nima.NimaFactory;
import nima.NimaPackage;
import nima.TypeDef;
import nima.Univers;
import nima.typeAtt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NimaPackageImpl extends EPackageImpl implements NimaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archetypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualHandConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configCacEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configLanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configTirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configAoeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attaqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeDefEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeAttEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nima.NimaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NimaPackageImpl() {
		super(eNS_URI, NimaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NimaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NimaPackage init() {
		if (isInited) return (NimaPackage)EPackage.Registry.INSTANCE.getEPackage(NimaPackage.eNS_URI);

		// Obtain or create and register package
		NimaPackageImpl theNimaPackage = (NimaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NimaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NimaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNimaPackage.createPackageContents();

		// Initialize created meta-data
		theNimaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNimaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NimaPackage.eNS_URI, theNimaPackage);
		return theNimaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchetype() {
		return archetypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Hp() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetype_Configs() {
		return (EReference)archetypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Init() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Attaque() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Defense() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_TypeDef() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Rphy() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Rmys() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Rpsy() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Perf() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Tran() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Con() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Cha() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Froid() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Elec() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Ener() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Nom() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Description() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchetype_Active() {
		return (EReference)archetypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_NbDef() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_Joueur() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_NbAction() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_PeutAgir() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchetype_RolledInit() {
		return (EAttribute)archetypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfig() {
		return configEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Init() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Defense() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Degats() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_TypeDegat() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Nom() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Description() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfig_Attaque() {
		return (EAttribute)configEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Attack() {
		return (EReference)configEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfig_Owner() {
		return (EReference)configEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDualHandConfig() {
		return dualHandConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualHandConfig_InitGauche() {
		return (EAttribute)dualHandConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualHandConfig_AttaqueGauche() {
		return (EAttribute)dualHandConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualHandConfig_DefGauche() {
		return (EAttribute)dualHandConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualHandConfig_DegatsGauche() {
		return (EAttribute)dualHandConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDualHandConfig_TypeDegatGuche() {
		return (EAttribute)dualHandConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigCac() {
		return configCacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigLance() {
		return configLanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigTir() {
		return configTirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigAoe() {
		return configAoeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigAoe_Rayon() {
		return (EAttribute)configAoeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnivers() {
		return universEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivers_Archetypes() {
		return (EReference)universEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnivers_Combats() {
		return (EReference)universEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombat() {
		return combatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombat_Archetypes() {
		return (EReference)combatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombat_Attaques() {
		return (EReference)combatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombat_NbRound() {
		return (EAttribute)combatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttaque() {
		return attaqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttaque_Cible() {
		return (EReference)attaqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttaque_BonusAtt() {
		return (EAttribute)attaqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttaque_Attaquant() {
		return (EReference)attaqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttaque_BonusDef() {
		return (EAttribute)attaqueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeDef() {
		return typeDefEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum gettypeAtt() {
		return typeAttEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NimaFactory getNimaFactory() {
		return (NimaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		archetypeEClass = createEClass(ARCHETYPE);
		createEAttribute(archetypeEClass, ARCHETYPE__HP);
		createEReference(archetypeEClass, ARCHETYPE__CONFIGS);
		createEAttribute(archetypeEClass, ARCHETYPE__INIT);
		createEAttribute(archetypeEClass, ARCHETYPE__ATTAQUE);
		createEAttribute(archetypeEClass, ARCHETYPE__DEFENSE);
		createEAttribute(archetypeEClass, ARCHETYPE__TYPE_DEF);
		createEAttribute(archetypeEClass, ARCHETYPE__RPHY);
		createEAttribute(archetypeEClass, ARCHETYPE__RMYS);
		createEAttribute(archetypeEClass, ARCHETYPE__RPSY);
		createEAttribute(archetypeEClass, ARCHETYPE__PERF);
		createEAttribute(archetypeEClass, ARCHETYPE__TRAN);
		createEAttribute(archetypeEClass, ARCHETYPE__CON);
		createEAttribute(archetypeEClass, ARCHETYPE__CHA);
		createEAttribute(archetypeEClass, ARCHETYPE__FROID);
		createEAttribute(archetypeEClass, ARCHETYPE__ELEC);
		createEAttribute(archetypeEClass, ARCHETYPE__ENER);
		createEAttribute(archetypeEClass, ARCHETYPE__NOM);
		createEAttribute(archetypeEClass, ARCHETYPE__DESCRIPTION);
		createEReference(archetypeEClass, ARCHETYPE__ACTIVE);
		createEAttribute(archetypeEClass, ARCHETYPE__NB_DEF);
		createEAttribute(archetypeEClass, ARCHETYPE__JOUEUR);
		createEAttribute(archetypeEClass, ARCHETYPE__NB_ACTION);
		createEAttribute(archetypeEClass, ARCHETYPE__PEUT_AGIR);
		createEAttribute(archetypeEClass, ARCHETYPE__ROLLED_INIT);

		configEClass = createEClass(CONFIG);
		createEAttribute(configEClass, CONFIG__INIT);
		createEAttribute(configEClass, CONFIG__DEFENSE);
		createEAttribute(configEClass, CONFIG__DEGATS);
		createEAttribute(configEClass, CONFIG__TYPE_DEGAT);
		createEAttribute(configEClass, CONFIG__NOM);
		createEAttribute(configEClass, CONFIG__DESCRIPTION);
		createEReference(configEClass, CONFIG__OWNER);
		createEAttribute(configEClass, CONFIG__ATTAQUE);
		createEReference(configEClass, CONFIG__ATTACK);

		dualHandConfigEClass = createEClass(DUAL_HAND_CONFIG);
		createEAttribute(dualHandConfigEClass, DUAL_HAND_CONFIG__INIT_GAUCHE);
		createEAttribute(dualHandConfigEClass, DUAL_HAND_CONFIG__ATTAQUE_GAUCHE);
		createEAttribute(dualHandConfigEClass, DUAL_HAND_CONFIG__DEF_GAUCHE);
		createEAttribute(dualHandConfigEClass, DUAL_HAND_CONFIG__DEGATS_GAUCHE);
		createEAttribute(dualHandConfigEClass, DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE);

		configCacEClass = createEClass(CONFIG_CAC);

		configLanceEClass = createEClass(CONFIG_LANCE);

		configTirEClass = createEClass(CONFIG_TIR);

		configAoeEClass = createEClass(CONFIG_AOE);
		createEAttribute(configAoeEClass, CONFIG_AOE__RAYON);

		universEClass = createEClass(UNIVERS);
		createEReference(universEClass, UNIVERS__ARCHETYPES);
		createEReference(universEClass, UNIVERS__COMBATS);

		combatEClass = createEClass(COMBAT);
		createEReference(combatEClass, COMBAT__ARCHETYPES);
		createEReference(combatEClass, COMBAT__ATTAQUES);
		createEAttribute(combatEClass, COMBAT__NB_ROUND);

		attaqueEClass = createEClass(ATTAQUE);
		createEReference(attaqueEClass, ATTAQUE__CIBLE);
		createEAttribute(attaqueEClass, ATTAQUE__BONUS_ATT);
		createEReference(attaqueEClass, ATTAQUE__ATTAQUANT);
		createEAttribute(attaqueEClass, ATTAQUE__BONUS_DEF);

		// Create enums
		typeDefEEnum = createEEnum(TYPE_DEF);
		typeAttEEnum = createEEnum(TYPE_ATT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dualHandConfigEClass.getESuperTypes().add(this.getConfigCac());
		configCacEClass.getESuperTypes().add(this.getConfig());
		configLanceEClass.getESuperTypes().add(this.getConfig());
		configTirEClass.getESuperTypes().add(this.getConfig());
		configAoeEClass.getESuperTypes().add(this.getConfig());

		// Initialize classes and features; add operations and parameters
		initEClass(archetypeEClass, Archetype.class, "Archetype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchetype_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchetype_Configs(), this.getConfig(), this.getConfig_Owner(), "configs", null, 0, -1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Init(), ecorePackage.getEInt(), "init", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Attaque(), ecorePackage.getEInt(), "attaque", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Defense(), ecorePackage.getEInt(), "defense", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_TypeDef(), this.getTypeDef(), "typeDef", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Rphy(), ecorePackage.getEInt(), "rphy", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Rmys(), ecorePackage.getEInt(), "rmys", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Rpsy(), ecorePackage.getEInt(), "rpsy", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Perf(), ecorePackage.getEInt(), "perf", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Tran(), ecorePackage.getEInt(), "tran", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Con(), ecorePackage.getEInt(), "con", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Cha(), ecorePackage.getEInt(), "cha", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Froid(), ecorePackage.getEInt(), "froid", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Elec(), ecorePackage.getEInt(), "elec", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Ener(), ecorePackage.getEInt(), "ener", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Description(), ecorePackage.getEString(), "description", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchetype_Active(), this.getConfig(), null, "active", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_NbDef(), ecorePackage.getEInt(), "nbDef", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_Joueur(), ecorePackage.getEBoolean(), "joueur", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_NbAction(), ecorePackage.getEInt(), "nbAction", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_PeutAgir(), ecorePackage.getEBoolean(), "peutAgir", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArchetype_RolledInit(), ecorePackage.getEInt(), "rolledInit", null, 0, 1, Archetype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(archetypeEClass, ecorePackage.getEInt(), "getIP", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.gettypeAtt(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(archetypeEClass, null, "resetRound", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(configEClass, Config.class, "Config", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfig_Init(), ecorePackage.getEInt(), "init", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Defense(), ecorePackage.getEInt(), "defense", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Degats(), ecorePackage.getEInt(), "degats", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_TypeDegat(), this.gettypeAtt(), "typeDegat", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Description(), ecorePackage.getEString(), "description", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Owner(), this.getArchetype(), this.getArchetype_Configs(), "owner", null, 1, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfig_Attaque(), ecorePackage.getEInt(), "attaque", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfig_Attack(), this.getAttaque(), this.getAttaque_Attaquant(), "attack", null, 0, 1, Config.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dualHandConfigEClass, DualHandConfig.class, "DualHandConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDualHandConfig_InitGauche(), ecorePackage.getEInt(), "initGauche", null, 0, 1, DualHandConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDualHandConfig_AttaqueGauche(), ecorePackage.getEInt(), "attaqueGauche", null, 0, 1, DualHandConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDualHandConfig_DefGauche(), ecorePackage.getEInt(), "defGauche", null, 0, 1, DualHandConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDualHandConfig_DegatsGauche(), ecorePackage.getEInt(), "degatsGauche", null, 0, 1, DualHandConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDualHandConfig_TypeDegatGuche(), this.gettypeAtt(), "typeDegatGuche", null, 0, 1, DualHandConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configCacEClass, ConfigCac.class, "ConfigCac", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configLanceEClass, ConfigLance.class, "ConfigLance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configTirEClass, ConfigTir.class, "ConfigTir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configAoeEClass, ConfigAoe.class, "ConfigAoe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigAoe_Rayon(), ecorePackage.getEInt(), "rayon", null, 0, 1, ConfigAoe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universEClass, Univers.class, "Univers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnivers_Archetypes(), this.getArchetype(), null, "archetypes", null, 0, -1, Univers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnivers_Combats(), this.getCombat(), null, "combats", null, 0, -1, Univers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(combatEClass, Combat.class, "Combat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombat_Archetypes(), this.getArchetype(), null, "archetypes", null, 0, -1, Combat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCombat_Attaques(), this.getAttaque(), null, "attaques", null, 0, -1, Combat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCombat_NbRound(), ecorePackage.getEInt(), "nbRound", null, 0, 1, Combat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(combatEClass, null, "resetRound", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(combatEClass, null, "resetAndRun", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attaqueEClass, Attaque.class, "Attaque", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttaque_Cible(), this.getArchetype(), null, "cible", null, 1, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttaque_BonusAtt(), ecorePackage.getEInt(), "bonusAtt", null, 0, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttaque_Attaquant(), this.getConfig(), this.getConfig_Attack(), "attaquant", null, 1, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttaque_BonusDef(), ecorePackage.getEInt(), "bonusDef", null, 0, 1, Attaque.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(attaqueEClass, null, "resolve", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeDefEEnum, TypeDef.class, "TypeDef");
		addEEnumLiteral(typeDefEEnum, TypeDef.ESQUIVE);
		addEEnumLiteral(typeDefEEnum, TypeDef.PARADE);
		addEEnumLiteral(typeDefEEnum, TypeDef.BOUCLIER);
		addEEnumLiteral(typeDefEEnum, TypeDef.ENCAISSEMENT);

		initEEnum(typeAttEEnum, typeAtt.class, "typeAtt");
		addEEnumLiteral(typeAttEEnum, typeAtt.TRANCHANT);
		addEEnumLiteral(typeAttEEnum, typeAtt.CONTONDANT);
		addEEnumLiteral(typeAttEEnum, typeAtt.PERFORANT);
		addEEnumLiteral(typeAttEEnum, typeAtt.CHALEUR);
		addEEnumLiteral(typeAttEEnum, typeAtt.FROID);
		addEEnumLiteral(typeAttEEnum, typeAtt.ELECTRICITE);
		addEEnumLiteral(typeAttEEnum, typeAtt.ENERGIE);

		// Create resource
		createResource(eNS_URI);
	}

} //NimaPackageImpl
