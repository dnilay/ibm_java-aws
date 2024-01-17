package com.ibm.example.repo;

import java.util.List;

import com.ibm.example.model.Guiter;

public interface GuiterRepository {

	void addGuiters(Guiter guiter);

	Guiter getGuiter(String serialNumber);

	Guiter searchGuiter(Guiter guiter);
	List<Guiter> getAllGuiters();

}
