package com.ibm.example.repo;

import java.util.ArrayList;
import java.util.List;

import com.ibm.example.model.Guiter;
import com.ibm.example.model.GuiterType;

public class Inventory implements GuiterRepository {

	private List<Guiter> guiters = null;

	{
		guiters = new ArrayList<Guiter>();
	}

	@Override
	public void addGuiters(Guiter guiter) {
		// TODO Auto-generated method stub
		guiters.add(guiter);
		System.out.println("Guiter inserted in the inventory" + guiter);

	}

	@Override
	public Guiter getGuiter(String serialNumber) {
		// TODO Auto-generated method stub
		Guiter tempGuiter = null;
		for (Guiter g : guiters) {
			if (g.getSerialNumber().equals(serialNumber)) {
				tempGuiter = g;
				break;

			}
		}
		return tempGuiter;
	}

	@Override
	public Guiter searchGuiter(Guiter guiter) {

		Guiter tempGuiter = null;
		for (Guiter g : guiters) {
			if (g.equals(guiter)) {
				tempGuiter = g;
				break;
			}

		}

		return tempGuiter;
	}

	@Override
	public List<Guiter> getAllGuiters() {
		// TODO Auto-generated method stub
		sort(guiters);
		return guiters;
	}

	private static void sort(List<Guiter> guiters2) {

		guiters2.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
	}

	@Override
	public List<Guiter> getByGuiterType(String type) {
		// TODO Auto-generated method stub
		List<Guiter> list = new ArrayList<Guiter>();
		for (Guiter g : guiters) {
			if (g.getType().equals(GuiterType.valueOf(type))) {

				list.add(g);
			}
		}
		
			
		return list;
	}
	
}
