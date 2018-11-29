package com.soap.services;

import java.util.List;

import com.soap.beans.CompteBean;

public interface ICompte {

	public Double conversion(Double mt);
	public CompteBean getCompte(Long code);
	public List<CompteBean> getAllComptes();
	
}
