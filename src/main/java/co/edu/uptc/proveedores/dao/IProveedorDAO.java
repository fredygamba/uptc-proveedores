package co.edu.uptc.proveedores.dao;

import co.edu.uptc.proveedores.modelo.Proveedor;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author fredy
 */
public interface IProveedorDAO {

    public void actualizarProveedor(Proveedor proveedor) throws HibernateException;

    public Integer agregarProveedor(Proveedor proveedor) throws HibernateException;

    public Proveedor consultarProveedor(Integer codigo) throws HibernateException;

    public List<Proveedor> consultarProveedores() throws HibernateException;

    public void eliminarProveedor(Proveedor proveedor) throws HibernateException;

}
