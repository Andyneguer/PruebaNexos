package com.spring.domain;


import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data//
@Entity
@Table(name = "persona")
public class Persona implements Serializable
{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    
    @NotEmpty
    //This notation validates that the string is not empty
    private String nombres;

    @NotEmpty
    //This notation validates that the string is not empty
    private String apellidos;
    
    @NotEmpty
    //This notation validates that the string is not empty
    private String tipoDocumento;
    
    @NotEmpty
    //This notation validates that the string is not empty
    private String cedula;
    
    @NotEmpty
    //This notation validates that the string is not empty
    private String fechaNacimiento;
    
    @NotEmpty
    //This notation validates that the string is not empty
    private String direccion;
    
    @NotEmpty
    //This notation validates that the string is not empty
    private String celular;
}
