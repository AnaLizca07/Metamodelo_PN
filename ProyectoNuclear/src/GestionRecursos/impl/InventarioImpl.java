/**
 */
package GestionRecursos.impl;

import GestionRecursos.Equipo;
import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.GestorInventario;
import GestionRecursos.Inventario;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.InventarioImpl#getReporte <em>Reporte</em>}</li>
 *   <li>{@link GestionRecursos.impl.InventarioImpl#getEquiposTecnologicos <em>Equipos Tecnologicos</em>}</li>
 *   <li>{@link GestionRecursos.impl.InventarioImpl#getAdministrador <em>Administrador</em>}</li>
 *   <li>{@link GestionRecursos.impl.InventarioImpl#getEstadoElementos <em>Estado Elementos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InventarioImpl extends MinimalEObjectImpl.Container implements Inventario {
	/**
	 * The default value of the '{@link #getReporte() <em>Reporte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporte()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReporte() <em>Reporte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReporte()
	 * @generated
	 * @ordered
	 */
	protected String reporte = REPORTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquiposTecnologicos() <em>Equipos Tecnologicos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquiposTecnologicos()
	 * @generated
	 * @ordered
	 */
	protected Equipo equiposTecnologicos;

	/**
	 * The cached value of the '{@link #getAdministrador() <em>Administrador</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdministrador()
	 * @generated
	 * @ordered
	 */
	protected EList<GestorInventario> administrador;

	/**
	 * The default value of the '{@link #getEstadoElementos() <em>Estado Elementos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoElementos()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_ELEMENTOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstadoElementos() <em>Estado Elementos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstadoElementos()
	 * @generated
	 * @ordered
	 */
	protected String estadoElementos = ESTADO_ELEMENTOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InventarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.INVENTARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReporte() {
		return reporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReporte(String newReporte) {
		String oldReporte = reporte;
		reporte = newReporte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.INVENTARIO__REPORTE, oldReporte, reporte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equipo getEquiposTecnologicos() {
		if (equiposTecnologicos != null && equiposTecnologicos.eIsProxy()) {
			InternalEObject oldEquiposTecnologicos = (InternalEObject)equiposTecnologicos;
			equiposTecnologicos = (Equipo)eResolveProxy(oldEquiposTecnologicos);
			if (equiposTecnologicos != oldEquiposTecnologicos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GestionRecursosPackage.INVENTARIO__EQUIPOS_TECNOLOGICOS, oldEquiposTecnologicos, equiposTecnologicos));
			}
		}
		return equiposTecnologicos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipo basicGetEquiposTecnologicos() {
		return equiposTecnologicos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquiposTecnologicos(Equipo newEquiposTecnologicos) {
		Equipo oldEquiposTecnologicos = equiposTecnologicos;
		equiposTecnologicos = newEquiposTecnologicos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.INVENTARIO__EQUIPOS_TECNOLOGICOS, oldEquiposTecnologicos, equiposTecnologicos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GestorInventario> getAdministrador() {
		if (administrador == null) {
			administrador = new EObjectResolvingEList<GestorInventario>(GestorInventario.class, this, GestionRecursosPackage.INVENTARIO__ADMINISTRADOR);
		}
		return administrador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstadoElementos() {
		return estadoElementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstadoElementos(String newEstadoElementos) {
		String oldEstadoElementos = estadoElementos;
		estadoElementos = newEstadoElementos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.INVENTARIO__ESTADO_ELEMENTOS, oldEstadoElementos, estadoElementos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.INVENTARIO__REPORTE:
				return getReporte();
			case GestionRecursosPackage.INVENTARIO__EQUIPOS_TECNOLOGICOS:
				if (resolve) return getEquiposTecnologicos();
				return basicGetEquiposTecnologicos();
			case GestionRecursosPackage.INVENTARIO__ADMINISTRADOR:
				return getAdministrador();
			case GestionRecursosPackage.INVENTARIO__ESTADO_ELEMENTOS:
				return getEstadoElementos();
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
			case GestionRecursosPackage.INVENTARIO__REPORTE:
				setReporte((String)newValue);
				return;
			case GestionRecursosPackage.INVENTARIO__EQUIPOS_TECNOLOGICOS:
				setEquiposTecnologicos((Equipo)newValue);
				return;
			case GestionRecursosPackage.INVENTARIO__ADMINISTRADOR:
				getAdministrador().clear();
				getAdministrador().addAll((Collection<? extends GestorInventario>)newValue);
				return;
			case GestionRecursosPackage.INVENTARIO__ESTADO_ELEMENTOS:
				setEstadoElementos((String)newValue);
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
			case GestionRecursosPackage.INVENTARIO__REPORTE:
				setReporte(REPORTE_EDEFAULT);
				return;
			case GestionRecursosPackage.INVENTARIO__EQUIPOS_TECNOLOGICOS:
				setEquiposTecnologicos((Equipo)null);
				return;
			case GestionRecursosPackage.INVENTARIO__ADMINISTRADOR:
				getAdministrador().clear();
				return;
			case GestionRecursosPackage.INVENTARIO__ESTADO_ELEMENTOS:
				setEstadoElementos(ESTADO_ELEMENTOS_EDEFAULT);
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
			case GestionRecursosPackage.INVENTARIO__REPORTE:
				return REPORTE_EDEFAULT == null ? reporte != null : !REPORTE_EDEFAULT.equals(reporte);
			case GestionRecursosPackage.INVENTARIO__EQUIPOS_TECNOLOGICOS:
				return equiposTecnologicos != null;
			case GestionRecursosPackage.INVENTARIO__ADMINISTRADOR:
				return administrador != null && !administrador.isEmpty();
			case GestionRecursosPackage.INVENTARIO__ESTADO_ELEMENTOS:
				return ESTADO_ELEMENTOS_EDEFAULT == null ? estadoElementos != null : !ESTADO_ELEMENTOS_EDEFAULT.equals(estadoElementos);
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
		result.append(" (reporte: ");
		result.append(reporte);
		result.append(", estadoElementos: ");
		result.append(estadoElementos);
		result.append(')');
		return result.toString();
	}

} //InventarioImpl
