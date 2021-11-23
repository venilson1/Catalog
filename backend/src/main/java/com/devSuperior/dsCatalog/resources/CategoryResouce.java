package com.devSuperior.dsCatalog.resources;

import java.util.List;

import com.devSuperior.dsCatalog.dto.CategoryDTO;
import com.devSuperior.dsCatalog.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResouce {

  @Autowired
  private CategoryService service;

  @GetMapping
  public ResponseEntity<List<CategoryDTO>> findAll() {
    List<CategoryDTO> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
    CategoryDTO dto = service.findById(id);
    return ResponseEntity.ok().body(dto);
  }
}
