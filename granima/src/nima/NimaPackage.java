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
	 * The feature id for the '<em><b>Nb Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__NB_DEF = 19;

	/**
	 * The feature id for the '<em><b>Joueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__JOUEUR = 20;

	/**
	 * The feature id for the '<em><b>Nb Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__NB_ACTION = 21;

	/**
	 * The feature id for the '<em><b>Peut Agir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__PEUT_AGIR = 22;

	/**
	 * The feature id for the '<em><b>Rolled Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__ROLLED_INIT = 23;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CIBLE = 24;

	/**
	 * The feature id for the '<em><b>Hp Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__HP_MAX = 25;

	/**
	 * The feature id for the '<em><b>Malus Crit Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__MALUS_CRIT_TEMP = 26;

	/**
	 * The feature id for the '<em><b>Bonus Ataque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__BONUS_ATAQUE = 27;

	/**
	 * The feature id for the '<em><b>Bonus Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__BONUS_DEF = 28;

	/**
	 * The feature id for the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE__CURRENT = 29;

	/**
	 * The number of structural features of the '<em>Archetype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_FEATURE_COUNT = 30;

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
	 * The feature id for the '<em><b>Attack</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ATTACK = 8;

	/**
	 * The feature id for the '<em><b>Nb Attaques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__NB_ATTAQUES = 9;

	/**
	 * The feature id for the '<em><b>Enchaine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ENCHAINE = 10;

	/**
	 * The feature id for the '<em><b>Type Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__TYPE_DEF = 11;

	/**
	 * The feature id for the '<em><b>Type Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__TYPE_ATTAQUE = 12;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link nima.impl.UniversImpl <em>Univers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.UniversImpl
	 * @see nima.impl.NimaPackageImpl#getUnivers()
	 * @generated
	 */
	int UNIVERS = 2;

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
	int COMBAT = 3;

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
	 * The feature id for the '<em><b>Nb Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBAT__NB_ROUND = 2;

	/**
	 * The number of structural features of the '<em>Combat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBAT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link nima.impl.AttaqueImpl <em>Attaque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.impl.AttaqueImpl
	 * @see nima.impl.NimaPackageImpl#getAttaque()
	 * @generated
	 */
	int ATTAQUE = 4;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__CIBLE = 0;

	/**
	 * The feature id for the '<em><b>Bonus Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__BONUS_ATT = 1;

	/**
	 * The feature id for the '<em><b>Attaquant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__ATTAQUANT = 2;

	/**
	 * The feature id for the '<em><b>Bonus Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE__BONUS_DEF = 3;

	/**
	 * The number of structural features of the '<em>Attaque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTAQUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link nima.TypeDef <em>Type Def</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.TypeDef
	 * @see nima.impl.NimaPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 5;

	/**
	 * The meta object id for the '{@link nima.typeAtt <em>type Att</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.typeAtt
	 * @see nima.impl.NimaPackageImpl#gettypeAtt()
	 * @generated
	 */
	int TYPE_ATT = 6;


	/**
	 * The meta object id for the '{@link nima.TypeAttaque <em>Type Attaque</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nima.TypeAttaque
	 * @see nima.impl.NimaPackageImpl#getTypeAttaque()
	 * @generated
	 */
	int TYPE_ATTAQUE = 7;


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
	 * Returns the meta object for the attribute '{@link nima.Archetype#getNbAction <em>Nb Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Action</em>'.
	 * @see nima.Archetype#getNbAction()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_NbAction();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#isPeutAgir <em>Peut Agir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peut Agir</em>'.
	 * @see nima.Archetype#isPeutAgir()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_PeutAgir();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getRolledInit <em>Rolled Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolled Init</em>'.
	 * @see nima.Archetype#getRolledInit()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_RolledInit();

	/**
	 * Returns the meta object for the reference '{@link nima.Archetype#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cible</em>'.
	 * @see nima.Archetype#getCible()
	 * @see #getArchetype()
	 * @generated
	 */
	EReference getArchetype_Cible();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getHpMax <em>Hp Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp Max</em>'.
	 * @see nima.Archetype#getHpMax()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_HpMax();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getMalusCritTemp <em>Malus Crit Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Malus Crit Temp</em>'.
	 * @see nima.Archetype#getMalusCritTemp()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_MalusCritTemp();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getBonusAtaque <em>Bonus Ataque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus Ataque</em>'.
	 * @see nima.Archetype#getBonusAtaque()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_BonusAtaque();

	/**
	 * Returns the meta object for the attribute '{@link nima.Archetype#getBonusDef <em>Bonus Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus Def</em>'.
	 * @see nima.Archetype#getBonusDef()
	 * @see #getArchetype()
	 * @generated
	 */
	EAttribute getArchetype_BonusDef();

	/**
	 * Returns the meta object for the reference '{@link nima.Archetype#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current</em>'.
	 * @see nima.Archetype#getCurrent()
	 * @see #getArchetype()
	 * @generated
	 */
	EReference getArchetype_Current();

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
	 * Returns the meta object for the reference '{@link nima.Config#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attack</em>'.
	 * @see nima.Config#getAttack()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Attack();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getNbAttaques <em>Nb Attaques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Attaques</em>'.
	 * @see nima.Config#getNbAttaques()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_NbAttaques();

	/**
	 * Returns the meta object for the reference '{@link nima.Config#getEnchaine <em>Enchaine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enchaine</em>'.
	 * @see nima.Config#getEnchaine()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Enchaine();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getTypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Def</em>'.
	 * @see nima.Config#getTypeDef()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_TypeDef();

	/**
	 * Returns the meta object for the attribute '{@link nima.Config#getTypeAttaque <em>Type Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Attaque</em>'.
	 * @see nima.Config#getTypeAttaque()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_TypeAttaque();

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
	 * Returns the meta object for the attribute '{@link nima.Combat#getNbRound <em>Nb Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Round</em>'.
	 * @see nima.Combat#getNbRound()
	 * @see #getCombat()
	 * @generated
	 */
	EAttribute getCombat_NbRound();

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
	 * Returns the meta object for the attribute '{@link nima.Attaque#getBonusAtt <em>Bonus Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus Att</em>'.
	 * @see nima.Attaque#getBonusAtt()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_BonusAtt();

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
	 * Returns the meta object for the attribute '{@link nima.Attaque#getBonusDef <em>Bonus Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bonus Def</em>'.
	 * @see nima.Attaque#getBonusDef()
	 * @see #getAttaque()
	 * @generated
	 */
	EAttribute getAttaque_BonusDef();

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
	 * Returns the meta object for enum '{@link nima.TypeAttaque <em>Type Attaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Attaque</em>'.
	 * @see nima.TypeAttaque
	 * @generated
	 */
	EEnum getTypeAttaque();

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
		 * The meta object literal for the '<em><b>Nb Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__NB_ACTION = eINSTANCE.getArchetype_NbAction();

		/**
		 * The meta object literal for the '<em><b>Peut Agir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__PEUT_AGIR = eINSTANCE.getArchetype_PeutAgir();

		/**
		 * The meta object literal for the '<em><b>Rolled Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__ROLLED_INIT = eINSTANCE.getArchetype_RolledInit();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE__CIBLE = eINSTANCE.getArchetype_Cible();

		/**
		 * The meta object literal for the '<em><b>Hp Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__HP_MAX = eINSTANCE.getArchetype_HpMax();

		/**
		 * The meta object literal for the '<em><b>Malus Crit Temp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__MALUS_CRIT_TEMP = eINSTANCE.getArchetype_MalusCritTemp();

		/**
		 * The meta object literal for the '<em><b>Bonus Ataque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__BONUS_ATAQUE = eINSTANCE.getArchetype_BonusAtaque();

		/**
		 * The meta object literal for the '<em><b>Bonus Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHETYPE__BONUS_DEF = eINSTANCE.getArchetype_BonusDef();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE__CURRENT = eINSTANCE.getArchetype_Current();

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
		 * The meta object literal for the '<em><b>Attack</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__ATTACK = eINSTANCE.getConfig_Attack();

		/**
		 * The meta object literal for the '<em><b>Nb Attaques</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__NB_ATTAQUES = eINSTANCE.getConfig_NbAttaques();

		/**
		 * The meta object literal for the '<em><b>Enchaine</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__ENCHAINE = eINSTANCE.getConfig_Enchaine();

		/**
		 * The meta object literal for the '<em><b>Type Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__TYPE_DEF = eINSTANCE.getConfig_TypeDef();

		/**
		 * The meta object literal for the '<em><b>Type Attaque</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__TYPE_ATTAQUE = eINSTANCE.getConfig_TypeAttaque();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__OWNER = eINSTANCE.getConfig_Owner();

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
		 * The meta object literal for the '<em><b>Nb Round</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBAT__NB_ROUND = eINSTANCE.getCombat_NbRound();

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
		 * The meta object literal for the '<em><b>Bonus Att</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTAQUE__BONUS_ATT = eINSTANCE.getAttaque_BonusAtt();

		/**
		 * The meta object literal for the '<em><b>Attaquant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTAQUE__ATTAQUANT = eINSTANCE.getAttaque_Attaquant();

		/**
		 * The meta object literal for the '<em><b>Bonus Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTAQUE__BONUS_DEF = eINSTANCE.getAttaque_BonusDef();

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

		/**
		 * The meta object literal for the '{@link nima.TypeAttaque <em>Type Attaque</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nima.TypeAttaque
		 * @see nima.impl.NimaPackageImpl#getTypeAttaque()
		 * @generated
		 */
		EEnum TYPE_ATTAQUE = eINSTANCE.getTypeAttaque();

	}

} //NimaPackage
