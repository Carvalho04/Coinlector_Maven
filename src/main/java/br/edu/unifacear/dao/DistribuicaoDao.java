package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.dao.Fabrica;



public class DistribuicaoDao {

	
	public DistribuicaoDao () {}
	
		
	// excluir
	public String deletar(Distribuicao distribuicao) throws Exception {
		try {			
			EntityManager em = Fabrica.getEntityManager();
			Distribuicao d = em.find(Distribuicao.class, distribuicao.getId());
			em.getTransaction().begin();
			em.remove(d);
			em.getTransaction().commit();			
			return "Ok";			
		} catch(Exception e) {
			throw new Exception("Erro gravando Distribuicao: "+e.getMessage());
		}
	}

	// consultar
	public List<Distribuicao> consultar(String Pesquisa) throws Exception {		
		EntityManager em = Fabrica.getEntityManager();
				
		Query q;
		if (Pesquisa.equals("")) {
			q = em.createQuery("from Distribuicao");			
		}
		else {
			q = em.createQuery("select d from Distribuicao d"
					+" where descricao like :descricao");
			q.setParameter("descricao", "%" + Pesquisa + "%");		
		}		

		return q.getResultList();
	}

	
}
