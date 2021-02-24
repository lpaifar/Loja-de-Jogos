package com.lojadejogos.lojadejogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadejogos.lojadejogos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> 
{
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}
