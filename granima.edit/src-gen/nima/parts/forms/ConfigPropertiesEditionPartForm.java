/**
 * Generated with Acceleo
 */
package nima.parts.forms;

// Start of user code for imports
import nima.parts.ConfigPropertiesEditionPart;
import nima.parts.NimaViewsRepository;
import nima.providers.NimaMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
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
public class ConfigPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ConfigPropertiesEditionPart {

	protected Text init;
	protected Text defense;
	protected Text degats;
	protected EMFComboViewer typeDegat;
	protected Text nom;
	protected Text description;
	protected EObjectFlatComboViewer owner;
	protected Text attaque;
	protected Text nbAttaques;
	protected EObjectFlatComboViewer enchaine;
	protected EMFComboViewer typeDef;
	protected EMFComboViewer typeAttaque;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ConfigPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence configStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = configStep.addStep(NimaViewsRepository.Config.Properties.class);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.init);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.defense);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.degats);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.typeDegat);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.nom);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.description);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.owner);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.attaque);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.nbAttaques);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.enchaine);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.typeDef);
		propertiesStep.addStep(NimaViewsRepository.Config.Properties.typeAttaque);
		
		
		composer = new PartComposer(configStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NimaViewsRepository.Config.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.init) {
					return 		createInitText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.defense) {
					return 		createDefenseText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.degats) {
					return 		createDegatsText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.typeDegat) {
					return createTypeDegatEMFComboViewer(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.nom) {
					return 		createNomText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.owner) {
					return createOwnerFlatComboViewer(parent, widgetFactory);
				}
				if (key == NimaViewsRepository.Config.Properties.attaque) {
					return 		createAttaqueText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.nbAttaques) {
					return 		createNbAttaquesText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.enchaine) {
					return createEnchaineFlatComboViewer(parent, widgetFactory);
				}
				if (key == NimaViewsRepository.Config.Properties.typeDef) {
					return createTypeDefEMFComboViewer(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Config.Properties.typeAttaque) {
					return createTypeAttaqueEMFComboViewer(widgetFactory, parent);
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
		propertiesSection.setText(NimaMessages.ConfigPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createInitText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_InitLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.init, NimaViewsRepository.FORM_KIND));
		init = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		init.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData initData = new GridData(GridData.FILL_HORIZONTAL);
		init.setLayoutData(initData);
		init.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
			}
		});
		init.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
				}
			}
		});
		EditingUtils.setID(init, NimaViewsRepository.Config.Properties.init);
		EditingUtils.setEEFtype(init, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.init, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDefenseText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_DefenseLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.defense, NimaViewsRepository.FORM_KIND));
		defense = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		defense.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData defenseData = new GridData(GridData.FILL_HORIZONTAL);
		defense.setLayoutData(defenseData);
		defense.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
			}
		});
		defense.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
				}
			}
		});
		EditingUtils.setID(defense, NimaViewsRepository.Config.Properties.defense);
		EditingUtils.setEEFtype(defense, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.defense, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDegatsText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_DegatsLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.degats, NimaViewsRepository.FORM_KIND));
		degats = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		degats.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData degatsData = new GridData(GridData.FILL_HORIZONTAL);
		degats.setLayoutData(degatsData);
		degats.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.degats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, degats.getText()));
			}
		});
		degats.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.degats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, degats.getText()));
				}
			}
		});
		EditingUtils.setID(degats, NimaViewsRepository.Config.Properties.degats);
		EditingUtils.setEEFtype(degats, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.degats, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeDegatEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_TypeDegatLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.typeDegat, NimaViewsRepository.FORM_KIND));
		typeDegat = new EMFComboViewer(parent);
		typeDegat.setContentProvider(new ArrayContentProvider());
		typeDegat.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeDegatData = new GridData(GridData.FILL_HORIZONTAL);
		typeDegat.getCombo().setLayoutData(typeDegatData);
		typeDegat.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.typeDegat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDegat()));
			}

		});
		typeDegat.setID(NimaViewsRepository.Config.Properties.typeDegat);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.typeDegat, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNomText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_NomLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.nom, NimaViewsRepository.FORM_KIND));
		nom = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nom.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nomData = new GridData(GridData.FILL_HORIZONTAL);
		nom.setLayoutData(nomData);
		nom.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
			}
		});
		nom.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
				}
			}
		});
		EditingUtils.setID(nom, NimaViewsRepository.Config.Properties.nom);
		EditingUtils.setEEFtype(nom, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.nom, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.description, NimaViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, NimaViewsRepository.Config.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.description, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOwnerFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.owner, NimaViewsRepository.FORM_KIND));
		owner = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.owner, NimaViewsRepository.FORM_KIND));
		widgetFactory.adapt(owner);
		owner.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData ownerData = new GridData(GridData.FILL_HORIZONTAL);
		owner.setLayoutData(ownerData);
		owner.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOwner()));
			}

		});
		owner.setID(NimaViewsRepository.Config.Properties.owner);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.owner, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAttaqueText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_AttaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.attaque, NimaViewsRepository.FORM_KIND));
		attaque = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		attaque.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData attaqueData = new GridData(GridData.FILL_HORIZONTAL);
		attaque.setLayoutData(attaqueData);
		attaque.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
			}
		});
		attaque.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
				}
			}
		});
		EditingUtils.setID(attaque, NimaViewsRepository.Config.Properties.attaque);
		EditingUtils.setEEFtype(attaque, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.attaque, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNbAttaquesText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_NbAttaquesLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.nbAttaques, NimaViewsRepository.FORM_KIND));
		nbAttaques = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbAttaques.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbAttaquesData = new GridData(GridData.FILL_HORIZONTAL);
		nbAttaques.setLayoutData(nbAttaquesData);
		nbAttaques.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.nbAttaques, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAttaques.getText()));
			}
		});
		nbAttaques.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.nbAttaques, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAttaques.getText()));
				}
			}
		});
		EditingUtils.setID(nbAttaques, NimaViewsRepository.Config.Properties.nbAttaques);
		EditingUtils.setEEFtype(nbAttaques, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.nbAttaques, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEnchaineFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_EnchaineLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.enchaine, NimaViewsRepository.FORM_KIND));
		enchaine = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.enchaine, NimaViewsRepository.FORM_KIND));
		widgetFactory.adapt(enchaine);
		enchaine.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData enchaineData = new GridData(GridData.FILL_HORIZONTAL);
		enchaine.setLayoutData(enchaineData);
		enchaine.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.enchaine, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEnchaine()));
			}

		});
		enchaine.setID(NimaViewsRepository.Config.Properties.enchaine);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.enchaine, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeDefEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_TypeDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.typeDef, NimaViewsRepository.FORM_KIND));
		typeDef = new EMFComboViewer(parent);
		typeDef.setContentProvider(new ArrayContentProvider());
		typeDef.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeDefData = new GridData(GridData.FILL_HORIZONTAL);
		typeDef.getCombo().setLayoutData(typeDefData);
		typeDef.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.typeDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDef()));
			}

		});
		typeDef.setID(NimaViewsRepository.Config.Properties.typeDef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.typeDef, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeAttaqueEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ConfigPropertiesEditionPart_TypeAttaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.typeAttaque, NimaViewsRepository.FORM_KIND));
		typeAttaque = new EMFComboViewer(parent);
		typeAttaque.setContentProvider(new ArrayContentProvider());
		typeAttaque.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeAttaqueData = new GridData(GridData.FILL_HORIZONTAL);
		typeAttaque.getCombo().setLayoutData(typeAttaqueData);
		typeAttaque.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartForm.this, NimaViewsRepository.Config.Properties.typeAttaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeAttaque()));
			}

		});
		typeAttaque.setID(NimaViewsRepository.Config.Properties.typeAttaque);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.typeAttaque, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see nima.parts.ConfigPropertiesEditionPart#getInit()
	 * 
	 */
	public String getInit() {
		return init.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setInit(String newValue)
	 * 
	 */
	public void setInit(String newValue) {
		if (newValue != null) {
			init.setText(newValue);
		} else {
			init.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getDefense()
	 * 
	 */
	public String getDefense() {
		return defense.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setDefense(String newValue)
	 * 
	 */
	public void setDefense(String newValue) {
		if (newValue != null) {
			defense.setText(newValue);
		} else {
			defense.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getDegats()
	 * 
	 */
	public String getDegats() {
		return degats.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setDegats(String newValue)
	 * 
	 */
	public void setDegats(String newValue) {
		if (newValue != null) {
			degats.setText(newValue);
		} else {
			degats.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getTypeDegat()
	 * 
	 */
	public Enumerator getTypeDegat() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) typeDegat.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#initTypeDegat(EEnum eenum, Enumerator current)
	 */
	public void initTypeDegat(EEnum eenum, Enumerator current) {
		typeDegat.setInput(eenum.getELiterals());
		typeDegat.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setTypeDegat(Enumerator newValue)
	 * 
	 */
	public void setTypeDegat(Enumerator newValue) {
		typeDegat.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getNom()
	 * 
	 */
	public String getNom() {
		return nom.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setNom(String newValue)
	 * 
	 */
	public void setNom(String newValue) {
		if (newValue != null) {
			nom.setText(newValue);
		} else {
			nom.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getOwner()
	 * 
	 */
	public EObject getOwner() {
		if (owner.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) owner.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#initOwner(EObjectFlatComboSettings)
	 */
	public void initOwner(EObjectFlatComboSettings settings) {
		owner.setInput(settings);
		if (current != null) {
			owner.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setOwner(EObject newValue)
	 * 
	 */
	public void setOwner(EObject newValue) {
		if (newValue != null) {
			owner.setSelection(new StructuredSelection(newValue));
		} else {
			owner.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setOwnerButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOwnerButtonMode(ButtonsModeEnum newValue) {
		owner.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#addFilterOwner(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOwner(ViewerFilter filter) {
		owner.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#addBusinessFilterOwner(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOwner(ViewerFilter filter) {
		owner.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getAttaque()
	 * 
	 */
	public String getAttaque() {
		return attaque.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setAttaque(String newValue)
	 * 
	 */
	public void setAttaque(String newValue) {
		if (newValue != null) {
			attaque.setText(newValue);
		} else {
			attaque.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getNbAttaques()
	 * 
	 */
	public String getNbAttaques() {
		return nbAttaques.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setNbAttaques(String newValue)
	 * 
	 */
	public void setNbAttaques(String newValue) {
		if (newValue != null) {
			nbAttaques.setText(newValue);
		} else {
			nbAttaques.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getEnchaine()
	 * 
	 */
	public EObject getEnchaine() {
		if (enchaine.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) enchaine.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#initEnchaine(EObjectFlatComboSettings)
	 */
	public void initEnchaine(EObjectFlatComboSettings settings) {
		enchaine.setInput(settings);
		if (current != null) {
			enchaine.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setEnchaine(EObject newValue)
	 * 
	 */
	public void setEnchaine(EObject newValue) {
		if (newValue != null) {
			enchaine.setSelection(new StructuredSelection(newValue));
		} else {
			enchaine.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setEnchaineButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEnchaineButtonMode(ButtonsModeEnum newValue) {
		enchaine.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#addFilterEnchaine(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEnchaine(ViewerFilter filter) {
		enchaine.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#addBusinessFilterEnchaine(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEnchaine(ViewerFilter filter) {
		enchaine.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getTypeDef()
	 * 
	 */
	public Enumerator getTypeDef() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) typeDef.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#initTypeDef(EEnum eenum, Enumerator current)
	 */
	public void initTypeDef(EEnum eenum, Enumerator current) {
		typeDef.setInput(eenum.getELiterals());
		typeDef.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setTypeDef(Enumerator newValue)
	 * 
	 */
	public void setTypeDef(Enumerator newValue) {
		typeDef.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#getTypeAttaque()
	 * 
	 */
	public Enumerator getTypeAttaque() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) typeAttaque.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#initTypeAttaque(EEnum eenum, Enumerator current)
	 */
	public void initTypeAttaque(EEnum eenum, Enumerator current) {
		typeAttaque.setInput(eenum.getELiterals());
		typeAttaque.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ConfigPropertiesEditionPart#setTypeAttaque(Enumerator newValue)
	 * 
	 */
	public void setTypeAttaque(Enumerator newValue) {
		typeAttaque.modelUpdating(new StructuredSelection(newValue));
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NimaMessages.Config_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
