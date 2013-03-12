/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dual Hand Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nima.DualHandConfig#getInitGauche <em>Init Gauche</em>}</li>
 *   <li>{@link nima.DualHandConfig#getAttaqueGauche <em>Attaque Gauche</em>}</li>
 *   <li>{@link nima.DualHandConfig#getDefGauche <em>Def Gauche</em>}</li>
 *   <li>{@link nima.DualHandConfig#getDegatsGauche <em>Degats Gauche</em>}</li>
 *   <li>{@link nima.DualHandConfig#getTypeDegatGuche <em>Type Degat Guche</em>}</li>
 * </ul>
 * </p>
 *
 * @see nima.NimaPackage#getDualHandConfig()
 * @model
 * @generated
 */
public interface DualHandConfig extends ConfigCac {
	/**
	 * Returns the value of the '<em><b>Init Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Gauche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Gauche</em>' attribute.
	 * @see #setInitGauche(int)
	 * @see nima.NimaPackage#getDualHandConfig_InitGauche()
	 * @model
	 * @generated
	 */
	int getInitGauche();

	/**
	 * Sets the value of the '{@link nima.DualHandConfig#getInitGauche <em>Init Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Gauche</em>' attribute.
	 * @see #getInitGauche()
	 * @generated
	 */
	void setInitGauche(int value);

	/**
	 * Returns the value of the '<em><b>Attaque Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaque Gauche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaque Gauche</em>' attribute.
	 * @see #setAttaqueGauche(int)
	 * @see nima.NimaPackage#getDualHandConfig_AttaqueGauche()
	 * @model
	 * @generated
	 */
	int getAttaqueGauche();

	/**
	 * Sets the value of the '{@link nima.DualHandConfig#getAttaqueGauche <em>Attaque Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attaque Gauche</em>' attribute.
	 * @see #getAttaqueGauche()
	 * @generated
	 */
	void setAttaqueGauche(int value);

	/**
	 * Returns the value of the '<em><b>Def Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Gauche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Gauche</em>' attribute.
	 * @see #setDefGauche(int)
	 * @see nima.NimaPackage#getDualHandConfig_DefGauche()
	 * @model
	 * @generated
	 */
	int getDefGauche();

	/**
	 * Sets the value of the '{@link nima.DualHandConfig#getDefGauche <em>Def Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Gauche</em>' attribute.
	 * @see #getDefGauche()
	 * @generated
	 */
	void setDefGauche(int value);

	/**
	 * Returns the value of the '<em><b>Degats Gauche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degats Gauche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degats Gauche</em>' attribute.
	 * @see #setDegatsGauche(int)
	 * @see nima.NimaPackage#getDualHandConfig_DegatsGauche()
	 * @model
	 * @generated
	 */
	int getDegatsGauche();

	/**
	 * Sets the value of the '{@link nima.DualHandConfig#getDegatsGauche <em>Degats Gauche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degats Gauche</em>' attribute.
	 * @see #getDegatsGauche()
	 * @generated
	 */
	void setDegatsGauche(int value);

	/**
	 * Returns the value of the '<em><b>Type Degat Guche</b></em>' attribute.
	 * The literals are from the enumeration {@link nima.typeAtt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Degat Guche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Degat Guche</em>' attribute.
	 * @see nima.typeAtt
	 * @see #setTypeDegatGuche(typeAtt)
	 * @see nima.NimaPackage#getDualHandConfig_TypeDegatGuche()
	 * @model
	 * @generated
	 */
	typeAtt getTypeDegatGuche();

	/**
	 * Sets the value of the '{@link nima.DualHandConfig#getTypeDegatGuche <em>Type Degat Guche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Degat Guche</em>' attribute.
	 * @see nima.typeAtt
	 * @see #getTypeDegatGuche()
	 * @generated
	 */
	void setTypeDegatGuche(typeAtt value);

} // DualHandConfig
