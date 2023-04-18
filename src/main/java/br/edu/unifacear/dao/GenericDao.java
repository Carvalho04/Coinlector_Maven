package br.edu.unifacear.dao;

import java.util.List;

import javax.persistence.*;

import br.edu.unifacear.classes.EntityBase;
import br.edu.unifacear.dao.Fabrica;

public class GenericDao <T extends EntityBase> {
	
	private static EntityManager em = Fabrica.getEntityManager();

	public void salvarOuAtualizar (T obj) throws Exception {
		try {
			em.getTransaction().begin();
			
			if(obj.getId() == 0) {
				em.persist(obj);
			} else {
				em.merge(obj);
			}
			
			em.getTransaction().commit();
		} catch(Exception e) {
			throw new Exception ("Erro ao salvar: " + e.getMessage());
		}
	}
	
	
	public T findById(Class<T> classe, int id) {		
		return em.find(classe, id);		
	}

	public void remove (Class <T> classe, int id) throws Exception {
		
		T t = findById(classe, id);
		try {
			em.getTransaction().begin();
			em.remove(t);
			em.getTransaction().commit();
		} catch (Exception e) {
			throw new Exception ("Erro ao deletar: " + e.getMessage());
		}
		
	}
	
	
	public List<T> list (Class <T> classe){
		Query q = em.createQuery("select from " + classe.getSimpleName().toString()+ " t");
		return q.getResultList();
	}









}
