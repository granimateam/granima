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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='setNbRound(nbRound+1);\r\nEList<Archetype> l = this.getArchetypes();\r\nfor(Archetype arch : l ) {\r\n\tarch.resetRound();\r\n\t\r\n}\r\nCollections.sort(l, new InitComparator());\r\n\r\nfor(Archetype arch : l ) {\r\n\tif(arch.isPeutAgir())\r\n\t{\r\n\t\tarch.getActive().getAttack().resolve();\r\n\t}\r\n\t\r\n}'"
	 * @generated
	 */
	void resetAndRun();

} // Combat
