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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tArchetype attaquant, defenseur;\r\n\t\tConfig attaque, defense;\r\n\t\tattaque = this.getAttaquant();\r\n\t\tdefense = this.getCible().getActive();\r\n\t\tattaquant=this.getAttaquant().getOwner();\r\n\t\tdefenseur = this.getCible();\r\n\t\tint attaqueTotale = this.getAttaquant().getAttaque();\r\n\t\tattaqueTotale+= this.getBonusAtt();\r\n\t\tattaqueTotale+=Des.fullRoll();\r\n\t\tint nbatt = attaquant.getNbAction();\r\n\t\tattaqueTotale = attaqueTotale + (-25 *nbatt);\r\n\t\tthis.getAttaquant().getOwner().setNbAction(nbatt+1);\r\n\t\tint defenseTotale = this.getBonusDef();\r\n\t\tdefenseTotale+= defenseur.getActive().getDefense();\r\n\t\tdefenseTotale+=Des.fullRoll();\r\n\t\tint def = defenseur.getNbDef();\r\n\t\tif(def ==1) defenseTotale=defenseTotale-30;\r\n\t\tif(def ==2) defenseTotale=defenseTotale-50;\r\n\t\tif(def ==3) defenseTotale=defenseTotale-70;\r\n\t\tif(def >3) defenseTotale=defenseTotale-90;\r\n\t\tthis.getCible().setNbDef(def+1);\r\n\t\t\r\n\t\tint marge = attaqueTotale - defenseTotale;\r\n\t\tSystem.out.println(marge);\r\n\t\tif(marge>10)\r\n\t\t{\r\n\t\t\tdefenseur.setPeutAgir(false);\r\n\t\t\tint absorption = 2 + defenseur.getIP(attaque.getTypeDegat());\r\n\t\t\tmarge -= absorption * 10;\r\n\t\t\tif(marge>10)\r\n\t\t\t{\r\n\t\t\t\tint degat = attaque.getDegats()* marge /100;\r\n\t\t\t\tint hp = defenseur.getHp()- degat;\r\n\t\t\t\tdefenseur.setHp(hp);\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t\t//TODO contre attaque'"
	 * @generated
	 */
	void resolve();

} // Attaque
