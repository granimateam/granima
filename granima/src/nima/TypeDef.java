/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package nima;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Def</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nima.NimaPackage#getTypeDef()
 * @model
 * @generated
 */
public enum TypeDef implements Enumerator {
	/**
	 * The '<em><b>Esquive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESQUIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ESQUIVE(0, "esquive", "esquive"),

	/**
	 * The '<em><b>Parade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARADE_VALUE
	 * @generated
	 * @ordered
	 */
	PARADE(1, "parade", "parade"),

	/**
	 * The '<em><b>Bouclier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUCLIER_VALUE
	 * @generated
	 * @ordered
	 */
	BOUCLIER(2, "bouclier", "bouclier"),

	/**
	 * The '<em><b>Encaissement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCAISSEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENCAISSEMENT(3, "encaissement", "encaissement");

	/**
	 * The '<em><b>Esquive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Esquive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESQUIVE
	 * @model name="esquive"
	 * @generated
	 * @ordered
	 */
	public static final int ESQUIVE_VALUE = 0;

	/**
	 * The '<em><b>Parade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARADE
	 * @model name="parade"
	 * @generated
	 * @ordered
	 */
	public static final int PARADE_VALUE = 1;

	/**
	 * The '<em><b>Bouclier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bouclier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUCLIER
	 * @model name="bouclier"
	 * @generated
	 * @ordered
	 */
	public static final int BOUCLIER_VALUE = 2;

	/**
	 * The '<em><b>Encaissement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Encaissement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCAISSEMENT
	 * @model name="encaissement"
	 * @generated
	 * @ordered
	 */
	public static final int ENCAISSEMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Type Def</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeDef[] VALUES_ARRAY =
		new TypeDef[] {
			ESQUIVE,
			PARADE,
			BOUCLIER,
			ENCAISSEMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Def</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeDef> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Def</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDef get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDef result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Def</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDef getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeDef result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Def</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeDef get(int value) {
		switch (value) {
			case ESQUIVE_VALUE: return ESQUIVE;
			case PARADE_VALUE: return PARADE;
			case BOUCLIER_VALUE: return BOUCLIER;
			case ENCAISSEMENT_VALUE: return ENCAISSEMENT;
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
	private TypeDef(int value, String name, String literal) {
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
	
} //TypeDef
