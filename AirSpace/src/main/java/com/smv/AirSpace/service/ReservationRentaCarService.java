package com.smv.AirSpace.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smv.AirSpace.model.ReservationRentaCar;
import com.smv.AirSpace.model.Vehicle;
import com.smv.AirSpace.repository.ReservationRentaCarRepository;

import exceptions.ReservationDoesntExistException;

@Service
public class ReservationRentaCarService {

	@Autowired
	ReservationRentaCarRepository reservationRentaCarRepository;

	@Autowired
	UserServiceImpl userService;

	@Autowired
	VehicleService vehicleService;

	public List<Vehicle> getReservationsByRentaCarID(String dateFrom, String dateUntil, String numberOfSeats, Long id)
			throws ParseException {
		// dateFrom = dateFrom.substring(1);
		List<ReservationRentaCar> reservations = new CopyOnWriteArrayList<ReservationRentaCar>();
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		reservations = reservationRentaCarRepository.findAll();
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateFrom);
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(dateUntil);

		// sva vozila
		vehicles = vehicleService.getAllVehicles();

		// brise vozila koja nisu od tog R.cara
		Iterator<Vehicle> veh = vehicles.iterator();
		while (veh.hasNext()) {
			Vehicle vehicle = veh.next();
			if (vehicle.findRentaCar().getId() != id) {
				veh.remove();
			}
		}

		Iterator<ReservationRentaCar> iterator = reservations.iterator();
		while (iterator.hasNext()) {
			ReservationRentaCar reservation = iterator.next();
			if (reservation.getRentacar().getId() != id) {
				iterator.remove();
			}
		}
		List<Long> unavailableVehicles = new ArrayList<Long>();
		Iterator<ReservationRentaCar> iter = reservations.iterator();
		while (iter.hasNext()) {
			ReservationRentaCar reservation = iter.next();
			if (date1.after(reservation.getDateFrom()) && date2.before(reservation.getDateUntil())) {
				iter.remove();
				unavailableVehicles.add(reservation.getVehicle().getId());
			} else if (date1.before(reservation.getDateFrom()) && date2.after(reservation.getDateUntil())) {
				iter.remove();
				unavailableVehicles.add(reservation.getVehicle().getId());
			} else if (date1.before(reservation.getDateFrom()) && date2.after(reservation.getDateFrom())
					&& date2.before(reservation.getDateUntil())) {
				iter.remove();
				unavailableVehicles.add(reservation.getVehicle().getId());
			} else if (date1.after(reservation.getDateFrom()) && date1.before(reservation.getDateUntil())
					&& date2.after(reservation.getDateUntil())) {
				iter.remove();
				unavailableVehicles.add(reservation.getVehicle().getId());
			} else if (date1.equals(reservation.getDateFrom()) && date2.equals(reservation.getDateUntil())) {
				iter.remove();
				unavailableVehicles.add(reservation.getVehicle().getId());
			}
			  else if (date1.equals(reservation.getDateFrom()) && date2.before(reservation.getDateUntil())) {
				iter.remove();
				unavailableVehicles.add(reservation.getVehicle().getId());
			}
			  else if (date1.equals(reservation.getDateFrom()) && date2.after(reservation.getDateUntil())) {
					iter.remove();
					unavailableVehicles.add(reservation.getVehicle().getId());
			}
			  else if (date1.before(reservation.getDateFrom()) && date2.equals(reservation.getDateUntil())) {
					iter.remove();
					unavailableVehicles.add(reservation.getVehicle().getId());
			}
			  else if (date1.after(reservation.getDateFrom()) && date2.equals(reservation.getDateUntil())) {
					iter.remove();
					unavailableVehicles.add(reservation.getVehicle().getId());
			}
		}
		for (ReservationRentaCar reservationRentaCar : reservations) {
			if (vehicles.contains(reservationRentaCar.getVehicle())) {
				// System.out.println("Ovo vozilo je vec u listi");
			} else {
				vehicles.add(reservationRentaCar.getVehicle());
			}
		}
		// Brise vozilo zbog duplikata koji ispunjavaju uslov pretrage
		Iterator<Vehicle> iter1 = vehicles.iterator();
		while (iter1.hasNext()) {
			Vehicle vehicle = iter1.next();
			for (Long long1 : unavailableVehicles) {
				if (vehicle.getId().equals(long1)) {
					iter1.remove();
				}
			}
			if (vehicle.getNumOfSeats() < Integer.parseInt(numberOfSeats)) {
				iter1.remove();
			}
		}
		return vehicles;
	}

	public List<ReservationRentaCar> getReservationsByUserID(Long userID) {
		List<ReservationRentaCar> reservations = new CopyOnWriteArrayList<ReservationRentaCar>();
		reservations = reservationRentaCarRepository.findAll();

		Iterator<ReservationRentaCar> iterator = reservations.iterator();
		while (iterator.hasNext()) {
			ReservationRentaCar reservation = iterator.next();
			if (reservation.getUser().getId() != userID) {
				iterator.remove();
			}
		}

		return reservations;

	}

	public void delete(Long id) {
		try {
			reservationRentaCarRepository.deleteById(id);
		} catch (Exception e) {
			throw new ReservationDoesntExistException();
		}

	}

	public ReservationRentaCar saveReservation(ReservationRentaCar reservation) {

		return reservationRentaCarRepository.save(reservation);
	}
}
