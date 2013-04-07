/**
 * Generated with Acceleo
 */
package nima.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import nima.parts.NimaViewsRepository;
import nima.parts.UniversPropertiesEditionPart;
import nima.providers.NimaMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class UniversPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, UniversPropertiesEditionPart {

	protected ReferencesTable combats;
	protected List<ViewerFilter> combatsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> combatsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public UniversPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence universStep = new BindingCompositionSequence(propertiesEditionComponent);
		universStep
			.addStep(NimaViewsRepository.Univers.Properties.class)
			.addStep(NimaViewsRepository.Univers.Properties.combats);
		
		
		composer = new PartComposer(universStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NimaViewsRepository.Univers.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Univers.Properties.combats) {
					return createCombatsTableComposition(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(NimaMessages.UniversPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createCombatsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.combats = new ReferencesTable(NimaMessages.UniversPropertiesEditionPart_CombatsLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UniversPropertiesEditionPartForm.this, NimaViewsRepository.Univers.Properties.combats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				combats.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UniversPropertiesEditionPartForm.this, NimaViewsRepository.Univers.Properties.combats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				combats.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UniversPropertiesEditionPartForm.this, NimaViewsRepository.Univers.Properties.combats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				combats.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UniversPropertiesEditionPartForm.this, NimaViewsRepository.Univers.Properties.combats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				combats.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.combatsFilters) {
			this.combats.addFilter(filter);
		}
		this.combats.setHelpText(propertiesEditionComponent.getHelpContent(NimaViewsRepository.Univers.Properties.combats, NimaViewsRepository.FORM_KIND));
		this.combats.createControls(parent, widgetFactory);
		this.combats.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(UniversPropertiesEditionPartForm.this, NimaViewsRepository.Univers.Properties.combats, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData combatsData = new GridData(GridData.FILL_HORIZONTAL);
		combatsData.horizontalSpan = 3;
		this.combats.setLayoutData(combatsData);
		this.combats.setLowerBound(0);
		this.combats.setUpperBound(-1);
		combats.setID(NimaViewsRepository.Univers.Properties.combats);
		combats.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		return parent;
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.UniversPropertiesEditionPart#initCombats(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCombats(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		combats.setContentProvider(contentProvider);
		combats.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.UniversPropertiesEditionPart#updateCombats()
	 * 
	 */
	public void updateCombats() {
	combats.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.UniversPropertiesEditionPart#addFilterCombats(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCombats(ViewerFilter filter) {
		combatsFilters.add(filter);
		if (this.combats != null) {
			this.combats.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.UniversPropertiesEditionPart#addBusinessFilterCombats(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCombats(ViewerFilter filter) {
		combatsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.UniversPropertiesEditionPart#isContainedInCombatsTable(EObject element)
	 * 
	 */
	public boolean isContainedInCombatsTable(EObject element) {
		return ((ReferencesTableSettings)combats.getInput()).contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NimaMessages.Univers_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
