package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "categoria", path = "categoria")
public interface CategoriaRepository extends PagingAndSortingRepository<Categoria, Integer> {
	List<Categoria> findByNome(@Param("nome") String nome);

	List<Categoria> findById(@Param("id") Integer id);

	List<Categoria> findAll();

}
