/**
 * @author: Edson A. Terceros T.
 */

package edu.umss.dip.ssiservice.model;

import edu.umss.dip.ssiservice.dto.EmployeeDto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee extends ModelBase<EmployeeDto> {
    private String CI;
    private String nombresE;
    private String apellidosE;
    private String direccion;
    private String telefono;
    private String correo;
    private String gradoInstruccion;
    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    private List<Contract> contracts = new ArrayList<>();

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombresE() {
        return nombresE;
    }

    public void setNombresE(String nombresE) {
        this.nombresE = nombresE;
    }

    public String getApellidosE() {
        return apellidosE;
    }

    public void setApellidosE(String apellidosE) {
        this.apellidosE = apellidosE;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGradoInstruccion() {
        return gradoInstruccion;
    }

    public void setGradoInstruccion(String gradoInstruccion) {
        this.gradoInstruccion = gradoInstruccion;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
