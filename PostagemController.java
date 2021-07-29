package org.generetion.blogpessoal.controller;

import java.util.List;

import org.generetion.blogpessoal.model.Postagem;
import org.generetion.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	 @GetMapping
	 public ResponseEntity<List<Postagem>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	  @GetMapping ("/{ID}")
	  public ResponseEntity<Postagem> GetByID(@PathVariable long ID){
		return repository.findById(ID)
	               .map(resp-> ResponseEntity.ok(resp))
			 .orElse(ResponseEntity.notFound().build());			
	}
       @GetMapping("/titulo/{titulo}")
       public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String titulo){
          return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));	 
         }
        @PostMapping
        public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
        	return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
        	        	   
           }
          @PutMapping
           public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
        	   return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
}
}
