/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attaque</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nima.Attaque#getCible <em>Cible</em>}</li>
 *   <li>{@link nima.Attaque#getBonus <em>Bonus</em>}</li>
 *   <li>{@link nima.Attaque#getAttaquant <em>Attaquant</em>}</li>
 * </ul>
 * </p>
 *
 * @see nima.NimaPackage#getAttaque()
 * @model
 * @generated
 */
public interface Attaque extends EObject {
	/**
	 * Returns the value of the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' reference.
	 * @see #setCible(Archetype)
	 * @see nima.NimaPackage#getAttaque_Cible()
	 * @model required="true"
	 * @generated
	 */
	Archetype getCible();

	/**
	 * Sets the value of the '{@link nima.Attaque#getCible <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(Archetype value);

	/**
	 * Returns the value of the '<em><b>Bonus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus</em>' attribute.
	 * @see #setBonus(int)
	 * @see nima.NimaPackage#getAttaque_Bonus()
	 * @model
	 * @generated
	 */
	int getBonus();

	/**
	 * Sets the value of the '{@link nima.Attaque#getBonus <em>Bonus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus</em>' attribute.
	 * @see #getBonus()
	 * @generated
	 */
	void setBonus(int value);

	/**
	 * Returns the value of the '<em><b>Attaquant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaquant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaquant</em>' reference.
	 * @see #setAttaquant(Config)
	 * @see nima.NimaPackage#getAttaque_Attaquant()
	 * @model required="true"
	 * @generated
	 */
	Config getAttaquant();

	/**
	 * Sets the value of the '{@link nima.Attaque#getAttaquant <em>Attaquant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attaquant</em>' reference.
	 * @see #getAttaquant()
	 * @generated
	 */
	void setAttaquant(Config value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resolve();

} // Attaque
