/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nima.NimaFactory
 * @model kind="package"
 * @generated
 */
public interface NimaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nima";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nima/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nima";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NimaPackage eINSTANCE = nima.impl.NimaPackageImpl.init();

	/**
	 * The meta object id for the '{@link nima.impl.ArchetypeImpl <em>Archetype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.ArchetypeImpl
	 * @see nima.impl.NimaPackageImpl#getArchetype()
	 * @generated
	 */
	int ARCHETYPE = 0;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__HP = 0;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CONFIGS = 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__INIT = 2;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ATTAQUE = 3;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__DEFENSE = 4;

	/**
	 * The feature id for the '<em><b>Type Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__TYPE_DEF = 5;

	/**
	 * The feature id for the '<em><b>Rphy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RPHY = 6;

	/**
	 * The feature id for the '<em><b>Rmys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RMYS = 7;

	/**
	 * The feature id for the '<em><b>Rpsy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__RPSY = 8;

	/**
	 * The feature id for the '<em><b>Perf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__PERF = 9;

	/**
	 * The feature id for the '<em><b>Tran</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__TRAN = 10;

	/**
	 * The feature id for the '<em><b>Con</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CON = 11;

	/**
	 * The feature id for the '<em><b>Cha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CHA = 12;

	/**
	 * The feature id for the '<em><b>Froid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__FROID = 13;

	/**
	 * The feature id for the '<em><b>Elec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ELEC = 14;

	/**
	 * The feature id for the '<em><b>Ener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ENER = 15;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__NOM = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__DESCRIPTION = 17;

	/**
	 * The feature id for the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ACTIVE = 18;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__EREFERENCE0 = 19;

	/**
	 * The feature id for the '<em><b>Nb Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__NB_DEF = 20;

	/**
	 * The feature id for the '<em><b>Joueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__JOUEUR = 21;

	/**
	 * The number of structural features of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link nima.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.ConfigImpl
	 * @see nima.impl.NimaPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__INIT = 0;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DEFENSE = 1;

	/**
	 * The feature id for the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DEGATS = 2;

	/**
	 * The feature id for the '<em><b>Type Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__TYPE_DEGAT = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NOM = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__OWNER = 6;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ATTAQUE = 7;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link nima.impl.ConfigCacImpl <em>Config Cac</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.ConfigCacImpl
	 * @see nima.impl.NimaPackageImpl#getConfigCac()
	 * @generated
	 */
	int CONFIG_CAC = 3;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__INIT = CONFIG__INIT;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__DEFENSE = CONFIG__DEFENSE;

	/**
	 * The feature id for the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__DEGATS = CONFIG__DEGATS;

	/**
	 * The feature id for the '<em><b>Type Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__TYPE_DEGAT = CONFIG__TYPE_DEGAT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__NOM = CONFIG__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__DESCRIPTION = CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__OWNER = CONFIG__OWNER;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC__ATTAQUE = CONFIG__ATTAQUE;

	/**
	 * The number of structural features of the '<em>Config Cac</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_CAC_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nima.impl.DualHandConfigImpl <em>Dual Hand Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.DualHandConfigImpl
	 * @see nima.impl.NimaPackageImpl#getDualHandConfig()
	 * @generated
	 */
	int DUAL_HAND_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__INIT = CONFIG_CAC__INIT;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__DEFENSE = CONFIG_CAC__DEFENSE;

	/**
	 * The feature id for the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__DEGATS = CONFIG_CAC__DEGATS;

	/**
	 * The feature id for the '<em><b>Type Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__TYPE_DEGAT = CONFIG_CAC__TYPE_DEGAT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__NOM = CONFIG_CAC__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__DESCRIPTION = CONFIG_CAC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__OWNER = CONFIG_CAC__OWNER;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__ATTAQUE = CONFIG_CAC__ATTAQUE;

	/**
	 * The feature id for the '<em><b>Init Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__INIT_GAUCHE = CONFIG_CAC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attaque Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__ATTAQUE_GAUCHE = CONFIG_CAC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Def Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__DEF_GAUCHE = CONFIG_CAC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Degats Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__DEGATS_GAUCHE = CONFIG_CAC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Degat Guche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE = CONFIG_CAC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dual Hand Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_HAND_CONFIG_FEATURE_COUNT = CONFIG_CAC_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link nima.impl.ConfigLanceImpl <em>Config Lance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.ConfigLanceImpl
	 * @see nima.impl.NimaPackageImpl#getConfigLance()
	 * @generated
	 */
	int CONFIG_LANCE = 4;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__INIT = CONFIG__INIT;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__DEFENSE = CONFIG__DEFENSE;

	/**
	 * The feature id for the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__DEGATS = CONFIG__DEGATS;

	/**
	 * The feature id for the '<em><b>Type Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__TYPE_DEGAT = CONFIG__TYPE_DEGAT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__NOM = CONFIG__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__DESCRIPTION = CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__OWNER = CONFIG__OWNER;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE__ATTAQUE = CONFIG__ATTAQUE;

	/**
	 * The number of structural features of the '<em>Config Lance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_LANCE_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nima.impl.ConfigTirImpl <em>Config Tir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.ConfigTirImpl
	 * @see nima.impl.NimaPackageImpl#getConfigTir()
	 * @generated
	 */
	int CONFIG_TIR = 5;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__INIT = CONFIG__INIT;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__DEFENSE = CONFIG__DEFENSE;

	/**
	 * The feature id for the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__DEGATS = CONFIG__DEGATS;

	/**
	 * The feature id for the '<em><b>Type Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__TYPE_DEGAT = CONFIG__TYPE_DEGAT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__NOM = CONFIG__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__DESCRIPTION = CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__OWNER = CONFIG__OWNER;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR__ATTAQUE = CONFIG__ATTAQUE;

	/**
	 * The number of structural features of the '<em>Config Tir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_TIR_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link nima.impl.ConfigAoeImpl <em>Config Aoe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.ConfigAoeImpl
	 * @see nima.impl.NimaPackageImpl#getConfigAoe()
	 * @generated
	 */
	int CONFIG_AOE = 6;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__INIT = CONFIG__INIT;

	/**
	 * The feature id for the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__DEFENSE = CONFIG__DEFENSE;

	/**
	 * The feature id for the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__DEGATS = CONFIG__DEGATS;

	/**
	 * The feature id for the '<em><b>Type Degat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__TYPE_DEGAT = CONFIG__TYPE_DEGAT;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__NOM = CONFIG__NOM;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__DESCRIPTION = CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__OWNER = CONFIG__OWNER;

	/**
	 * The feature id for the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__ATTAQUE = CONFIG__ATTAQUE;

	/**
	 * The feature id for the '<em><b>Rayon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE__RAYON = CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config Aoe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_AOE_FEATURE_COUNT = CONFIG_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link nima.impl.UniversImpl <em>Univers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.UniversImpl
	 * @see nima.impl.NimaPackageImpl#getUnivers()
	 * @generated
	 */
	int UNIVERS = 7;

	/**
	 * The feature id for the '<em><b>Archetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERS__ARCHETYPES = 0;

	/**
	 * The feature id for the '<em><b>Combats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERS__COMBATS = 1;

	/**
	 * The number of structural features of the '<em>Univers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nima.impl.CombatImpl <em>Combat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.CombatImpl
	 * @see nima.impl.NimaPackageImpl#getCombat()
	 * @generated
	 */
	int COMBAT = 8;

	/**
	 * The feature id for the '<em><b>Archetypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBAT__ARCHETYPES = 0;

	/**
	 * The feature id for the '<em><b>Attaques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBAT__ATTAQUES = 1;

	/**
	 * The number of structural features of the '<em>Combat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBAT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link nima.impl.AttaqueImpl <em>Attaque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.AttaqueImpl
	 * @see nima.impl.NimaPackageImpl#getAttaque()
	 * @generated
	 */
	int ATTAQUE = 9;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__CIBLE = 0;

	/**
	 * The feature id for the '<em><b>Bonus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__BONUS = 1;

	/**
	 * The feature id for the '<em><b>Attaquant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__ATTAQUANT = 2;

	/**
	 * The number of structural features of the '<em>Attaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link nima.TypeDef <em>Type Def</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.TypeDef
	 * @see nima.impl.NimaPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 10;

	/**
	 * The meta object id for the '{@link nima.typeAtt <em>type Att</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.typeAtt
	 * @see nima.impl.NimaPackageImpl#gettypeAtt()
	 * @generated
	 */
	int TYPE_ATT = 11;


	/**
	 * Returns the meta object for class '{@link nima.Archetype <em>Archetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype</em>'.
	 * @see nima.Archetype
	 * @generated
	 */
	EClass getArchetype();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getHp <em>Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp</em>'.
	 * @see nima.Archetype#getHp()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Hp();

	/**
	 * Returns the meta object for the containment reference list '{@link nima.Archetype#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see nima.Archetype#getConfigs()
	 * @see #getArchetype()
	 * @generated
	 */
	EReference getArchetype_Configs();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see nima.Archetype#getInit()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Init();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getAttaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attaque</em>'.
	 * @see nima.Archetype#getAttaque()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Attaque();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getDefense <em>Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defense</em>'.
	 * @see nima.Archetype#getDefense()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Defense();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getTypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Def</em>'.
	 * @see nima.Archetype#getTypeDef()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_TypeDef();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getRphy <em>Rphy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rphy</em>'.
	 * @see nima.Archetype#getRphy()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Rphy();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getRmys <em>Rmys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rmys</em>'.
	 * @see nima.Archetype#getRmys()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Rmys();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getRpsy <em>Rpsy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpsy</em>'.
	 * @see nima.Archetype#getRpsy()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Rpsy();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getPerf <em>Perf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perf</em>'.
	 * @see nima.Archetype#getPerf()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Perf();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getTran <em>Tran</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tran</em>'.
	 * @see nima.Archetype#getTran()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Tran();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getCon <em>Con</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Con</em>'.
	 * @see nima.Archetype#getCon()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Con();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getCha <em>Cha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cha</em>'.
	 * @see nima.Archetype#getCha()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Cha();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getFroid <em>Froid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Froid</em>'.
	 * @see nima.Archetype#getFroid()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Froid();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getElec <em>Elec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elec</em>'.
	 * @see nima.Archetype#getElec()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Elec();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getEner <em>Ener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ener</em>'.
	 * @see nima.Archetype#getEner()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Ener();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see nima.Archetype#getNom()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Nom();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see nima.Archetype#getDescription()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Description();

	/**
	 * Returns the meta object for the reference '{@link nima.Archetype#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Active</em>'.
	 * @see nima.Archetype#getActive()
	 * @see #getArchetype()
	 * @generated
	 */
	EReference getArchetype_Active();

	/**
	 * Returns the meta object for the reference '{@link nima.Archetype#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see nima.Archetype#getEReference0()
	 * @see #getArchetype()
	 * @generated
	 */
	EReference getArchetype_EReference0();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getNbDef <em>Nb Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Def</em>'.
	 * @see nima.Archetype#getNbDef()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_NbDef();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#isJoueur <em>Joueur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joueur</em>'.
	 * @see nima.Archetype#isJoueur()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_Joueur();

	/**
	 * Returns the meta object for class '{@link nima.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see nima.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see nima.Config#getInit()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Init();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getDefense <em>Defense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defense</em>'.
	 * @see nima.Config#getDefense()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Defense();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getDegats <em>Degats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degats</em>'.
	 * @see nima.Config#getDegats()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Degats();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getTypeDegat <em>Type Degat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Degat</em>'.
	 * @see nima.Config#getTypeDegat()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_TypeDegat();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see nima.Config#getNom()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Nom();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see nima.Config#getDescription()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Description();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getAttaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attaque</em>'.
	 * @see nima.Config#getAttaque()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Attaque();

	/**
	 * Returns the meta object for the container reference '{@link nima.Config#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see nima.Config#getOwner()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Owner();

	/**
	 * Returns the meta object for class '{@link nima.DualHandConfig <em>Dual Hand Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dual Hand Config</em>'.
	 * @see nima.DualHandConfig
	 * @generated
	 */
	EClass getDualHandConfig();

	/**
	 * Returns the meta object for the attribute '{@link nima.DualHandConfig#getInitGauche <em>Init Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Gauche</em>'.
	 * @see nima.DualHandConfig#getInitGauche()
	 * @see #getDualHandConfig()
	 * @generated
	 */
	EAttribute getDualHandConfig_InitGauche();

	/**
	 * Returns the meta object for the attribute '{@link nima.DualHandConfig#getAttaqueGauche <em>Attaque Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attaque Gauche</em>'.
	 * @see nima.DualHandConfig#getAttaqueGauche()
	 * @see #getDualHandConfig()
	 * @generated
	 */
	EAttribute getDualHandConfig_AttaqueGauche();

	/**
	 * Returns the meta object for the attribute '{@link nima.DualHandConfig#getDefGauche <em>Def Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def Gauche</em>'.
	 * @see nima.DualHandConfig#getDefGauche()
	 * @see #getDualHandConfig()
	 * @generated
	 */
	EAttribute getDualHandConfig_DefGauche();

	/**
	 * Returns the meta object for the attribute '{@link nima.DualHandConfig#getDegatsGauche <em>Degats Gauche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degats Gauche</em>'.
	 * @see nima.DualHandConfig#getDegatsGauche()
	 * @see #getDualHandConfig()
	 * @generated
	 */
	EAttribute getDualHandConfig_DegatsGauche();

	/**
	 * Returns the meta object for the attribute '{@link nima.DualHandConfig#getTypeDegatGuche <em>Type Degat Guche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Degat Guche</em>'.
	 * @see nima.DualHandConfig#getTypeDegatGuche()
	 * @see #getDualHandConfig()
	 * @generated
	 */
	EAttribute getDualHandConfig_TypeDegatGuche();

	/**
	 * Returns the meta object for class '{@link nima.ConfigCac <em>Config Cac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Cac</em>'.
	 * @see nima.ConfigCac
	 * @generated
	 */
	EClass getConfigCac();

	/**
	 * Returns the meta object for class '{@link nima.ConfigLance <em>Config Lance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Lance</em>'.
	 * @see nima.ConfigLance
	 * @generated
	 */
	EClass getConfigLance();

	/**
	 * Returns the meta object for class '{@link nima.ConfigTir <em>Config Tir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Tir</em>'.
	 * @see nima.ConfigTir
	 * @generated
	 */
	EClass getConfigTir();

	/**
	 * Returns the meta object for class '{@link nima.ConfigAoe <em>Config Aoe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Aoe</em>'.
	 * @see nima.ConfigAoe
	 * @generated
	 */
	EClass getConfigAoe();

	/**
	 * Returns the meta object for the attribute '{@link nima.ConfigAoe#getRayon <em>Rayon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rayon</em>'.
	 * @see nima.ConfigAoe#getRayon()
	 * @see #getConfigAoe()
	 * @generated
	 */
	EAttribute getConfigAoe_Rayon();

	/**
	 * Returns the meta object for class '{@link nima.Univers <em>Univers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Univers</em>'.
	 * @see nima.Univers
	 * @generated
	 */
	EClass getUnivers();

	/**
	 * Returns the meta object for the containment reference list '{@link nima.Univers#getArchetypes <em>Archetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Archetypes</em>'.
	 * @see nima.Univers#getArchetypes()
	 * @see #getUnivers()
	 * @generated
	 */
	EReference getUnivers_Archetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link nima.Univers#getCombats <em>Combats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combats</em>'.
	 * @see nima.Univers#getCombats()
	 * @see #getUnivers()
	 * @generated
	 */
	EReference getUnivers_Combats();

	/**
	 * Returns the meta object for class '{@link nima.Combat <em>Combat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combat</em>'.
	 * @see nima.Combat
	 * @generated
	 */
	EClass getCombat();

	/**
	 * Returns the meta object for the containment reference list '{@link nima.Combat#getArchetypes <em>Archetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Archetypes</em>'.
	 * @see nima.Combat#getArchetypes()
	 * @see #getCombat()
	 * @generated
	 */
	EReference getCombat_Archetypes();

	/**
	 * Returns the meta object for the containment reference list '{@link nima.Combat#getAttaques <em>Attaques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attaques</em>'.
	 * @see nima.Combat#getAttaques()
	 * @see #getCombat()
	 * @generated
	 */
	EReference getCombat_Attaques();

	/**
	 * Returns the meta object for class '{@link nima.Attaque <em>Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attaque</em>'.
	 * @see nima.Attaque
	 * @generated
	 */
	EClass getAttaque();

	/**
	 * Returns the meta object for the reference '{@link nima.Attaque#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cible</em>'.
	 * @see nima.Attaque#getCible()
	 * @see #getAttaque()
	 * @generated
	 */
	EReference getAttaque_Cible();

	/**
	 * Returns the meta object for the attribute '{@link nima.Attaque#getBonus <em>Bonus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus</em>'.
	 * @see nima.Attaque#getBonus()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_Bonus();

	/**
	 * Returns the meta object for the reference '{@link nima.Attaque#getAttaquant <em>Attaquant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attaquant</em>'.
	 * @see nima.Attaque#getAttaquant()
	 * @see #getAttaque()
	 * @generated
	 */
	EReference getAttaque_Attaquant();

	/**
	 * Returns the meta object for enum '{@link nima.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Def</em>'.
	 * @see nima.TypeDef
	 * @generated
	 */
	EEnum getTypeDef();

	/**
	 * Returns the meta object for enum '{@link nima.typeAtt <em>type Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>type Att</em>'.
	 * @see nima.typeAtt
	 * @generated
	 */
	EEnum gettypeAtt();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NimaFactory getNimaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nima.impl.ArchetypeImpl <em>Archetype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.ArchetypeImpl
		 * @see nima.impl.NimaPackageImpl#getArchetype()
		 * @generated
		 */
		EClass ARCHETYPE = eINSTANCE.getArchetype();

		/**
		 * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__HP = eINSTANCE.getArchetype_Hp();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE__CONFIGS = eINSTANCE.getArchetype_Configs();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__INIT = eINSTANCE.getArchetype_Init();

		/**
		 * The meta object literal for the '<em><b>Attaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__ATTAQUE = eINSTANCE.getArchetype_Attaque();

		/**
		 * The meta object literal for the '<em><b>Defense</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__DEFENSE = eINSTANCE.getArchetype_Defense();

		/**
		 * The meta object literal for the '<em><b>Type Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__TYPE_DEF = eINSTANCE.getArchetype_TypeDef();

		/**
		 * The meta object literal for the '<em><b>Rphy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__RPHY = eINSTANCE.getArchetype_Rphy();

		/**
		 * The meta object literal for the '<em><b>Rmys</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__RMYS = eINSTANCE.getArchetype_Rmys();

		/**
		 * The meta object literal for the '<em><b>Rpsy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__RPSY = eINSTANCE.getArchetype_Rpsy();

		/**
		 * The meta object literal for the '<em><b>Perf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__PERF = eINSTANCE.getArchetype_Perf();

		/**
		 * The meta object literal for the '<em><b>Tran</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__TRAN = eINSTANCE.getArchetype_Tran();

		/**
		 * The meta object literal for the '<em><b>Con</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__CON = eINSTANCE.getArchetype_Con();

		/**
		 * The meta object literal for the '<em><b>Cha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__CHA = eINSTANCE.getArchetype_Cha();

		/**
		 * The meta object literal for the '<em><b>Froid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__FROID = eINSTANCE.getArchetype_Froid();

		/**
		 * The meta object literal for the '<em><b>Elec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__ELEC = eINSTANCE.getArchetype_Elec();

		/**
		 * The meta object literal for the '<em><b>Ener</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__ENER = eINSTANCE.getArchetype_Ener();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__NOM = eINSTANCE.getArchetype_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__DESCRIPTION = eINSTANCE.getArchetype_Description();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE__ACTIVE = eINSTANCE.getArchetype_Active();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE__EREFERENCE0 = eINSTANCE.getArchetype_EReference0();

		/**
		 * The meta object literal for the '<em><b>Nb Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__NB_DEF = eINSTANCE.getArchetype_NbDef();

		/**
		 * The meta object literal for the '<em><b>Joueur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__JOUEUR = eINSTANCE.getArchetype_Joueur();

		/**
		 * The meta object literal for the '{@link nima.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.ConfigImpl
		 * @see nima.impl.NimaPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__INIT = eINSTANCE.getConfig_Init();

		/**
		 * The meta object literal for the '<em><b>Defense</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__DEFENSE = eINSTANCE.getConfig_Defense();

		/**
		 * The meta object literal for the '<em><b>Degats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__DEGATS = eINSTANCE.getConfig_Degats();

		/**
		 * The meta object literal for the '<em><b>Type Degat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__TYPE_DEGAT = eINSTANCE.getConfig_TypeDegat();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NOM = eINSTANCE.getConfig_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__DESCRIPTION = eINSTANCE.getConfig_Description();

		/**
		 * The meta object literal for the '<em><b>Attaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__ATTAQUE = eINSTANCE.getConfig_Attaque();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__OWNER = eINSTANCE.getConfig_Owner();

		/**
		 * The meta object literal for the '{@link nima.impl.DualHandConfigImpl <em>Dual Hand Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.DualHandConfigImpl
		 * @see nima.impl.NimaPackageImpl#getDualHandConfig()
		 * @generated
		 */
		EClass DUAL_HAND_CONFIG = eINSTANCE.getDualHandConfig();

		/**
		 * The meta object literal for the '<em><b>Init Gauche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_HAND_CONFIG__INIT_GAUCHE = eINSTANCE.getDualHandConfig_InitGauche();

		/**
		 * The meta object literal for the '<em><b>Attaque Gauche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_HAND_CONFIG__ATTAQUE_GAUCHE = eINSTANCE.getDualHandConfig_AttaqueGauche();

		/**
		 * The meta object literal for the '<em><b>Def Gauche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_HAND_CONFIG__DEF_GAUCHE = eINSTANCE.getDualHandConfig_DefGauche();

		/**
		 * The meta object literal for the '<em><b>Degats Gauche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_HAND_CONFIG__DEGATS_GAUCHE = eINSTANCE.getDualHandConfig_DegatsGauche();

		/**
		 * The meta object literal for the '<em><b>Type Degat Guche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE = eINSTANCE.getDualHandConfig_TypeDegatGuche();

		/**
		 * The meta object literal for the '{@link nima.impl.ConfigCacImpl <em>Config Cac</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.ConfigCacImpl
		 * @see nima.impl.NimaPackageImpl#getConfigCac()
		 * @generated
		 */
		EClass CONFIG_CAC = eINSTANCE.getConfigCac();

		/**
		 * The meta object literal for the '{@link nima.impl.ConfigLanceImpl <em>Config Lance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.ConfigLanceImpl
		 * @see nima.impl.NimaPackageImpl#getConfigLance()
		 * @generated
		 */
		EClass CONFIG_LANCE = eINSTANCE.getConfigLance();

		/**
		 * The meta object literal for the '{@link nima.impl.ConfigTirImpl <em>Config Tir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.ConfigTirImpl
		 * @see nima.impl.NimaPackageImpl#getConfigTir()
		 * @generated
		 */
		EClass CONFIG_TIR = eINSTANCE.getConfigTir();

		/**
		 * The meta object literal for the '{@link nima.impl.ConfigAoeImpl <em>Config Aoe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.ConfigAoeImpl
		 * @see nima.impl.NimaPackageImpl#getConfigAoe()
		 * @generated
		 */
		EClass CONFIG_AOE = eINSTANCE.getConfigAoe();

		/**
		 * The meta object literal for the '<em><b>Rayon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_AOE__RAYON = eINSTANCE.getConfigAoe_Rayon();

		/**
		 * The meta object literal for the '{@link nima.impl.UniversImpl <em>Univers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.UniversImpl
		 * @see nima.impl.NimaPackageImpl#getUnivers()
		 * @generated
		 */
		EClass UNIVERS = eINSTANCE.getUnivers();

		/**
		 * The meta object literal for the '<em><b>Archetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERS__ARCHETYPES = eINSTANCE.getUnivers_Archetypes();

		/**
		 * The meta object literal for the '<em><b>Combats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERS__COMBATS = eINSTANCE.getUnivers_Combats();

		/**
		 * The meta object literal for the '{@link nima.impl.CombatImpl <em>Combat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.CombatImpl
		 * @see nima.impl.NimaPackageImpl#getCombat()
		 * @generated
		 */
		EClass COMBAT = eINSTANCE.getCombat();

		/**
		 * The meta object literal for the '<em><b>Archetypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBAT__ARCHETYPES = eINSTANCE.getCombat_Archetypes();

		/**
		 * The meta object literal for the '<em><b>Attaques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMBAT__ATTAQUES = eINSTANCE.getCombat_Attaques();

		/**
		 * The meta object literal for the '{@link nima.impl.AttaqueImpl <em>Attaque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.impl.AttaqueImpl
		 * @see nima.impl.NimaPackageImpl#getAttaque()
		 * @generated
		 */
		EClass ATTAQUE = eINSTANCE.getAttaque();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTAQUE__CIBLE = eINSTANCE.getAttaque_Cible();

		/**
		 * The meta object literal for the '<em><b>Bonus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTAQUE__BONUS = eINSTANCE.getAttaque_Bonus();

		/**
		 * The meta object literal for the '<em><b>Attaquant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTAQUE__ATTAQUANT = eINSTANCE.getAttaque_Attaquant();

		/**
		 * The meta object literal for the '{@link nima.TypeDef <em>Type Def</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.TypeDef
		 * @see nima.impl.NimaPackageImpl#getTypeDef()
		 * @generated
		 */
		EEnum TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '{@link nima.typeAtt <em>type Att</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.typeAtt
		 * @see nima.impl.NimaPackageImpl#gettypeAtt()
		 * @generated
		 */
		EEnum TYPE_ATT = eINSTANCE.gettypeAtt();

	}

} //NimaPackage
