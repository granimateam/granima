/**
 * Generated with Acceleo
 */
package nima.providers;

import nima.parts.NimaViewsRepository;
import nima.parts.forms.ArchetypePropertiesEditionPartForm;
import nima.parts.forms.CombatPropertiesEditionPartForm;
import nima.parts.forms.ConfigPropertiesEditionPartForm;
import nima.parts.forms.UniversPropertiesEditionPartForm;
import nima.parts.impl.ArchetypePropertiesEditionPartImpl;
import nima.parts.impl.CombatPropertiesEditionPartImpl;
import nima.parts.impl.ConfigPropertiesEditionPartImpl;
import nima.parts.impl.UniversPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;




/**
 * 
 * 
 */
public class NimaPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == NimaViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == NimaViewsRepository.Archetype.class) {
			if (kind == NimaViewsRepository.SWT_KIND)
				return new ArchetypePropertiesEditionPartImpl(component);
			if (kind == NimaViewsRepository.FORM_KIND)
				return new ArchetypePropertiesEditionPartForm(component);
		}
		if (key == NimaViewsRepository.Config.class) {
			if (kind == NimaViewsRepository.SWT_KIND)
				return new ConfigPropertiesEditionPartImpl(component);
			if (kind == NimaViewsRepository.FORM_KIND)
				return new ConfigPropertiesEditionPartForm(component);
		}
		if (key == NimaViewsRepository.Univers.class) {
			if (kind == NimaViewsRepository.SWT_KIND)
				return new UniversPropertiesEditionPartImpl(component);
			if (kind == NimaViewsRepository.FORM_KIND)
				return new UniversPropertiesEditionPartForm(component);
		}
		if (key == NimaViewsRepository.Combat.class) {
			if (kind == NimaViewsRepository.SWT_KIND)
				return new CombatPropertiesEditionPartImpl(component);
			if (kind == NimaViewsRepository.FORM_KIND)
				return new CombatPropertiesEditionPartForm(component);
		}
		return null;
	}

}
