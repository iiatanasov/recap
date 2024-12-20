package bg.tu-sofia.lab1458.recap;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long>, CrudRepository<Student,Long> {

	List<Student> findByLastName(@Param("name") String name);

}
