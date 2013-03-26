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
 * A representation of the model object '<em><b>Univers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nima.Univers#getArchetypes <em>Archetypes</em>}</li>
 *   <li>{@link nima.Univers#getCombats <em>Combats</em>}</li>
 * </ul>
 * </p>
 *
 * @see nima.NimaPackage#getUnivers()
 * @model
 * @generated
 */
public interface Univers extends EObject {
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
	 * @see nima.NimaPackage#getUnivers_Archetypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Archetype> getArchetypes();

	/**
	 * Returns the value of the '<em><b>Combats</b></em>' containment reference list.
	 * The list contents are of type {@link nima.Combat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combats</em>' containment reference list.
	 * @see nima.NimaPackage#getUnivers_Combats()
	 * @model containment="true"
	 * @generated
	 */
	EList<Combat> getCombats();

} // Univers
