/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.provider;


import java.util.Collection;
import java.util.List;

import nima.Archetype;
import nima.NimaFactory;
import nima.NimaPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nima.Archetype} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchetypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addHpPropertyDescriptor(object);
			addInitPropertyDescriptor(object);
			addAttaquePropertyDescriptor(object);
			addDefensePropertyDescriptor(object);
			addTypeDefPropertyDescriptor(object);
			addRphyPropertyDescriptor(object);
			addRmysPropertyDescriptor(object);
			addRpsyPropertyDescriptor(object);
			addPerfPropertyDescriptor(object);
			addTranPropertyDescriptor(object);
			addConPropertyDescriptor(object);
			addChaPropertyDescriptor(object);
			addFroidPropertyDescriptor(object);
			addElecPropertyDescriptor(object);
			addEnerPropertyDescriptor(object);
			addNomPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addActivePropertyDescriptor(object);
			addEReference0PropertyDescriptor(object);
			addNbDefPropertyDescriptor(object);
			addJoueurPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Hp feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHpPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_hp_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_hp_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__HP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_init_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_init_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__INIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attaque feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttaquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_attaque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_attaque_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__ATTAQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Defense feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_defense_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_defense_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__DEFENSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypeDefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_typeDef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_typeDef_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__TYPE_DEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rphy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRphyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_rphy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_rphy_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__RPHY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rmys feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRmysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_rmys_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_rmys_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__RMYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rpsy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRpsyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_rpsy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_rpsy_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__RPSY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Perf feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerfPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_perf_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_perf_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__PERF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tran feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTranPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_tran_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_tran_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__TRAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Con feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_con_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_con_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__CON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_cha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_cha_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__CHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Froid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFroidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_froid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_froid_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__FROID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_elec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_elec_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__ELEC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ener feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_ener_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_ener_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__ENER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_nom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_nom_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__NOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_description_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_active_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_active_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__ACTIVE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the EReference0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEReference0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_EReference0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_EReference0_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__EREFERENCE0,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nb Def feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbDefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_nbDef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_nbDef_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__NB_DEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Joueur feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoueurPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Archetype_joueur_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Archetype_joueur_feature", "_UI_Archetype_type"),
				 NimaPackage.Literals.ARCHETYPE__JOUEUR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NimaPackage.Literals.ARCHETYPE__CONFIGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Archetype.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Archetype"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Archetype archetype = (Archetype)object;
		return getString("_UI_Archetype_type") + " " + archetype.getHp();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Archetype.class)) {
			case NimaPackage.ARCHETYPE__HP:
			case NimaPackage.ARCHETYPE__INIT:
			case NimaPackage.ARCHETYPE__ATTAQUE:
			case NimaPackage.ARCHETYPE__DEFENSE:
			case NimaPackage.ARCHETYPE__TYPE_DEF:
			case NimaPackage.ARCHETYPE__RPHY:
			case NimaPackage.ARCHETYPE__RMYS:
			case NimaPackage.ARCHETYPE__RPSY:
			case NimaPackage.ARCHETYPE__PERF:
			case NimaPackage.ARCHETYPE__TRAN:
			case NimaPackage.ARCHETYPE__CON:
			case NimaPackage.ARCHETYPE__CHA:
			case NimaPackage.ARCHETYPE__FROID:
			case NimaPackage.ARCHETYPE__ELEC:
			case NimaPackage.ARCHETYPE__ENER:
			case NimaPackage.ARCHETYPE__NOM:
			case NimaPackage.ARCHETYPE__DESCRIPTION:
			case NimaPackage.ARCHETYPE__NB_DEF:
			case NimaPackage.ARCHETYPE__JOUEUR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NimaPackage.ARCHETYPE__CONFIGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NimaPackage.Literals.ARCHETYPE__CONFIGS,
				 NimaFactory.eINSTANCE.createConfig()));

		newChildDescriptors.add
			(createChildParameter
				(NimaPackage.Literals.ARCHETYPE__CONFIGS,
				 NimaFactory.eINSTANCE.createConfigCac()));

		newChildDescriptors.add
			(createChildParameter
				(NimaPackage.Literals.ARCHETYPE__CONFIGS,
				 NimaFactory.eINSTANCE.createDualHandConfig()));

		newChildDescriptors.add
			(createChildParameter
				(NimaPackage.Literals.ARCHETYPE__CONFIGS,
				 NimaFactory.eINSTANCE.createConfigLance()));

		newChildDescriptors.add
			(createChildParameter
				(NimaPackage.Literals.ARCHETYPE__CONFIGS,
				 NimaFactory.eINSTANCE.createConfigTir()));

		newChildDescriptors.add
			(createChildParameter
				(NimaPackage.Literals.ARCHETYPE__CONFIGS,
				 NimaFactory.eINSTANCE.createConfigAoe()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NimaEditPlugin.INSTANCE;
	}

}
