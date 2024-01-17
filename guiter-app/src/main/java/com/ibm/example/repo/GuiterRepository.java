package com.ibm.example.repo;

import com.ibm.example.model.Guiter;

public interface GuiterRepository {

	void addGuiters(Guiter guiter);

	Guiter getGuiter(String serialNumber);

	Guiter searchGuiter(Guiter guiter);

}
