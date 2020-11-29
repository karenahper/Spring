package com.karen.demo.repo;

import com.karen.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface Postrepository extends CrudRepository<Post, Long> {
}
