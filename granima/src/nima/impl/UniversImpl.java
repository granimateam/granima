/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import java.util.Collection;

import nima.Archetype;
import nima.Combat;
import nima.NimaPackage;
import nima.Univers;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Univers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nima.impl.UniversImpl#getArchetypes <em>Archetypes</em>}</li>
 *   <li>{@link nima.impl.UniversImpl#getCombats <em>Combats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UniversImpl extends EObjectImpl implements Univers {
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
	 * The cached value of the '{@link #getCombats() <em>Combats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombats()
	 * @generated
	 * @ordered
	 */
	protected EList<Combat> combats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NimaPackage.Literals.UNIVERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Archetype> getArchetypes() {
		if (archetypes == null) {
			archetypes = new EObjectContainmentEList<Archetype>(Archetype.class, this, NimaPackage.UNIVERS__ARCHETYPES);
		}
		return archetypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Combat> getCombats() {
		if (combats == null) {
			combats = new EObjectContainmentEList<Combat>(Combat.class, this, NimaPackage.UNIVERS__COMBATS);
		}
		return combats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NimaPackage.UNIVERS__ARCHETYPES:
				return ((InternalEList<?>)getArchetypes()).basicRemove(otherEnd, msgs);
			case NimaPackage.UNIVERS__COMBATS:
				return ((InternalEList<?>)getCombats()).basicRemove(otherEnd, msgs);
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
			case NimaPackage.UNIVERS__ARCHETYPES:
				return getArchetypes();
			case NimaPackage.UNIVERS__COMBATS:
				return getCombats();
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
			case NimaPackage.UNIVERS__ARCHETYPES:
				getArchetypes().clear();
				getArchetypes().addAll((Collection<? extends Archetype>)newValue);
				return;
			case NimaPackage.UNIVERS__COMBATS:
				getCombats().clear();
				getCombats().addAll((Collection<? extends Combat>)newValue);
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
			case NimaPackage.UNIVERS__ARCHETYPES:
				getArchetypes().clear();
				return;
			case NimaPackage.UNIVERS__COMBATS:
				getCombats().clear();
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
			case NimaPackage.UNIVERS__ARCHETYPES:
				return archetypes != null && !archetypes.isEmpty();
			case NimaPackage.UNIVERS__COMBATS:
				return combats != null && !combats.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniversImpl
