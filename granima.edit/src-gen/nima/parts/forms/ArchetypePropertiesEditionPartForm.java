/**
 * Generated with Acceleo
 */
package nima.parts.forms;

// Start of user code for imports
import nima.parts.ArchetypePropertiesEditionPart;
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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
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
public class ArchetypePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ArchetypePropertiesEditionPart {

	protected Text hp;
	protected Text init;
	protected Text attaque;
	protected Text defense;
	protected EMFComboViewer typeDef;
	protected Text rphy;
	protected Text rmys;
	protected Text rpsy;
	protected Text perf;
	protected Text tran;
	protected Text con;
	protected Text cha;
	protected Text froid;
	protected Text elec;
	protected Text ener;
	protected Text nom;
	protected Text description;
	protected EObjectFlatComboViewer active;
	protected Text nbDef;
	protected Button joueur;
	protected Text nbAction;
	protected Button peutAgir;
	protected Text rolledInit;
	protected EObjectFlatComboViewer cible;
	protected Text hpMax;
	protected Text malusCritTemp;
	protected Text bonusAtaque;
	protected Text bonusDef;
	protected EObjectFlatComboViewer current;
	protected EObjectFlatComboViewer contre;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArchetypePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence archetypeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = archetypeStep.addStep(NimaViewsRepository.Archetype.Properties.class);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.hp);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.init);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.attaque);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.defense);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.typeDef);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.rphy);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.rmys);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.rpsy);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.perf);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.tran);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.con);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.cha);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.froid);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.elec);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.ener);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.nom);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.description);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.active);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.nbDef);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.joueur);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.nbAction);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.peutAgir);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.rolledInit);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.cible);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.hpMax);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.malusCritTemp);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.bonusAtaque);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.bonusDef);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.current);
		propertiesStep.addStep(NimaViewsRepository.Archetype.Properties.contre);
		
		
		composer = new PartComposer(archetypeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == NimaViewsRepository.Archetype.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.hp) {
					return 		createHpText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.init) {
					return 		createInitText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.attaque) {
					return 		createAttaqueText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.defense) {
					return 		createDefenseText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.typeDef) {
					return createTypeDefEMFComboViewer(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rphy) {
					return 		createRphyText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rmys) {
					return 		createRmysText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rpsy) {
					return 		createRpsyText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.perf) {
					return 		createPerfText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.tran) {
					return 		createTranText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.con) {
					return 		createConText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.cha) {
					return 		createChaText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.froid) {
					return 		createFroidText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.elec) {
					return 		createElecText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.ener) {
					return 		createEnerText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.nom) {
					return 		createNomText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.description) {
					return 		createDescriptionText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.active) {
					return createActiveFlatComboViewer(parent, widgetFactory);
				}
				if (key == NimaViewsRepository.Archetype.Properties.nbDef) {
					return 		createNbDefText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.joueur) {
					return createJoueurCheckbox(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.nbAction) {
					return 		createNbActionText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.peutAgir) {
					return createPeutAgirCheckbox(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rolledInit) {
					return 		createRolledInitText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.cible) {
					return createCibleFlatComboViewer(parent, widgetFactory);
				}
				if (key == NimaViewsRepository.Archetype.Properties.hpMax) {
					return 		createHpMaxText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.malusCritTemp) {
					return 		createMalusCritTempText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.bonusAtaque) {
					return 		createBonusAtaqueText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.bonusDef) {
					return 		createBonusDefText(widgetFactory, parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.current) {
					return createCurrentFlatComboViewer(parent, widgetFactory);
				}
				if (key == NimaViewsRepository.Archetype.Properties.contre) {
					return createContreFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(NimaMessages.ArchetypePropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createHpText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_HpLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.hp, NimaViewsRepository.FORM_KIND));
		hp = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		hp.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData hpData = new GridData(GridData.FILL_HORIZONTAL);
		hp.setLayoutData(hpData);
		hp.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.hp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hp.getText()));
			}
		});
		hp.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.hp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hp.getText()));
				}
			}
		});
		EditingUtils.setID(hp, NimaViewsRepository.Archetype.Properties.hp);
		EditingUtils.setEEFtype(hp, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.hp, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInitText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_InitLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.init, NimaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
				}
			}
		});
		EditingUtils.setID(init, NimaViewsRepository.Archetype.Properties.init);
		EditingUtils.setEEFtype(init, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.init, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAttaqueText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_AttaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.attaque, NimaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
				}
			}
		});
		EditingUtils.setID(attaque, NimaViewsRepository.Archetype.Properties.attaque);
		EditingUtils.setEEFtype(attaque, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.attaque, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDefenseText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_DefenseLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.defense, NimaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
				}
			}
		});
		EditingUtils.setID(defense, NimaViewsRepository.Archetype.Properties.defense);
		EditingUtils.setEEFtype(defense, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.defense, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeDefEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_TypeDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.typeDef, NimaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.typeDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDef()));
			}

		});
		typeDef.setID(NimaViewsRepository.Archetype.Properties.typeDef);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.typeDef, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRphyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_RphyLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rphy, NimaViewsRepository.FORM_KIND));
		rphy = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		rphy.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData rphyData = new GridData(GridData.FILL_HORIZONTAL);
		rphy.setLayoutData(rphyData);
		rphy.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rphy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rphy.getText()));
			}
		});
		rphy.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rphy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rphy.getText()));
				}
			}
		});
		EditingUtils.setID(rphy, NimaViewsRepository.Archetype.Properties.rphy);
		EditingUtils.setEEFtype(rphy, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rphy, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRmysText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_RmysLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rmys, NimaViewsRepository.FORM_KIND));
		rmys = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		rmys.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData rmysData = new GridData(GridData.FILL_HORIZONTAL);
		rmys.setLayoutData(rmysData);
		rmys.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rmys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rmys.getText()));
			}
		});
		rmys.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rmys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rmys.getText()));
				}
			}
		});
		EditingUtils.setID(rmys, NimaViewsRepository.Archetype.Properties.rmys);
		EditingUtils.setEEFtype(rmys, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rmys, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRpsyText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_RpsyLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rpsy, NimaViewsRepository.FORM_KIND));
		rpsy = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		rpsy.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData rpsyData = new GridData(GridData.FILL_HORIZONTAL);
		rpsy.setLayoutData(rpsyData);
		rpsy.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rpsy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rpsy.getText()));
			}
		});
		rpsy.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rpsy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rpsy.getText()));
				}
			}
		});
		EditingUtils.setID(rpsy, NimaViewsRepository.Archetype.Properties.rpsy);
		EditingUtils.setEEFtype(rpsy, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rpsy, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPerfText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_PerfLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.perf, NimaViewsRepository.FORM_KIND));
		perf = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		perf.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData perfData = new GridData(GridData.FILL_HORIZONTAL);
		perf.setLayoutData(perfData);
		perf.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.perf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, perf.getText()));
			}
		});
		perf.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.perf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, perf.getText()));
				}
			}
		});
		EditingUtils.setID(perf, NimaViewsRepository.Archetype.Properties.perf);
		EditingUtils.setEEFtype(perf, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.perf, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTranText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_TranLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.tran, NimaViewsRepository.FORM_KIND));
		tran = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		tran.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData tranData = new GridData(GridData.FILL_HORIZONTAL);
		tran.setLayoutData(tranData);
		tran.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.tran, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, tran.getText()));
			}
		});
		tran.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.tran, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, tran.getText()));
				}
			}
		});
		EditingUtils.setID(tran, NimaViewsRepository.Archetype.Properties.tran);
		EditingUtils.setEEFtype(tran, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.tran, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_ConLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.con, NimaViewsRepository.FORM_KIND));
		con = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		con.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData conData = new GridData(GridData.FILL_HORIZONTAL);
		con.setLayoutData(conData);
		con.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.con, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, con.getText()));
			}
		});
		con.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.con, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, con.getText()));
				}
			}
		});
		EditingUtils.setID(con, NimaViewsRepository.Archetype.Properties.con);
		EditingUtils.setEEFtype(con, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.con, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChaText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_ChaLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.cha, NimaViewsRepository.FORM_KIND));
		cha = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		cha.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData chaData = new GridData(GridData.FILL_HORIZONTAL);
		cha.setLayoutData(chaData);
		cha.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.cha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cha.getText()));
			}
		});
		cha.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.cha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cha.getText()));
				}
			}
		});
		EditingUtils.setID(cha, NimaViewsRepository.Archetype.Properties.cha);
		EditingUtils.setEEFtype(cha, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.cha, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFroidText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_FroidLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.froid, NimaViewsRepository.FORM_KIND));
		froid = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		froid.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData froidData = new GridData(GridData.FILL_HORIZONTAL);
		froid.setLayoutData(froidData);
		froid.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.froid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, froid.getText()));
			}
		});
		froid.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.froid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, froid.getText()));
				}
			}
		});
		EditingUtils.setID(froid, NimaViewsRepository.Archetype.Properties.froid);
		EditingUtils.setEEFtype(froid, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.froid, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createElecText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_ElecLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.elec, NimaViewsRepository.FORM_KIND));
		elec = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		elec.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData elecData = new GridData(GridData.FILL_HORIZONTAL);
		elec.setLayoutData(elecData);
		elec.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.elec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, elec.getText()));
			}
		});
		elec.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.elec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, elec.getText()));
				}
			}
		});
		EditingUtils.setID(elec, NimaViewsRepository.Archetype.Properties.elec);
		EditingUtils.setEEFtype(elec, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.elec, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEnerText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_EnerLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.ener, NimaViewsRepository.FORM_KIND));
		ener = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		ener.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData enerData = new GridData(GridData.FILL_HORIZONTAL);
		ener.setLayoutData(enerData);
		ener.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.ener, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ener.getText()));
			}
		});
		ener.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.ener, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ener.getText()));
				}
			}
		});
		EditingUtils.setID(ener, NimaViewsRepository.Archetype.Properties.ener);
		EditingUtils.setEEFtype(ener, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.ener, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNomText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_NomLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.nom, NimaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
				}
			}
		});
		EditingUtils.setID(nom, NimaViewsRepository.Archetype.Properties.nom);
		EditingUtils.setEEFtype(nom, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.nom, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.description, NimaViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, NimaViewsRepository.Archetype.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.description, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createActiveFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_ActiveLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.active, NimaViewsRepository.FORM_KIND));
		active = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.active, NimaViewsRepository.FORM_KIND));
		widgetFactory.adapt(active);
		active.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData activeData = new GridData(GridData.FILL_HORIZONTAL);
		active.setLayoutData(activeData);
		active.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.active, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getActive()));
			}

		});
		active.setID(NimaViewsRepository.Archetype.Properties.active);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.active, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNbDefText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_NbDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.nbDef, NimaViewsRepository.FORM_KIND));
		nbDef = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbDef.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbDefData = new GridData(GridData.FILL_HORIZONTAL);
		nbDef.setLayoutData(nbDefData);
		nbDef.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.nbDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbDef.getText()));
			}
		});
		nbDef.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.nbDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbDef.getText()));
				}
			}
		});
		EditingUtils.setID(nbDef, NimaViewsRepository.Archetype.Properties.nbDef);
		EditingUtils.setEEFtype(nbDef, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.nbDef, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createJoueurCheckbox(FormToolkit widgetFactory, Composite parent) {
		joueur = widgetFactory.createButton(parent, NimaMessages.ArchetypePropertiesEditionPart_JoueurLabel, SWT.CHECK);
		joueur.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.joueur, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(joueur.getSelection())));
			}

		});
		GridData joueurData = new GridData(GridData.FILL_HORIZONTAL);
		joueurData.horizontalSpan = 2;
		joueur.setLayoutData(joueurData);
		EditingUtils.setID(joueur, NimaViewsRepository.Archetype.Properties.joueur);
		EditingUtils.setEEFtype(joueur, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.joueur, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNbActionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_NbActionLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.nbAction, NimaViewsRepository.FORM_KIND));
		nbAction = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nbAction.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nbActionData = new GridData(GridData.FILL_HORIZONTAL);
		nbAction.setLayoutData(nbActionData);
		nbAction.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.nbAction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAction.getText()));
			}
		});
		nbAction.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.nbAction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAction.getText()));
				}
			}
		});
		EditingUtils.setID(nbAction, NimaViewsRepository.Archetype.Properties.nbAction);
		EditingUtils.setEEFtype(nbAction, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.nbAction, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeutAgirCheckbox(FormToolkit widgetFactory, Composite parent) {
		peutAgir = widgetFactory.createButton(parent, NimaMessages.ArchetypePropertiesEditionPart_PeutAgirLabel, SWT.CHECK);
		peutAgir.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.peutAgir, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(peutAgir.getSelection())));
			}

		});
		GridData peutAgirData = new GridData(GridData.FILL_HORIZONTAL);
		peutAgirData.horizontalSpan = 2;
		peutAgir.setLayoutData(peutAgirData);
		EditingUtils.setID(peutAgir, NimaViewsRepository.Archetype.Properties.peutAgir);
		EditingUtils.setEEFtype(peutAgir, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.peutAgir, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRolledInitText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_RolledInitLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rolledInit, NimaViewsRepository.FORM_KIND));
		rolledInit = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		rolledInit.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData rolledInitData = new GridData(GridData.FILL_HORIZONTAL);
		rolledInit.setLayoutData(rolledInitData);
		rolledInit.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rolledInit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rolledInit.getText()));
			}
		});
		rolledInit.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.rolledInit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rolledInit.getText()));
				}
			}
		});
		EditingUtils.setID(rolledInit, NimaViewsRepository.Archetype.Properties.rolledInit);
		EditingUtils.setEEFtype(rolledInit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rolledInit, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCibleFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_CibleLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.cible, NimaViewsRepository.FORM_KIND));
		cible = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.cible, NimaViewsRepository.FORM_KIND));
		widgetFactory.adapt(cible);
		cible.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData cibleData = new GridData(GridData.FILL_HORIZONTAL);
		cible.setLayoutData(cibleData);
		cible.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.cible, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCible()));
			}

		});
		cible.setID(NimaViewsRepository.Archetype.Properties.cible);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.cible, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHpMaxText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_HpMaxLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.hpMax, NimaViewsRepository.FORM_KIND));
		hpMax = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		hpMax.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData hpMaxData = new GridData(GridData.FILL_HORIZONTAL);
		hpMax.setLayoutData(hpMaxData);
		hpMax.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.hpMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hpMax.getText()));
			}
		});
		hpMax.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.hpMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hpMax.getText()));
				}
			}
		});
		EditingUtils.setID(hpMax, NimaViewsRepository.Archetype.Properties.hpMax);
		EditingUtils.setEEFtype(hpMax, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.hpMax, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMalusCritTempText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_MalusCritTempLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.malusCritTemp, NimaViewsRepository.FORM_KIND));
		malusCritTemp = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		malusCritTemp.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData malusCritTempData = new GridData(GridData.FILL_HORIZONTAL);
		malusCritTemp.setLayoutData(malusCritTempData);
		malusCritTemp.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.malusCritTemp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, malusCritTemp.getText()));
			}
		});
		malusCritTemp.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.malusCritTemp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, malusCritTemp.getText()));
				}
			}
		});
		EditingUtils.setID(malusCritTemp, NimaViewsRepository.Archetype.Properties.malusCritTemp);
		EditingUtils.setEEFtype(malusCritTemp, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.malusCritTemp, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBonusAtaqueText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_BonusAtaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.bonusAtaque, NimaViewsRepository.FORM_KIND));
		bonusAtaque = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		bonusAtaque.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData bonusAtaqueData = new GridData(GridData.FILL_HORIZONTAL);
		bonusAtaque.setLayoutData(bonusAtaqueData);
		bonusAtaque.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.bonusAtaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusAtaque.getText()));
			}
		});
		bonusAtaque.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.bonusAtaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusAtaque.getText()));
				}
			}
		});
		EditingUtils.setID(bonusAtaque, NimaViewsRepository.Archetype.Properties.bonusAtaque);
		EditingUtils.setEEFtype(bonusAtaque, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.bonusAtaque, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBonusDefText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_BonusDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.bonusDef, NimaViewsRepository.FORM_KIND));
		bonusDef = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		bonusDef.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData bonusDefData = new GridData(GridData.FILL_HORIZONTAL);
		bonusDef.setLayoutData(bonusDefData);
		bonusDef.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.bonusDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusDef.getText()));
			}
		});
		bonusDef.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.bonusDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusDef.getText()));
				}
			}
		});
		EditingUtils.setID(bonusDef, NimaViewsRepository.Archetype.Properties.bonusDef);
		EditingUtils.setEEFtype(bonusDef, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.bonusDef, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createCurrentFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_CurrentLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.current, NimaViewsRepository.FORM_KIND));
		current = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.current, NimaViewsRepository.FORM_KIND));
		widgetFactory.adapt(current);
		current.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData currentData = new GridData(GridData.FILL_HORIZONTAL);
		current.setLayoutData(currentData);
		current.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.current, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getCurrent()));
			}

		});
		current.setID(NimaViewsRepository.Archetype.Properties.current);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.current, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createContreFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		FormUtils.createPartLabel(widgetFactory, parent, NimaMessages.ArchetypePropertiesEditionPart_ContreLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.contre, NimaViewsRepository.FORM_KIND));
		contre = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.contre, NimaViewsRepository.FORM_KIND));
		widgetFactory.adapt(contre);
		contre.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData contreData = new GridData(GridData.FILL_HORIZONTAL);
		contre.setLayoutData(contreData);
		contre.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartForm.this, NimaViewsRepository.Archetype.Properties.contre, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getContre()));
			}

		});
		contre.setID(NimaViewsRepository.Archetype.Properties.contre);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.contre, NimaViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see nima.parts.ArchetypePropertiesEditionPart#getHp()
	 * 
	 */
	public String getHp() {
		return hp.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setHp(String newValue)
	 * 
	 */
	public void setHp(String newValue) {
		if (newValue != null) {
			hp.setText(newValue);
		} else {
			hp.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getInit()
	 * 
	 */
	public String getInit() {
		return init.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setInit(String newValue)
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
	 * @see nima.parts.ArchetypePropertiesEditionPart#getAttaque()
	 * 
	 */
	public String getAttaque() {
		return attaque.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setAttaque(String newValue)
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
	 * @see nima.parts.ArchetypePropertiesEditionPart#getDefense()
	 * 
	 */
	public String getDefense() {
		return defense.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setDefense(String newValue)
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
	 * @see nima.parts.ArchetypePropertiesEditionPart#getTypeDef()
	 * 
	 */
	public Enumerator getTypeDef() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) typeDef.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#initTypeDef(EEnum eenum, Enumerator current)
	 */
	public void initTypeDef(EEnum eenum, Enumerator current) {
		typeDef.setInput(eenum.getELiterals());
		typeDef.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setTypeDef(Enumerator newValue)
	 * 
	 */
	public void setTypeDef(Enumerator newValue) {
		typeDef.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getRphy()
	 * 
	 */
	public String getRphy() {
		return rphy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setRphy(String newValue)
	 * 
	 */
	public void setRphy(String newValue) {
		if (newValue != null) {
			rphy.setText(newValue);
		} else {
			rphy.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getRmys()
	 * 
	 */
	public String getRmys() {
		return rmys.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setRmys(String newValue)
	 * 
	 */
	public void setRmys(String newValue) {
		if (newValue != null) {
			rmys.setText(newValue);
		} else {
			rmys.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getRpsy()
	 * 
	 */
	public String getRpsy() {
		return rpsy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setRpsy(String newValue)
	 * 
	 */
	public void setRpsy(String newValue) {
		if (newValue != null) {
			rpsy.setText(newValue);
		} else {
			rpsy.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getPerf()
	 * 
	 */
	public String getPerf() {
		return perf.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setPerf(String newValue)
	 * 
	 */
	public void setPerf(String newValue) {
		if (newValue != null) {
			perf.setText(newValue);
		} else {
			perf.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getTran()
	 * 
	 */
	public String getTran() {
		return tran.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setTran(String newValue)
	 * 
	 */
	public void setTran(String newValue) {
		if (newValue != null) {
			tran.setText(newValue);
		} else {
			tran.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getCon()
	 * 
	 */
	public String getCon() {
		return con.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setCon(String newValue)
	 * 
	 */
	public void setCon(String newValue) {
		if (newValue != null) {
			con.setText(newValue);
		} else {
			con.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getCha()
	 * 
	 */
	public String getCha() {
		return cha.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setCha(String newValue)
	 * 
	 */
	public void setCha(String newValue) {
		if (newValue != null) {
			cha.setText(newValue);
		} else {
			cha.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getFroid()
	 * 
	 */
	public String getFroid() {
		return froid.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setFroid(String newValue)
	 * 
	 */
	public void setFroid(String newValue) {
		if (newValue != null) {
			froid.setText(newValue);
		} else {
			froid.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getElec()
	 * 
	 */
	public String getElec() {
		return elec.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setElec(String newValue)
	 * 
	 */
	public void setElec(String newValue) {
		if (newValue != null) {
			elec.setText(newValue);
		} else {
			elec.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getEner()
	 * 
	 */
	public String getEner() {
		return ener.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setEner(String newValue)
	 * 
	 */
	public void setEner(String newValue) {
		if (newValue != null) {
			ener.setText(newValue);
		} else {
			ener.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getNom()
	 * 
	 */
	public String getNom() {
		return nom.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setNom(String newValue)
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
	 * @see nima.parts.ArchetypePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setDescription(String newValue)
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
	 * @see nima.parts.ArchetypePropertiesEditionPart#getActive()
	 * 
	 */
	public EObject getActive() {
		if (active.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) active.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#initActive(EObjectFlatComboSettings)
	 */
	public void initActive(EObjectFlatComboSettings settings) {
		active.setInput(settings);
		if (current != null) {
			active.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setActive(EObject newValue)
	 * 
	 */
	public void setActive(EObject newValue) {
		if (newValue != null) {
			active.setSelection(new StructuredSelection(newValue));
		} else {
			active.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setActiveButtonMode(ButtonsModeEnum newValue)
	 */
	public void setActiveButtonMode(ButtonsModeEnum newValue) {
		active.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addFilterActive(ViewerFilter filter)
	 * 
	 */
	public void addFilterToActive(ViewerFilter filter) {
		active.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addBusinessFilterActive(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToActive(ViewerFilter filter) {
		active.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getNbDef()
	 * 
	 */
	public String getNbDef() {
		return nbDef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setNbDef(String newValue)
	 * 
	 */
	public void setNbDef(String newValue) {
		if (newValue != null) {
			nbDef.setText(newValue);
		} else {
			nbDef.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getJoueur()
	 * 
	 */
	public Boolean getJoueur() {
		return Boolean.valueOf(joueur.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setJoueur(Boolean newValue)
	 * 
	 */
	public void setJoueur(Boolean newValue) {
		if (newValue != null) {
			joueur.setSelection(newValue.booleanValue());
		} else {
			joueur.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getNbAction()
	 * 
	 */
	public String getNbAction() {
		return nbAction.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setNbAction(String newValue)
	 * 
	 */
	public void setNbAction(String newValue) {
		if (newValue != null) {
			nbAction.setText(newValue);
		} else {
			nbAction.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getPeutAgir()
	 * 
	 */
	public Boolean getPeutAgir() {
		return Boolean.valueOf(peutAgir.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setPeutAgir(Boolean newValue)
	 * 
	 */
	public void setPeutAgir(Boolean newValue) {
		if (newValue != null) {
			peutAgir.setSelection(newValue.booleanValue());
		} else {
			peutAgir.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getRolledInit()
	 * 
	 */
	public String getRolledInit() {
		return rolledInit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setRolledInit(String newValue)
	 * 
	 */
	public void setRolledInit(String newValue) {
		if (newValue != null) {
			rolledInit.setText(newValue);
		} else {
			rolledInit.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getCible()
	 * 
	 */
	public EObject getCible() {
		if (cible.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) cible.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#initCible(EObjectFlatComboSettings)
	 */
	public void initCible(EObjectFlatComboSettings settings) {
		cible.setInput(settings);
		if (current != null) {
			cible.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setCible(EObject newValue)
	 * 
	 */
	public void setCible(EObject newValue) {
		if (newValue != null) {
			cible.setSelection(new StructuredSelection(newValue));
		} else {
			cible.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setCibleButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCibleButtonMode(ButtonsModeEnum newValue) {
		cible.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addFilterCible(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCible(ViewerFilter filter) {
		cible.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addBusinessFilterCible(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCible(ViewerFilter filter) {
		cible.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getHpMax()
	 * 
	 */
	public String getHpMax() {
		return hpMax.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setHpMax(String newValue)
	 * 
	 */
	public void setHpMax(String newValue) {
		if (newValue != null) {
			hpMax.setText(newValue);
		} else {
			hpMax.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getMalusCritTemp()
	 * 
	 */
	public String getMalusCritTemp() {
		return malusCritTemp.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setMalusCritTemp(String newValue)
	 * 
	 */
	public void setMalusCritTemp(String newValue) {
		if (newValue != null) {
			malusCritTemp.setText(newValue);
		} else {
			malusCritTemp.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getBonusAtaque()
	 * 
	 */
	public String getBonusAtaque() {
		return bonusAtaque.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setBonusAtaque(String newValue)
	 * 
	 */
	public void setBonusAtaque(String newValue) {
		if (newValue != null) {
			bonusAtaque.setText(newValue);
		} else {
			bonusAtaque.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getBonusDef()
	 * 
	 */
	public String getBonusDef() {
		return bonusDef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setBonusDef(String newValue)
	 * 
	 */
	public void setBonusDef(String newValue) {
		if (newValue != null) {
			bonusDef.setText(newValue);
		} else {
			bonusDef.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getCurrent()
	 * 
	 */
	public EObject getCurrent() {
		if (current.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) current.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#initCurrent(EObjectFlatComboSettings)
	 */
	public void initCurrent(EObjectFlatComboSettings settings) {
		current.setInput(settings);
		if (current != null) {
			current.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setCurrent(EObject newValue)
	 * 
	 */
	public void setCurrent(EObject newValue) {
		if (newValue != null) {
			current.setSelection(new StructuredSelection(newValue));
		} else {
			current.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setCurrentButtonMode(ButtonsModeEnum newValue)
	 */
	public void setCurrentButtonMode(ButtonsModeEnum newValue) {
		current.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addFilterCurrent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCurrent(ViewerFilter filter) {
		current.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addBusinessFilterCurrent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCurrent(ViewerFilter filter) {
		current.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#getContre()
	 * 
	 */
	public EObject getContre() {
		if (contre.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) contre.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#initContre(EObjectFlatComboSettings)
	 */
	public void initContre(EObjectFlatComboSettings settings) {
		contre.setInput(settings);
		if (current != null) {
			contre.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setContre(EObject newValue)
	 * 
	 */
	public void setContre(EObject newValue) {
		if (newValue != null) {
			contre.setSelection(new StructuredSelection(newValue));
		} else {
			contre.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#setContreButtonMode(ButtonsModeEnum newValue)
	 */
	public void setContreButtonMode(ButtonsModeEnum newValue) {
		contre.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addFilterContre(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContre(ViewerFilter filter) {
		contre.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see nima.parts.ArchetypePropertiesEditionPart#addBusinessFilterContre(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContre(ViewerFilter filter) {
		contre.addBusinessRuleFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return NimaMessages.Archetype_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
