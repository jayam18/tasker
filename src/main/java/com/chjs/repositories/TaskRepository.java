package com.chjs.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.chjs.models.Task;

/**
 * Created by localadmin on 8/17/16.
 */
public interface TaskRepository extends PagingAndSortingRepository<Task,Integer>{
}
