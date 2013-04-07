/**
 * Generated with Acceleo
 */
package nima.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;



// End of user code

/**
 * 
 * 
 */
public interface UniversPropertiesEditionPart {



	/**
	 * Init the combats
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initCombats(ReferencesTableSettings settings);

	/**
	 * Update the combats
	 * @param newValue the combats to update
	 * 
	 */
	public void updateCombats();

	/**
	 * Adds the given filter to the combats edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCombats(ViewerFilter filter);

	/**
	 * Adds the given filter to the combats edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCombats(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the combats table
	 * 
	 */
	public boolean isContainedInCombatsTable(EObject element);





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
