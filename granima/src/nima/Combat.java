/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nima.Combat#getArchetypes <em>Archetypes</em>}</li>
 *   <li>{@link nima.Combat#getAttaques <em>Attaques</em>}</li>
 * </ul>
 * </p>
 *
 * @see nima.NimaPackage#getCombat()
 * @model
 * @generated
 */
public interface Combat extends EObject {
	/**
	 * Returns the value of the '<em><b>Archetypes</b></em>' containment reference list.
	 * The list contents are of type {@link nima.Archetype}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archetypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archetypes</em>' containment reference list.
	 * @see nima.NimaPackage#getCombat_Archetypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Archetype> getArchetypes();

	/**
	 * Returns the value of the '<em><b>Attaques</b></em>' containment reference list.
	 * The list contents are of type {@link nima.Attaque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaques</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaques</em>' containment reference list.
	 * @see nima.NimaPackage#getCombat_Attaques()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attaque> getAttaques();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resetRound();

} // Combat
