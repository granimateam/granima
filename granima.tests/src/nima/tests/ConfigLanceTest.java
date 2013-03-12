/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.textui.TestRunner;

import nima.ConfigLance;
import nima.NimaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Lance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigLanceTest extends ConfigTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigLanceTest.class);
	}

	/**
	 * Constructs a new Config Lance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigLanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Config Lance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigLance getFixture() {
		return (ConfigLance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NimaFactory.eINSTANCE.createConfigLance());
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

} //ConfigLanceTest
