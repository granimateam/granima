/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.textui.TestRunner;

import nima.DualHandConfig;
import nima.NimaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dual Hand Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DualHandConfigTest extends ConfigCacTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DualHandConfigTest.class);
	}

	/**
	 * Constructs a new Dual Hand Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DualHandConfigTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dual Hand Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DualHandConfig getFixture() {
		return (DualHandConfig)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NimaFactory.eINSTANCE.createDualHandConfig());
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

} //DualHandConfigTest
