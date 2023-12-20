module qa_guru_2.qa_guru_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens qa_guru_2.qa_guru_2 to javafx.fxml;
    exports qa_guru_2.qa_guru_2;
}