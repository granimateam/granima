/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import nima.DualHandConfig;
import nima.NimaPackage;
import nima.typeAtt;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dual Hand Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.DualHandConfigImpl#getInitGauche <em>Init Gauche</em>}</li>
 *   <li>{@link nima.impl.DualHandConfigImpl#getAttaqueGauche <em>Attaque Gauche</em>}</li>
 *   <li>{@link nima.impl.DualHandConfigImpl#getDefGauche <em>Def Gauche</em>}</li>
 *   <li>{@link nima.impl.DualHandConfigImpl#getDegatsGauche <em>Degats Gauche</em>}</li>
 *   <li>{@link nima.impl.DualHandConfigImpl#getTypeDegatGuche <em>Type Degat Guche</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DualHandConfigImpl extends ConfigCacImpl implements DualHandConfig {
	/**
	 * The default value of the '{@link #getInitGauche() <em>Init Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitGauche()
	 * @generated
	 * @ordered
	 */
	protected static final int INIT_GAUCHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitGauche() <em>Init Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitGauche()
	 * @generated
	 * @ordered
	 */
	protected int initGauche = INIT_GAUCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttaqueGauche() <em>Attaque Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaqueGauche()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTAQUE_GAUCHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttaqueGauche() <em>Attaque Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaqueGauche()
	 * @generated
	 * @ordered
	 */
	protected int attaqueGauche = ATTAQUE_GAUCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefGauche() <em>Def Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefGauche()
	 * @generated
	 * @ordered
	 */
	protected static final int DEF_GAUCHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefGauche() <em>Def Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefGauche()
	 * @generated
	 * @ordered
	 */
	protected int defGauche = DEF_GAUCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegatsGauche() <em>Degats Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegatsGauche()
	 * @generated
	 * @ordered
	 */
	protected static final int DEGATS_GAUCHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDegatsGauche() <em>Degats Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegatsGauche()
	 * @generated
	 * @ordered
	 */
	protected int degatsGauche = DEGATS_GAUCHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDegatGuche() <em>Type Degat Guche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDegatGuche()
	 * @generated
	 * @ordered
	 */
	protected static final typeAtt TYPE_DEGAT_GUCHE_EDEFAULT = typeAtt.TRANCHANT;

	/**
	 * The cached value of the '{@link #getTypeDegatGuche() <em>Type Degat Guche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDegatGuche()
	 * @generated
	 * @ordered
	 */
	protected typeAtt typeDegatGuche = TYPE_DEGAT_GUCHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DualHandConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NimaPackage.Literals.DUAL_HAND_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitGauche() {
		return initGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitGauche(int newInitGauche) {
		int oldInitGauche = initGauche;
		initGauche = newInitGauche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.DUAL_HAND_CONFIG__INIT_GAUCHE, oldInitGauche, initGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttaqueGauche() {
		return attaqueGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttaqueGauche(int newAttaqueGauche) {
		int oldAttaqueGauche = attaqueGauche;
		attaqueGauche = newAttaqueGauche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.DUAL_HAND_CONFIG__ATTAQUE_GAUCHE, oldAttaqueGauche, attaqueGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefGauche() {
		return defGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefGauche(int newDefGauche) {
		int oldDefGauche = defGauche;
		defGauche = newDefGauche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.DUAL_HAND_CONFIG__DEF_GAUCHE, oldDefGauche, defGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDegatsGauche() {
		return degatsGauche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegatsGauche(int newDegatsGauche) {
		int oldDegatsGauche = degatsGauche;
		degatsGauche = newDegatsGauche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.DUAL_HAND_CONFIG__DEGATS_GAUCHE, oldDegatsGauche, degatsGauche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeAtt getTypeDegatGuche() {
		return typeDegatGuche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDegatGuche(typeAtt newTypeDegatGuche) {
		typeAtt oldTypeDegatGuche = typeDegatGuche;
		typeDegatGuche = newTypeDegatGuche == null ? TYPE_DEGAT_GUCHE_EDEFAULT : newTypeDegatGuche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE, oldTypeDegatGuche, typeDegatGuche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NimaPackage.DUAL_HAND_CONFIG__INIT_GAUCHE:
				return getInitGauche();
			case NimaPackage.DUAL_HAND_CONFIG__ATTAQUE_GAUCHE:
				return getAttaqueGauche();
			case NimaPackage.DUAL_HAND_CONFIG__DEF_GAUCHE:
				return getDefGauche();
			case NimaPackage.DUAL_HAND_CONFIG__DEGATS_GAUCHE:
				return getDegatsGauche();
			case NimaPackage.DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE:
				return getTypeDegatGuche();
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
			case NimaPackage.DUAL_HAND_CONFIG__INIT_GAUCHE:
				setInitGauche((Integer)newValue);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__ATTAQUE_GAUCHE:
				setAttaqueGauche((Integer)newValue);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__DEF_GAUCHE:
				setDefGauche((Integer)newValue);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__DEGATS_GAUCHE:
				setDegatsGauche((Integer)newValue);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE:
				setTypeDegatGuche((typeAtt)newValue);
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
			case NimaPackage.DUAL_HAND_CONFIG__INIT_GAUCHE:
				setInitGauche(INIT_GAUCHE_EDEFAULT);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__ATTAQUE_GAUCHE:
				setAttaqueGauche(ATTAQUE_GAUCHE_EDEFAULT);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__DEF_GAUCHE:
				setDefGauche(DEF_GAUCHE_EDEFAULT);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__DEGATS_GAUCHE:
				setDegatsGauche(DEGATS_GAUCHE_EDEFAULT);
				return;
			case NimaPackage.DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE:
				setTypeDegatGuche(TYPE_DEGAT_GUCHE_EDEFAULT);
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
			case NimaPackage.DUAL_HAND_CONFIG__INIT_GAUCHE:
				return initGauche != INIT_GAUCHE_EDEFAULT;
			case NimaPackage.DUAL_HAND_CONFIG__ATTAQUE_GAUCHE:
				return attaqueGauche != ATTAQUE_GAUCHE_EDEFAULT;
			case NimaPackage.DUAL_HAND_CONFIG__DEF_GAUCHE:
				return defGauche != DEF_GAUCHE_EDEFAULT;
			case NimaPackage.DUAL_HAND_CONFIG__DEGATS_GAUCHE:
				return degatsGauche != DEGATS_GAUCHE_EDEFAULT;
			case NimaPackage.DUAL_HAND_CONFIG__TYPE_DEGAT_GUCHE:
				return typeDegatGuche != TYPE_DEGAT_GUCHE_EDEFAULT;
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
		result.append(" (initGauche: ");
		result.append(initGauche);
		result.append(", attaqueGauche: ");
		result.append(attaqueGauche);
		result.append(", defGauche: ");
		result.append(defGauche);
		result.append(", degatsGauche: ");
		result.append(degatsGauche);
		result.append(", typeDegatGuche: ");
		result.append(typeDegatGuche);
		result.append(')');
		return result.toString();
	}

} //DualHandConfigImpl
