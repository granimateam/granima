/**
 * Generated with Acceleo
 */
package nima.parts.impl;

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
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * 
 * 
 */
public class ConfigPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ConfigPropertiesEditionPart {

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
	public ConfigPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
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
					return createPropertiesGroup(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.init) {
					return createInitText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.defense) {
					return createDefenseText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.degats) {
					return createDegatsText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.typeDegat) {
					return createTypeDegatEMFComboViewer(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.nom) {
					return createNomText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.owner) {
					return createOwnerFlatComboViewer(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.attaque) {
					return createAttaqueText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.nbAttaques) {
					return createNbAttaquesText(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.enchaine) {
					return createEnchaineFlatComboViewer(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.typeDef) {
					return createTypeDefEMFComboViewer(parent);
				}
				if (key == NimaViewsRepository.Config.Properties.typeAttaque) {
					return createTypeAttaqueEMFComboViewer(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(NimaMessages.ConfigPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createInitText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_InitLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.init, NimaViewsRepository.SWT_KIND));
		init = new Text(parent, SWT.BORDER);
		GridData initData = new GridData(GridData.FILL_HORIZONTAL);
		init.setLayoutData(initData);
		init.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
			}

		});
		init.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
				}
			}

		});
		EditingUtils.setID(init, NimaViewsRepository.Config.Properties.init);
		EditingUtils.setEEFtype(init, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.init, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDefenseText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_DefenseLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.defense, NimaViewsRepository.SWT_KIND));
		defense = new Text(parent, SWT.BORDER);
		GridData defenseData = new GridData(GridData.FILL_HORIZONTAL);
		defense.setLayoutData(defenseData);
		defense.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
			}

		});
		defense.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
				}
			}

		});
		EditingUtils.setID(defense, NimaViewsRepository.Config.Properties.defense);
		EditingUtils.setEEFtype(defense, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.defense, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDegatsText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_DegatsLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.degats, NimaViewsRepository.SWT_KIND));
		degats = new Text(parent, SWT.BORDER);
		GridData degatsData = new GridData(GridData.FILL_HORIZONTAL);
		degats.setLayoutData(degatsData);
		degats.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.degats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, degats.getText()));
			}

		});
		degats.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.degats, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, degats.getText()));
				}
			}

		});
		EditingUtils.setID(degats, NimaViewsRepository.Config.Properties.degats);
		EditingUtils.setEEFtype(degats, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.degats, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeDegatEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_TypeDegatLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.typeDegat, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.typeDegat, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDegat()));
			}

		});
		typeDegat.setID(NimaViewsRepository.Config.Properties.typeDegat);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.typeDegat, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNomText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_NomLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.nom, NimaViewsRepository.SWT_KIND));
		nom = new Text(parent, SWT.BORDER);
		GridData nomData = new GridData(GridData.FILL_HORIZONTAL);
		nom.setLayoutData(nomData);
		nom.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
			}

		});
		nom.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
				}
			}

		});
		EditingUtils.setID(nom, NimaViewsRepository.Config.Properties.nom);
		EditingUtils.setEEFtype(nom, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.nom, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.description, NimaViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, NimaViewsRepository.Config.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.description, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOwnerFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_OwnerLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.owner, NimaViewsRepository.SWT_KIND));
		owner = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.owner, NimaViewsRepository.SWT_KIND));
		owner.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		owner.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.owner, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOwner()));
			}

		});
		GridData ownerData = new GridData(GridData.FILL_HORIZONTAL);
		owner.setLayoutData(ownerData);
		owner.setID(NimaViewsRepository.Config.Properties.owner);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.owner, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAttaqueText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_AttaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.attaque, NimaViewsRepository.SWT_KIND));
		attaque = new Text(parent, SWT.BORDER);
		GridData attaqueData = new GridData(GridData.FILL_HORIZONTAL);
		attaque.setLayoutData(attaqueData);
		attaque.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
			}

		});
		attaque.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
				}
			}

		});
		EditingUtils.setID(attaque, NimaViewsRepository.Config.Properties.attaque);
		EditingUtils.setEEFtype(attaque, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.attaque, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNbAttaquesText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_NbAttaquesLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.nbAttaques, NimaViewsRepository.SWT_KIND));
		nbAttaques = new Text(parent, SWT.BORDER);
		GridData nbAttaquesData = new GridData(GridData.FILL_HORIZONTAL);
		nbAttaques.setLayoutData(nbAttaquesData);
		nbAttaques.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.nbAttaques, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAttaques.getText()));
			}

		});
		nbAttaques.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.nbAttaques, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAttaques.getText()));
				}
			}

		});
		EditingUtils.setID(nbAttaques, NimaViewsRepository.Config.Properties.nbAttaques);
		EditingUtils.setEEFtype(nbAttaques, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.nbAttaques, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createEnchaineFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_EnchaineLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.enchaine, NimaViewsRepository.SWT_KIND));
		enchaine = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.enchaine, NimaViewsRepository.SWT_KIND));
		enchaine.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		enchaine.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.enchaine, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEnchaine()));
			}

		});
		GridData enchaineData = new GridData(GridData.FILL_HORIZONTAL);
		enchaine.setLayoutData(enchaineData);
		enchaine.setID(NimaViewsRepository.Config.Properties.enchaine);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.enchaine, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeDefEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_TypeDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.typeDef, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.typeDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDef()));
			}

		});
		typeDef.setID(NimaViewsRepository.Config.Properties.typeDef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.typeDef, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeAttaqueEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ConfigPropertiesEditionPart_TypeAttaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Config.Properties.typeAttaque, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ConfigPropertiesEditionPartImpl.this, NimaViewsRepository.Config.Properties.typeAttaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeAttaque()));
			}

		});
		typeAttaque.setID(NimaViewsRepository.Config.Properties.typeAttaque);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Config.Properties.typeAttaque, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
