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
 *   <li>{@link nima.Combat#getNbRound <em>Nb Round</em>}</li>
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
	 * Returns the value of the '<em><b>Nb Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Round</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Round</em>' attribute.
	 * @see #setNbRound(int)
	 * @see nima.NimaPackage#getCombat_NbRound()
	 * @model
	 * @generated
	 */
	int getNbRound();

	/**
	 * Sets the value of the '{@link nima.Combat#getNbRound <em>Nb Round</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Round</em>' attribute.
	 * @see #getNbRound()
	 * @generated
	 */
	void setNbRound(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='setNbRound(nbRound+1);\r\nEList<Archetype> l = this.getArchetypes();\r\nfor(Archetype arch : l )\r\n{\r\n\tarch.resetRound();\r\n}'"
	 * @generated
	 */
	void resetRound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tsetNbRound(nbRound+1);\r\n\t\tLinkedList<Archetype> l =new LinkedList<Archetype>(this.getArchetypes());\r\n\t\tfor(Archetype arch : l ) {\r\n\t\t\tarch.resetRound();\r\n\t\t\t\r\n\t\t}\r\n\t\tCollections.sort(l, new InitComparator());\r\n\t\t\r\n\t\tfor(Archetype arch : l ) {\r\n\t\t\tif(arch.isPeutAgir()) {\r\n\t\t\t\tarch.baston(0);\r\n\t\t\t}\r\n\t\t\t\r\n\t\t}'"
	 * @generated
	 */
	void resetAndRun();

} // Combat
