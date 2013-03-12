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
 * A representation of the literals of the enumeration '<em><b>type Att</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nima.NimaPackage#gettypeAtt()
 * @model
 * @generated
 */
public enum typeAtt implements Enumerator {
	/**
	 * The '<em><b>Tranchant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANCHANT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANCHANT(0, "tranchant", "tranchant"),

	/**
	 * The '<em><b>Contondant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTONDANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTONDANT(1, "contondant", "contondant"),

	/**
	 * The '<em><b>Perforant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERFORANT_VALUE
	 * @generated
	 * @ordered
	 */
	PERFORANT(2, "perforant", "perforant"),

	/**
	 * The '<em><b>Chaleur</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHALEUR_VALUE
	 * @generated
	 * @ordered
	 */
	CHALEUR(3, "chaleur", "chaleur"),

	/**
	 * The '<em><b>Froid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROID_VALUE
	 * @generated
	 * @ordered
	 */
	FROID(4, "froid", "froid"),

	/**
	 * The '<em><b>Electricite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRICITE_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRICITE(5, "electricite", "electricite"),

	/**
	 * The '<em><b>Energie</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENERGIE_VALUE
	 * @generated
	 * @ordered
	 */
	ENERGIE(6, "energie", "energie");

	/**
	 * The '<em><b>Tranchant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tranchant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANCHANT
	 * @model name="tranchant"
	 * @generated
	 * @ordered
	 */
	public static final int TRANCHANT_VALUE = 0;

	/**
	 * The '<em><b>Contondant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contondant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTONDANT
	 * @model name="contondant"
	 * @generated
	 * @ordered
	 */
	public static final int CONTONDANT_VALUE = 1;

	/**
	 * The '<em><b>Perforant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perforant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERFORANT
	 * @model name="perforant"
	 * @generated
	 * @ordered
	 */
	public static final int PERFORANT_VALUE = 2;

	/**
	 * The '<em><b>Chaleur</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chaleur</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHALEUR
	 * @model name="chaleur"
	 * @generated
	 * @ordered
	 */
	public static final int CHALEUR_VALUE = 3;

	/**
	 * The '<em><b>Froid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Froid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROID
	 * @model name="froid"
	 * @generated
	 * @ordered
	 */
	public static final int FROID_VALUE = 4;

	/**
	 * The '<em><b>Electricite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electricite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRICITE
	 * @model name="electricite"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRICITE_VALUE = 5;

	/**
	 * The '<em><b>Energie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Energie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENERGIE
	 * @model name="energie"
	 * @generated
	 * @ordered
	 */
	public static final int ENERGIE_VALUE = 6;

	/**
	 * An array of all the '<em><b>type Att</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final typeAtt[] VALUES_ARRAY =
		new typeAtt[] {
			TRANCHANT,
			CONTONDANT,
			PERFORANT,
			CHALEUR,
			FROID,
			ELECTRICITE,
			ENERGIE,
		};

	/**
	 * A public read-only list of all the '<em><b>type Att</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<typeAtt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>type Att</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeAtt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeAtt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Att</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeAtt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			typeAtt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>type Att</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static typeAtt get(int value) {
		switch (value) {
			case TRANCHANT_VALUE: return TRANCHANT;
			case CONTONDANT_VALUE: return CONTONDANT;
			case PERFORANT_VALUE: return PERFORANT;
			case CHALEUR_VALUE: return CHALEUR;
			case FROID_VALUE: return FROID;
			case ELECTRICITE_VALUE: return ELECTRICITE;
			case ENERGIE_VALUE: return ENERGIE;
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
	private typeAtt(int value, String name, String literal) {
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
	
} //typeAtt
