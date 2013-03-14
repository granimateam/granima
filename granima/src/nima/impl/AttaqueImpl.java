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

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import tool.Des;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attaque</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.AttaqueImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link nima.impl.AttaqueImpl#getBonusAtt <em>Bonus Att</em>}</li>
 *   <li>{@link nima.impl.AttaqueImpl#getAttaquant <em>Attaquant</em>}</li>
 *   <li>{@link nima.impl.AttaqueImpl#getBonusDef <em>Bonus Def</em>}</li>
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
	 * The default value of the '{@link #getBonusAtt() <em>Bonus Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusAtt()
	 * @generated
	 * @ordered
	 */
	protected static final int BONUS_ATT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBonusAtt() <em>Bonus Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBonusAtt()
	 * @generated
	 * @ordered
	 */
	protected int bonusAtt = BONUS_ATT_EDEFAULT;

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
	public int getBonusAtt() {
		return bonusAtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBonusAtt(int newBonusAtt) {
		int oldBonusAtt = bonusAtt;
		bonusAtt = newBonusAtt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ATTAQUE__BONUS_ATT, oldBonusAtt, bonusAtt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.ATTAQUE__BONUS_DEF, oldBonusDef, bonusDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void resolve() {
		Archetype attaquant, defenseur;
		Config attaque, defense;
		attaque = this.getAttaquant();
		defense = this.getCible().getActive();
		attaquant=this.getAttaquant().getOwner();
		defenseur = this.getCible();
		int attaqueTotale = this.getAttaquant().getAttaque();
		attaqueTotale+= this.getBonusAtt();
		attaqueTotale+=Des.fullRoll();
		int nbatt = attaquant.getNbAction();
		attaqueTotale = attaqueTotale + (-25 *nbatt);
		this.getAttaquant().getOwner().setNbAction(nbatt+1);
		int defenseTotale = this.getBonusDef();
		defenseTotale+= defenseur.getActive().getDefense();
		defenseTotale+=Des.fullRoll();
		int def = defenseur.getNbDef();
		if(def ==1) defenseTotale=defenseTotale-30;
		if(def ==2) defenseTotale=defenseTotale-50;
		if(def ==3) defenseTotale=defenseTotale-70;
		if(def >3) defenseTotale=defenseTotale-90;
		this.getCible().setNbDef(def+1);
		
		int marge = attaqueTotale - defenseTotale;
		System.out.println(marge);
		if(marge>10)
		{
			defenseur.setPeutAgir(false);
			int absorption = 2 + defenseur.getIP(attaque.getTypeDegat());
			marge -= absorption * 10;
			if(marge>10)
			{
				int degat = attaque.getDegats()* marge /100;
				int hp = defenseur.getHp()- degat;
				defenseur.setHp(hp);
				
			}
		}
		//TODO contre attaque
		
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
			case NimaPackage.ATTAQUE__BONUS_ATT:
				return getBonusAtt();
			case NimaPackage.ATTAQUE__ATTAQUANT:
				if (resolve) return getAttaquant();
				return basicGetAttaquant();
			case NimaPackage.ATTAQUE__BONUS_DEF:
				return getBonusDef();
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
			case NimaPackage.ATTAQUE__BONUS_ATT:
				setBonusAtt((Integer)newValue);
				return;
			case NimaPackage.ATTAQUE__ATTAQUANT:
				setAttaquant((Config)newValue);
				return;
			case NimaPackage.ATTAQUE__BONUS_DEF:
				setBonusDef((Integer)newValue);
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
			case NimaPackage.ATTAQUE__BONUS_ATT:
				setBonusAtt(BONUS_ATT_EDEFAULT);
				return;
			case NimaPackage.ATTAQUE__ATTAQUANT:
				setAttaquant((Config)null);
				return;
			case NimaPackage.ATTAQUE__BONUS_DEF:
				setBonusDef(BONUS_DEF_EDEFAULT);
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
			case NimaPackage.ATTAQUE__BONUS_ATT:
				return bonusAtt != BONUS_ATT_EDEFAULT;
			case NimaPackage.ATTAQUE__ATTAQUANT:
				return attaquant != null;
			case NimaPackage.ATTAQUE__BONUS_DEF:
				return bonusDef != BONUS_DEF_EDEFAULT;
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
		result.append(" (bonusAtt: ");
		result.append(bonusAtt);
		result.append(", bonusDef: ");
		result.append(bonusDef);
		result.append(')');
		return result.toString();
	}

} //AttaqueImpl
