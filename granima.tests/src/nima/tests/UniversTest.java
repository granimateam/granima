/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import nima.NimaFactory;
import nima.Univers;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Univers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversTest extends TestCase {

	/**
	 * The fixture for this Univers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Univers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UniversTest.class);
	}

	/**
	 * Constructs a new Univers test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Univers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Univers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Univers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Univers getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NimaFactory.eINSTANCE.createUnivers());
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

} //UniversTest
