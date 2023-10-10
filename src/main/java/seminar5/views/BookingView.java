package seminar5.views;

import seminar5.models.Table;
import seminar5.presenters.View;
import seminar5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void  showTables(Collection<Table> tables){
        for (Table table: tables){
            System.out.println(table);
        }
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if(reservationNo >0){
            System.out.printf("столик успешно забронирова. номер брони : #%d\n", reservationNo);
        }
        else {
            System.out.println("не удалось забронировать столик, повторите попытку позже");
        }
    }

    public void reservationTable(Date orderDate, int tableNo, String name){
            if(observer != null)
                observer.onResepvationTable(orderDate, tableNo, name);
    }
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        if (observer != null)
            observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }
}
