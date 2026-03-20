package com.dam1.lumaraesports.repository.impl;

import com.dam1.lumaraesports.model.Equipo;
import com.dam1.lumaraesports.repository.EquipoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Repository
@AllArgsConstructor
public class EquipoRepositoryImpl implements EquipoRepository {

    private final JdbcTemplate jdbcTemplate

    @Override
    public List<Equipo> findAll() {
        String sql = "Select * from equipo ORDER BY id";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Equipo(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("juego"),
                        rs.getString("pais")));
    }

    @Override
    public Equipo findById(Long id) {
        String sql = "Select * from equipo WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) ->
                new Equipo(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("juego"),
                        rs.getString("pais")
                ), id
        );
    }

    @Override
    public void save(Equipo equipo) {

    }

    @Override
    public void update(Equipo equipo) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public boolean existByName(String nombre) {
        return false;
    }

    @Override
    public boolean existByNameDifferentId(String nombre, Long id) {
        return false;
    }
}
