package com.soap.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.soap.beans.CompteBean;
import com.soap.services.ICompte;

@WebService(name = "CompteWS")
public class Compte implements ICompte{

	@Override
	@WebMethod(operationName = "conversioEuroEnDH")
	public Double conversion(@WebParam(name = "montant") Double mt) {
		return mt * 11.04;
	}

	@Override
	@WebMethod(operationName = "getCompteByID")
	public CompteBean getCompte(@WebParam(name = "code") Long code) {
		return new CompteBean(code, 1987.31, new Date());
	}

	@Override
	@WebMethod(operationName = "getAllComptes")
	public List<CompteBean> getAllComptes() {
		List<CompteBean> comptes = new ArrayList<>();
		comptes.add(new CompteBean(1l, 1987.31, new Date()));
		comptes.add(new CompteBean(2l, 1988.31, new Date()));
		comptes.add(new CompteBean(3l, 1989.31, new Date()));
		return comptes;
	}

}
