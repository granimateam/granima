/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import nima.Archetype;
import nima.Attaque;
import nima.Combat;
import nima.NimaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tool.InitComparator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.CombatImpl#getArchetypes <em>Archetypes</em>}</li>
 *   <li>{@link nima.impl.CombatImpl#getAttaques <em>Attaques</em>}</li>
 *   <li>{@link nima.impl.CombatImpl#getNbRound <em>Nb Round</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CombatImpl extends EObjectImpl implements Combat {
	/**
	 * The cached value of the '{@link #getArchetypes() <em>Archetypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchetypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Archetype> archetypes;

	/**
	 * The cached value of the '{@link #getAttaques() <em>Attaques</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttaques()
	 * @generated
	 * @ordered
	 */
	protected EList<Attaque> attaques;

	/**
	 * The default value of the '{@link #getNbRound() <em>Nb Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRound()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_ROUND_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbRound() <em>Nb Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRound()
	 * @generated
	 * @ordered
	 */
	protected int nbRound = NB_ROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NimaPackage.Literals.COMBAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Archetype> getArchetypes() {
		if (archetypes == null) {
			archetypes = new EObjectContainmentEList<Archetype>(Archetype.class, this, NimaPackage.COMBAT__ARCHETYPES);
		}
		return archetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attaque> getAttaques() {
		if (attaques == null) {
			attaques = new EObjectContainmentEList<Attaque>(Attaque.class, this, NimaPackage.COMBAT__ATTAQUES);
		}
		return attaques;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRound() {
		return nbRound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRound(int newNbRound) {
		int oldNbRound = nbRound;
		nbRound = newNbRound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NimaPackage.COMBAT__NB_ROUND, oldNbRound, nbRound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetRound() {
		setNbRound(nbRound+1);
		EList<Archetype> l = this.getArchetypes();
		for(Archetype arch : l ) {
			arch.resetRound();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetAndRun() {

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NimaPackage.COMBAT__ARCHETYPES:
				return ((InternalEList<?>)getArchetypes()).basicRemove(otherEnd, msgs);
			case NimaPackage.COMBAT__ATTAQUES:
				return ((InternalEList<?>)getAttaques()).basicRemove(otherEnd, msgs);
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
			case NimaPackage.COMBAT__ARCHETYPES:
				return getArchetypes();
			case NimaPackage.COMBAT__ATTAQUES:
				return getAttaques();
			case NimaPackage.COMBAT__NB_ROUND:
				return getNbRound();
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
			case NimaPackage.COMBAT__ARCHETYPES:
				getArchetypes().clear();
				getArchetypes().addAll((Collection<? extends Archetype>)newValue);
				return;
			case NimaPackage.COMBAT__ATTAQUES:
				getAttaques().clear();
				getAttaques().addAll((Collection<? extends Attaque>)newValue);
				return;
			case NimaPackage.COMBAT__NB_ROUND:
				setNbRound((Integer)newValue);
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
			case NimaPackage.COMBAT__ARCHETYPES:
				getArchetypes().clear();
				return;
			case NimaPackage.COMBAT__ATTAQUES:
				getAttaques().clear();
				return;
			case NimaPackage.COMBAT__NB_ROUND:
				setNbRound(NB_ROUND_EDEFAULT);
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
			case NimaPackage.COMBAT__ARCHETYPES:
				return archetypes != null && !archetypes.isEmpty();
			case NimaPackage.COMBAT__ATTAQUES:
				return attaques != null && !attaques.isEmpty();
			case NimaPackage.COMBAT__NB_ROUND:
				return nbRound != NB_ROUND_EDEFAULT;
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
		result.append(" (nbRound: ");
		result.append(nbRound);
		result.append(')');
		return result.toString();
	}

} //CombatImpl
