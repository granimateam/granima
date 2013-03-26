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
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
