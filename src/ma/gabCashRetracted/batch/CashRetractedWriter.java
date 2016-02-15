package ma.gabCashRetracted.batch;

import java.util.List;

import ma.gabCashRetracted.dao.Idao;
import ma.gabCashRetracted.entities.Transaction;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("cashRetractedWriter")
public class CashRetractedWriter implements ItemWriter<Transaction>{
	
	private Idao dao;
	
	@Autowired
	public void setDao(Idao dao) {
		this.dao = dao;
	}

	@Override
	public void write(List<? extends Transaction> items) throws Exception {
		// TODO Auto-generated method stub
		for(Transaction t : items){
			dao.addTransaction(t);
		}
		
	}


}
