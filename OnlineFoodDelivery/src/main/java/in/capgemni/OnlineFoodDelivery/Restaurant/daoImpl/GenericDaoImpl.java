package in.capgemni.OnlineFoodDelivery.Restaurant.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import in.capgemni.OnlineFoodDelivery.Restaurant.dao.GenericDao;

@Repository
public class GenericDaoImpl<T> implements GenericDao<T> {

	@PersistenceContext
	protected EntityManager entityManager;
	
	protected Class<T> daoType;
	
	public void setDaoType(Class<T> type) {
		daoType = type;
	}
	
	@Override
	public void save(T entity) {
		entityManager.persist( entity );
	}

	public void delete( T entity ){
        entityManager.remove( entity );
     }
	
	@Override
	public void delete(Long id) {
		T entity = findOne( id );
        delete( entity ); 
	}

	@Override
	public T findOne(Long id) {
		return entityManager.find( daoType, id );
	}

	@Override
	public T update(T entity) {
		return entityManager.merge( entity );
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return entityManager.createQuery( "from " + daoType.getName() )
			       .getResultList();
	}

}
