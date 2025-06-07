package com.example.demo.repository;


import com.example.demo.entity.Requerimientos;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequerimientosRepository extends JpaRepository<Requerimientos, Integer> {

    List<Requerimientos> findByActivo(boolean estado);

}
