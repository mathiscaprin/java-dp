package org.sebsy.grasps;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;
import org.sebsy.strategy.ToDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 */
public class ReservationController {

    /**
     * DAO permettant d'accéder à la table des clients
     */
    private ClientDao clientDao = new ClientDao();

    /**
     * DAO permettant d'accéder à la table des types de réservation
     */
    private TypeReservationDao typeReservationDao = new TypeReservationDao();

    /**
     * Méthode qui créée une réservation pour un client à partir des informations transmises
     *
     * @param params contient toutes les infos permettant de créer une réservation
     * @return Reservation
     */
    public Reservation creerReservation(Params params) {

        // 1) Récupération des infos provenant de la classe appelante
        String identifiantClient = params.getIdentifiantClient();
        String dateReservationStr = params.getDateReservation();
        String typeReservation = params.getTypeReservation();
        int nbPlaces = params.getNbPlaces();

        ToDate toDate = new ToDate();

        // 2) Conversion de la date de réservation en LocalDateTime
        LocalDateTime dateReservation = toDate.toDate(dateReservationStr);

        // 3) Extraction de la base de données des informations client
        Client client = clientDao.extraireClient(identifiantClient);

        // 4) Extraction de la base de données des infos concernant le type de la réservation
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        ReservationFactory reservationFactory = new ReservationFactory();
        Reservation reservation = reservationFactory.getInstance(client, type, nbPlaces, dateReservation);


        return reservation;
    }


}
