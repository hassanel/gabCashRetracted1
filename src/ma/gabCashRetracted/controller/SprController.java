package ma.gabCashRetracted.controller;

import javax.servlet.http.HttpServletRequest;

import ma.gabCashRetracted.dao.Dao;
import ma.gabCashRetracted.dao.Idao;
import ma.gabCashRetracted.entities.Client;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SprController {
	
	Idao dao;
	
	@Autowired
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value={"/","/login"})
	public ModelAndView loginpage() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException{
		
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("login");
		
		return modelview;
	}
	
	@RequestMapping("/admin")
	public ModelAndView adminpage(){
		
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("admin");
		modelview.addObject("listeClients",dao.getClients());
		
		return modelview;
	}
	
	@RequestMapping("/adminListeComptes")
	public ModelAndView admincomptespage(@RequestParam(value="idClient",required=true)String idClient){
		
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("adminListeComptes");
		modelview.addObject("listeComptes",dao.getComptes(Integer.parseInt(idClient)));
		modelview.addObject("client",dao.getClientById(Integer.parseInt(idClient)));
		return modelview;
	}
	
	@RequestMapping("/adminListeTransactions")
	public ModelAndView admintransactionspage(@RequestParam(value="idCompte",required=true)String idCompte){
		
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("adminListeTransactions");
		modelview.addObject("listeTransactions",dao.getTransactions(Integer.parseInt(idCompte)));
		modelview.addObject("compte",dao.findCompte(Integer.parseInt(idCompte)));
		return modelview;
	}
	
	@RequestMapping("/client")
	public ModelAndView clientpage(HttpServletRequest request){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		Client c = dao.getClientByUsername(username);
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("client");
		modelview.addObject("clientListeComptes",dao.getComptes(c.getIdClient()));
		modelview.addObject("client",c);
		return modelview;
	}
	
	@RequestMapping("/clientListeTransactions")
	public ModelAndView clienttransactionspage(@RequestParam(value="idCompte",required=true)String idCompte){
		
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("clientListeTransactions");
		modelview.addObject("listeTransactions",dao.getTransactions(Integer.parseInt(idCompte)));
		modelview.addObject("compte",dao.findCompte(Integer.parseInt(idCompte)));
		return modelview;
	}
}
