/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.textui.TestRunner;

import nima.ConfigAoe;
import nima.NimaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Aoe</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigAoeTest extends ConfigTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigAoeTest.class);
	}

	/**
	 * Constructs a new Config Aoe test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigAoeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Config Aoe test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigAoe getFixture() {
		return (ConfigAoe)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NimaFactory.eINSTANCE.createConfigAoe());
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

} //ConfigAoeTest
