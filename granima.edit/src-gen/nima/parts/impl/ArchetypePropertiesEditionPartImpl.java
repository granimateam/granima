/**
 * Generated with Acceleo
 */
package nima.parts.impl;

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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;


// End of user code

/**
 * 
 * 
 */
public class ArchetypePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArchetypePropertiesEditionPart {

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
	public ArchetypePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.hp) {
					return createHpText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.init) {
					return createInitText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.attaque) {
					return createAttaqueText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.defense) {
					return createDefenseText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.typeDef) {
					return createTypeDefEMFComboViewer(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rphy) {
					return createRphyText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rmys) {
					return createRmysText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rpsy) {
					return createRpsyText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.perf) {
					return createPerfText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.tran) {
					return createTranText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.con) {
					return createConText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.cha) {
					return createChaText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.froid) {
					return createFroidText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.elec) {
					return createElecText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.ener) {
					return createEnerText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.nom) {
					return createNomText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.active) {
					return createActiveFlatComboViewer(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.nbDef) {
					return createNbDefText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.joueur) {
					return createJoueurCheckbox(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.nbAction) {
					return createNbActionText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.peutAgir) {
					return createPeutAgirCheckbox(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.rolledInit) {
					return createRolledInitText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.cible) {
					return createCibleFlatComboViewer(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.hpMax) {
					return createHpMaxText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.malusCritTemp) {
					return createMalusCritTempText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.bonusAtaque) {
					return createBonusAtaqueText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.bonusDef) {
					return createBonusDefText(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.current) {
					return createCurrentFlatComboViewer(parent);
				}
				if (key == NimaViewsRepository.Archetype.Properties.contre) {
					return createContreFlatComboViewer(parent);
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
		propertiesGroup.setText(NimaMessages.ArchetypePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createHpText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_HpLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.hp, NimaViewsRepository.SWT_KIND));
		hp = new Text(parent, SWT.BORDER);
		GridData hpData = new GridData(GridData.FILL_HORIZONTAL);
		hp.setLayoutData(hpData);
		hp.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.hp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hp.getText()));
			}

		});
		hp.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.hp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hp.getText()));
				}
			}

		});
		EditingUtils.setID(hp, NimaViewsRepository.Archetype.Properties.hp);
		EditingUtils.setEEFtype(hp, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.hp, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createInitText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_InitLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.init, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.init, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, init.getText()));
				}
			}

		});
		EditingUtils.setID(init, NimaViewsRepository.Archetype.Properties.init);
		EditingUtils.setEEFtype(init, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.init, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAttaqueText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_AttaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.attaque, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.attaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, attaque.getText()));
				}
			}

		});
		EditingUtils.setID(attaque, NimaViewsRepository.Archetype.Properties.attaque);
		EditingUtils.setEEFtype(attaque, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.attaque, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDefenseText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_DefenseLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.defense, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.defense, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, defense.getText()));
				}
			}

		});
		EditingUtils.setID(defense, NimaViewsRepository.Archetype.Properties.defense);
		EditingUtils.setEEFtype(defense, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.defense, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeDefEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_TypeDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.typeDef, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.typeDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTypeDef()));
			}

		});
		typeDef.setID(NimaViewsRepository.Archetype.Properties.typeDef);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.typeDef, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRphyText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_RphyLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rphy, NimaViewsRepository.SWT_KIND));
		rphy = new Text(parent, SWT.BORDER);
		GridData rphyData = new GridData(GridData.FILL_HORIZONTAL);
		rphy.setLayoutData(rphyData);
		rphy.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rphy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rphy.getText()));
			}

		});
		rphy.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rphy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rphy.getText()));
				}
			}

		});
		EditingUtils.setID(rphy, NimaViewsRepository.Archetype.Properties.rphy);
		EditingUtils.setEEFtype(rphy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rphy, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRmysText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_RmysLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rmys, NimaViewsRepository.SWT_KIND));
		rmys = new Text(parent, SWT.BORDER);
		GridData rmysData = new GridData(GridData.FILL_HORIZONTAL);
		rmys.setLayoutData(rmysData);
		rmys.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rmys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rmys.getText()));
			}

		});
		rmys.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rmys, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rmys.getText()));
				}
			}

		});
		EditingUtils.setID(rmys, NimaViewsRepository.Archetype.Properties.rmys);
		EditingUtils.setEEFtype(rmys, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rmys, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRpsyText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_RpsyLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rpsy, NimaViewsRepository.SWT_KIND));
		rpsy = new Text(parent, SWT.BORDER);
		GridData rpsyData = new GridData(GridData.FILL_HORIZONTAL);
		rpsy.setLayoutData(rpsyData);
		rpsy.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rpsy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rpsy.getText()));
			}

		});
		rpsy.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rpsy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rpsy.getText()));
				}
			}

		});
		EditingUtils.setID(rpsy, NimaViewsRepository.Archetype.Properties.rpsy);
		EditingUtils.setEEFtype(rpsy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rpsy, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPerfText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_PerfLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.perf, NimaViewsRepository.SWT_KIND));
		perf = new Text(parent, SWT.BORDER);
		GridData perfData = new GridData(GridData.FILL_HORIZONTAL);
		perf.setLayoutData(perfData);
		perf.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.perf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, perf.getText()));
			}

		});
		perf.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.perf, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, perf.getText()));
				}
			}

		});
		EditingUtils.setID(perf, NimaViewsRepository.Archetype.Properties.perf);
		EditingUtils.setEEFtype(perf, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.perf, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTranText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_TranLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.tran, NimaViewsRepository.SWT_KIND));
		tran = new Text(parent, SWT.BORDER);
		GridData tranData = new GridData(GridData.FILL_HORIZONTAL);
		tran.setLayoutData(tranData);
		tran.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.tran, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, tran.getText()));
			}

		});
		tran.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.tran, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, tran.getText()));
				}
			}

		});
		EditingUtils.setID(tran, NimaViewsRepository.Archetype.Properties.tran);
		EditingUtils.setEEFtype(tran, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.tran, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_ConLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.con, NimaViewsRepository.SWT_KIND));
		con = new Text(parent, SWT.BORDER);
		GridData conData = new GridData(GridData.FILL_HORIZONTAL);
		con.setLayoutData(conData);
		con.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.con, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, con.getText()));
			}

		});
		con.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.con, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, con.getText()));
				}
			}

		});
		EditingUtils.setID(con, NimaViewsRepository.Archetype.Properties.con);
		EditingUtils.setEEFtype(con, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.con, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createChaText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_ChaLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.cha, NimaViewsRepository.SWT_KIND));
		cha = new Text(parent, SWT.BORDER);
		GridData chaData = new GridData(GridData.FILL_HORIZONTAL);
		cha.setLayoutData(chaData);
		cha.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.cha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cha.getText()));
			}

		});
		cha.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.cha, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, cha.getText()));
				}
			}

		});
		EditingUtils.setID(cha, NimaViewsRepository.Archetype.Properties.cha);
		EditingUtils.setEEFtype(cha, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.cha, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFroidText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_FroidLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.froid, NimaViewsRepository.SWT_KIND));
		froid = new Text(parent, SWT.BORDER);
		GridData froidData = new GridData(GridData.FILL_HORIZONTAL);
		froid.setLayoutData(froidData);
		froid.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.froid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, froid.getText()));
			}

		});
		froid.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.froid, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, froid.getText()));
				}
			}

		});
		EditingUtils.setID(froid, NimaViewsRepository.Archetype.Properties.froid);
		EditingUtils.setEEFtype(froid, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.froid, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createElecText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_ElecLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.elec, NimaViewsRepository.SWT_KIND));
		elec = new Text(parent, SWT.BORDER);
		GridData elecData = new GridData(GridData.FILL_HORIZONTAL);
		elec.setLayoutData(elecData);
		elec.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.elec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, elec.getText()));
			}

		});
		elec.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.elec, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, elec.getText()));
				}
			}

		});
		EditingUtils.setID(elec, NimaViewsRepository.Archetype.Properties.elec);
		EditingUtils.setEEFtype(elec, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.elec, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEnerText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_EnerLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.ener, NimaViewsRepository.SWT_KIND));
		ener = new Text(parent, SWT.BORDER);
		GridData enerData = new GridData(GridData.FILL_HORIZONTAL);
		ener.setLayoutData(enerData);
		ener.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.ener, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ener.getText()));
			}

		});
		ener.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.ener, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ener.getText()));
				}
			}

		});
		EditingUtils.setID(ener, NimaViewsRepository.Archetype.Properties.ener);
		EditingUtils.setEEFtype(ener, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.ener, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNomText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_NomLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.nom, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.nom, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nom.getText()));
				}
			}

		});
		EditingUtils.setID(nom, NimaViewsRepository.Archetype.Properties.nom);
		EditingUtils.setEEFtype(nom, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.nom, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.description, NimaViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, NimaViewsRepository.Archetype.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.description, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createActiveFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_ActiveLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.active, NimaViewsRepository.SWT_KIND));
		active = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.active, NimaViewsRepository.SWT_KIND));
		active.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		active.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.active, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getActive()));
			}

		});
		GridData activeData = new GridData(GridData.FILL_HORIZONTAL);
		active.setLayoutData(activeData);
		active.setID(NimaViewsRepository.Archetype.Properties.active);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.active, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNbDefText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_NbDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.nbDef, NimaViewsRepository.SWT_KIND));
		nbDef = new Text(parent, SWT.BORDER);
		GridData nbDefData = new GridData(GridData.FILL_HORIZONTAL);
		nbDef.setLayoutData(nbDefData);
		nbDef.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.nbDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbDef.getText()));
			}

		});
		nbDef.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.nbDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbDef.getText()));
				}
			}

		});
		EditingUtils.setID(nbDef, NimaViewsRepository.Archetype.Properties.nbDef);
		EditingUtils.setEEFtype(nbDef, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.nbDef, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createJoueurCheckbox(Composite parent) {
		joueur = new Button(parent, SWT.CHECK);
		joueur.setText(NimaMessages.ArchetypePropertiesEditionPart_JoueurLabel);
		joueur.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.joueur, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(joueur.getSelection())));
			}

		});
		GridData joueurData = new GridData(GridData.FILL_HORIZONTAL);
		joueurData.horizontalSpan = 2;
		joueur.setLayoutData(joueurData);
		EditingUtils.setID(joueur, NimaViewsRepository.Archetype.Properties.joueur);
		EditingUtils.setEEFtype(joueur, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.joueur, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNbActionText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_NbActionLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.nbAction, NimaViewsRepository.SWT_KIND));
		nbAction = new Text(parent, SWT.BORDER);
		GridData nbActionData = new GridData(GridData.FILL_HORIZONTAL);
		nbAction.setLayoutData(nbActionData);
		nbAction.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.nbAction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAction.getText()));
			}

		});
		nbAction.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.nbAction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nbAction.getText()));
				}
			}

		});
		EditingUtils.setID(nbAction, NimaViewsRepository.Archetype.Properties.nbAction);
		EditingUtils.setEEFtype(nbAction, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.nbAction, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeutAgirCheckbox(Composite parent) {
		peutAgir = new Button(parent, SWT.CHECK);
		peutAgir.setText(NimaMessages.ArchetypePropertiesEditionPart_PeutAgirLabel);
		peutAgir.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.peutAgir, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(peutAgir.getSelection())));
			}

		});
		GridData peutAgirData = new GridData(GridData.FILL_HORIZONTAL);
		peutAgirData.horizontalSpan = 2;
		peutAgir.setLayoutData(peutAgirData);
		EditingUtils.setID(peutAgir, NimaViewsRepository.Archetype.Properties.peutAgir);
		EditingUtils.setEEFtype(peutAgir, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.peutAgir, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRolledInitText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_RolledInitLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.rolledInit, NimaViewsRepository.SWT_KIND));
		rolledInit = new Text(parent, SWT.BORDER);
		GridData rolledInitData = new GridData(GridData.FILL_HORIZONTAL);
		rolledInit.setLayoutData(rolledInitData);
		rolledInit.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rolledInit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rolledInit.getText()));
			}

		});
		rolledInit.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.rolledInit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, rolledInit.getText()));
				}
			}

		});
		EditingUtils.setID(rolledInit, NimaViewsRepository.Archetype.Properties.rolledInit);
		EditingUtils.setEEFtype(rolledInit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.rolledInit, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCibleFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_CibleLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.cible, NimaViewsRepository.SWT_KIND));
		cible = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.cible, NimaViewsRepository.SWT_KIND));
		cible.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		cible.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.cible, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCible()));
			}

		});
		GridData cibleData = new GridData(GridData.FILL_HORIZONTAL);
		cible.setLayoutData(cibleData);
		cible.setID(NimaViewsRepository.Archetype.Properties.cible);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.cible, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHpMaxText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_HpMaxLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.hpMax, NimaViewsRepository.SWT_KIND));
		hpMax = new Text(parent, SWT.BORDER);
		GridData hpMaxData = new GridData(GridData.FILL_HORIZONTAL);
		hpMax.setLayoutData(hpMaxData);
		hpMax.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.hpMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hpMax.getText()));
			}

		});
		hpMax.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.hpMax, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hpMax.getText()));
				}
			}

		});
		EditingUtils.setID(hpMax, NimaViewsRepository.Archetype.Properties.hpMax);
		EditingUtils.setEEFtype(hpMax, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.hpMax, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMalusCritTempText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_MalusCritTempLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.malusCritTemp, NimaViewsRepository.SWT_KIND));
		malusCritTemp = new Text(parent, SWT.BORDER);
		GridData malusCritTempData = new GridData(GridData.FILL_HORIZONTAL);
		malusCritTemp.setLayoutData(malusCritTempData);
		malusCritTemp.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.malusCritTemp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, malusCritTemp.getText()));
			}

		});
		malusCritTemp.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.malusCritTemp, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, malusCritTemp.getText()));
				}
			}

		});
		EditingUtils.setID(malusCritTemp, NimaViewsRepository.Archetype.Properties.malusCritTemp);
		EditingUtils.setEEFtype(malusCritTemp, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.malusCritTemp, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBonusAtaqueText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_BonusAtaqueLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.bonusAtaque, NimaViewsRepository.SWT_KIND));
		bonusAtaque = new Text(parent, SWT.BORDER);
		GridData bonusAtaqueData = new GridData(GridData.FILL_HORIZONTAL);
		bonusAtaque.setLayoutData(bonusAtaqueData);
		bonusAtaque.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.bonusAtaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusAtaque.getText()));
			}

		});
		bonusAtaque.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.bonusAtaque, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusAtaque.getText()));
				}
			}

		});
		EditingUtils.setID(bonusAtaque, NimaViewsRepository.Archetype.Properties.bonusAtaque);
		EditingUtils.setEEFtype(bonusAtaque, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.bonusAtaque, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBonusDefText(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_BonusDefLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.bonusDef, NimaViewsRepository.SWT_KIND));
		bonusDef = new Text(parent, SWT.BORDER);
		GridData bonusDefData = new GridData(GridData.FILL_HORIZONTAL);
		bonusDef.setLayoutData(bonusDefData);
		bonusDef.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.bonusDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusDef.getText()));
			}

		});
		bonusDef.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.bonusDef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, bonusDef.getText()));
				}
			}

		});
		EditingUtils.setID(bonusDef, NimaViewsRepository.Archetype.Properties.bonusDef);
		EditingUtils.setEEFtype(bonusDef, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.bonusDef, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createCurrentFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_CurrentLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.current, NimaViewsRepository.SWT_KIND));
		current = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.current, NimaViewsRepository.SWT_KIND));
		current.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		current.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.current, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getCurrent()));
			}

		});
		GridData currentData = new GridData(GridData.FILL_HORIZONTAL);
		current.setLayoutData(currentData);
		current.setID(NimaViewsRepository.Archetype.Properties.current);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.current, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createContreFlatComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, NimaMessages.ArchetypePropertiesEditionPart_ContreLabel, propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.contre, NimaViewsRepository.SWT_KIND));
		contre = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(NimaViewsRepository.Archetype.Properties.contre, NimaViewsRepository.SWT_KIND));
		contre.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		contre.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArchetypePropertiesEditionPartImpl.this, NimaViewsRepository.Archetype.Properties.contre, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getContre()));
			}

		});
		GridData contreData = new GridData(GridData.FILL_HORIZONTAL);
		contre.setLayoutData(contreData);
		contre.setID(NimaViewsRepository.Archetype.Properties.contre);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(NimaViewsRepository.Archetype.Properties.contre, NimaViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
