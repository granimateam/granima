/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.impl;

import nima.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NimaFactoryImpl extends EFactoryImpl implements NimaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NimaFactory init() {
		try {
			NimaFactory theNimaFactory = (NimaFactory)EPackage.Registry.INSTANCE.getEFactory("http://nima/1.0"); 
			if (theNimaFactory != null) {
				return theNimaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NimaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NimaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NimaPackage.ARCHETYPE: return createArchetype();
			case NimaPackage.CONFIG: return createConfig();
			case NimaPackage.DUAL_HAND_CONFIG: return createDualHandConfig();
			case NimaPackage.CONFIG_CAC: return createConfigCac();
			case NimaPackage.CONFIG_LANCE: return createConfigLance();
			case NimaPackage.CONFIG_TIR: return createConfigTir();
			case NimaPackage.CONFIG_AOE: return createConfigAoe();
			case NimaPackage.UNIVERS: return createUnivers();
			case NimaPackage.COMBAT: return createCombat();
			case NimaPackage.ATTAQUE: return createAttaque();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NimaPackage.TYPE_DEF:
				return createTypeDefFromString(eDataType, initialValue);
			case NimaPackage.TYPE_ATT:
				return createtypeAttFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NimaPackage.TYPE_DEF:
				return convertTypeDefToString(eDataType, instanceValue);
			case NimaPackage.TYPE_ATT:
				return converttypeAttToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archetype createArchetype() {
		ArchetypeImpl archetype = new ArchetypeImpl();
		return archetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DualHandConfig createDualHandConfig() {
		DualHandConfigImpl dualHandConfig = new DualHandConfigImpl();
		return dualHandConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigCac createConfigCac() {
		ConfigCacImpl configCac = new ConfigCacImpl();
		return configCac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigLance createConfigLance() {
		ConfigLanceImpl configLance = new ConfigLanceImpl();
		return configLance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTir createConfigTir() {
		ConfigTirImpl configTir = new ConfigTirImpl();
		return configTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAoe createConfigAoe() {
		ConfigAoeImpl configAoe = new ConfigAoeImpl();
		return configAoe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Univers createUnivers() {
		UniversImpl univers = new UniversImpl();
		return univers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Combat createCombat() {
		CombatImpl combat = new CombatImpl();
		return combat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attaque createAttaque() {
		AttaqueImpl attaque = new AttaqueImpl();
		return attaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef createTypeDefFromString(EDataType eDataType, String initialValue) {
		TypeDef result = TypeDef.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeDefToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public typeAtt createtypeAttFromString(EDataType eDataType, String initialValue) {
		typeAtt result = typeAtt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String converttypeAttToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NimaPackage getNimaPackage() {
		return (NimaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NimaPackage getPackage() {
		return NimaPackage.eINSTANCE;
	}

} //NimaFactoryImpl
