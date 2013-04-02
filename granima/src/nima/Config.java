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
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nima.Config#getInit <em>Init</em>}</li>
 *   <li>{@link nima.Config#getDefense <em>Defense</em>}</li>
 *   <li>{@link nima.Config#getDegats <em>Degats</em>}</li>
 *   <li>{@link nima.Config#getTypeDegat <em>Type Degat</em>}</li>
 *   <li>{@link nima.Config#getNom <em>Nom</em>}</li>
 *   <li>{@link nima.Config#getDescription <em>Description</em>}</li>
 *   <li>{@link nima.Config#getOwner <em>Owner</em>}</li>
 *   <li>{@link nima.Config#getAttaque <em>Attaque</em>}</li>
 *   <li>{@link nima.Config#getAttack <em>Attack</em>}</li>
 *   <li>{@link nima.Config#getNbAttaques <em>Nb Attaques</em>}</li>
 *   <li>{@link nima.Config#getEnchaine <em>Enchaine</em>}</li>
 *   <li>{@link nima.Config#getTypeDef <em>Type Def</em>}</li>
 *   <li>{@link nima.Config#getTypeAttaque <em>Type Attaque</em>}</li>
 * </ul>
 * </p>
 *
 * @see nima.NimaPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(int)
	 * @see nima.NimaPackage#getConfig_Init()
	 * @model default="0"
	 * @generated
	 */
	int getInit();

	/**
	 * Sets the value of the '{@link nima.Config#getInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(int value);

	/**
	 * Returns the value of the '<em><b>Defense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defense</em>' attribute.
	 * @see #setDefense(int)
	 * @see nima.NimaPackage#getConfig_Defense()
	 * @model
	 * @generated
	 */
	int getDefense();

	/**
	 * Sets the value of the '{@link nima.Config#getDefense <em>Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defense</em>' attribute.
	 * @see #getDefense()
	 * @generated
	 */
	void setDefense(int value);

	/**
	 * Returns the value of the '<em><b>Degats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degats</em>' attribute.
	 * @see #setDegats(int)
	 * @see nima.NimaPackage#getConfig_Degats()
	 * @model
	 * @generated
	 */
	int getDegats();

	/**
	 * Sets the value of the '{@link nima.Config#getDegats <em>Degats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degats</em>' attribute.
	 * @see #getDegats()
	 * @generated
	 */
	void setDegats(int value);

	/**
	 * Returns the value of the '<em><b>Type Degat</b></em>' attribute.
	 * The literals are from the enumeration {@link nima.typeAtt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Degat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Degat</em>' attribute.
	 * @see nima.typeAtt
	 * @see #setTypeDegat(typeAtt)
	 * @see nima.NimaPackage#getConfig_TypeDegat()
	 * @model
	 * @generated
	 */
	typeAtt getTypeDegat();

	/**
	 * Sets the value of the '{@link nima.Config#getTypeDegat <em>Type Degat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Degat</em>' attribute.
	 * @see nima.typeAtt
	 * @see #getTypeDegat()
	 * @generated
	 */
	void setTypeDegat(typeAtt value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see nima.NimaPackage#getConfig_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link nima.Config#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see nima.NimaPackage#getConfig_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link nima.Config#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaque</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaque</em>' attribute.
	 * @see #setAttaque(int)
	 * @see nima.NimaPackage#getConfig_Attaque()
	 * @model
	 * @generated
	 */
	int getAttaque();

	/**
	 * Sets the value of the '{@link nima.Config#getAttaque <em>Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attaque</em>' attribute.
	 * @see #getAttaque()
	 * @generated
	 */
	void setAttaque(int value);

	/**
	 * Returns the value of the '<em><b>Attack</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nima.Attaque#getAttaquant <em>Attaquant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack</em>' reference.
	 * @see #setAttack(Attaque)
	 * @see nima.NimaPackage#getConfig_Attack()
	 * @see nima.Attaque#getAttaquant
	 * @model opposite="attaquant"
	 * @generated
	 */
	Attaque getAttack();

	/**
	 * Sets the value of the '{@link nima.Config#getAttack <em>Attack</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack</em>' reference.
	 * @see #getAttack()
	 * @generated
	 */
	void setAttack(Attaque value);

	/**
	 * Returns the value of the '<em><b>Nb Attaques</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Attaques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Attaques</em>' attribute.
	 * @see #setNbAttaques(int)
	 * @see nima.NimaPackage#getConfig_NbAttaques()
	 * @model default="1"
	 * @generated
	 */
	int getNbAttaques();

	/**
	 * Sets the value of the '{@link nima.Config#getNbAttaques <em>Nb Attaques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Attaques</em>' attribute.
	 * @see #getNbAttaques()
	 * @generated
	 */
	void setNbAttaques(int value);

	/**
	 * Returns the value of the '<em><b>Enchaine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enchaine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enchaine</em>' reference.
	 * @see #setEnchaine(Config)
	 * @see nima.NimaPackage#getConfig_Enchaine()
	 * @model
	 * @generated
	 */
	Config getEnchaine();

	/**
	 * Sets the value of the '{@link nima.Config#getEnchaine <em>Enchaine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enchaine</em>' reference.
	 * @see #getEnchaine()
	 * @generated
	 */
	void setEnchaine(Config value);

	/**
	 * Returns the value of the '<em><b>Type Def</b></em>' attribute.
	 * The literals are from the enumeration {@link nima.TypeDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Def</em>' attribute.
	 * @see nima.TypeDef
	 * @see #setTypeDef(TypeDef)
	 * @see nima.NimaPackage#getConfig_TypeDef()
	 * @model
	 * @generated
	 */
	TypeDef getTypeDef();

	/**
	 * Sets the value of the '{@link nima.Config#getTypeDef <em>Type Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Def</em>' attribute.
	 * @see nima.TypeDef
	 * @see #getTypeDef()
	 * @generated
	 */
	void setTypeDef(TypeDef value);

	/**
	 * Returns the value of the '<em><b>Type Attaque</b></em>' attribute.
	 * The literals are from the enumeration {@link nima.TypeAttaque}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Attaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Attaque</em>' attribute.
	 * @see nima.TypeAttaque
	 * @see #setTypeAttaque(TypeAttaque)
	 * @see nima.NimaPackage#getConfig_TypeAttaque()
	 * @model
	 * @generated
	 */
	TypeAttaque getTypeAttaque();

	/**
	 * Sets the value of the '{@link nima.Config#getTypeAttaque <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Attaque</em>' attribute.
	 * @see nima.TypeAttaque
	 * @see #getTypeAttaque()
	 * @generated
	 */
	void setTypeAttaque(TypeAttaque value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='TypeDef td = this.getTypeDef();\r\nTypeAttaque ta = attaquand.getTypeAttaque();\r\nif(ta==TypeAttaque.TIR){\r\n\tif(td==TypeDef.ESQUIVE)\r\n\t\treturn 30;\r\n\tif(td==TypeDef.PARADE)\r\n\t\treturn 80;\r\n}\r\nif(ta==TypeAttaque.LANCE){\r\n\r\n\tif(td==TypeDef.PARADE)\r\n\t\treturn 50;\r\n}\r\nreturn 0;'"
	 * @generated
	 */
	int calcMalusDef(Config attaquand);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link nima.Archetype#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Archetype)
	 * @see nima.NimaPackage#getConfig_Owner()
	 * @see nima.Archetype#getConfigs
	 * @model opposite="configs" required="true" transient="false"
	 * @generated
	 */
	Archetype getOwner();

	/**
	 * Sets the value of the '{@link nima.Config#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Archetype value);

} // Config
