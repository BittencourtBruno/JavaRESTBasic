package Repository;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@SuppressWarnings("rawtypes")
@Repository
public class EnderecoRepository extends SimpleJpaRepository{

	@SuppressWarnings("unchecked")
	public EnderecoRepository(JpaEntityInformation entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		// TODO Auto-generated constructor stub
	}

}
