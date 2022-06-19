package br.edu.up.model;  

import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id; 
import javax.persistence.Table;  
  
@Entity  
@Table(name = "Livro")  
public class Livro {  
  
	@Id  
	@GeneratedValue(strategy = GenerationType.AUTO)  
  	private Integer id;  
  	private String titulo;  
  	private String autor;  
  	private Integer ano;  
  	private String editora;  
  
  public Integer getId() {  
	 return id;  
  }  
  
  public void setId(Integer id) {  
	  this.id = id;  
  }  
  
  public String getTitulo() {  
	  return titulo;  
  }  
  
  public void setTitulo(String titulo) {  
	  this.titulo = titulo;  
  }  
  
  public String getAutor() {  
	  return autor;  
  }  
  
  public void setAutor(String autor) {  
	  this.autor = autor;  
  }  
    
  public Integer getAno() {  
	  return ano;  
  }  
  
  public void setAno(Integer ano) {  
	  this.ano = ano;  
  }  
    
  public String getEditora() {  
	  return editora;  
  }  
  
  public void setEditora(String editora) {  
	  this.editora = editora;  
  }
  
}
