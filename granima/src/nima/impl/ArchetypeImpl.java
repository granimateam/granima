/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import java.util.Collection;

import nima.Archetype;
import nima.Attaque;
import nima.Config;
import nima.NimaPackage;
import nima.TypeDef;

import nima.typeAtt;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;

import tool.Des;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.ArchetypeImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getConfigs <em>Configs</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getInit <em>Init</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getAttaque <em>Attaque</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getDefense <em>Defense</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getTypeDef <em>Type Def</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getRphy <em>Rphy</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getRmys <em>Rmys</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getRpsy <em>Rpsy</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getPerf <em>Perf</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getTran <em>Tran</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getCon <em>Con</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getCha <em>Cha</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getFroid <em>Froid</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getElec <em>Elec</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getEner <em>Ener</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getActive <em>Active</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getNbDef <em>Nb Def</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#isJoueur <em>Joueur</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getNbAction <em>Nb Action</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#isPeutAgir <em>Peut Agir</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getRolledInit <em>Rolled Init</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getHpMax <em>Hp Max</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getMalusCritTemp <em>Malus Crit Temp</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getBonusAtaque <em>Bonus Ataque</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getBonusDef <em>Bonus Def</em>}</li>
 *   <li>{@link nima.impl.ArchetypeImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchetypeImpl extends EObjectImpl implements Archetype {
	/**
	 * The default value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected int hp = HP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<Config> configs;

	/**
	 * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected int init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttaque() <em>Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaque()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTAQUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttaque() <em>Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaque()
	 * @generated
	 * @ordered
	 */
	protected int attaque = ATTAQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefense() <em>Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefense()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFENSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefense() <em>Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefense()
	 * @generated
	 * @ordered
	 */
	protected int defense = DEFENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDef() <em>Type Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDef()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDef TYPE_DEF_EDEFAULT = TypeDef.ESQUIVE;

	/**
	 * The cached value of the '{@link #getTypeDef() <em>Type Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDef()
	 * @generated
	 * @ordered
	 */
	protected TypeDef typeDef = TYPE_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRphy() <em>Rphy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRphy()
	 * @generated
	 * @ordered
	 */
	protected static final int RPHY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRphy() <em>Rphy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRphy()
	 * @generated
	 * @ordered
	 */
	protected int rphy = RPHY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRmys() <em>Rmys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmys()
	 * @generated
	 * @ordered
	 */
	protected static final int RMYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRmys() <em>Rmys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmys()
	 * @generated
	 * @ordered
	 */
	protected int rmys = RMYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRpsy() <em>Rpsy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpsy()
	 * @generated
	 * @ordered
	 */
	protected static final int RPSY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRpsy() <em>Rpsy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpsy()
	 * @generated
	 * @ordered
	 */
	protected int rpsy = RPSY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerf() <em>Perf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerf()
	 * @generated
	 * @ordered
	 */
	protected static final int PERF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPerf() <em>Perf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerf()
	 * @generated
	 * @ordered
	 */
	protected int perf = PERF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTran() <em>Tran</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTran()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTran() <em>Tran</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTran()
	 * @generated
	 * @ordered
	 */
	protected int tran = TRAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCon() <em>Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCon()
	 * @generated
	 * @ordered
	 */
	protected static final int CON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCon() <em>Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCon()
	 * @generated
	 * @ordered
	 */
	protected int con = CON_EDEFAULT;

	/**
	 * The default value of the '{@link #getCha() <em>Cha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCha()
	 * @generated
	 * @ordered
	 */
	protected static final int CHA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCha() <em>Cha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCha()
	 * @generated
	 * @ordered
	 */
	protected int cha = CHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFroid() <em>Froid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFroid()
	 * @generated
	 * @ordered
	 */
	protected static final int FROID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFroid() <em>Froid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFroid()
	 * @generated
	 * @ordered
	 */
	protected int froid = FROID_EDEFAULT;

	/**
	 * The default value of the '{@link #getElec() <em>Elec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElec()
	 * @generated
	 * @ordered
	 */
	protected static final int ELEC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElec() <em>Elec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElec()
	 * @generated
	 * @ordered
	 */
	protected int elec = ELEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEner() <em>Ener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEner()
	 * @generated
	 * @ordered
	 */
	protected static final int ENER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEner() <em>Ener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEner()
	 * @generated
	 * @ordered
	 */
	protected int ener = ENER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Config active;

	/**
	 * The default value of the '{@link #getNbDef() <em>Nb Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDef()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_DEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbDef() <em>Nb Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbDef()
	 * @generated
	 * @ordered
	 */
	protected int nbDef = NB_DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #isJoueur() <em>Joueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJoueur()
	 * @generated
	 * @ordered
	 */
	protected static final boolean JOUEUR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isJoueur() <em>Joueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isJoueur()
	 * @generated
	 * @ordered
	 */
	protected boolean joueur = JOUEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbAction() <em>Nb Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAction()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ACTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbAction() <em>Nb Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAction()
	 * @generated
	 * @ordered
	 */
	protected int nbAction = NB_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPeutAgir() <em>Peut Agir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeutAgir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PEUT_AGIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPeutAgir() <em>Peut Agir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeutAgir()
	 * @generated
	 * @ordered
	 */
	protected boolean peutAgir = PEUT_AGIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolledInit() <em>Rolled Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolledInit()
	 * @generated
	 * @ordered
	 */
	protected static final int ROLLED_INIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRolledInit() <em>Rolled Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolledInit()
	 * @generated
	 * @ordered
	 */
	protected int rolledInit = ROLLED_INIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected Archetype cible;

	/**
	 * The default value of the '{@link #getHpMax() <em>Hp Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpMax()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHpMax() <em>Hp Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHpMax()
	 * @generated
	 * @ordered
	 */
	protected int hpMax = HP_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMalusCritTemp() <em>Malus Crit Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalusCritTemp()
	 * @generated
	 * @ordered
	 */
	protected static final int MALUS_CRIT_TEMP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMalusCritTemp() <em>Malus Crit Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalusCritTemp()
	 * @generated
	 * @ordered
	 */
	protected int malusCritTemp = MALUS_CRIT_TEMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBonusAtaque() <em>Bonus Ataque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusAtaque()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_ATAQUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonusAtaque() <em>Bonus Ataque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusAtaque()
	 * @generated
	 * @ordered
	 */
	protected int bonusAtaque = BONUS_ATAQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBonusDef() <em>Bonus Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusDef()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_DEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonusDef() <em>Bonus Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusDef()
	 * @generated
	 * @ordered
	 */
	protected int bonusDef = BONUS_DEF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected Config current;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchetypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NimaPackage.Literals.ARCHETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHp(int newHp) {
		int oldHp = hp;
		hp = newHp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__HP, oldHp, hp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Config> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentWithInverseEList<Config>(Config.class, this, NimaPackage.ARCHETYPE__CONFIGS, NimaPackage.CONFIG__OWNER);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(int newInit) {
		int oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttaque() {
		return attaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttaque(int newAttaque) {
		int oldAttaque = attaque;
		attaque = newAttaque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__ATTAQUE, oldAttaque, attaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefense(int newDefense) {
		int oldDefense = defense;
		defense = newDefense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__DEFENSE, oldDefense, defense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef getTypeDef() {
		return typeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDef(TypeDef newTypeDef) {
		TypeDef oldTypeDef = typeDef;
		typeDef = newTypeDef == null ? TYPE_DEF_EDEFAULT : newTypeDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__TYPE_DEF, oldTypeDef, typeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRphy() {
		return rphy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRphy(int newRphy) {
		int oldRphy = rphy;
		rphy = newRphy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__RPHY, oldRphy, rphy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRmys() {
		return rmys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmys(int newRmys) {
		int oldRmys = rmys;
		rmys = newRmys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__RMYS, oldRmys, rmys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRpsy() {
		return rpsy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpsy(int newRpsy) {
		int oldRpsy = rpsy;
		rpsy = newRpsy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__RPSY, oldRpsy, rpsy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPerf() {
		return perf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerf(int newPerf) {
		int oldPerf = perf;
		perf = newPerf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__PERF, oldPerf, perf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTran() {
		return tran;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTran(int newTran) {
		int oldTran = tran;
		tran = newTran;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__TRAN, oldTran, tran));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCon() {
		return con;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCon(int newCon) {
		int oldCon = con;
		con = newCon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__CON, oldCon, con));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCha() {
		return cha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCha(int newCha) {
		int oldCha = cha;
		cha = newCha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__CHA, oldCha, cha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFroid() {
		return froid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFroid(int newFroid) {
		int oldFroid = froid;
		froid = newFroid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__FROID, oldFroid, froid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getElec() {
		return elec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElec(int newElec) {
		int oldElec = elec;
		elec = newElec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__ELEC, oldElec, elec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEner() {
		return ener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEner(int newEner) {
		int oldEner = ener;
		ener = newEner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__ENER, oldEner, ener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getActive() {
		if (active != null && active.eIsProxy()) {
			InternalEObject oldActive = (InternalEObject)active;
			active = (Config)eResolveProxy(oldActive);
			if (active != oldActive) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.ARCHETYPE__ACTIVE, oldActive, active));
			}
		}
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config basicGetActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(Config newActive) {
		Config oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbDef() {
		return nbDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbDef(int newNbDef) {
		int oldNbDef = nbDef;
		nbDef = newNbDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__NB_DEF, oldNbDef, nbDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isJoueur() {
		return joueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoueur(boolean newJoueur) {
		boolean oldJoueur = joueur;
		joueur = newJoueur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__JOUEUR, oldJoueur, joueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbAction() {
		return nbAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAction(int newNbAction) {
		int oldNbAction = nbAction;
		nbAction = newNbAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__NB_ACTION, oldNbAction, nbAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPeutAgir() {
		return peutAgir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeutAgir(boolean newPeutAgir) {
		boolean oldPeutAgir = peutAgir;
		peutAgir = newPeutAgir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__PEUT_AGIR, oldPeutAgir, peutAgir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRolledInit() {
		return rolledInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolledInit(int newRolledInit) {
		int oldRolledInit = rolledInit;
		rolledInit = newRolledInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__ROLLED_INIT, oldRolledInit, rolledInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archetype getCible() {
		if (cible != null && cible.eIsProxy()) {
			InternalEObject oldCible = (InternalEObject)cible;
			cible = (Archetype)eResolveProxy(oldCible);
			if (cible != oldCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.ARCHETYPE__CIBLE, oldCible, cible));
			}
		}
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archetype basicGetCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCible(Archetype newCible) {
		Archetype oldCible = cible;
		cible = newCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__CIBLE, oldCible, cible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHpMax() {
		return hpMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHpMax(int newHpMax) {
		int oldHpMax = hpMax;
		hpMax = newHpMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__HP_MAX, oldHpMax, hpMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMalusCritTemp() {
		return malusCritTemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMalusCritTemp(int newMalusCritTemp) {
		int oldMalusCritTemp = malusCritTemp;
		malusCritTemp = newMalusCritTemp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__MALUS_CRIT_TEMP, oldMalusCritTemp, malusCritTemp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonusAtaque() {
		return bonusAtaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonusAtaque(int newBonusAtaque) {
		int oldBonusAtaque = bonusAtaque;
		bonusAtaque = newBonusAtaque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__BONUS_ATAQUE, oldBonusAtaque, bonusAtaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonusDef() {
		return bonusDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonusDef(int newBonusDef) {
		int oldBonusDef = bonusDef;
		bonusDef = newBonusDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__BONUS_DEF, oldBonusDef, bonusDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getCurrent() {
		if (current != null && current.eIsProxy()) {
			InternalEObject oldCurrent = (InternalEObject)current;
			current = (Config)eResolveProxy(oldCurrent);
			if (current != oldCurrent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.ARCHETYPE__CURRENT, oldCurrent, current));
			}
		}
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config basicGetCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(Config newCurrent) {
		Config oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ARCHETYPE__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getIP(typeAtt type) {
		if(typeAtt.CHALEUR == type)
			return cha;
		if(typeAtt.ELECTRICITE == type)
			return elec;
		if(typeAtt.FROID == type)
			return cha;
		if(typeAtt.TRANCHANT == type)
			return tran;
		if(typeAtt.CONTONDANT == type)
			return con;
		if(typeAtt.PERFORANT == type)
			return perf;
		if(typeAtt.ENERGIE == type)
			return ener;
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetRound() {
this.setPeutAgir(true);
this.setNbAction(0);
this.setNbDef(0);
int init = this.getInit() + this.getActive().getInit();
init+= Des.fullRoll();
this.setRolledInit(init);
this.setCurrent(this.getActive());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int attaque(int bonus) {
if(!this.isPeutAgir())
	return -1;
Archetype attaquant, defenseur;
Config attaque, defense;
attaquant=this;
attaque=this.getActive();
defenseur=this.getCible();
defense = defenseur.getActive();
String attakname = attaque.getNom();
//Score de base
int attaqueTotale =attaquant.getTotalAttaque();
int defenseTotale=defenseur.getTotalDefense();

//bonus config

attaqueTotale+=attaque.getAttaque();
defenseTotale+=defense.getDefense();
		
//bonus malus contexte
if(defense.getTypeDef()==TypeDef.ESQUIVE
		|| defense.getTypeDef()==TypeDef.PARADE){
	int def = defenseur.getNbDef();
	if(def ==1) defenseTotale=defenseTotale-30;
	if(def ==2) defenseTotale=defenseTotale-50;
	if(def ==3) defenseTotale=defenseTotale-70;
	if(def >3) defenseTotale=defenseTotale-90;
	this.getCible().setNbDef(def+1);
}
//roll
System.out.println("att :"+attaqueTotale+ " def :"+defenseTotale);
if(attaquant.isJoueur()){
	
	InputDialog d = new InputDialog(new Shell(),"Score du joueur", "Entrez le score d'attaque au dés de "+attaquant.getNom(), "50",null);
	int choice = d.open();
	if(choice==Window.OK) {
		Integer result = Integer.parseInt(d.getValue());
		attaqueTotale+=result;
	}else {
		attaqueTotale+=Des.fullRoll();
	}
}else {
	attaqueTotale+=Des.fullRoll();
}
if(defenseur.isJoueur()) {
	InputDialog d = new InputDialog(new Shell(),"Score du joueur", "Entrez le score de défense au dés de "+attaquant.getNom(), "50",null);
	int choice = d.open();
	if(choice==Window.OK) {
		Integer result = Integer.parseInt(d.getValue());
		defenseTotale+=result;
	}else {
		defenseTotale+=Des.fullRoll();
	}
	
}else {
	defenseTotale+=Des.fullRoll();		
}
if(defenseTotale<0) defenseTotale=0;
int marge = attaqueTotale - defenseTotale;
System.out.println("marge : "+marge);
if(marge>0) {
	defenseur.setPeutAgir(defense.getTypeDef()==TypeDef.ENCAISSEMENT);
	int absorption = 2 + defenseur.getIP(attaque.getTypeDegat());
	marge -= absorption * 10;
	if(marge>10) {
		int degat = attaque.getDegats()* marge /100;
		int hp = defenseur.getHp()- degat;
		defenseur.setHp(hp);
		String tab[] ={"Ok"}; 
		String info = defenseur.getNom()+" encaisse "+degat+" points de dégats sur "+attakname+". Restant : "+hp;
		MessageDialog d = new MessageDialog(new Shell(), "Résultat", null, info, 0, tab, 0);
		d.open();
	}else {
		String tab[] ={"Ok"}; 
		String info = defenseur.getNom()+" se défend de justesse sur "+attakname+". 0 Dégat, pas d'actions";
		MessageDialog d = new MessageDialog(new Shell(), "Résultat", null, info, 0, tab, 0);
		d.open();	
	}
}else if (marge<0) {
	int result = Des.getContre(marge);
	String tab[] ={"Ok"}; 
	String info = "Défense réussi par"+defenseur.getNom()+", contre attaque contre "+attakname+" possible avec un bonus de "+result;
	MessageDialog d = new MessageDialog(new Shell(), "Résultat", null, info, 0, tab, 0);
	d.open();
	return result;
}else{
	String tab[] ={"Ok"}; 
	String info = "Défense réussi par"+defenseur.getNom()+", pas de contre attaque possible contre "+attakname;
	MessageDialog d = new MessageDialog(new Shell(), "Résultat", null, info, 0, tab, 0);
	d.open();
	return -1;
}
return-1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalAttaque() {
		int total = 0;
		total+=this.getAttaque();
		total+=this.getBonusAtaque();
		total+=this.getMalusCritTemp();
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalDefense() {
		int total = 0;
		total+=this.getDefense();
		total+=this.getBonusDef();
		total+=this.getMalusCritTemp();
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void baston(int bonus) {
Config attaque = this.getCurrent();
if(attaque==null)
{
	return;
}
int nb  = attaque.getNbAttaques();
int superbonus = bonus;
while(nb>0){
	nb--;
	int r =attaque(superbonus);
	superbonus=0;
	if(r>=0){
		return;
	}
	
}
if(attaque.getEnchaine()!=null) {
	this.setCurrent(attaque.getEnchaine());
	baston(0);
}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NimaPackage.ARCHETYPE__CONFIGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfigs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NimaPackage.ARCHETYPE__CONFIGS:
				return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NimaPackage.ARCHETYPE__HP:
				return getHp();
			case NimaPackage.ARCHETYPE__CONFIGS:
				return getConfigs();
			case NimaPackage.ARCHETYPE__INIT:
				return getInit();
			case NimaPackage.ARCHETYPE__ATTAQUE:
				return getAttaque();
			case NimaPackage.ARCHETYPE__DEFENSE:
				return getDefense();
			case NimaPackage.ARCHETYPE__TYPE_DEF:
				return getTypeDef();
			case NimaPackage.ARCHETYPE__RPHY:
				return getRphy();
			case NimaPackage.ARCHETYPE__RMYS:
				return getRmys();
			case NimaPackage.ARCHETYPE__RPSY:
				return getRpsy();
			case NimaPackage.ARCHETYPE__PERF:
				return getPerf();
			case NimaPackage.ARCHETYPE__TRAN:
				return getTran();
			case NimaPackage.ARCHETYPE__CON:
				return getCon();
			case NimaPackage.ARCHETYPE__CHA:
				return getCha();
			case NimaPackage.ARCHETYPE__FROID:
				return getFroid();
			case NimaPackage.ARCHETYPE__ELEC:
				return getElec();
			case NimaPackage.ARCHETYPE__ENER:
				return getEner();
			case NimaPackage.ARCHETYPE__NOM:
				return getNom();
			case NimaPackage.ARCHETYPE__DESCRIPTION:
				return getDescription();
			case NimaPackage.ARCHETYPE__ACTIVE:
				if (resolve) return getActive();
				return basicGetActive();
			case NimaPackage.ARCHETYPE__NB_DEF:
				return getNbDef();
			case NimaPackage.ARCHETYPE__JOUEUR:
				return isJoueur();
			case NimaPackage.ARCHETYPE__NB_ACTION:
				return getNbAction();
			case NimaPackage.ARCHETYPE__PEUT_AGIR:
				return isPeutAgir();
			case NimaPackage.ARCHETYPE__ROLLED_INIT:
				return getRolledInit();
			case NimaPackage.ARCHETYPE__CIBLE:
				if (resolve) return getCible();
				return basicGetCible();
			case NimaPackage.ARCHETYPE__HP_MAX:
				return getHpMax();
			case NimaPackage.ARCHETYPE__MALUS_CRIT_TEMP:
				return getMalusCritTemp();
			case NimaPackage.ARCHETYPE__BONUS_ATAQUE:
				return getBonusAtaque();
			case NimaPackage.ARCHETYPE__BONUS_DEF:
				return getBonusDef();
			case NimaPackage.ARCHETYPE__CURRENT:
				if (resolve) return getCurrent();
				return basicGetCurrent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NimaPackage.ARCHETYPE__HP:
				setHp((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__CONFIGS:
				getConfigs().clear();
				getConfigs().addAll((Collection<? extends Config>)newValue);
				return;
			case NimaPackage.ARCHETYPE__INIT:
				setInit((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__ATTAQUE:
				setAttaque((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__DEFENSE:
				setDefense((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__TYPE_DEF:
				setTypeDef((TypeDef)newValue);
				return;
			case NimaPackage.ARCHETYPE__RPHY:
				setRphy((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__RMYS:
				setRmys((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__RPSY:
				setRpsy((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__PERF:
				setPerf((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__TRAN:
				setTran((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__CON:
				setCon((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__CHA:
				setCha((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__FROID:
				setFroid((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__ELEC:
				setElec((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__ENER:
				setEner((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__NOM:
				setNom((String)newValue);
				return;
			case NimaPackage.ARCHETYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NimaPackage.ARCHETYPE__ACTIVE:
				setActive((Config)newValue);
				return;
			case NimaPackage.ARCHETYPE__NB_DEF:
				setNbDef((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__JOUEUR:
				setJoueur((Boolean)newValue);
				return;
			case NimaPackage.ARCHETYPE__NB_ACTION:
				setNbAction((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__PEUT_AGIR:
				setPeutAgir((Boolean)newValue);
				return;
			case NimaPackage.ARCHETYPE__ROLLED_INIT:
				setRolledInit((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__CIBLE:
				setCible((Archetype)newValue);
				return;
			case NimaPackage.ARCHETYPE__HP_MAX:
				setHpMax((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__MALUS_CRIT_TEMP:
				setMalusCritTemp((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__BONUS_ATAQUE:
				setBonusAtaque((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__BONUS_DEF:
				setBonusDef((Integer)newValue);
				return;
			case NimaPackage.ARCHETYPE__CURRENT:
				setCurrent((Config)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NimaPackage.ARCHETYPE__HP:
				setHp(HP_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__CONFIGS:
				getConfigs().clear();
				return;
			case NimaPackage.ARCHETYPE__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__ATTAQUE:
				setAttaque(ATTAQUE_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__DEFENSE:
				setDefense(DEFENSE_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__TYPE_DEF:
				setTypeDef(TYPE_DEF_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__RPHY:
				setRphy(RPHY_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__RMYS:
				setRmys(RMYS_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__RPSY:
				setRpsy(RPSY_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__PERF:
				setPerf(PERF_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__TRAN:
				setTran(TRAN_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__CON:
				setCon(CON_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__CHA:
				setCha(CHA_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__FROID:
				setFroid(FROID_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__ELEC:
				setElec(ELEC_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__ENER:
				setEner(ENER_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__ACTIVE:
				setActive((Config)null);
				return;
			case NimaPackage.ARCHETYPE__NB_DEF:
				setNbDef(NB_DEF_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__JOUEUR:
				setJoueur(JOUEUR_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__NB_ACTION:
				setNbAction(NB_ACTION_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__PEUT_AGIR:
				setPeutAgir(PEUT_AGIR_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__ROLLED_INIT:
				setRolledInit(ROLLED_INIT_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__CIBLE:
				setCible((Archetype)null);
				return;
			case NimaPackage.ARCHETYPE__HP_MAX:
				setHpMax(HP_MAX_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__MALUS_CRIT_TEMP:
				setMalusCritTemp(MALUS_CRIT_TEMP_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__BONUS_ATAQUE:
				setBonusAtaque(BONUS_ATAQUE_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__BONUS_DEF:
				setBonusDef(BONUS_DEF_EDEFAULT);
				return;
			case NimaPackage.ARCHETYPE__CURRENT:
				setCurrent((Config)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NimaPackage.ARCHETYPE__HP:
				return hp != HP_EDEFAULT;
			case NimaPackage.ARCHETYPE__CONFIGS:
				return configs != null && !configs.isEmpty();
			case NimaPackage.ARCHETYPE__INIT:
				return init != INIT_EDEFAULT;
			case NimaPackage.ARCHETYPE__ATTAQUE:
				return attaque != ATTAQUE_EDEFAULT;
			case NimaPackage.ARCHETYPE__DEFENSE:
				return defense != DEFENSE_EDEFAULT;
			case NimaPackage.ARCHETYPE__TYPE_DEF:
				return typeDef != TYPE_DEF_EDEFAULT;
			case NimaPackage.ARCHETYPE__RPHY:
				return rphy != RPHY_EDEFAULT;
			case NimaPackage.ARCHETYPE__RMYS:
				return rmys != RMYS_EDEFAULT;
			case NimaPackage.ARCHETYPE__RPSY:
				return rpsy != RPSY_EDEFAULT;
			case NimaPackage.ARCHETYPE__PERF:
				return perf != PERF_EDEFAULT;
			case NimaPackage.ARCHETYPE__TRAN:
				return tran != TRAN_EDEFAULT;
			case NimaPackage.ARCHETYPE__CON:
				return con != CON_EDEFAULT;
			case NimaPackage.ARCHETYPE__CHA:
				return cha != CHA_EDEFAULT;
			case NimaPackage.ARCHETYPE__FROID:
				return froid != FROID_EDEFAULT;
			case NimaPackage.ARCHETYPE__ELEC:
				return elec != ELEC_EDEFAULT;
			case NimaPackage.ARCHETYPE__ENER:
				return ener != ENER_EDEFAULT;
			case NimaPackage.ARCHETYPE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case NimaPackage.ARCHETYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NimaPackage.ARCHETYPE__ACTIVE:
				return active != null;
			case NimaPackage.ARCHETYPE__NB_DEF:
				return nbDef != NB_DEF_EDEFAULT;
			case NimaPackage.ARCHETYPE__JOUEUR:
				return joueur != JOUEUR_EDEFAULT;
			case NimaPackage.ARCHETYPE__NB_ACTION:
				return nbAction != NB_ACTION_EDEFAULT;
			case NimaPackage.ARCHETYPE__PEUT_AGIR:
				return peutAgir != PEUT_AGIR_EDEFAULT;
			case NimaPackage.ARCHETYPE__ROLLED_INIT:
				return rolledInit != ROLLED_INIT_EDEFAULT;
			case NimaPackage.ARCHETYPE__CIBLE:
				return cible != null;
			case NimaPackage.ARCHETYPE__HP_MAX:
				return hpMax != HP_MAX_EDEFAULT;
			case NimaPackage.ARCHETYPE__MALUS_CRIT_TEMP:
				return malusCritTemp != MALUS_CRIT_TEMP_EDEFAULT;
			case NimaPackage.ARCHETYPE__BONUS_ATAQUE:
				return bonusAtaque != BONUS_ATAQUE_EDEFAULT;
			case NimaPackage.ARCHETYPE__BONUS_DEF:
				return bonusDef != BONUS_DEF_EDEFAULT;
			case NimaPackage.ARCHETYPE__CURRENT:
				return current != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hp: ");
		result.append(hp);
		result.append(", init: ");
		result.append(init);
		result.append(", attaque: ");
		result.append(attaque);
		result.append(", defense: ");
		result.append(defense);
		result.append(", typeDef: ");
		result.append(typeDef);
		result.append(", rphy: ");
		result.append(rphy);
		result.append(", rmys: ");
		result.append(rmys);
		result.append(", rpsy: ");
		result.append(rpsy);
		result.append(", perf: ");
		result.append(perf);
		result.append(", tran: ");
		result.append(tran);
		result.append(", con: ");
		result.append(con);
		result.append(", cha: ");
		result.append(cha);
		result.append(", froid: ");
		result.append(froid);
		result.append(", elec: ");
		result.append(elec);
		result.append(", ener: ");
		result.append(ener);
		result.append(", nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", nbDef: ");
		result.append(nbDef);
		result.append(", joueur: ");
		result.append(joueur);
		result.append(", nbAction: ");
		result.append(nbAction);
		result.append(", peutAgir: ");
		result.append(peutAgir);
		result.append(", rolledInit: ");
		result.append(rolledInit);
		result.append(", hpMax: ");
		result.append(hpMax);
		result.append(", malusCritTemp: ");
		result.append(malusCritTemp);
		result.append(", bonusAtaque: ");
		result.append(bonusAtaque);
		result.append(", bonusDef: ");
		result.append(bonusDef);
		result.append(')');
		return result.toString();
	}

} //ArchetypeImpl
