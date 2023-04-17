package br.edu.unifacear.bo;

import java.sql.SQLException;
import java.util.List;

import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.dao.TipoUsuarioDao;

public class TipoUsuarioBo {

	public TipoUsuarioBo () { 	}

	public void salvarTipoUsuario(TipoUsuario tpUsuario) throws Exception {
		
//		if (tpUsuario.getId() <= 0) {
//			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
//		}
		if (tpUsuario.getTipo().equals("")) {
			throw new Exception ("Tipo deve estar preenchido!");
		}
		
		System.out.println("Validações de Tipo Borda - OK");
		
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		tpUsuarioDao.salvarTipoUsuario(tpUsuario);	
	}
	
	public void selecionarTipoUsuario(TipoUsuario tipoUsuario) {
		TipoUsuarioDao tipoUsuarioDao = new TipoUsuarioDao();
		try {
			tipoUsuarioDao.selecionarTipoUsuario(tipoUsuario);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
//	public void inserirTipoUsuario(TipoUsuario tipoUsuario) {
//		TipoUsuarioDao tipoUsuarioDao = new TipoUsuarioDao();
//		tipoUsuarioDao.inserirTipoUsuario(tipoUsuario);	
//	}
	
	public void editarTipoUsuario(TipoUsuario tpUsuario) {
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		tpUsuarioDao.editarTipoUsuario(tpUsuario);
	}
	
	public void deletarTipoUsuario(int id) {
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		tpUsuarioDao.deletarTipoUsuario(id);
	}
	
	public List<TipoUsuario> listarTipoUsuario() {
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		return tpUsuarioDao.listarTipoUsuario();
	}		
	
	
}
