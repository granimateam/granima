/**
 */
package nima;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Attaque</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nima.NimaPackage#getTypeAttaque()
 * @model
 * @generated
 */
public enum TypeAttaque implements Enumerator {
	/**
	 * The '<em><b>Cac</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAC_VALUE
	 * @generated
	 * @ordered
	 */
	CAC(0, "cac", "cac"),

	/**
	 * The '<em><b>Lance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANCE_VALUE
	 * @generated
	 * @ordered
	 */
	LANCE(1, "lance", "lance"),

	/**
	 * The '<em><b>Tir</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIR_VALUE
	 * @generated
	 * @ordered
	 */
	TIR(2, "tir", "tir"),

	/**
	 * The '<em><b>Neutre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTRE_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTRE(3, "neutre", "neutre");

	/**
	 * The '<em><b>Cac</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cac</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAC
	 * @model name="cac"
	 * @generated
	 * @ordered
	 */
	public static final int CAC_VALUE = 0;

	/**
	 * The '<em><b>Lance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANCE
	 * @model name="lance"
	 * @generated
	 * @ordered
	 */
	public static final int LANCE_VALUE = 1;

	/**
	 * The '<em><b>Tir</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tir</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIR
	 * @model name="tir"
	 * @generated
	 * @ordered
	 */
	public static final int TIR_VALUE = 2;

	/**
	 * The '<em><b>Neutre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neutre</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEUTRE
	 * @model name="neutre"
	 * @generated
	 * @ordered
	 */
	public static final int NEUTRE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Attaque</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeAttaque[] VALUES_ARRAY =
		new TypeAttaque[] {
			CAC,
			LANCE,
			TIR,
			NEUTRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Attaque</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeAttaque> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Attaque</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAttaque get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAttaque result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Attaque</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAttaque getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAttaque result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Attaque</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAttaque get(int value) {
		switch (value) {
			case CAC_VALUE: return CAC;
			case LANCE_VALUE: return LANCE;
			case TIR_VALUE: return TIR;
			case NEUTRE_VALUE: return NEUTRE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeAttaque(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeAttaque
