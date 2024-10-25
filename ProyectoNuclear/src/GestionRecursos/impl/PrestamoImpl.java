/**
 */
package GestionRecursos.impl;

import GestionRecursos.Actas;
import GestionRecursos.GestionRecursosPackage;
import GestionRecursos.Prestamo;
import GestionRecursos.Reserva;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prestamo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getId <em>Id</em>}</li>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getFechaPrestamo <em>Fecha Prestamo</em>}</li>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getFechaDevolucion <em>Fecha Devolucion</em>}</li>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getActa <em>Acta</em>}</li>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getObservaciones <em>Observaciones</em>}</li>
 *   <li>{@link GestionRecursos.impl.PrestamoImpl#getReserva <em>Reserva</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrestamoImpl extends MinimalEObjectImpl.Container implements Prestamo {
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
	 * The default value of the '{@link #getFechaPrestamo() <em>Fecha Prestamo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPrestamo()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_PRESTAMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaPrestamo() <em>Fecha Prestamo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaPrestamo()
	 * @generated
	 * @ordered
	 */
	protected Date fechaPrestamo = FECHA_PRESTAMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFechaDevolucion() <em>Fecha Devolucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaDevolucion()
	 * @generated
	 * @ordered
	 */
	protected static final Date FECHA_DEVOLUCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFechaDevolucion() <em>Fecha Devolucion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFechaDevolucion()
	 * @generated
	 * @ordered
	 */
	protected Date fechaDevolucion = FECHA_DEVOLUCION_EDEFAULT;

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
	 * The cached value of the '{@link #getActa() <em>Acta</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActa()
	 * @generated
	 * @ordered
	 */
	protected Actas acta;

	/**
	 * The default value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected static final String OBSERVACIONES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObservaciones() <em>Observaciones</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservaciones()
	 * @generated
	 * @ordered
	 */
	protected String observaciones = OBSERVACIONES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReserva() <em>Reserva</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserva()
	 * @generated
	 * @ordered
	 */
	protected Reserva reserva;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrestamoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GestionRecursosPackage.Literals.PRESTAMO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaPrestamo(Date newFechaPrestamo) {
		Date oldFechaPrestamo = fechaPrestamo;
		fechaPrestamo = newFechaPrestamo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__FECHA_PRESTAMO, oldFechaPrestamo, fechaPrestamo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFechaDevolucion(Date newFechaDevolucion) {
		Date oldFechaDevolucion = fechaDevolucion;
		fechaDevolucion = newFechaDevolucion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__FECHA_DEVOLUCION, oldFechaDevolucion, fechaDevolucion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__ESTADO, oldEstado, estado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actas getActa() {
		if (acta != null && acta.eIsProxy()) {
			InternalEObject oldActa = (InternalEObject)acta;
			acta = (Actas)eResolveProxy(oldActa);
			if (acta != oldActa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GestionRecursosPackage.PRESTAMO__ACTA, oldActa, acta));
			}
		}
		return acta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actas basicGetActa() {
		return acta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActa(Actas newActa) {
		Actas oldActa = acta;
		acta = newActa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__ACTA, oldActa, acta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObservaciones() {
		return observaciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservaciones(String newObservaciones) {
		String oldObservaciones = observaciones;
		observaciones = newObservaciones;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__OBSERVACIONES, oldObservaciones, observaciones));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reserva getReserva() {
		if (reserva != null && reserva.eIsProxy()) {
			InternalEObject oldReserva = (InternalEObject)reserva;
			reserva = (Reserva)eResolveProxy(oldReserva);
			if (reserva != oldReserva) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GestionRecursosPackage.PRESTAMO__RESERVA, oldReserva, reserva));
			}
		}
		return reserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserva basicGetReserva() {
		return reserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserva(Reserva newReserva) {
		Reserva oldReserva = reserva;
		reserva = newReserva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GestionRecursosPackage.PRESTAMO__RESERVA, oldReserva, reserva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GestionRecursosPackage.PRESTAMO__ID:
				return getId();
			case GestionRecursosPackage.PRESTAMO__FECHA_PRESTAMO:
				return getFechaPrestamo();
			case GestionRecursosPackage.PRESTAMO__FECHA_DEVOLUCION:
				return getFechaDevolucion();
			case GestionRecursosPackage.PRESTAMO__ESTADO:
				return getEstado();
			case GestionRecursosPackage.PRESTAMO__ACTA:
				if (resolve) return getActa();
				return basicGetActa();
			case GestionRecursosPackage.PRESTAMO__OBSERVACIONES:
				return getObservaciones();
			case GestionRecursosPackage.PRESTAMO__RESERVA:
				if (resolve) return getReserva();
				return basicGetReserva();
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
			case GestionRecursosPackage.PRESTAMO__ID:
				setId((Integer)newValue);
				return;
			case GestionRecursosPackage.PRESTAMO__FECHA_PRESTAMO:
				setFechaPrestamo((Date)newValue);
				return;
			case GestionRecursosPackage.PRESTAMO__FECHA_DEVOLUCION:
				setFechaDevolucion((Date)newValue);
				return;
			case GestionRecursosPackage.PRESTAMO__ESTADO:
				setEstado((String)newValue);
				return;
			case GestionRecursosPackage.PRESTAMO__ACTA:
				setActa((Actas)newValue);
				return;
			case GestionRecursosPackage.PRESTAMO__OBSERVACIONES:
				setObservaciones((String)newValue);
				return;
			case GestionRecursosPackage.PRESTAMO__RESERVA:
				setReserva((Reserva)newValue);
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
			case GestionRecursosPackage.PRESTAMO__ID:
				setId(ID_EDEFAULT);
				return;
			case GestionRecursosPackage.PRESTAMO__FECHA_PRESTAMO:
				setFechaPrestamo(FECHA_PRESTAMO_EDEFAULT);
				return;
			case GestionRecursosPackage.PRESTAMO__FECHA_DEVOLUCION:
				setFechaDevolucion(FECHA_DEVOLUCION_EDEFAULT);
				return;
			case GestionRecursosPackage.PRESTAMO__ESTADO:
				setEstado(ESTADO_EDEFAULT);
				return;
			case GestionRecursosPackage.PRESTAMO__ACTA:
				setActa((Actas)null);
				return;
			case GestionRecursosPackage.PRESTAMO__OBSERVACIONES:
				setObservaciones(OBSERVACIONES_EDEFAULT);
				return;
			case GestionRecursosPackage.PRESTAMO__RESERVA:
				setReserva((Reserva)null);
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
			case GestionRecursosPackage.PRESTAMO__ID:
				return id != ID_EDEFAULT;
			case GestionRecursosPackage.PRESTAMO__FECHA_PRESTAMO:
				return FECHA_PRESTAMO_EDEFAULT == null ? fechaPrestamo != null : !FECHA_PRESTAMO_EDEFAULT.equals(fechaPrestamo);
			case GestionRecursosPackage.PRESTAMO__FECHA_DEVOLUCION:
				return FECHA_DEVOLUCION_EDEFAULT == null ? fechaDevolucion != null : !FECHA_DEVOLUCION_EDEFAULT.equals(fechaDevolucion);
			case GestionRecursosPackage.PRESTAMO__ESTADO:
				return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
			case GestionRecursosPackage.PRESTAMO__ACTA:
				return acta != null;
			case GestionRecursosPackage.PRESTAMO__OBSERVACIONES:
				return OBSERVACIONES_EDEFAULT == null ? observaciones != null : !OBSERVACIONES_EDEFAULT.equals(observaciones);
			case GestionRecursosPackage.PRESTAMO__RESERVA:
				return reserva != null;
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
		result.append(", fechaPrestamo: ");
		result.append(fechaPrestamo);
		result.append(", fechaDevolucion: ");
		result.append(fechaDevolucion);
		result.append(", estado: ");
		result.append(estado);
		result.append(", observaciones: ");
		result.append(observaciones);
		result.append(')');
		return result.toString();
	}

} //PrestamoImpl
