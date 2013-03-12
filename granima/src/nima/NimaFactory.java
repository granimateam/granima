/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nima.NimaPackage
 * @generated
 */
public interface NimaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NimaFactory eINSTANCE = nima.impl.NimaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Archetype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype</em>'.
	 * @generated
	 */
	Archetype createArchetype();

	/**
	 * Returns a new object of class '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config</em>'.
	 * @generated
	 */
	Config createConfig();

	/**
	 * Returns a new object of class '<em>Dual Hand Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dual Hand Config</em>'.
	 * @generated
	 */
	DualHandConfig createDualHandConfig();

	/**
	 * Returns a new object of class '<em>Config Cac</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Cac</em>'.
	 * @generated
	 */
	ConfigCac createConfigCac();

	/**
	 * Returns a new object of class '<em>Config Lance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Lance</em>'.
	 * @generated
	 */
	ConfigLance createConfigLance();

	/**
	 * Returns a new object of class '<em>Config Tir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Tir</em>'.
	 * @generated
	 */
	ConfigTir createConfigTir();

	/**
	 * Returns a new object of class '<em>Config Aoe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config Aoe</em>'.
	 * @generated
	 */
	ConfigAoe createConfigAoe();

	/**
	 * Returns a new object of class '<em>Univers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Univers</em>'.
	 * @generated
	 */
	Univers createUnivers();

	/**
	 * Returns a new object of class '<em>Combat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combat</em>'.
	 * @generated
	 */
	Combat createCombat();

	/**
	 * Returns a new object of class '<em>Attaque</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attaque</em>'.
	 * @generated
	 */
	Attaque createAttaque();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NimaPackage getNimaPackage();

} //NimaFactory
