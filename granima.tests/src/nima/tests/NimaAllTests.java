/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Nima</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class NimaAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new NimaAllTests("Nima Tests");
		suite.addTest(NimaTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NimaAllTests(String name) {
		super(name);
	}

} //NimaAllTests
