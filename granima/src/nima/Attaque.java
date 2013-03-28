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
 *   <li>{@link nima.Attaque#getBonusAtt <em>Bonus Att</em>}</li>
 *   <li>{@link nima.Attaque#getAttaquant <em>Attaquant</em>}</li>
 *   <li>{@link nima.Attaque#getBonusDef <em>Bonus Def</em>}</li>
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
	 * Returns the value of the '<em><b>Bonus Att</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus Att</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus Att</em>' attribute.
	 * @see #setBonusAtt(int)
	 * @see nima.NimaPackage#getAttaque_BonusAtt()
	 * @model
	 * @generated
	 */
	int getBonusAtt();

	/**
	 * Sets the value of the '{@link nima.Attaque#getBonusAtt <em>Bonus Att</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus Att</em>' attribute.
	 * @see #getBonusAtt()
	 * @generated
	 */
	void setBonusAtt(int value);

	/**
	 * Returns the value of the '<em><b>Attaquant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nima.Config#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaquant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaquant</em>' reference.
	 * @see #setAttaquant(Config)
	 * @see nima.NimaPackage#getAttaque_Attaquant()
	 * @see nima.Config#getAttack
	 * @model opposite="attack" required="true"
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
	 * Returns the value of the '<em><b>Bonus Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bonus Def</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bonus Def</em>' attribute.
	 * @see #setBonusDef(int)
	 * @see nima.NimaPackage#getAttaque_BonusDef()
	 * @model
	 * @generated
	 */
	int getBonusDef();

	/**
	 * Sets the value of the '{@link nima.Attaque#getBonusDef <em>Bonus Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bonus Def</em>' attribute.
	 * @see #getBonusDef()
	 * @generated
	 */
	void setBonusDef(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='Archetype attaquant, defenseur;\r\nConfig attaque, defense;\r\nattaque = this.getAttaquant();\r\ndefense = this.getCible().getActive();\r\nattaquant=this.getAttaquant().getOwner();\r\ndefenseur = this.getCible();\r\nint attaqueTotale = this.getAttaquant().getAttaque();\r\nattaqueTotale+= this.getBonusAtt();\r\n\r\nint nbatt = attaquant.getNbAction();\r\nattaqueTotale = attaqueTotale + (-25 *nbatt);\r\nthis.getAttaquant().getOwner().setNbAction(nbatt+1);\r\nint defenseTotale = this.getBonusDef();\r\ndefenseTotale+= defenseur.getActive().getDefense();\r\n\r\nint def = defenseur.getNbDef();\r\nif(def ==1) defenseTotale=defenseTotale-30;\r\nif(def ==2) defenseTotale=defenseTotale-50;\r\nif(def ==3) defenseTotale=defenseTotale-70;\r\nif(def >3) defenseTotale=defenseTotale-90;\r\nthis.getCible().setNbDef(def+1);\r\nSystem.out.println(\"att :\"+attaqueTotale+ \" def :\"+defenseTotale);\r\nif(attaquant.isJoueur()){\r\n\t\r\n\tInputDialog d = new InputDialog(new Shell(),\"Score du joueur\", \"Entrez le score d\'attaque au d\351s de \"+attaquant.getNom(), \"50\",null);\r\n\tint choice = d.open();\r\n\tif(choice==Window.OK)\r\n\t{\r\n\t\tInteger result = Integer.parseInt(d.getValue());\r\n\t\tattaqueTotale+=result;\r\n\t}else\r\n\t{\r\n\t\tattaqueTotale+=Des.fullRoll();\r\n\t}\r\n}else\r\n{\r\n\tattaqueTotale+=Des.fullRoll();\r\n}\r\nif(defenseur.isJoueur())\r\n{\r\n\tInputDialog d = new InputDialog(new Shell(),\"Score du joueur\", \"Entrez le score de d\351fense au d\351s de \"+attaquant.getNom(), \"50\",null);\r\n\tint choice = d.open();\r\n\tif(choice==Window.OK)\r\n\t{\r\n\t\tInteger result = Integer.parseInt(d.getValue());\r\n\t\tdefenseTotale+=result;\r\n\t}else\r\n\t{\r\n\t\tdefenseTotale+=Des.fullRoll();\r\n\t}\r\n\t\r\n}else\r\n{\r\n\tdefenseTotale+=Des.fullRoll();\t\t\r\n}\r\nif(defenseTotale<0) defenseTotale=0;\r\nint marge = attaqueTotale - defenseTotale;\r\nSystem.out.println(\"marge : \"+marge);\r\nif(marge>10) {\r\n\tdefenseur.setPeutAgir(false);\r\n\tint absorption = 2 + defenseur.getIP(attaque.getTypeDegat());\r\n\tmarge -= absorption * 10;\r\n\tif(marge>10) {\r\n\t\tint degat = attaque.getDegats()* marge /100;\r\n\t\tint hp = defenseur.getHp()- degat;\r\n\t\tdefenseur.setHp(hp);\r\n\t\tString tab[] ={\"Ok\"}; \r\n\t\tString info = \"La cible encaisse \"+degat+\" points de d\351gats. Restant : \"+hp;\r\n\t\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\t\td.open();\r\n\t}\r\n}else if (marge<-10) {\r\n\tint result = marge/10;\r\n\tresult *=-5;\r\n\tString tab[] ={\"Ok\"}; \r\n\tString info = \"D\351fense r\351ussi, contre attaque possible avec un bonus de \"+result;\r\n\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\td.open();\r\n}else{\r\n\tString tab[] ={\"Ok\"}; \r\n\tString info = \"d\351fense r\351ussi, pas de contre attaque possible\";\r\n\tMessageDialog d = new MessageDialog(new Shell(), \"R\351sultat\", null, info, 0, tab, 0);\r\n\td.open();\r\n}'"
	 * @generated
	 */
	void resolve();

} // Attaque
