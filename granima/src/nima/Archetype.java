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
 *   <li>{@link nima.Archetype#getNbDef <em>Nb Def</em>}</li>
 *   <li>{@link nima.Archetype#isJoueur <em>Joueur</em>}</li>
 *   <li>{@link nima.Archetype#getNbAction <em>Nb Action</em>}</li>
 *   <li>{@link nima.Archetype#isPeutAgir <em>Peut Agir</em>}</li>
 *   <li>{@link nima.Archetype#getRolledInit <em>Rolled Init</em>}</li>
 *   <li>{@link nima.Archetype#getCible <em>Cible</em>}</li>
 *   <li>{@link nima.Archetype#getHpMax <em>Hp Max</em>}</li>
 *   <li>{@link nima.Archetype#getMalusCritTemp <em>Malus Crit Temp</em>}</li>
 *   <li>{@link nima.Archetype#getBonusAtaque <em>Bonus Ataque</em>}</li>
 *   <li>{@link nima.Archetype#getBonusDef <em>Bonus Def</em>}</li>
 *   <li>{@link nima.Archetype#getCurrent <em>Current</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Nb Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Action</em>' attribute.
	 * @see #setNbAction(int)
	 * @see nima.NimaPackage#getArchetype_NbAction()
	 * @model
	 * @generated
	 */
	int getNbAction();

	/**
	 * Sets the value of the '{@link nima.Archetype#getNbAction <em>Nb Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Action</em>' attribute.
	 * @see #getNbAction()
	 * @generated
	 */
	void setNbAction(int value);

	/**
	 * Returns the value of the '<em><b>Peut Agir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Peut Agir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peut Agir</em>' attribute.
	 * @see #setPeutAgir(boolean)
	 * @see nima.NimaPackage#getArchetype_PeutAgir()
	 * @model
	 * @generated
	 */
	boolean isPeutAgir();

	/**
	 * Sets the value of the '{@link nima.Archetype#isPeutAgir <em>Peut Agir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peut Agir</em>' attribute.
	 * @see #isPeutAgir()
	 * @generated
	 */
	void setPeutAgir(boolean value);

	/**
	 * Returns the value of the '<em><b>Rolled Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rolled Init</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rolled Init</em>' attribute.
	 * @see #setRolledInit(int)
	 * @see nima.NimaPackage#getArchetype_RolledInit()
	 * @model
	 * @generated
	 */
	int getRolledInit();

	/**
	 * Sets the value of the '{@link nima.Archetype#getRolledInit <em>Rolled Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolled Init</em>' attribute.
	 * @see #getRolledInit()
	 * @generated
	 */
	void setRolledInit(int value);

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
	 * @see nima.NimaPackage#getArchetype_Cible()
	 * @model
	 * @generated
	 */
	Archetype getCible();

	/**
	 * Sets the value of the '{@link nima.Archetype#getCible <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(Archetype value);

	/**
	 * Returns the value of the '<em><b>Hp Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hp Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hp Max</em>' attribute.
	 * @see #setHpMax(int)
	 * @see nima.NimaPackage#getArchetype_HpMax()
	 * @model
	 * @generated
	 */
	int getHpMax();

	/**
	 * Sets the value of the '{@link nima.Archetype#getHpMax <em>Hp Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp Max</em>' attribute.
	 * @see #getHpMax()
	 * @generated
	 */
	void setHpMax(int value);

	/**
	 * Returns the value of the '<em><b>Malus Crit Temp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Malus Crit Temp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malus Crit Temp</em>' attribute.
	 * @see #setMalusCritTemp(int)
	 * @see nima.NimaPackage#getArchetype_MalusCritTemp()
	 * @model
	 * @generated
	 */
	int getMalusCritTemp();

	/**
	 * Sets the value of the '{@link nima.Archetype#getMalusCritTemp <em>Malus Crit Temp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Malus Crit Temp</em>' attribute.
	 * @see #getMalusCritTemp()
	 * @generated
	 */
	void setMalusCritTemp(int value);

	/**
	 * Returns the value of the '<em><b>Bonus Ataque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus Ataque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus Ataque</em>' attribute.
	 * @see #setBonusAtaque(int)
	 * @see nima.NimaPackage#getArchetype_BonusAtaque()
	 * @model
	 * @generated
	 */
	int getBonusAtaque();

	/**
	 * Sets the value of the '{@link nima.Archetype#getBonusAtaque <em>Bonus Ataque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus Ataque</em>' attribute.
	 * @see #getBonusAtaque()
	 * @generated
	 */
	void setBonusAtaque(int value);

	/**
	 * Returns the value of the '<em><b>Bonus Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus Def</em>' attribute.
	 * @see #setBonusDef(int)
	 * @see nima.NimaPackage#getArchetype_BonusDef()
	 * @model
	 * @generated
	 */
	int getBonusDef();

	/**
	 * Sets the value of the '{@link nima.Archetype#getBonusDef <em>Bonus Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus Def</em>' attribute.
	 * @see #getBonusDef()
	 * @generated
	 */
	void setBonusDef(int value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' reference.
	 * @see #setCurrent(Config)
	 * @see nima.NimaPackage#getArchetype_Current()
	 * @model
	 * @generated
	 */
	Config getCurrent();

	/**
	 * Sets the value of the '{@link nima.Archetype#getCurrent <em>Current</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Config value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if(typeAtt.CHALEUR == type)\r\n\treturn cha;\r\nif(typeAtt.ELECTRICITE == type)\r\n\treturn elec;\r\nif(typeAtt.FROID == type)\r\n\treturn cha;\r\nif(typeAtt.TRANCHANT == type)\r\n\treturn tran;\r\nif(typeAtt.CONTONDANT == type)\r\n\treturn con;\r\nif(typeAtt.PERFORANT == type)\r\n\treturn perf;\r\nif(typeAtt.ENERGIE == type)\r\n\treturn ener;\r\nreturn 0;'"
	 * @generated
	 */
	int getIP(typeAtt type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='this.setPeutAgir(true);\r\nthis.setNbAction(0);\r\nthis.setNbDef(0);\r\nint init = this.getInit() + this.getActive().getInit();\r\ninit+= Des.fullRoll();\r\nthis.setRolledInit(init);'"
	 * @generated
	 */
	void resetRound();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Archetype attaquant, defenseur;\r\nConfig attaque, defense;\r\nattaquant=this;\r\nattaque=this.getActive();\r\ndefenseur=this.getCible();\r\ndefense = defenseur.getActive();\r\n\r\n//Score de base\r\nint attaqueTotale =attaquant.getTotalAttaque();\r\nint defenseTotale=defenseur.getTotalDefense();\r\n\r\n//bonus config\r\n\r\nattaqueTotale+=attaque.getAttaque();\r\ndefenseTotale+=defense.getDefense();\r\n\t\t\r\n//bonus malus contexte\r\nif(defense.getTypeDef()==TypeDef.ESQUIVE\r\n\t\t|| defense.getTypeDef()==TypeDef.PARADE){\r\n\tint def = defenseur.getNbDef();\r\n\tif(def ==1) defenseTotale=defenseTotale-30;\r\n\tif(def ==2) defenseTotale=defenseTotale-50;\r\n\tif(def ==3) defenseTotale=defenseTotale-70;\r\n\tif(def >3) defenseTotale=defenseTotale-90;\r\n\tthis.getCible().setNbDef(def+1);\r\n}\r\n//roll\r\nSystem.out.println(\"att :\"+attaqueTotale+ \" def :\"+defenseTotale);\r\nif(attaquant.isJoueur()){\r\n\t\r\n\tInputDialog d = new InputDialog(new Shell(),\"Score du joueur\", \"Entrez le score d\'attaque au d\351s de \"+attaquant.getNom(), \"50\",null);\r\n\tint choice = d.open();\r\n\tif(choice==Window.OK) {\r\n\t\tInteger result = Integer.parseInt(d.getValue());\r\n\t\tattaqueTotale+=result;\r\n\t}else {\r\n\t\tattaqueTotale+=Des.fullRoll();\r\n\t}\r\n}else {\r\n\tattaqueTotale+=Des.fullRoll();\r\n}\r\nif(defenseur.isJoueur()) {\r\n\tInputDialog d = new InputDialog(new Shell(),\"Score du joueur\", \"Entrez le score de d\351fense au d\351s de \"+attaquant.getNom(), \"50\",null);\r\n\tint choice = d.open();\r\n\tif(choice==Window.OK) {\r\n\t\tInteger result = Integer.parseInt(d.getValue());\r\n\t\tdefenseTotale+=result;\r\n\t}else {\r\n\t\tdefenseTotale+=Des.fullRoll();\r\n\t}\r\n\t\r\n}else {\r\n\tdefenseTotale+=Des.fullRoll();\t\t\r\n}\r\nif(defenseTotale<0) defenseTotale=0;\r\nint marge = attaqueTotale - defenseTotale;\r\nSystem.out.println(\"marge : \"+marge);\r\nif(marge>0) {\r\n\tdefenseur.setPeutAgir(false);\r\n\tint absorption = 2 + defenseur.getIP(attaque.getTypeDegat());\r\n\tmarge -= absorption * 10;\r\n\tif(marge>10) {\r\n\t\tint degat = attaque.getDegats()* marge /100;\r\n\t\tint hp = defenseur.getHp()- degat;\r\n\t\tdefenseur.setHp(hp);\r\n\t\tString tab[] ={\"Ok\"}; \r\n\t\tString info = defenseur.getNom()+\" encaisse \"+degat+\" points de d\351gats. Restant : \"+hp;\r\n\t\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\t\td.open();\r\n\t}else {\r\n\t\tString tab[] ={\"Ok\"}; \r\n\t\tString info = defenseur.getNom()+\" se d\351fend de justesse. 0 D\351gat, pas d\'actions\";\r\n\t\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\t\td.open();\t\r\n\t}\r\n}else if (marge<0) {\r\n\tint result = Des.getContre(marge);\r\n\tString tab[] ={\"Ok\"}; \r\n\tString info = \"D\351fense r\351ussi par\"+defenseur.getNom()+\", contre attaque possible avec un bonus de \"+result;\r\n\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\td.open();\r\n\treturn result;\r\n}else{\r\n\tString tab[] ={\"Ok\"}; \r\n\tString info = \"D\351fense r\351ussi par\"+defenseur.getNom()+\", pas de contre attaque possible\";\r\n\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\td.open();\r\n\treturn -1;\r\n}\r\nreturn-1;'"
	 * @generated
	 */
	int attaque(int bonus);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int total = 0;\r\ntotal+=this.getAttaque();\r\ntotal+=this.getBonusAtaque();\r\ntotal+=this.getMalusCritTemp();\r\nreturn total;'"
	 * @generated
	 */
	int getTotalAttaque();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='int total = 0;\r\ntotal+=this.getDefense();\r\ntotal+=this.getBonusDef();\r\ntotal+=this.getMalusCritTemp();\r\nreturn total;'"
	 * @generated
	 */
	int getTotalDefense();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Config attaque = this.getActive();\r\nint nb  = attaque.getNbAttaques();\r\nint superbonus = bonus;\r\nwhile(nb>0){\r\n\tnb--;\r\n\tint r =attaque(superbonus);\r\n\tsuperbonus=0;\r\n\tif(r>=0){\r\n\t\tcible.baston(r);\r\n\t}\r\n\t\r\n}\r\nif(attaque.getEnchaine()!=null)\r\n{\r\n\tthis.setActive(attaque.getEnchaine());\r\n\tbaston(0);\r\n}\t'"
	 * @generated
	 */
	void baston(int bonus);

} // Archetype
