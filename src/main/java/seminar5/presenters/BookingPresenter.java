package seminar5.presenters;
import seminar5.models.Table;

import seminar5.models.TableModel;
import seminar5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }
    private Collection<Table> loadTables(){
        return model.loadTables();
    }
    public void updateUIShowTables(){
        view.showTables(loadTables());
    }

    private void updateUIShowReservationTableResult(int reservationNo){
        view.showReservationTableResult(reservationNo);

    }

    @Override
    public void onResepvationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationTableResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationTableResult(-1);

        }
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
            try{
                int reservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
                updateUIShowReservationTableResult(reservationNo);
            }
            catch (RuntimeException e) {
                updateUIShowReservationTableResult(-1);
            }
        }

    }

