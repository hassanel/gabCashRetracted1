package ma.gabCashRetracted.dao;

import java.util.List;






import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ma.gabCashRetracted.entities.Client;
import ma.gabCashRetracted.entities.Compte;
import ma.gabCashRetracted.entities.Transaction;

@Repository
public class Dao implements Idao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public List<Client> getClients() {
		
		Session session = sessionFactory.openSession();
		
		try {
		Query query = session.createQuery("from Client");
		return query.list();
		} 
		
		finally {
		session.close();
			}
	}
	
	@Override
	public void updateCompte(Compte compte) {
		Session session = sessionFactory.openSession();
		
		try {
			session.saveOrUpdate(compte);
			} finally {
			session.close();
			}
	}
	
	@Override
	public void addTransaction(Transaction transaction) {
		Session session = sessionFactory.openSession();
		
		try {
			session.save(transaction);
			} finally {
			session.close();
			}
	}
	
	public Compte findCompte(int idCompte){
		Session session = sessionFactory.openSession();
		
		try {
		Query query = session.createQuery("from Compte where idCompte=" + idCompte);
		return (Compte) query.uniqueResult();
		} 
		
		finally {
		session.close();
			}
	}
	@SuppressWarnings("unchecked")
	public List<Compte> getComptes(int idClient) {
		
		Session session = sessionFactory.openSession();
		
		try {
		Query query = session.createQuery("from Compte where client = " + idClient);
		return query.list();
		} 
		
		finally {
		session.close();
			}
	}
	@SuppressWarnings("unchecked")
	public List<Transaction> getTransactions(int idCompte) {
		
		Session session = sessionFactory.openSession();
		
		try {
		Query query = session.createQuery("from Transaction where idCompte=" + idCompte);
		return query.list();
		} 
		
		finally {
		session.close();
			}
	}
	public Client getClientByUsername(String username){
		Session session = sessionFactory.openSession();
		
		try {
		Query query = session.createQuery("from Client where nomDUtilisateur='" + username + "'");
		return (Client) query.uniqueResult();
		} 
		
		finally {
		session.close();
			}
		
	}
	public Client getClientById(int idClient){
		Session session = sessionFactory.openSession();
		
		try {
		Query query = session.createQuery("from Client where idClient=" +  idClient);
		return (Client) query.uniqueResult();
		} 
		
		finally {
		session.close();
			}
		
	}
}
