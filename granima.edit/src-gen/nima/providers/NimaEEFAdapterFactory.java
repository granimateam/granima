/**
 * Generated with Acceleo
 */
package nima.providers;

import nima.util.NimaAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;


/**
 * 
 * 
 */
public class NimaEEFAdapterFactory extends NimaAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see .nima.util.NimaAdapterFactory#createArchetypeAdapter()
	 * 
	 */
	public Adapter createArchetypeAdapter() {
		return new ArchetypePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .nima.util.NimaAdapterFactory#createConfigAdapter()
	 * 
	 */
	public Adapter createConfigAdapter() {
		return new ConfigPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .nima.util.NimaAdapterFactory#createUniversAdapter()
	 * 
	 */
	public Adapter createUniversAdapter() {
		return new UniversPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see .nima.util.NimaAdapterFactory#createCombatAdapter()
	 * 
	 */
	public Adapter createCombatAdapter() {
		return new CombatPropertiesEditionProvider();
	}

}
