package org.sebsy.grasps;
import java.time.LocalDateTime;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;

public class ReservationFactory {
    public Reservation getInstance(Client client, TypeReservation type, int nbPlaces, LocalDateTime dateReservation) {

        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        client.getReservations().add(reservation);
        
        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            reservation.setTotal(total * (1 - type.getReductionPourcent() / 100.0));
        } else {
            reservation.setTotal(total);
        }

        return reservation;
    }
}
