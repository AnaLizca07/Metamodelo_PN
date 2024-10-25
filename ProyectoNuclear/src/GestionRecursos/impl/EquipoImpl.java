/**
 */
package GestionRecursos.impl;

import GestionRecursos.Equipo;
import GestionRecursos.GestionRecursosPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.EquipoImpl#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.impl.EquipoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link GestionRecursos.impl.EquipoImpl#getMarca <em>Marca</em>}</li>
 *   <li>{@link GestionRecursos.impl.EquipoImpl#getSede <em>Sede</em>}</li>
 *   <li>{@link GestionRecursos.impl.EquipoImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipoImpl extends MinimalEObjectImpl.Container implements Equipo {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected static final String MARCA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarca() <em>Marca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarca()
	 * @generated
	 * @ordered
	 */
	protected String marca = MARCA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSede() <em>Sede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSede()
	 * @generated
	 * @ordered
	 */
	protected static final String SEDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSede() <em>Sede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSede()
	 * @generated
	 * @ordered
	 */
	protected String sede = SEDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected static final String ESTADO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstado()
	 * @generated
	 * @ordered
	 */
	protected String estado = ESTADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EquipoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.EQUIPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.EQUIPO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.EQUIPO__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMarca() {
		return marca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarca(String newMarca) {
		String oldMarca = marca;
		marca = newMarca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.EQUIPO__MARCA, oldMarca, marca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSede() {
		return sede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSede(String newSede) {
		String oldSede = sede;
		sede = newSede;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.EQUIPO__SEDE, oldSede, sede));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEstado() {
		return estado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstado(String newEstado) {
		String oldEstado = estado;
		estado = newEstado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.EQUIPO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.EQUIPO__ID:
				return getId();
			case GestionRecursosPackage.EQUIPO__NOMBRE:
				return getNombre();
			case GestionRecursosPackage.EQUIPO__MARCA:
				return getMarca();
			case GestionRecursosPackage.EQUIPO__SEDE:
				return getSede();
			case GestionRecursosPackage.EQUIPO__ESTADO:
				return getEstado();
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
			case GestionRecursosPackage.EQUIPO__ID:
				setId((String)newValue);
				return;
			case GestionRecursosPackage.EQUIPO__NOMBRE:
				setNombre((String)newValue);
				return;
			case GestionRecursosPackage.EQUIPO__MARCA:
				setMarca((String)newValue);
				return;
			case GestionRecursosPackage.EQUIPO__SEDE:
				setSede((String)newValue);
				return;
			case GestionRecursosPackage.EQUIPO__ESTADO:
				setEstado((String)newValue);
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
			case GestionRecursosPackage.EQUIPO__ID:
				setId(ID_EDEFAULT);
				return;
			case GestionRecursosPackage.EQUIPO__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case GestionRecursosPackage.EQUIPO__MARCA:
				setMarca(MARCA_EDEFAULT);
				return;
			case GestionRecursosPackage.EQUIPO__SEDE:
				setSede(SEDE_EDEFAULT);
				return;
			case GestionRecursosPackage.EQUIPO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
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
			case GestionRecursosPackage.EQUIPO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GestionRecursosPackage.EQUIPO__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case GestionRecursosPackage.EQUIPO__MARCA:
				return MARCA_EDEFAULT == null ? marca != null : !MARCA_EDEFAULT.equals(marca);
			case GestionRecursosPackage.EQUIPO__SEDE:
				return SEDE_EDEFAULT == null ? sede != null : !SEDE_EDEFAULT.equals(sede);
			case GestionRecursosPackage.EQUIPO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", nombre: ");
		result.append(nombre);
		result.append(", marca: ");
		result.append(marca);
		result.append(", sede: ");
		result.append(sede);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //EquipoImpl
