/**
 * Generated with Acceleo
 */
package nima.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface ArchetypePropertiesEditionPart {

	/**
	 * @return the hp
	 * 
	 */
	public String getHp();

	/**
	 * Defines a new hp
	 * @param newValue the new hp to set
	 * 
	 */
	public void setHp(String newValue);


	/**
	 * @return the init
	 * 
	 */
	public String getInit();

	/**
	 * Defines a new init
	 * @param newValue the new init to set
	 * 
	 */
	public void setInit(String newValue);


	/**
	 * @return the attaque
	 * 
	 */
	public String getAttaque();

	/**
	 * Defines a new attaque
	 * @param newValue the new attaque to set
	 * 
	 */
	public void setAttaque(String newValue);


	/**
	 * @return the defense
	 * 
	 */
	public String getDefense();

	/**
	 * Defines a new defense
	 * @param newValue the new defense to set
	 * 
	 */
	public void setDefense(String newValue);


	/**
	 * @return the typeDef
	 * 
	 */
	public Enumerator getTypeDef();

	/**
	 * Init the typeDef
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initTypeDef(EEnum eenum, Enumerator current);

	/**
	 * Defines a new typeDef
	 * @param newValue the new typeDef to set
	 * 
	 */
	public void setTypeDef(Enumerator newValue);


	/**
	 * @return the rphy
	 * 
	 */
	public String getRphy();

	/**
	 * Defines a new rphy
	 * @param newValue the new rphy to set
	 * 
	 */
	public void setRphy(String newValue);


	/**
	 * @return the rmys
	 * 
	 */
	public String getRmys();

	/**
	 * Defines a new rmys
	 * @param newValue the new rmys to set
	 * 
	 */
	public void setRmys(String newValue);


	/**
	 * @return the rpsy
	 * 
	 */
	public String getRpsy();

	/**
	 * Defines a new rpsy
	 * @param newValue the new rpsy to set
	 * 
	 */
	public void setRpsy(String newValue);


	/**
	 * @return the perf
	 * 
	 */
	public String getPerf();

	/**
	 * Defines a new perf
	 * @param newValue the new perf to set
	 * 
	 */
	public void setPerf(String newValue);


	/**
	 * @return the tran
	 * 
	 */
	public String getTran();

	/**
	 * Defines a new tran
	 * @param newValue the new tran to set
	 * 
	 */
	public void setTran(String newValue);


	/**
	 * @return the con
	 * 
	 */
	public String getCon();

	/**
	 * Defines a new con
	 * @param newValue the new con to set
	 * 
	 */
	public void setCon(String newValue);


	/**
	 * @return the cha
	 * 
	 */
	public String getCha();

	/**
	 * Defines a new cha
	 * @param newValue the new cha to set
	 * 
	 */
	public void setCha(String newValue);


	/**
	 * @return the froid
	 * 
	 */
	public String getFroid();

	/**
	 * Defines a new froid
	 * @param newValue the new froid to set
	 * 
	 */
	public void setFroid(String newValue);


	/**
	 * @return the elec
	 * 
	 */
	public String getElec();

	/**
	 * Defines a new elec
	 * @param newValue the new elec to set
	 * 
	 */
	public void setElec(String newValue);


	/**
	 * @return the ener
	 * 
	 */
	public String getEner();

	/**
	 * Defines a new ener
	 * @param newValue the new ener to set
	 * 
	 */
	public void setEner(String newValue);


	/**
	 * @return the nom
	 * 
	 */
	public String getNom();

	/**
	 * Defines a new nom
	 * @param newValue the new nom to set
	 * 
	 */
	public void setNom(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the active
	 * 
	 */
	public EObject getActive();

	/**
	 * Init the active
	 * @param settings the combo setting
	 */
	public void initActive(EObjectFlatComboSettings settings);

	/**
	 * Defines a new active
	 * @param newValue the new active to set
	 * 
	 */
	public void setActive(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setActiveButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the active edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToActive(ViewerFilter filter);

	/**
	 * Adds the given filter to the active edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToActive(ViewerFilter filter);


	/**
	 * @return the nbDef
	 * 
	 */
	public String getNbDef();

	/**
	 * Defines a new nbDef
	 * @param newValue the new nbDef to set
	 * 
	 */
	public void setNbDef(String newValue);


	/**
	 * @return the joueur
	 * 
	 */
	public Boolean getJoueur();

	/**
	 * Defines a new joueur
	 * @param newValue the new joueur to set
	 * 
	 */
	public void setJoueur(Boolean newValue);


	/**
	 * @return the nbAction
	 * 
	 */
	public String getNbAction();

	/**
	 * Defines a new nbAction
	 * @param newValue the new nbAction to set
	 * 
	 */
	public void setNbAction(String newValue);


	/**
	 * @return the peutAgir
	 * 
	 */
	public Boolean getPeutAgir();

	/**
	 * Defines a new peutAgir
	 * @param newValue the new peutAgir to set
	 * 
	 */
	public void setPeutAgir(Boolean newValue);


	/**
	 * @return the rolledInit
	 * 
	 */
	public String getRolledInit();

	/**
	 * Defines a new rolledInit
	 * @param newValue the new rolledInit to set
	 * 
	 */
	public void setRolledInit(String newValue);


	/**
	 * @return the cible
	 * 
	 */
	public EObject getCible();

	/**
	 * Init the cible
	 * @param settings the combo setting
	 */
	public void initCible(EObjectFlatComboSettings settings);

	/**
	 * Defines a new cible
	 * @param newValue the new cible to set
	 * 
	 */
	public void setCible(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCibleButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the cible edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCible(ViewerFilter filter);

	/**
	 * Adds the given filter to the cible edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCible(ViewerFilter filter);


	/**
	 * @return the hpMax
	 * 
	 */
	public String getHpMax();

	/**
	 * Defines a new hpMax
	 * @param newValue the new hpMax to set
	 * 
	 */
	public void setHpMax(String newValue);


	/**
	 * @return the malusCritTemp
	 * 
	 */
	public String getMalusCritTemp();

	/**
	 * Defines a new malusCritTemp
	 * @param newValue the new malusCritTemp to set
	 * 
	 */
	public void setMalusCritTemp(String newValue);


	/**
	 * @return the bonusAtaque
	 * 
	 */
	public String getBonusAtaque();

	/**
	 * Defines a new bonusAtaque
	 * @param newValue the new bonusAtaque to set
	 * 
	 */
	public void setBonusAtaque(String newValue);


	/**
	 * @return the bonusDef
	 * 
	 */
	public String getBonusDef();

	/**
	 * Defines a new bonusDef
	 * @param newValue the new bonusDef to set
	 * 
	 */
	public void setBonusDef(String newValue);


	/**
	 * @return the current
	 * 
	 */
	public EObject getCurrent();

	/**
	 * Init the current
	 * @param settings the combo setting
	 */
	public void initCurrent(EObjectFlatComboSettings settings);

	/**
	 * Defines a new current
	 * @param newValue the new current to set
	 * 
	 */
	public void setCurrent(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCurrentButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the current edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCurrent(ViewerFilter filter);

	/**
	 * Adds the given filter to the current edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCurrent(ViewerFilter filter);


	/**
	 * @return the contre
	 * 
	 */
	public EObject getContre();

	/**
	 * Init the contre
	 * @param settings the combo setting
	 */
	public void initContre(EObjectFlatComboSettings settings);

	/**
	 * Defines a new contre
	 * @param newValue the new contre to set
	 * 
	 */
	public void setContre(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setContreButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the contre edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToContre(ViewerFilter filter);

	/**
	 * Adds the given filter to the contre edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToContre(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
