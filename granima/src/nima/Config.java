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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\r\nArchetype attaquant, defenseur;\r\nConfig attaque, defense;\r\nattaquant=this.getOwner();\r\nattaque=this;\r\ndefenseur=attaquant.getCible();\r\ndefense = defenseur.getActive();\r\nString attakname = attaque.getNom();\r\n\r\nif(!attaquant.isPeutAgir())\r\n\treturn -1;\r\n//Score de base\r\nint attaqueTotale =attaquant.getTotalAttaque();\r\nint defenseTotale=defenseur.getTotalDefense();\r\n\r\n//bonus config\r\n\r\nattaqueTotale+=attaque.getAttaque();\r\ndefenseTotale+=defense.getDefense();\r\n\t\t\r\n//bonus malus contexte\r\nif(defense.getTypeDef()==TypeDef.ESQUIVE\r\n\t\t|| defense.getTypeDef()==TypeDef.PARADE){\r\n\tint def = defenseur.getNbDef();\r\n\tif(def ==1) defenseTotale=defenseTotale-30;\r\n\tif(def ==2) defenseTotale=defenseTotale-50;\r\n\tif(def ==3) defenseTotale=defenseTotale-70;\r\n\tif(def >3) defenseTotale=defenseTotale-90;\r\n\tdefenseur.setNbDef(def+1);\r\n}\r\n//roll\r\nSystem.out.println(\"att :\"+attaqueTotale+ \" def :\"+defenseTotale);\r\nif(attaquant.isJoueur()){\r\n\t\r\n\tInputDialog d = new InputDialog(new Shell(),\"Score du joueur\", \"Entrez le score d\'attaque au d\351s de \"+attaquant.getNom(), \"50\",null);\r\n\tint choice = d.open();\r\n\tif(choice==Window.OK) {\r\n\t\tInteger result = Integer.parseInt(d.getValue());\r\n\t\tattaqueTotale+=result;\r\n\t}else {\r\n\t\tattaqueTotale+=Des.fullRoll();\r\n\t}\r\n}else {\r\n\tattaqueTotale+=Des.fullRoll();\r\n}\r\nif(defenseur.isJoueur()) {\r\n\tInputDialog d = new InputDialog(new Shell(),\"Score du joueur\", \"Entrez le score de d\351fense au d\351s de \"+attaquant.getNom(), \"50\",null);\r\n\tint choice = d.open();\r\n\tif(choice==Window.OK) {\r\n\t\tInteger result = Integer.parseInt(d.getValue());\r\n\t\tdefenseTotale+=result;\r\n\t}else {\r\n\t\tdefenseTotale+=Des.fullRoll();\r\n\t}\r\n\t\r\n}else {\r\n\tdefenseTotale+=Des.fullRoll();\t\t\r\n}\r\nif(defenseTotale<0) defenseTotale=0;\r\nint marge = attaqueTotale - defenseTotale;\r\nSystem.out.println(\"marge : \"+marge);\r\nif(marge>0) {\r\n\tdefenseur.setPeutAgir(defense.getTypeDef()==TypeDef.ENCAISSEMENT);\r\n\tint absorption = 2 + defenseur.getIP(attaque.getTypeDegat());\r\n\tmarge -= absorption * 10;\r\n\tif(marge>10) {\r\n\t\tint degat = attaque.getDegats()* marge /100;\r\n\t\tint hp = defenseur.getHp()- degat;\r\n\t\tdefenseur.setHp(hp);\r\n\t\tString tab[] ={\"Ok\"}; \r\n\t\tString info = defenseur.getNom()+\" encaisse \"+degat+\" points de d\351gats sur \"+attakname+\". Restant : \"+hp;\r\n\t\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\t\td.open();\r\n\t}else {\r\n\t\tString tab[] ={\"Ok\"}; \r\n\t\tString info = defenseur.getNom()+\" se d\351fend de justesse sur \"+attakname+\". 0 D\351gat, pas d\'actions\";\r\n\t\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\t\td.open();\t\r\n\t}\r\n}else if (marge<0) {\r\n\tint result = Des.getContre(marge);\r\n\tString tab[] ={\"Ok\"}; \r\n\tString info = \"D\351fense r\351ussi par\"+defenseur.getNom()+\", contre attaque contre \"+attakname+\" possible avec un bonus de \"+result;\r\n\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\td.open();\r\n\treturn result;\r\n}else{\r\n\tString tab[] ={\"Ok\"}; \r\n\tString info = \"D\351fense r\351ussi par\"+defenseur.getNom()+\", pas de contre attaque possible contre \"+attakname;\r\n\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\td.open();\r\n\treturn -1;\r\n}\r\nreturn-1;'"
	 * @generated
	 */
	int attaque(int bonus);

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
