/**
 */
package GestionRecursos.impl;

import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.GestorPrestamos;
import GestionRecursos.Notificaciones;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gestor Prestamos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.GestorPrestamosImpl#getNotificaciones <em>Notificaciones</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GestorPrestamosImpl extends UsuarioImpl implements GestorPrestamos {
	/**
	 * The cached value of the '{@link #getNotificaciones() <em>Notificaciones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificaciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Notificaciones> notificaciones;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GestorPrestamosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.GESTOR_PRESTAMOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notificaciones> getNotificaciones() {
		if (notificaciones == null) {
			notificaciones = new EObjectResolvingEList<Notificaciones>(Notificaciones.class, this, GestionRecursosPackage.GESTOR_PRESTAMOS__NOTIFICACIONES);
		}
		return notificaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.GESTOR_PRESTAMOS__NOTIFICACIONES:
				return getNotificaciones();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GestionRecursosPackage.GESTOR_PRESTAMOS__NOTIFICACIONES:
				getNotificaciones().clear();
				getNotificaciones().addAll((Collection<? extends Notificaciones>)newValue);
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
			case GestionRecursosPackage.GESTOR_PRESTAMOS__NOTIFICACIONES:
				getNotificaciones().clear();
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
			case GestionRecursosPackage.GESTOR_PRESTAMOS__NOTIFICACIONES:
				return notificaciones != null && !notificaciones.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GestorPrestamosImpl
