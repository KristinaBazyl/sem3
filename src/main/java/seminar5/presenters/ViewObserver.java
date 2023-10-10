package seminar5.presenters;

import java.util.Date;

public interface ViewObserver {
    void onResepvationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
