package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "requerimientos")

public class Requerimientos implements Serializable {
    @Id
    @Column(name = "id_requerimientos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_requerimientos;

    @NotBlank(message="El campo de razón social es obligatorio")
    @Size(max = 100, message = "Los nombres no pueden exceder los 100 caracteres")
    private String razon_social;

    @NotBlank(message="El campo de nombre comercial es obligatorio")
    @Size(max = 100, message = "El nombre comercial no pueden exceder los 100 caracteres")
    private String nombre_comercial;

    @NotBlank(message="El campo de ruc es obligatorio")
    @Digits(integer = 11, fraction = 0, message = "La RUC debe tener 11 dígitos")
    private Integer ruc;

    @NotBlank(message="El campo de teléfono es obligatorio")
    @Digits(integer = 9, fraction = 0, message = "El número telefónico debe tener 11 dígitos")
    private Integer telefono ;

    @NotBlank(message="El campo de correo es obligatorio")
    @Email(message = "Debe ser un correo electrónico válido")
    private String correo;

    @NotBlank(message="El campo de sitio web es obligatorio")
    @Size(max = 50, message = "La URL tiene que ser válida")
    private String sitio_web;

    @NotBlank(message="El campo de dirección física es obligatorio")
    @Size(max = 150, message = "La dirección física como máximo peude tener 150 caractéres")
    private String direccion_fisica;

    @NotBlank(message="El campo de pais es obligatorio")
    @Size(max = 50, message = "El campo pais tiene que ser válido")
    private String pais;

    @NotBlank(message="El campo de representante legal es obligatorio")
    @Size(max = 50, message = "El nombre del representante legal solo puede tener como máximo 50 caractéres")
    private String representante_legal;

    @NotBlank(message="El campo de DNI es obligatorio")
    @Digits(integer = 11, fraction = 0, message = "El DNI debe tener 8 dígitos")
    private Integer dni;


    @NotBlank(message="El campo de tipo de provedor es obligatorio")
    @Size(max = 50, message = "El tipo de provedor  solo puede tener como máximo 50 caractéres")
    private String  tipo_provedor;

    @NotBlank(message="El campo de categoria es obligatorio")
    @Size(max = 50, message = "La categoria   solo puede tener como máximo 50 caractéres")
    private String  categoria;

    @NotBlank(message="El campo de facturación anual es obligatorio")
    @Digits(integer = 4, fraction = 0, message = "La facturacion debe tener 4 dígitos")
    private String  facturacion;

    @NotBlank(message="El campo de fechas registro es obligatorio")
    private LocalDateTime fecha_registro;

    @NotBlank(message="El campo de tipo de última actualización es obligatorio")
    private LocalDateTime  ultima_actualizacion;


    @NotBlank(message="El campo de tipo de estadp es obligatorio")
    private boolean  estado;



}
