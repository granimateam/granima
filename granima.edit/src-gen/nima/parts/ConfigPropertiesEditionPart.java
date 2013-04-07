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
public interface ConfigPropertiesEditionPart {

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
	 * @return the degats
	 * 
	 */
	public String getDegats();

	/**
	 * Defines a new degats
	 * @param newValue the new degats to set
	 * 
	 */
	public void setDegats(String newValue);


	/**
	 * @return the typeDegat
	 * 
	 */
	public Enumerator getTypeDegat();

	/**
	 * Init the typeDegat
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initTypeDegat(EEnum eenum, Enumerator current);

	/**
	 * Defines a new typeDegat
	 * @param newValue the new typeDegat to set
	 * 
	 */
	public void setTypeDegat(Enumerator newValue);


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
	 * @return the owner
	 * 
	 */
	public EObject getOwner();

	/**
	 * Init the owner
	 * @param settings the combo setting
	 */
	public void initOwner(EObjectFlatComboSettings settings);

	/**
	 * Defines a new owner
	 * @param newValue the new owner to set
	 * 
	 */
	public void setOwner(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOwnerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the owner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOwner(ViewerFilter filter);

	/**
	 * Adds the given filter to the owner edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOwner(ViewerFilter filter);


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
	 * @return the nbAttaques
	 * 
	 */
	public String getNbAttaques();

	/**
	 * Defines a new nbAttaques
	 * @param newValue the new nbAttaques to set
	 * 
	 */
	public void setNbAttaques(String newValue);


	/**
	 * @return the enchaine
	 * 
	 */
	public EObject getEnchaine();

	/**
	 * Init the enchaine
	 * @param settings the combo setting
	 */
	public void initEnchaine(EObjectFlatComboSettings settings);

	/**
	 * Defines a new enchaine
	 * @param newValue the new enchaine to set
	 * 
	 */
	public void setEnchaine(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEnchaineButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the enchaine edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEnchaine(ViewerFilter filter);

	/**
	 * Adds the given filter to the enchaine edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEnchaine(ViewerFilter filter);


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
	 * @return the typeAttaque
	 * 
	 */
	public Enumerator getTypeAttaque();

	/**
	 * Init the typeAttaque
	 * @param eenum the enum to manage
	 * @param current the current value
	 */
	public void initTypeAttaque(EEnum eenum, Enumerator current);

	/**
	 * Defines a new typeAttaque
	 * @param newValue the new typeAttaque to set
	 * 
	 */
	public void setTypeAttaque(Enumerator newValue);





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
