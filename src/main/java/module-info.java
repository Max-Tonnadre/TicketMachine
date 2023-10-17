module com.example.ticketmachine {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ticketmachine to javafx.fxml;
    exports com.example.ticketmachine;
}