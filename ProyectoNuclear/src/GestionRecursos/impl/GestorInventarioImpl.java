/**
 */
package GestionRecursos.impl;

import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.GestorInventario;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gestor Inventario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.GestorInventarioImpl#getNivelAcceso <em>Nivel Acceso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GestorInventarioImpl extends UsuarioImpl implements GestorInventario {
	/**
	 * The default value of the '{@link #getNivelAcceso() <em>Nivel Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNivelAcceso()
	 * @generated
	 * @ordered
	 */
	protected static final int NIVEL_ACCESO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNivelAcceso() <em>Nivel Acceso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNivelAcceso()
	 * @generated
	 * @ordered
	 */
	protected int nivelAcceso = NIVEL_ACCESO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestorInventarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.GESTOR_INVENTARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNivelAcceso() {
		return nivelAcceso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNivelAcceso(int newNivelAcceso) {
		int oldNivelAcceso = nivelAcceso;
		nivelAcceso = newNivelAcceso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.GESTOR_INVENTARIO__NIVEL_ACCESO, oldNivelAcceso, nivelAcceso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.GESTOR_INVENTARIO__NIVEL_ACCESO:
				return getNivelAcceso();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GestionRecursosPackage.GESTOR_INVENTARIO__NIVEL_ACCESO:
				setNivelAcceso((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GestionRecursosPackage.GESTOR_INVENTARIO__NIVEL_ACCESO:
				setNivelAcceso(NIVEL_ACCESO_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GestionRecursosPackage.GESTOR_INVENTARIO__NIVEL_ACCESO:
				return nivelAcceso != NIVEL_ACCESO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nivelAcceso: ");
		result.append(nivelAcceso);
		result.append(')');
		return result.toString();
	}

} //GestorInventarioImpl
