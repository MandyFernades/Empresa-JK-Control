package br.com.fiap.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Visitante;

public class VisitanteDao {
	
	EntityManagerFactory factory = 
            Persistence.createEntityManagerFactory("JK_Control-persistence-unit");
    EntityManager manager = 
            factory.createEntityManager();
	
	public void create(Visitante visitante) {
		
		manager.getTransaction().begin();
		manager.persist(visitante);
		manager.getTransaction().commit();
		
		manager.clear();
	}
	
	public List<Visitante> listAll() {
		
		TypedQuery<Visitante> query = 
				manager.createQuery("SELECT v FROM Visitante v", Visitante.class);
		
		return query.getResultList();
		
	}

}
