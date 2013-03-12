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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attaque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.AttaqueImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link nima.impl.AttaqueImpl#getBonus <em>Bonus</em>}</li>
 *   <li>{@link nima.impl.AttaqueImpl#getAttaquant <em>Attaquant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttaqueImpl extends EObjectImpl implements Attaque {
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
	 * The default value of the '{@link #getBonus() <em>Bonus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonus()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonus() <em>Bonus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonus()
	 * @generated
	 * @ordered
	 */
	protected int bonus = BONUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttaquant() <em>Attaquant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaquant()
	 * @generated
	 * @ordered
	 */
	protected Config attaquant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttaqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NimaPackage.Literals.ATTAQUE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.ATTAQUE__CIBLE, oldCible, cible));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ATTAQUE__CIBLE, oldCible, cible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonus(int newBonus) {
		int oldBonus = bonus;
		bonus = newBonus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ATTAQUE__BONUS, oldBonus, bonus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config getAttaquant() {
		if (attaquant != null && attaquant.eIsProxy()) {
			InternalEObject oldAttaquant = (InternalEObject)attaquant;
			attaquant = (Config)eResolveProxy(oldAttaquant);
			if (attaquant != oldAttaquant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NimaPackage.ATTAQUE__ATTAQUANT, oldAttaquant, attaquant));
			}
		}
		return attaquant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config basicGetAttaquant() {
		return attaquant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttaquant(Config newAttaquant) {
		Config oldAttaquant = attaquant;
		attaquant = newAttaquant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ATTAQUE__ATTAQUANT, oldAttaquant, attaquant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resolve() {
		int att = this.getBonus();
		att+= this.getAttaquant().getAttaque();
		att+= this.getAttaquant().getOwner().getAttaque();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NimaPackage.ATTAQUE__CIBLE:
				if (resolve) return getCible();
				return basicGetCible();
			case NimaPackage.ATTAQUE__BONUS:
				return getBonus();
			case NimaPackage.ATTAQUE__ATTAQUANT:
				if (resolve) return getAttaquant();
				return basicGetAttaquant();
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
			case NimaPackage.ATTAQUE__CIBLE:
				setCible((Archetype)newValue);
				return;
			case NimaPackage.ATTAQUE__BONUS:
				setBonus((Integer)newValue);
				return;
			case NimaPackage.ATTAQUE__ATTAQUANT:
				setAttaquant((Config)newValue);
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
			case NimaPackage.ATTAQUE__CIBLE:
				setCible((Archetype)null);
				return;
			case NimaPackage.ATTAQUE__BONUS:
				setBonus(BONUS_EDEFAULT);
				return;
			case NimaPackage.ATTAQUE__ATTAQUANT:
				setAttaquant((Config)null);
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
			case NimaPackage.ATTAQUE__CIBLE:
				return cible != null;
			case NimaPackage.ATTAQUE__BONUS:
				return bonus != BONUS_EDEFAULT;
			case NimaPackage.ATTAQUE__ATTAQUANT:
				return attaquant != null;
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
		result.append(" (bonus: ");
		result.append(bonus);
		result.append(')');
		return result.toString();
	}

} //AttaqueImpl
