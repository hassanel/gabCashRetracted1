package ma.gabCashRetracted.dao;

import java.util.List;





import ma.gabCashRetracted.entities.Client;
import ma.gabCashRetracted.entities.Compte;
import ma.gabCashRetracted.entities.Transaction;

public interface Idao {
	public List<Client> getClients();
	public List<Compte> getComptes(int idClient);
	public List<Transaction> getTransactions(int idCompte);
	public Compte findCompte(int idCompte);
	public void updateCompte(Compte compte);
	public void addTransaction(Transaction transaction);
	public Client getClientByUsername(String username);
	public Client getClientById(int idClient);
}
