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
 * A representation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nima.Archetype#getHp <em>Hp</em>}</li>
 *   <li>{@link nima.Archetype#getConfigs <em>Configs</em>}</li>
 *   <li>{@link nima.Archetype#getInit <em>Init</em>}</li>
 *   <li>{@link nima.Archetype#getAttaque <em>Attaque</em>}</li>
 *   <li>{@link nima.Archetype#getDefense <em>Defense</em>}</li>
 *   <li>{@link nima.Archetype#getTypeDef <em>Type Def</em>}</li>
 *   <li>{@link nima.Archetype#getRphy <em>Rphy</em>}</li>
 *   <li>{@link nima.Archetype#getRmys <em>Rmys</em>}</li>
 *   <li>{@link nima.Archetype#getRpsy <em>Rpsy</em>}</li>
 *   <li>{@link nima.Archetype#getPerf <em>Perf</em>}</li>
 *   <li>{@link nima.Archetype#getTran <em>Tran</em>}</li>
 *   <li>{@link nima.Archetype#getCon <em>Con</em>}</li>
 *   <li>{@link nima.Archetype#getCha <em>Cha</em>}</li>
 *   <li>{@link nima.Archetype#getFroid <em>Froid</em>}</li>
 *   <li>{@link nima.Archetype#getElec <em>Elec</em>}</li>
 *   <li>{@link nima.Archetype#getEner <em>Ener</em>}</li>
 *   <li>{@link nima.Archetype#getNom <em>Nom</em>}</li>
 *   <li>{@link nima.Archetype#getDescription <em>Description</em>}</li>
 *   <li>{@link nima.Archetype#getActive <em>Active</em>}</li>
 *   <li>{@link nima.Archetype#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link nima.Archetype#getNbDef <em>Nb Def</em>}</li>
 *   <li>{@link nima.Archetype#isJoueur <em>Joueur</em>}</li>
 * </ul>
 * </p>
 *
 * @see nima.NimaPackage#getArchetype()
 * @model
 * @generated
 */
public interface Archetype extends EObject {
	/**
	 * Returns the value of the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hp</em>' attribute.
	 * @see #setHp(int)
	 * @see nima.NimaPackage#getArchetype_Hp()
	 * @model
	 * @generated
	 */
	int getHp();

	/**
	 * Sets the value of the '{@link nima.Archetype#getHp <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp</em>' attribute.
	 * @see #getHp()
	 * @generated
	 */
	void setHp(int value);

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link nima.Config}.
	 * It is bidirectional and its opposite is '{@link nima.Config#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see nima.NimaPackage#getArchetype_Configs()
	 * @see nima.Config#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Config> getConfigs();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(int)
	 * @see nima.NimaPackage#getArchetype_Init()
	 * @model
	 * @generated
	 */
	int getInit();

	/**
	 * Sets the value of the '{@link nima.Archetype#getInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(int value);

	/**
	 * Returns the value of the '<em><b>Attaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaque</em>' attribute.
	 * @see #setAttaque(int)
	 * @see nima.NimaPackage#getArchetype_Attaque()
	 * @model
	 * @generated
	 */
	int getAttaque();

	/**
	 * Sets the value of the '{@link nima.Archetype#getAttaque <em>Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attaque</em>' attribute.
	 * @see #getAttaque()
	 * @generated
	 */
	void setAttaque(int value);

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
	 * @see nima.NimaPackage#getArchetype_Defense()
	 * @model
	 * @generated
	 */
	int getDefense();

	/**
	 * Sets the value of the '{@link nima.Archetype#getDefense <em>Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defense</em>' attribute.
	 * @see #getDefense()
	 * @generated
	 */
	void setDefense(int value);

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
	 * @see nima.NimaPackage#getArchetype_TypeDef()
	 * @model
	 * @generated
	 */
	TypeDef getTypeDef();

	/**
	 * Sets the value of the '{@link nima.Archetype#getTypeDef <em>Type Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Def</em>' attribute.
	 * @see nima.TypeDef
	 * @see #getTypeDef()
	 * @generated
	 */
	void setTypeDef(TypeDef value);

	/**
	 * Returns the value of the '<em><b>Rphy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rphy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rphy</em>' attribute.
	 * @see #setRphy(int)
	 * @see nima.NimaPackage#getArchetype_Rphy()
	 * @model
	 * @generated
	 */
	int getRphy();

	/**
	 * Sets the value of the '{@link nima.Archetype#getRphy <em>Rphy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rphy</em>' attribute.
	 * @see #getRphy()
	 * @generated
	 */
	void setRphy(int value);

	/**
	 * Returns the value of the '<em><b>Rmys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rmys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rmys</em>' attribute.
	 * @see #setRmys(int)
	 * @see nima.NimaPackage#getArchetype_Rmys()
	 * @model
	 * @generated
	 */
	int getRmys();

	/**
	 * Sets the value of the '{@link nima.Archetype#getRmys <em>Rmys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rmys</em>' attribute.
	 * @see #getRmys()
	 * @generated
	 */
	void setRmys(int value);

	/**
	 * Returns the value of the '<em><b>Rpsy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpsy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpsy</em>' attribute.
	 * @see #setRpsy(int)
	 * @see nima.NimaPackage#getArchetype_Rpsy()
	 * @model
	 * @generated
	 */
	int getRpsy();

	/**
	 * Sets the value of the '{@link nima.Archetype#getRpsy <em>Rpsy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpsy</em>' attribute.
	 * @see #getRpsy()
	 * @generated
	 */
	void setRpsy(int value);

	/**
	 * Returns the value of the '<em><b>Perf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf</em>' attribute.
	 * @see #setPerf(int)
	 * @see nima.NimaPackage#getArchetype_Perf()
	 * @model
	 * @generated
	 */
	int getPerf();

	/**
	 * Sets the value of the '{@link nima.Archetype#getPerf <em>Perf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perf</em>' attribute.
	 * @see #getPerf()
	 * @generated
	 */
	void setPerf(int value);

	/**
	 * Returns the value of the '<em><b>Tran</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tran</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tran</em>' attribute.
	 * @see #setTran(int)
	 * @see nima.NimaPackage#getArchetype_Tran()
	 * @model
	 * @generated
	 */
	int getTran();

	/**
	 * Sets the value of the '{@link nima.Archetype#getTran <em>Tran</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tran</em>' attribute.
	 * @see #getTran()
	 * @generated
	 */
	void setTran(int value);

	/**
	 * Returns the value of the '<em><b>Con</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Con</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Con</em>' attribute.
	 * @see #setCon(int)
	 * @see nima.NimaPackage#getArchetype_Con()
	 * @model
	 * @generated
	 */
	int getCon();

	/**
	 * Sets the value of the '{@link nima.Archetype#getCon <em>Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con</em>' attribute.
	 * @see #getCon()
	 * @generated
	 */
	void setCon(int value);

	/**
	 * Returns the value of the '<em><b>Cha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cha</em>' attribute.
	 * @see #setCha(int)
	 * @see nima.NimaPackage#getArchetype_Cha()
	 * @model
	 * @generated
	 */
	int getCha();

	/**
	 * Sets the value of the '{@link nima.Archetype#getCha <em>Cha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cha</em>' attribute.
	 * @see #getCha()
	 * @generated
	 */
	void setCha(int value);

	/**
	 * Returns the value of the '<em><b>Froid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Froid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Froid</em>' attribute.
	 * @see #setFroid(int)
	 * @see nima.NimaPackage#getArchetype_Froid()
	 * @model
	 * @generated
	 */
	int getFroid();

	/**
	 * Sets the value of the '{@link nima.Archetype#getFroid <em>Froid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Froid</em>' attribute.
	 * @see #getFroid()
	 * @generated
	 */
	void setFroid(int value);

	/**
	 * Returns the value of the '<em><b>Elec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elec</em>' attribute.
	 * @see #setElec(int)
	 * @see nima.NimaPackage#getArchetype_Elec()
	 * @model
	 * @generated
	 */
	int getElec();

	/**
	 * Sets the value of the '{@link nima.Archetype#getElec <em>Elec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elec</em>' attribute.
	 * @see #getElec()
	 * @generated
	 */
	void setElec(int value);

	/**
	 * Returns the value of the '<em><b>Ener</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ener</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ener</em>' attribute.
	 * @see #setEner(int)
	 * @see nima.NimaPackage#getArchetype_Ener()
	 * @model
	 * @generated
	 */
	int getEner();

	/**
	 * Sets the value of the '{@link nima.Archetype#getEner <em>Ener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ener</em>' attribute.
	 * @see #getEner()
	 * @generated
	 */
	void setEner(int value);

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
	 * @see nima.NimaPackage#getArchetype_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link nima.Archetype#getNom <em>Nom</em>}' attribute.
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
	 * @see nima.NimaPackage#getArchetype_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link nima.Archetype#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' reference.
	 * @see #setActive(Config)
	 * @see nima.NimaPackage#getArchetype_Active()
	 * @model
	 * @generated
	 */
	Config getActive();

	/**
	 * Sets the value of the '{@link nima.Archetype#getActive <em>Active</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Config value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(Attaque)
	 * @see nima.NimaPackage#getArchetype_EReference0()
	 * @model
	 * @generated
	 */
	Attaque getEReference0();

	/**
	 * Sets the value of the '{@link nima.Archetype#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(Attaque value);

	/**
	 * Returns the value of the '<em><b>Nb Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Def</em>' attribute.
	 * @see #setNbDef(int)
	 * @see nima.NimaPackage#getArchetype_NbDef()
	 * @model
	 * @generated
	 */
	int getNbDef();

	/**
	 * Sets the value of the '{@link nima.Archetype#getNbDef <em>Nb Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Def</em>' attribute.
	 * @see #getNbDef()
	 * @generated
	 */
	void setNbDef(int value);

	/**
	 * Returns the value of the '<em><b>Joueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joueur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joueur</em>' attribute.
	 * @see #setJoueur(boolean)
	 * @see nima.NimaPackage#getArchetype_Joueur()
	 * @model
	 * @generated
	 */
	boolean isJoueur();

	/**
	 * Sets the value of the '{@link nima.Archetype#isJoueur <em>Joueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joueur</em>' attribute.
	 * @see #isJoueur()
	 * @generated
	 */
	void setJoueur(boolean value);

} // Archetype
