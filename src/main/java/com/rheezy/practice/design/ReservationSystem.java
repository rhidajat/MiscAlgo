package com.rheezy.practice.design;

import java.util.List;
import java.util.Map;

public class ReservationSystem {

	private static final Integer MAX_TIME = 2;

	private Map<Long, Reservation> customerIdToReservationMap;
	// List of available tables from opening to end, divided up by the hour
	private List<List<Table>> tableAvailableList;

	private Integer openingTime;

	public void makeReservation(Customer customer, Integer startTime, Integer size) {
		Table table = findTable(startTime, size);

		if (table != null) {
			Reservation reservation = new Reservation(table, customer, startTime);
			Long customerId = customer.getId();
			customerIdToReservationMap.put(customerId, reservation);
			// Remove table
			removeTable(table, startTime);
		} else {
			System.out.println("Sorry, can not find table.");
		}
	}

	private Table findTable(Integer startTime, Integer size) {
		Table selectedTable = null;
		Integer index = startTime - openingTime;

		List<Table> tables = tableAvailableList.get(index);
		for (Table table : tables) {
			if (table.getSize() >= size) {
				selectedTable = table;
				break;
			}
		}

		return selectedTable;
	}

	private void removeTable(Table table, Integer startTime) {
		Integer index = startTime - openingTime;
		
		for (int i = 0; i < MAX_TIME; i++) {
			Integer indexToRemove = index + i;
			List<Table> tableList = tableAvailableList.get(indexToRemove);
			tableList.remove(table);
		}
	}
	
	public Reservation getReservation(Customer customer) {
		return customerIdToReservationMap.get(customer.getId());
	}
}
