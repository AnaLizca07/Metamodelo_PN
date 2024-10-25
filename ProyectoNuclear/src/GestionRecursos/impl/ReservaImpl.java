/**
 */
package GestionRecursos.impl;

import GestionRecursos.Equipo;
import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.Reserva;
import GestionRecursos.Usuario;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserva</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.ReservaImpl#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.impl.ReservaImpl#getFechaSolicitud <em>Fecha Solicitud</em>}</li>
 *   <li>{@link GestionRecursos.impl.ReservaImpl#getFechaReserva <em>Fecha Reserva</em>}</li>
 *   <li>{@link GestionRecursos.impl.ReservaImpl#getEquipo <em>Equipo</em>}</li>
 *   <li>{@link GestionRecursos.impl.ReservaImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link GestionRecursos.impl.ReservaImpl#getEstado <em>Estado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReservaImpl extends MinimalEObjectImpl.Container implements Reserva {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaSolicitud() <em>Fecha Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaSolicitud()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_SOLICITUD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaSolicitud() <em>Fecha Solicitud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaSolicitud()
	 * @generated
	 * @ordered
	 */
	protected Date fechaSolicitud = FECHA_SOLICITUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaReserva() <em>Fecha Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaReserva()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_RESERVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaReserva() <em>Fecha Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaReserva()
	 * @generated
	 * @ordered
	 */
	protected Date fechaReserva = FECHA_RESERVA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquipo() <em>Equipo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipo()
	 * @generated
	 * @ordered
	 */
	protected Equipo equipo;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected Usuario usuario;

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
	protected ReservaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.RESERVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.RESERVA__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaSolicitud(Date newFechaSolicitud) {
		Date oldFechaSolicitud = fechaSolicitud;
		fechaSolicitud = newFechaSolicitud;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.RESERVA__FECHA_SOLICITUD, oldFechaSolicitud, fechaSolicitud));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaReserva() {
		return fechaReserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaReserva(Date newFechaReserva) {
		Date oldFechaReserva = fechaReserva;
		fechaReserva = newFechaReserva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.RESERVA__FECHA_RESERVA, oldFechaReserva, fechaReserva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Equipo getEquipo() {
		if (equipo != null && equipo.eIsProxy()) {
			InternalEObject oldEquipo = (InternalEObject)equipo;
			equipo = (Equipo)eResolveProxy(oldEquipo);
			if (equipo != oldEquipo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GestionRecursosPackage.RESERVA__EQUIPO, oldEquipo, equipo));
			}
		}
		return equipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipo basicGetEquipo() {
		return equipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEquipo(Equipo newEquipo) {
		Equipo oldEquipo = equipo;
		equipo = newEquipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.RESERVA__EQUIPO, oldEquipo, equipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usuario getUsuario() {
		if (usuario != null && usuario.eIsProxy()) {
			InternalEObject oldUsuario = (InternalEObject)usuario;
			usuario = (Usuario)eResolveProxy(oldUsuario);
			if (usuario != oldUsuario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GestionRecursosPackage.RESERVA__USUARIO, oldUsuario, usuario));
			}
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario basicGetUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsuario(Usuario newUsuario) {
		Usuario oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.RESERVA__USUARIO, oldUsuario, usuario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.RESERVA__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.RESERVA__ID:
				return getId();
			case GestionRecursosPackage.RESERVA__FECHA_SOLICITUD:
				return getFechaSolicitud();
			case GestionRecursosPackage.RESERVA__FECHA_RESERVA:
				return getFechaReserva();
			case GestionRecursosPackage.RESERVA__EQUIPO:
				if (resolve) return getEquipo();
				return basicGetEquipo();
			case GestionRecursosPackage.RESERVA__USUARIO:
				if (resolve) return getUsuario();
				return basicGetUsuario();
			case GestionRecursosPackage.RESERVA__ESTADO:
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
			case GestionRecursosPackage.RESERVA__ID:
				setId((Integer)newValue);
				return;
			case GestionRecursosPackage.RESERVA__FECHA_SOLICITUD:
				setFechaSolicitud((Date)newValue);
				return;
			case GestionRecursosPackage.RESERVA__FECHA_RESERVA:
				setFechaReserva((Date)newValue);
				return;
			case GestionRecursosPackage.RESERVA__EQUIPO:
				setEquipo((Equipo)newValue);
				return;
			case GestionRecursosPackage.RESERVA__USUARIO:
				setUsuario((Usuario)newValue);
				return;
			case GestionRecursosPackage.RESERVA__ESTADO:
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
			case GestionRecursosPackage.RESERVA__ID:
				setId(ID_EDEFAULT);
				return;
			case GestionRecursosPackage.RESERVA__FECHA_SOLICITUD:
				setFechaSolicitud(FECHA_SOLICITUD_EDEFAULT);
				return;
			case GestionRecursosPackage.RESERVA__FECHA_RESERVA:
				setFechaReserva(FECHA_RESERVA_EDEFAULT);
				return;
			case GestionRecursosPackage.RESERVA__EQUIPO:
				setEquipo((Equipo)null);
				return;
			case GestionRecursosPackage.RESERVA__USUARIO:
				setUsuario((Usuario)null);
				return;
			case GestionRecursosPackage.RESERVA__ESTADO:
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
			case GestionRecursosPackage.RESERVA__ID:
				return id != ID_EDEFAULT;
			case GestionRecursosPackage.RESERVA__FECHA_SOLICITUD:
				return FECHA_SOLICITUD_EDEFAULT == null ? fechaSolicitud != null : !FECHA_SOLICITUD_EDEFAULT.equals(fechaSolicitud);
			case GestionRecursosPackage.RESERVA__FECHA_RESERVA:
				return FECHA_RESERVA_EDEFAULT == null ? fechaReserva != null : !FECHA_RESERVA_EDEFAULT.equals(fechaReserva);
			case GestionRecursosPackage.RESERVA__EQUIPO:
				return equipo != null;
			case GestionRecursosPackage.RESERVA__USUARIO:
				return usuario != null;
			case GestionRecursosPackage.RESERVA__ESTADO:
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
		result.append(", fechaSolicitud: ");
		result.append(fechaSolicitud);
		result.append(", fechaReserva: ");
		result.append(fechaReserva);
		result.append(", estado: ");
		result.append(estado);
		result.append(')');
		return result.toString();
	}

} //ReservaImpl
