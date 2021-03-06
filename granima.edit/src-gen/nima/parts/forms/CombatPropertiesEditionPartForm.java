/**
 * Generated with Acceleo
 */
package nima.parts.forms;

// Start of user code for imports
import nima.parts.CombatPropertiesEditionPart;
import nima.parts.NimaViewsRepository;
import nima.providers.NimaMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class CombatPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, CombatPropertiesEditionPart {

	protected Text nbRound;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CombatPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence combatStep = new BindingCompositionSequence(propertiesEditionComponent);
		combatStep
			.addStep(NimaViewsRepository.Combat.Properties.class)
			.addStep(NimaViewsRepository.Combat.Properties.nbRound);
		
		
		composer = new PartComposer(combatStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NimaViewsRepository.Combat.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Combat.Properties.nbRound) {
					return 		createNbRoundText(widgetFactory, parent);
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
		propertiesSection.setText(NimaMessages.CombatPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNbRoundText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.CombatPropertiesEditionPart_NbRoundLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Combat.Properties.nbRound, NimaViewsRepository.FORM_KIND));
		nbRound = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbRound.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbRoundData = new GridData(GridData.FILL_HORIZONTAL);
		nbRound.setLayoutData(nbRoundData);
		nbRound.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CombatPropertiesEditionPartForm.this, NimaViewsRepository.Combat.Properties.nbRound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbRound.getText()));
			}
		});
		nbRound.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CombatPropertiesEditionPartForm.this, NimaViewsRepository.Combat.Properties.nbRound, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbRound.getText()));
				}
			}
		});
		EditingUtils.setID(nbRound, NimaViewsRepository.Combat.Properties.nbRound);
		EditingUtils.setEEFtype(nbRound, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Combat.Properties.nbRound, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see nima.parts.CombatPropertiesEditionPart#getNbRound()
	 * 
	 */
	public String getNbRound() {
		return nbRound.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.CombatPropertiesEditionPart#setNbRound(String newValue)
	 * 
	 */
	public void setNbRound(String newValue) {
		if (newValue != null) {
			nbRound.setText(newValue);
		} else {
			nbRound.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NimaMessages.Combat_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
