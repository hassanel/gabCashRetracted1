package ma.gabCashRetracted.batch;

import ma.gabCashRetracted.dao.Idao;
import ma.gabCashRetracted.entities.Compte;
import ma.gabCashRetracted.entities.Transaction;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("cashRetractedProcessor")
public class CashRetractedProcessor implements ItemProcessor<CashRetracted, Transaction>{
	private Idao dao;
	
	@Autowired
	public void setDao(Idao dao) {
		this.dao = dao;
	}
	@Override
	public Transaction process(CashRetracted c) throws Exception {
		// TODO Auto-generated method stub
		Compte compte = dao.findCompte(c.getIdCompte());
		compte.setMontant(compte.getMontant()+c.getMontant());
		Transaction t = new Transaction(compte, c.getDate(), c.getMontant());
		dao.updateCompte(compte);
		return t;
	}

}
