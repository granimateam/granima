/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.textui.TestRunner;

import nima.ConfigTir;
import nima.NimaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Tir</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigTirTest extends ConfigTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigTirTest.class);
	}

	/**
	 * Constructs a new Config Tir test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigTirTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Config Tir test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConfigTir getFixture() {
		return (ConfigTir)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NimaFactory.eINSTANCE.createConfigTir());
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

} //ConfigTirTest