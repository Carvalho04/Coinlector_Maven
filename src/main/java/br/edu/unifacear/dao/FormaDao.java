package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.classes.Forma;
import br.edu.unifacear.dao.Fabrica;


public class FormaDao {
	
	public FormaDao () {}
	
	// excluir
	public String deletar(Forma forma) throws Exception {
		try {			
			EntityManager em = Fabrica.getEntityManager();
			Forma f = em.find(Forma.class, forma.getId());
			em.getTransaction().begin();
			em.remove(f);
			em.getTransaction().commit();			
			return "Ok";			
		} catch(Exception e) {
			throw new Exception("Erro gravando Forma: "+e.getMessage());
		}
	}

	// consultar
	public List<Forma> consultar(String Pesquisa) throws Exception {		
		EntityManager em = Fabrica.getEntityManager();
				
		Query q;
		if (Pesquisa.equals("")) {
			q = em.createQuery("from Forma");			
		}
		else {
			q = em.createQuery("select f from Forma f"
					+" where descricao like :descricao");
			q.setParameter("descricao", "%" + Pesquisa + "%");		
		}		

		return q.getResultList();
	}

}
