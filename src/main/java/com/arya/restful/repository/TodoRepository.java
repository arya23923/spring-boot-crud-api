	package com.arya.restful.repository;

	 

	import com.arya.restful.model.Todo;

	import org.springframework.data.jpa.repository.JpaRepository;

	 

	public interface TodoRepository extends JpaRepository<Todo, Long> {

	}