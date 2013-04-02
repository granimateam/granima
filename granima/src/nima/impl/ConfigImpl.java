/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import nima.Archetype;
import nima.Attaque;
import nima.Config;
import nima.NimaPackage;
import nima.TypeAttaque;
import nima.TypeDef;
import nima.typeAtt;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.ConfigImpl#getInit <em>Init</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getDefense <em>Defense</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getDegats <em>Degats</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getTypeDegat <em>Type Degat</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getAttaque <em>Attaque</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getNbAttaques <em>Nb Attaques</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getEnchaine <em>Enchaine</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getTypeDef <em>Type Def</em>}</li>
 *   <li>{@link nima.impl.ConfigImpl#getTypeAttaque <em>Type Attaque</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config {
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
	 * The default value of the '{@link #getDegats() <em>Degats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegats()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGATS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegats() <em>Degats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegats()
	 * @generated
	 * @ordered
	 */
	protected int degats = DEGATS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDegat() <em>Type Degat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDegat()
	 * @generated
	 * @ordered
	 */
	protected static final typeAtt TYPE_DEGAT_EDEFAULT = typeAtt.TRANCHANT;

	/**
	 * The cached value of the '{@link #getTypeDegat() <em>Type Degat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDegat()
	 * @generated
	 * @ordered
	 */
	protected typeAtt typeDegat = TYPE_DEGAT_EDEFAULT;

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
	 * The cached value of the '{@link #getAttack() <em>Attack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected Attaque attack;

	/**
	 * The default value of the '{@link #getNbAttaques() <em>Nb Attaques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAttaques()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ATTAQUES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getNbAttaques() <em>Nb Attaques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbAttaques()
	 * @generated
	 * @ordered
	 */
	protected int nbAttaques = NB_ATTAQUES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnchaine() <em>Enchaine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnchaine()
	 * @generated
	 * @ordered
	 */
	protected Config enchaine;

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
	 * The default value of the '{@link #getTypeAttaque() <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttaque()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAttaque TYPE_ATTAQUE_EDEFAULT = TypeAttaque.CAC;

	/**
	 * The cached value of the '{@link #getTypeAttaque() <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttaque()
	 * @generated
	 * @ordered
	 */
	protected TypeAttaque typeAttaque = TYPE_ATTAQUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NimaPackage.Literals.CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__INIT, oldInit, init));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__DEFENSE, oldDefense, defense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegats() {
		return degats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegats(int newDegats) {
		int oldDegats = degats;
		degats = newDegats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__DEGATS, oldDegats, degats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeAtt getTypeDegat() {
		return typeDegat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDegat(typeAtt newTypeDegat) {
		typeAtt oldTypeDegat = typeDegat;
		typeDegat = newTypeDegat == null ? TYPE_DEGAT_EDEFAULT : newTypeDegat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__TYPE_DEGAT, oldTypeDegat, typeDegat));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__ATTAQUE, oldAttaque, attaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attaque getAttack() {
		if (attack != null && attack.eIsProxy()) {
			InternalEObject oldAttack = (InternalEObject)attack;
			attack = (Attaque)eResolveProxy(oldAttack);
			if (attack != oldAttack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.CONFIG__ATTACK, oldAttack, attack));
			}
		}
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attaque basicGetAttack() {
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttack(Attaque newAttack, NotificationChain msgs) {
		Attaque oldAttack = attack;
		attack = newAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__ATTACK, oldAttack, newAttack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttack(Attaque newAttack) {
		if (newAttack != attack) {
			NotificationChain msgs = null;
			if (attack != null)
				msgs = ((InternalEObject)attack).eInverseRemove(this, NimaPackage.ATTAQUE__ATTAQUANT, Attaque.class, msgs);
			if (newAttack != null)
				msgs = ((InternalEObject)newAttack).eInverseAdd(this, NimaPackage.ATTAQUE__ATTAQUANT, Attaque.class, msgs);
			msgs = basicSetAttack(newAttack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__ATTACK, newAttack, newAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbAttaques() {
		return nbAttaques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbAttaques(int newNbAttaques) {
		int oldNbAttaques = nbAttaques;
		nbAttaques = newNbAttaques;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__NB_ATTAQUES, oldNbAttaques, nbAttaques));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getEnchaine() {
		if (enchaine != null && enchaine.eIsProxy()) {
			InternalEObject oldEnchaine = (InternalEObject)enchaine;
			enchaine = (Config)eResolveProxy(oldEnchaine);
			if (enchaine != oldEnchaine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.CONFIG__ENCHAINE, oldEnchaine, enchaine));
			}
		}
		return enchaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config basicGetEnchaine() {
		return enchaine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnchaine(Config newEnchaine) {
		Config oldEnchaine = enchaine;
		enchaine = newEnchaine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__ENCHAINE, oldEnchaine, enchaine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__TYPE_DEF, oldTypeDef, typeDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttaque getTypeAttaque() {
		return typeAttaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttaque(TypeAttaque newTypeAttaque) {
		TypeAttaque oldTypeAttaque = typeAttaque;
		typeAttaque = newTypeAttaque == null ? TYPE_ATTAQUE_EDEFAULT : newTypeAttaque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__TYPE_ATTAQUE, oldTypeAttaque, typeAttaque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int calcMalusDef(Config attaquand) {
		TypeDef td = this.getTypeDef();
		TypeAttaque ta = attaquand.getTypeAttaque();
		if(ta==TypeAttaque.TIR){
			if(td==TypeDef.ESQUIVE)
				return 30;
			if(td==TypeDef.PARADE)
				return 80;
		}
		if(ta==TypeAttaque.LANCE){
		
			if(td==TypeDef.PARADE)
				return 50;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archetype getOwner() {
		if (eContainerFeatureID() != NimaPackage.CONFIG__OWNER) return null;
		return (Archetype)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Archetype newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, NimaPackage.CONFIG__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Archetype newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != NimaPackage.CONFIG__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, NimaPackage.ARCHETYPE__CONFIGS, Archetype.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.CONFIG__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NimaPackage.CONFIG__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Archetype)otherEnd, msgs);
			case NimaPackage.CONFIG__ATTACK:
				if (attack != null)
					msgs = ((InternalEObject)attack).eInverseRemove(this, NimaPackage.ATTAQUE__ATTAQUANT, Attaque.class, msgs);
				return basicSetAttack((Attaque)otherEnd, msgs);
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
			case NimaPackage.CONFIG__OWNER:
				return basicSetOwner(null, msgs);
			case NimaPackage.CONFIG__ATTACK:
				return basicSetAttack(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NimaPackage.CONFIG__OWNER:
				return eInternalContainer().eInverseRemove(this, NimaPackage.ARCHETYPE__CONFIGS, Archetype.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NimaPackage.CONFIG__INIT:
				return getInit();
			case NimaPackage.CONFIG__DEFENSE:
				return getDefense();
			case NimaPackage.CONFIG__DEGATS:
				return getDegats();
			case NimaPackage.CONFIG__TYPE_DEGAT:
				return getTypeDegat();
			case NimaPackage.CONFIG__NOM:
				return getNom();
			case NimaPackage.CONFIG__DESCRIPTION:
				return getDescription();
			case NimaPackage.CONFIG__OWNER:
				return getOwner();
			case NimaPackage.CONFIG__ATTAQUE:
				return getAttaque();
			case NimaPackage.CONFIG__ATTACK:
				if (resolve) return getAttack();
				return basicGetAttack();
			case NimaPackage.CONFIG__NB_ATTAQUES:
				return getNbAttaques();
			case NimaPackage.CONFIG__ENCHAINE:
				if (resolve) return getEnchaine();
				return basicGetEnchaine();
			case NimaPackage.CONFIG__TYPE_DEF:
				return getTypeDef();
			case NimaPackage.CONFIG__TYPE_ATTAQUE:
				return getTypeAttaque();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NimaPackage.CONFIG__INIT:
				setInit((Integer)newValue);
				return;
			case NimaPackage.CONFIG__DEFENSE:
				setDefense((Integer)newValue);
				return;
			case NimaPackage.CONFIG__DEGATS:
				setDegats((Integer)newValue);
				return;
			case NimaPackage.CONFIG__TYPE_DEGAT:
				setTypeDegat((typeAtt)newValue);
				return;
			case NimaPackage.CONFIG__NOM:
				setNom((String)newValue);
				return;
			case NimaPackage.CONFIG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case NimaPackage.CONFIG__OWNER:
				setOwner((Archetype)newValue);
				return;
			case NimaPackage.CONFIG__ATTAQUE:
				setAttaque((Integer)newValue);
				return;
			case NimaPackage.CONFIG__ATTACK:
				setAttack((Attaque)newValue);
				return;
			case NimaPackage.CONFIG__NB_ATTAQUES:
				setNbAttaques((Integer)newValue);
				return;
			case NimaPackage.CONFIG__ENCHAINE:
				setEnchaine((Config)newValue);
				return;
			case NimaPackage.CONFIG__TYPE_DEF:
				setTypeDef((TypeDef)newValue);
				return;
			case NimaPackage.CONFIG__TYPE_ATTAQUE:
				setTypeAttaque((TypeAttaque)newValue);
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
			case NimaPackage.CONFIG__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case NimaPackage.CONFIG__DEFENSE:
				setDefense(DEFENSE_EDEFAULT);
				return;
			case NimaPackage.CONFIG__DEGATS:
				setDegats(DEGATS_EDEFAULT);
				return;
			case NimaPackage.CONFIG__TYPE_DEGAT:
				setTypeDegat(TYPE_DEGAT_EDEFAULT);
				return;
			case NimaPackage.CONFIG__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case NimaPackage.CONFIG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case NimaPackage.CONFIG__OWNER:
				setOwner((Archetype)null);
				return;
			case NimaPackage.CONFIG__ATTAQUE:
				setAttaque(ATTAQUE_EDEFAULT);
				return;
			case NimaPackage.CONFIG__ATTACK:
				setAttack((Attaque)null);
				return;
			case NimaPackage.CONFIG__NB_ATTAQUES:
				setNbAttaques(NB_ATTAQUES_EDEFAULT);
				return;
			case NimaPackage.CONFIG__ENCHAINE:
				setEnchaine((Config)null);
				return;
			case NimaPackage.CONFIG__TYPE_DEF:
				setTypeDef(TYPE_DEF_EDEFAULT);
				return;
			case NimaPackage.CONFIG__TYPE_ATTAQUE:
				setTypeAttaque(TYPE_ATTAQUE_EDEFAULT);
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
			case NimaPackage.CONFIG__INIT:
				return init != INIT_EDEFAULT;
			case NimaPackage.CONFIG__DEFENSE:
				return defense != DEFENSE_EDEFAULT;
			case NimaPackage.CONFIG__DEGATS:
				return degats != DEGATS_EDEFAULT;
			case NimaPackage.CONFIG__TYPE_DEGAT:
				return typeDegat != TYPE_DEGAT_EDEFAULT;
			case NimaPackage.CONFIG__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case NimaPackage.CONFIG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case NimaPackage.CONFIG__OWNER:
				return getOwner() != null;
			case NimaPackage.CONFIG__ATTAQUE:
				return attaque != ATTAQUE_EDEFAULT;
			case NimaPackage.CONFIG__ATTACK:
				return attack != null;
			case NimaPackage.CONFIG__NB_ATTAQUES:
				return nbAttaques != NB_ATTAQUES_EDEFAULT;
			case NimaPackage.CONFIG__ENCHAINE:
				return enchaine != null;
			case NimaPackage.CONFIG__TYPE_DEF:
				return typeDef != TYPE_DEF_EDEFAULT;
			case NimaPackage.CONFIG__TYPE_ATTAQUE:
				return typeAttaque != TYPE_ATTAQUE_EDEFAULT;
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
		result.append(" (init: ");
		result.append(init);
		result.append(", defense: ");
		result.append(defense);
		result.append(", degats: ");
		result.append(degats);
		result.append(", typeDegat: ");
		result.append(typeDegat);
		result.append(", nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", attaque: ");
		result.append(attaque);
		result.append(", nbAttaques: ");
		result.append(nbAttaques);
		result.append(", typeDef: ");
		result.append(typeDef);
		result.append(", typeAttaque: ");
		result.append(typeAttaque);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
