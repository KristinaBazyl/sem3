package seminar5;

import seminar5.models.TableModel;
import seminar5.presenters.BookingPresenter;
import seminar5.presenters.Model;
import seminar5.presenters.View;
import seminar5.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model,view);
        presenter.updateUIShowTables();

        view.reservationTable(new Date(), 3, "Kris");
        view.changeReservationTable(1001, new Date(), 2, "Kris");
    }
}
