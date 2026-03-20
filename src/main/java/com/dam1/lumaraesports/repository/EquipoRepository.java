package com.dam1.lumaraesports.repository;

import com.dam1.lumaraesports.model.Equipo;

import java.util.List;

public interface EquipoRepository {

    public List<Equipo> findAll();
    public Equipo findById(Long id);
    public void save(Equipo equipo);
    public void update(Equipo equipo);
    public void deleteById(Long id);
    public boolean existByName(String nombre);
    public boolean existByNameDifferentId(String nombre, Long id);
}
