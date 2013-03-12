/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.textui.TestRunner;

import nima.ConfigCac;
import nima.NimaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Cac</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigCacTest extends ConfigTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigCacTest.class);
	}

	/**
	 * Constructs a new Config Cac test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigCacTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Config Cac test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigCac getFixture() {
		return (ConfigCac)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NimaFactory.eINSTANCE.createConfigCac());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConfigCacTest
